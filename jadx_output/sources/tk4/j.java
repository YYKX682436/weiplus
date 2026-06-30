package tk4;

/* loaded from: classes11.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f419989b;

    public j(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic, boolean z17) {
        this.f419988a = tingAudioPushConfigLogic;
        this.f419989b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419988a;
        if (i17 == 0 && fVar.f70616b == 0) {
            bw5.a50 parseFrom = new bw5.a50().parseFrom(((qk.t9) fVar.f70618d).f364338d);
            bw5.c2 c2Var = parseFrom.f25027h[4] ? parseFrom.f25024e : new bw5.c2();
            kotlin.jvm.internal.o.f(c2Var, "getPushConfig(...)");
            tingAudioPushConfigLogic.I = c2Var;
            long j17 = c2Var.f25882d;
            java.lang.String str = tingAudioPushConfigLogic.f174639a;
            if (j17 <= 0) {
                bw5.c2 c2Var2 = new bw5.c2();
                c2Var2.f25882d = 3600000L;
                c2Var2.f25884f[1] = true;
                com.tencent.mars.xlog.Log.w(str, "saveAudioRootConfigs fail: interval_ms = " + c2Var.f25882d);
                c2Var = c2Var2;
            }
            try {
                gm4.a.f273557a.j(tingAudioPushConfigLogic.f174642d, android.util.Base64.encodeToString(c2Var.toByteArray(), 0));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e(str, "store in kv fail: %s", e17.getMessage());
            }
            java.util.LinkedList linkedList = parseFrom.f25025f;
            bw5.d2 d2Var = linkedList != null ? (bw5.d2) kz5.n0.Z(linkedList) : null;
            boolean z17 = this.f419989b;
            if (d2Var == null) {
                com.tencent.mars.xlog.Log.i(str, "tryShowPushTips fail, no need! audioPush null outdoor " + z17);
                com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
                tingAudioPushLogStruct.f61302d = tingAudioPushConfigLogic.f174648j;
                tingAudioPushLogStruct.k();
            } else {
                int i18 = d2Var.f26285i;
                if (i18 == 1 || i18 == 2) {
                    o11.f fVar2 = new o11.f();
                    fVar2.f342078b = true;
                    fVar2.f342077a = true;
                    fVar2.f342096t = true;
                    o11.g a17 = fVar2.a();
                    n11.a b17 = n11.a.b();
                    bw5.e2 e2Var = d2Var.f26287n[7] ? d2Var.f26286m : new bw5.e2();
                    b17.i(e2Var.f26693g[3] ? e2Var.f26692f : "", null, a17, new tk4.n(tingAudioPushConfigLogic, z17, d2Var));
                } else {
                    tingAudioPushConfigLogic.i(d2Var, tingAudioPushConfigLogic.f174649k);
                    com.tencent.mars.xlog.Log.i(str, "tryShowPushTips fail! audioPush.contentType:" + d2Var.f26285i + ", not support! outdoor " + z17);
                }
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
            tingAudioPushLogStruct2.f61302d = tingAudioPushConfigLogic.f174655q;
            tingAudioPushLogStruct2.k();
            com.tencent.mars.xlog.Log.w(tingAudioPushConfigLogic.f174639a, "TingGetAudioConfigCGI fail, errType:" + fVar.f70615a + ", errCode:" + fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
