package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_idvlmtlKKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217729a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217730b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217731c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217732d = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_BI() {
        r45.vs2 vs2Var;
        r45.vs2 vs2Var2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217729a;
        com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyFetchMeTabRedPointEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyFetchMeTabRedPointEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((t01.a) ((com.tencent.wechat.iam.biz.e0) entry.getValue())).f414388a.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "onMeTabRegis");
            t01.i iVar = t01.m.f414399d;
            if (((ox.g) t01.i.b(iVar)).vj() && ((ox.g) t01.i.b(iVar)).Ni()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "get ctrlInfo");
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = t01.i.c(iVar).L0("FinderMyTab");
                byte[] bArr = null;
                byte[] byteArrayOrNull = (L0 == null || (vs2Var2 = L0.field_ctrInfo) == null) ? null : vs2Var2.toByteArrayOrNull();
                if (byteArrayOrNull == null) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb L02 = t01.i.c(iVar).L0("MyTabPhotoProfile");
                    if (L02 != null && (vs2Var = L02.field_ctrInfo) != null) {
                        bArr = vs2Var.toByteArrayOrNull();
                    }
                    byteArrayOrNull = bArr;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "start fetchMeTabRedPointAsync");
                t01.m.f414403h.d(java.util.Optional.ofNullable(byteArrayOrNull), java.util.Optional.empty(), t01.l.f414398a);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "shouldShowPhotoWorks is false or canRegisterPhotoAccount is false");
            }
        }
    }

    private void ZIDL_CI(int i17, byte[] bArr, long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217730b;
        int i18 = 0;
        com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[i18]);
            com.tencent.wechat.iam.biz.g0 g0Var = (com.tencent.wechat.iam.biz.g0) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            t01.b bVar = (t01.b) g0Var;
            bVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotUpdated, count: " + i17 + ", wording: " + str + ", timestamp: " + j17);
            t01.m mVar = bVar.f414389a;
            if (i17 <= 0) {
                mVar.Bi();
            } else {
                mVar.getClass();
                if (uh4.c0.getService().isTeenMode()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotUpdated: teen mode enabled, skip setting red dot");
                } else {
                    t01.i iVar = t01.m.f414399d;
                    if (((ox.g) t01.i.b(iVar)).wj()) {
                        r45.vs2 vs2Var = new r45.vs2();
                        vs2Var.f388487e = 1026;
                        vs2Var.f388486d = 100000;
                        double currentTimeMillis = java.lang.System.currentTimeMillis() / 1000.0d;
                        vs2Var.f388490h = "BizWorksEntryRedDot_" + currentTimeMillis;
                        vs2Var.f388503x = "BizWorksEntryRedDot_" + currentTimeMillis;
                        r45.f03 f03Var = new r45.f03();
                        f03Var.f373891h = 1;
                        f03Var.f373887d = 2;
                        f03Var.f373892i = "MyTab";
                        f03Var.f373888e = i17;
                        r45.f03 f03Var2 = new r45.f03();
                        f03Var2.f373891h = 1;
                        f03Var2.f373887d = 2;
                        f03Var2.f373892i = "FinderMentionMyTab";
                        f03Var2.f373888e = i17;
                        vs2Var.f388489g.add(f03Var);
                        vs2Var.f388489g.add(f03Var2);
                        zy2.fa.D(t01.i.c(iVar), vs2Var, "bizMeTab", null, false, null, 28, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "add works entry red dot success, count: " + i17 + ", wording: " + str);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotUpdated: works entry red dot disabled, skip setting red dot");
                    }
                }
            }
            i18 = 0;
        }
    }

    private void ZIDL_DI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217731c;
        com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotEnableChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotifyWorksEntryRedDotEnableChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            t01.c cVar = (t01.c) ((com.tencent.wechat.iam.biz.f0) entry.getValue());
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "onWorksEntryRedDotEnableChanged, enabled: " + z17);
            if (!z17) {
                cVar.f414390a.Bi();
            }
        }
    }

    private void ZIDL_KI(byte[] bArr, byte[] bArr2, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217732d;
        com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotificationDigestUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizInteractiveNativeToCppManagerKE", "onNotificationDigestUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.iam.biz.d0 d0Var = (com.tencent.wechat.iam.biz.d0) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            ((gr1.g) d0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated biz: " + str + ", digest: " + str2 + ", timestamp: " + i17);
            jr1.i iVar = jr1.i.f301360a;
            boolean b17 = kotlin.jvm.internal.o.b(iVar.c(0), str);
            com.tencent.wechat.mm.biz.m4 m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY;
            if (b17) {
                hr1.i Di = yq1.u0.Di();
                rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr = tk.s.f419870d;
                ((ox.r) d0Var2).Ni(1).b(m4Var, new gr1.e(Di, str2, i17));
            } else if (kotlin.jvm.internal.o.b(iVar.c(5), str)) {
                nr1.f Vi = yq1.u0.Vi();
                rm.d0 d0Var3 = (rm.d0) i95.n0.c(rm.d0.class);
                tk.s[] sVarArr2 = tk.s.f419870d;
                ((ox.r) d0Var3).Ni(2).b(m4Var, new gr1.f(Vi, str2, i17));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated, biz not match, biz: " + str + ", curBiz: " + iVar.c(0));
            }
        }
    }
}
