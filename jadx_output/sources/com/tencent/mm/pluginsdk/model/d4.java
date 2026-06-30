package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public class d4 extends com.tencent.mm.pluginsdk.model.y3 {
    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String a(android.content.Context context, android.content.pm.ResolveInfo resolveInfo) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.CharSequence loadLabel;
        if (context == null || resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || (loadLabel = activityInfo.loadLabel(context.getPackageManager())) == null) {
            return null;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(.*推荐.*\\)", 2).matcher(loadLabel.toString());
        return matcher.find() ? matcher.replaceAll("") : loadLabel.toString();
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public jt.u b() {
        jt.u uVar = new jt.u();
        uVar.f301589b = com.tencent.mm.R.string.ju7;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("QQMapDownloadTips");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            uVar.f301590c = d17;
        }
        uVar.f301591d = com.tencent.mm.R.string.juc;
        uVar.f301588a = com.tencent.mm.R.drawable.icon_tencent_map;
        return uVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String c() {
        return "TencentMap.apk";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String d() {
        return "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String e() {
        return "com.tencent.map";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String f() {
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public boolean g(android.content.Context context) {
        android.content.pm.ActivityInfo activityInfo;
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("sosomap://type=nav")), 0);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            int size = queryIntentActivities.size();
            for (int i17 = 0; i17 < size; i17++) {
                android.content.pm.ResolveInfo resolveInfo = queryIntentActivities.get(i17);
                if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && "com.tencent.map".equals(activityInfo.packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public boolean h(java.lang.String str) {
        return str != null && "com.tencent.map".equals(str);
    }
}
