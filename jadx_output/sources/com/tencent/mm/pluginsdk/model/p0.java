package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public class p0 extends com.tencent.mm.pluginsdk.model.y3 {

    /* renamed from: a, reason: collision with root package name */
    public final jt.w f189396a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f189397b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.d4 f189398c = new com.tencent.mm.pluginsdk.model.d4();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p0(android.os.Bundle r6) {
        /*
            r5 = this;
            r5.<init>()
            com.tencent.mm.pluginsdk.model.d4 r0 = new com.tencent.mm.pluginsdk.model.d4
            r0.<init>()
            r5.f189398c = r0
            r0 = 0
            java.lang.String r1 = "key_target_intent"
            jt.w r2 = jt.w.TencentMap
            if (r6 == 0) goto L49
            android.os.Parcelable r3 = r6.getParcelable(r1)
            if (r3 != 0) goto L18
            goto L49
        L18:
            java.lang.String r3 = "key_map_app"
            r4 = 0
            int r3 = r6.getInt(r3, r4)
            if (r3 == 0) goto L3a
            r4 = 1
            if (r3 == r4) goto L37
            r4 = 2
            if (r3 == r4) goto L34
            r4 = 3
            if (r3 == r4) goto L31
            r4 = 4
            if (r3 == r4) goto L2e
            goto L3a
        L2e:
            jt.w r3 = jt.w.AutonaviMap
            goto L3b
        L31:
            jt.w r3 = jt.w.BaiduMap
            goto L3b
        L34:
            jt.w r3 = jt.w.SogouMap
            goto L3b
        L37:
            jt.w r3 = jt.w.GoogleMap
            goto L3b
        L3a:
            r3 = r2
        L3b:
            android.content.Context r4 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.pm.ResolveInfo r4 = j(r4, r3, r0)
            if (r4 != 0) goto L46
            r5.f189396a = r2
            goto L4b
        L46:
            r5.f189396a = r3
            goto L4b
        L49:
            r5.f189396a = r2
        L4b:
            jt.w r3 = r5.f189396a
            if (r3 != r2) goto L52
            r5.f189397b = r0
            goto L5a
        L52:
            android.os.Parcelable r6 = r6.getParcelable(r1)
            android.content.Intent r6 = (android.content.Intent) r6
            r5.f189397b = r6
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.p0.<init>(android.os.Bundle):void");
    }

    public static android.content.pm.ResolveInfo j(android.content.Context context, jt.w wVar, android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("geo:%f,%f", java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f))));
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (com.tencent.mm.sdk.platformtools.t8.L0(queryIntentActivities)) {
            return null;
        }
        for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
            if (resolveInfo != null && resolveInfo.activityInfo != null && wVar.h().equals(resolveInfo.activityInfo.packageName)) {
                return resolveInfo;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String a(android.content.Context context, android.content.pm.ResolveInfo resolveInfo) {
        return this.f189398c.a(context, resolveInfo);
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public jt.u b() {
        jt.w wVar = jt.w.TencentMap;
        jt.w wVar2 = this.f189396a;
        if (wVar2 == wVar) {
            return this.f189398c.b();
        }
        jt.u uVar = new jt.u();
        uVar.f301591d = -1;
        uVar.f301588a = -1;
        android.content.pm.ResolveInfo j17 = j(com.tencent.mm.sdk.platformtools.x2.f193071a, wVar2, this.f189397b);
        if (j17 != null) {
            uVar.f301592e = a(com.tencent.mm.sdk.platformtools.x2.f193071a, j17);
        }
        return uVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String c() {
        if (this.f189396a != jt.w.TencentMap) {
            return null;
        }
        this.f189398c.getClass();
        return "TencentMap.apk";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String d() {
        if (this.f189396a != jt.w.TencentMap) {
            return null;
        }
        this.f189398c.getClass();
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
        jt.w wVar = jt.w.TencentMap;
        jt.w wVar2 = this.f189396a;
        return wVar2 == wVar ? this.f189398c.g(context) : j(context, wVar2, this.f189397b) != null;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public boolean h(java.lang.String str) {
        return this.f189396a.h().equals(str);
    }
}
