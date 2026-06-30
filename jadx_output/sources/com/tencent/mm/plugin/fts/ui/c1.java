package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class c1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138026a;

    public c1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138026a = fTSBaseVoiceSearchUI;
    }

    @Override // k23.v2
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "FloatingVoiceInput onStartPress");
    }

    @Override // k23.v2
    public void b(java.lang.String str, java.lang.String voiceID) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "FloatingVoiceInput onResult: " + str);
        boolean isEmpty = str.isEmpty();
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138026a;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "empty query");
            int i17 = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.E1;
            fTSBaseVoiceSearchUI.X6();
            return;
        }
        k23.c1 a17 = k23.c1.f303536h.a(fTSBaseVoiceSearchUI.getContext());
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.fts.ui.c1$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.plugin.fts.ui.c1 c1Var = com.tencent.mm.plugin.fts.ui.c1.this;
                c1Var.getClass();
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI2 = c1Var.f138026a;
                if (booleanValue) {
                    fTSBaseVoiceSearchUI2.L = true;
                    return null;
                }
                int i18 = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.E1;
                fTSBaseVoiceSearchUI2.X6();
                return null;
            }
        };
        kotlin.jvm.internal.o.g(voiceID, "voiceID");
        k23.v0 v0Var = a17.f303541g;
        if (v0Var != null) {
            v0Var.w(8, "", str);
        }
        android.app.Activity context = a17.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = (com.tencent.mm.plugin.fts.ui.FTSMainUI) context;
        com.tencent.mm.plugin.fts.ui.q2 q2Var = fTSMainUI.L1;
        android.app.Activity context2 = a17.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(z13.f.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        z13.f fVar = (z13.f) a18;
        com.tencent.mm.plugin.fts.ui.j3 j3Var = new com.tencent.mm.plugin.fts.ui.j3();
        j3Var.f138084a = true;
        j3Var.f138086c = true;
        j3Var.f138087d = false;
        j3Var.f138088e = new k23.a1(q2Var, a17, str, voiceID, fTSMainUI, true, lVar, fVar);
        q2Var.o(str, j3Var);
    }

    @Override // k23.v2
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "FloatingVoiceInput onCancel");
    }
}
