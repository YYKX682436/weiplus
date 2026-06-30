package u62;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f424944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f424945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v25.b f424946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f424947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg f424948h;

    public c(com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg extControlProviderMsg, int i17, long j17, v25.b bVar, java.lang.String[] strArr) {
        this.f424948h = extControlProviderMsg;
        this.f424944d = i17;
        this.f424945e = j17;
        this.f424946f = bVar;
        this.f424947g = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String[] strArr = this.f424947g;
        v25.b bVar = this.f424946f;
        com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg extControlProviderMsg = this.f424948h;
        int i17 = this.f424944d;
        if (i17 == 1) {
            com.tencent.mm.storage.z3 Bi = n62.k.Di().Bi(this.f424945e);
            if (Bi == null || ((int) Bi.E2) <= 0) {
                extControlProviderMsg.k(3);
                bVar.a();
                return;
            }
            com.tencent.mm.autogen.events.ExtRecordEvent extRecordEvent = new com.tencent.mm.autogen.events.ExtRecordEvent();
            am.o8 o8Var = extRecordEvent.f54206g;
            o8Var.f7516a = 1;
            o8Var.f7517b = Bi.d1();
            if (!extRecordEvent.e()) {
                extControlProviderMsg.k(4);
                bVar.a();
                return;
            }
            extControlProviderMsg.f99891o = new android.database.MatrixCursor(com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg.f99887w);
            int i18 = (int) Bi.E2;
            am.p8 p8Var = extRecordEvent.f54207h;
            if (i18 <= 0 || !p8Var.f7608a) {
                extControlProviderMsg.f99891o.addRow(new java.lang.Object[]{strArr[1], 2, "0"});
                extControlProviderMsg.k(3);
            } else {
                extControlProviderMsg.f99891o.addRow(new java.lang.Object[]{strArr[1], 1, "0"});
                extControlProviderMsg.k(0);
            }
            boolean z17 = p8Var.f7608a;
            java.lang.String str = p8Var.f7609b;
        } else if (i17 == 2) {
            com.tencent.mm.autogen.events.ExtRecordEvent extRecordEvent2 = new com.tencent.mm.autogen.events.ExtRecordEvent();
            extRecordEvent2.f54206g.f7516a = 2;
            if (!extRecordEvent2.e()) {
                extControlProviderMsg.k(4);
                bVar.a();
                return;
            }
            am.p8 p8Var2 = extRecordEvent2.f54207h;
            java.lang.String str2 = p8Var2.f7609b;
            extControlProviderMsg.f99891o = new android.database.MatrixCursor(com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg.f99887w);
            com.tencent.mm.autogen.events.ExtVoiceFileNameToMsgIdEvent extVoiceFileNameToMsgIdEvent = new com.tencent.mm.autogen.events.ExtVoiceFileNameToMsgIdEvent();
            extVoiceFileNameToMsgIdEvent.f54215g.f8367a = str2;
            if (!extVoiceFileNameToMsgIdEvent.e()) {
                extControlProviderMsg.k(4);
                extControlProviderMsg.f99891o.close();
                bVar.a();
                return;
            }
            am.y8 y8Var = extVoiceFileNameToMsgIdEvent.f54216h;
            long j17 = y8Var.f8443a;
            long j18 = y8Var.f8443a;
            if (j18 > 0) {
                try {
                    if (p8Var2.f7608a) {
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        if (context == null || !com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
                            extControlProviderMsg.f99891o.addRow(new java.lang.Object[]{strArr[1], 6, com.tencent.mm.plugin.ext.key.AESUtil.b(j18)});
                            extControlProviderMsg.k(4);
                        } else {
                            extControlProviderMsg.f99891o.addRow(new java.lang.Object[]{strArr[1], 1, com.tencent.mm.plugin.ext.key.AESUtil.b(j18)});
                            extControlProviderMsg.k(0);
                        }
                    } else {
                        extControlProviderMsg.f99891o.addRow(new java.lang.Object[]{strArr[1], 4, com.tencent.mm.plugin.ext.key.AESUtil.b(j18)});
                        extControlProviderMsg.k(4);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderMsg", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtControlProviderMsg", e17, "", new java.lang.Object[0]);
                    extControlProviderMsg.k(4);
                }
            } else {
                extControlProviderMsg.k(3);
            }
        }
        bVar.a();
    }
}
