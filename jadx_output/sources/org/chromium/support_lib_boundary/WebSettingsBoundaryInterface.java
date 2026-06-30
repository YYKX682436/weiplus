package org.chromium.support_lib_boundary;

/* loaded from: classes6.dex */
public interface WebSettingsBoundaryInterface {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getAttributionBehavior();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    java.util.Map<java.lang.String, java.lang.Object> getUserAgentMetadataMap();

    int getWebAuthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z17);

    void setAttributionBehavior(int i17);

    void setDisabledActionModeMenuItems(int i17);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z17);

    void setForceDark(int i17);

    void setForceDarkBehavior(int i17);

    void setOffscreenPreRaster(boolean z17);

    void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> set);

    void setSafeBrowsingEnabled(boolean z17);

    void setUserAgentMetadataFromMap(java.util.Map<java.lang.String, java.lang.Object> map);

    void setWebAuthnSupport(int i17);

    void setWillSuppressErrorPage(boolean z17);
}
