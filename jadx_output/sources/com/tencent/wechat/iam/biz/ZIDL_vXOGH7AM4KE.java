package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_vXOGH7AM4KE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217736a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_NI(boolean z17, byte[] bArr, boolean z18, byte[] bArr2, boolean z19, byte[] bArr3) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217736a;
        com.tencent.wechat.zlog.Zlog.a("IamBizServiceProxyManagerKE", "onBizPhotoEnableUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizServiceProxyManagerKE", "onBizPhotoEnableUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.iam.biz.u1 u1Var = (com.tencent.wechat.iam.biz.u1) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            java.lang.String str3 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
            ((t01.d) u1Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "onMeTabPhotoEnableUpdatedEvent, enableBizPicNewName: " + z17 + ", enableBizPicNewNameValue: " + str + ", canViewEnable: " + z18 + ", canViewEnableValue: " + str2 + ", canCreateEnable: " + z19 + ", canCreateEnableValue: " + str3);
            if (!z19) {
                t01.i iVar = t01.m.f414399d;
                com.tencent.mm.sdk.platformtools.o4 a17 = t01.i.a(iVar);
                java.lang.String str4 = t01.m.f414402g;
                java.lang.String u17 = a17.u(str4, "");
                kotlin.jvm.internal.o.d(u17);
                if (u17.length() > 0) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb B0 = zy2.fa.B0(t01.i.c(iVar), "FinderMyTab", u17, false, false, 12, null);
                    if (B0 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "clean finder me tab redDot");
                        zy2.fa.J0(t01.i.c(iVar), B0, "FinderMyTab", true, null, 8, null);
                    }
                    com.tencent.mm.plugin.finder.extension.reddot.jb B02 = zy2.fa.B0(t01.i.c(iVar), "MyTabPhotoProfile", u17, false, false, 12, null);
                    if (B02 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "clean photo redDot");
                        zy2.fa.J0(t01.i.c(iVar), B02, "MyTabPhotoProfile", true, null, 8, null);
                    }
                    t01.i.a(iVar).D(str4, "");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "tipsUuid is empty, skip clean redDot");
                }
            }
        }
    }
}
