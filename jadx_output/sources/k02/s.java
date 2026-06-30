package k02;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final k02.s f303102a = new k02.s();

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper, still in use, count: 2, list:
          (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) from 0x0125: MOVE (r29v1 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) = (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper)
          (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) from 0x0120: MOVE (r29v3 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) = (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void a(android.content.Context r28, vz.w1 r29, c02.e r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k02.s.a(android.content.Context, vz.w1, c02.e, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public static final void b(android.content.Context context, java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("GameDetainManager", "gamelog.download, downloader , detain, appId = ".concat(appId));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        c02.n nVar = new c02.n();
        nVar.f37609d = 2;
        nVar.f37611f = appId;
        lVar.f70664a = nVar;
        lVar.f70665b = new c02.o();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getcloudgameretainconf";
        lVar.f70667d = 4568;
        com.tencent.mm.ipcinvoker.wx_extension.h0.a(lVar.a(), new k02.r(appId, i17));
    }

    public final void c(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ActID", str3);
        jSONObject.put("appid", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 0 : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 4 : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 3 : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 2 : 1);
        objArr[1] = 16;
        objArr[2] = 1601;
        objArr[3] = 1;
        objArr[4] = java.lang.Long.valueOf(j17);
        objArr[5] = str;
        objArr[6] = "";
        objArr[7] = java.net.URLEncoder.encode(jSONObject2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        g0Var.d(16099, objArr);
    }
}
