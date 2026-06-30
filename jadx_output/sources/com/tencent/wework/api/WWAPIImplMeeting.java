package com.tencent.wework.api;

/* loaded from: classes13.dex */
public final class WWAPIImplMeeting extends com.tencent.wework.api.WWAPIImpl {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f220144e = new java.util.HashMap();

    @Override // com.tencent.wework.api.WWAPIImpl, com.tencent.wework.api.IWWAPI
    public boolean c(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeDefault) {
            return j("com.tencent.wework");
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork) {
            return j("com.tencent.wework") || j("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxwork://jump")));
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal) {
            return j("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxworkgovuniform://jump")));
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxworkWithoutSaas) {
            return j("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxwork://jump")));
        }
        return false;
    }

    @Override // com.tencent.wework.api.AbsWwAPIImpl
    public boolean f(android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f220136b.getPackageManager().queryIntentActivities(intent, 65536);
        f220144e.put(intent.getDataString(), queryIntentActivities.size() > 0 ? queryIntentActivities.get(0).activityInfo.applicationInfo.packageName : "");
        return !android.text.TextUtils.isEmpty(r0);
    }
}
