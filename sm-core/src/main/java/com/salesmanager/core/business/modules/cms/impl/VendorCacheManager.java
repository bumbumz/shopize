package com.salesmanager.core.business.modules.cms.impl;

import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VendorCacheManager {

  private static final Logger LOGGER = LoggerFactory.getLogger(VendorCacheManager.class);
  private EmbeddedCacheManager manager = null;
  private static VendorCacheManager vendorCacheManager = null;

  private VendorCacheManager() {

    try {
      manager = new DefaultCacheManager();
      LOGGER.info("✅ EmbeddedCacheManager khởi tạo thành công!");
    } catch (Exception e) {
      LOGGER.error("❌ Không thể khởi tạo EmbeddedCacheManager: ", e);
    }

  }

  public static VendorCacheManager getInstance() {
    if (vendorCacheManager == null) {
      vendorCacheManager = new VendorCacheManager();

    }
    return vendorCacheManager;
  }

  public EmbeddedCacheManager getManager() {
    return manager;
  }

}
