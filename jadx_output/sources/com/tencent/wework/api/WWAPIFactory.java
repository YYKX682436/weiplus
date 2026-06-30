package com.tencent.wework.api;

/* loaded from: classes13.dex */
public abstract class WWAPIFactory {
    static {
        new java.util.HashSet<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIFactory.1
            {
                add("com.tencent.mm");
                add("com.tencent.wemeet.app");
            }
        };
    }

    public static com.tencent.wework.api.IWWAPI a(android.content.Context context) {
        return android.text.TextUtils.equals(context.getPackageName(), "com.tencent.mm") ? new com.tencent.wework.api.WWAPIImplLocal(context) : (android.text.TextUtils.equals(context.getPackageName(), "com.tencent.wemeet.app") || android.text.TextUtils.equals(context.getPackageName(), "com.tencent.voov")) ? new com.tencent.wework.api.WWAPIImplMeeting(context) : new com.tencent.wework.api.WWAPIImpl(context);
    }
}
