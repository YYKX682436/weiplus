package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseMainUI f138128d;

    public o0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI) {
        this.f138128d = fTSBaseMainUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = this.f138128d;
        java.lang.String b76 = fTSBaseMainUI.b7();
        g23.k kVar = fTSBaseMainUI.L1.f138153r;
        kVar.L = z13.f.Y6(fTSBaseMainUI.getContext()).b7();
        int count = fTSBaseMainUI.L1.getCount();
        int i18 = fTSBaseMainUI.F1;
        java.util.Set set = com.tencent.mm.plugin.fts.ui.x2.f138375a;
        com.tencent.mm.autogen.mmdata.rpt.UniverSearchStruct univerSearchStruct = new com.tencent.mm.autogen.mmdata.rpt.UniverSearchStruct();
        univerSearchStruct.f61422d = i18;
        if (o13.n.n(b76)) {
            univerSearchStruct.f61424e = 8L;
        } else {
            univerSearchStruct.f61424e = 9L;
        }
        univerSearchStruct.f61426f = count + 1;
        long j17 = kVar.f267937b;
        if (j17 > 0 && j17 < java.lang.System.currentTimeMillis()) {
            univerSearchStruct.f61446p = java.lang.System.currentTimeMillis() - kVar.f267938c;
        }
        if (!kVar.A.equals(b76)) {
            univerSearchStruct.I = 1L;
        }
        univerSearchStruct.f61432i = univerSearchStruct.b("SearchId", "", true);
        univerSearchStruct.q("");
        univerSearchStruct.f61448q = kVar.f267940e;
        univerSearchStruct.f61449r = kVar.f267941f;
        univerSearchStruct.f61450s = kVar.f267943h;
        univerSearchStruct.f61451t = kVar.f267948m;
        univerSearchStruct.f61452u = kVar.f267950o;
        univerSearchStruct.f61453v = kVar.f267951p;
        univerSearchStruct.f61455x = kVar.f267952q;
        univerSearchStruct.f61456y = kVar.f267953r;
        univerSearchStruct.s(java.lang.String.valueOf(o13.p.f342250c));
        univerSearchStruct.A = univerSearchStruct.b("Query", b76, true);
        int i19 = kVar.f267961z;
        kVar.f267961z = 2;
        univerSearchStruct.D = i19;
        univerSearchStruct.E = univerSearchStruct.b("HasSHowType", "", true);
        univerSearchStruct.F = univerSearchStruct.b("VoiceInfo", "", true);
        univerSearchStruct.G = univerSearchStruct.b("SessionId", "", true);
        univerSearchStruct.H = 1L;
        univerSearchStruct.Q = univerSearchStruct.b("GroupId", "", true);
        univerSearchStruct.r("");
        univerSearchStruct.S = univerSearchStruct.b("MyRecentMsgCount", "", true);
        univerSearchStruct.T = univerSearchStruct.b("MyRecentSearchCount", "", true);
        univerSearchStruct.U = univerSearchStruct.b("MyRecentSearchDays", "", true);
        univerSearchStruct.W = univerSearchStruct.b("TophitsCount", "", true);
        univerSearchStruct.X = univerSearchStruct.b("TrainScore", "", true);
        univerSearchStruct.f61419a0 = univerSearchStruct.b("strDocId", "", true);
        univerSearchStruct.f61433i0 = univerSearchStruct.b("FtsTimeToken", o13.p.b(), true);
        univerSearchStruct.f61435j0 = c01.id.c();
        univerSearchStruct.f61420b0 = univerSearchStruct.b("ClickedAppId", "", true);
        univerSearchStruct.p(kVar.L);
        if (!com.tencent.mm.plugin.fts.ui.x2.d(univerSearchStruct.f61424e)) {
            univerSearchStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSReportLogic", "%s", univerSearchStruct.n().replace(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " "));
        }
        boolean n17 = o13.n.n(fTSBaseMainUI.b7());
        boolean o17 = o13.n.o(fTSBaseMainUI.b7());
        if (!n17) {
            i17 = o17 ? 9 : 8;
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        kVar.a(i17);
        com.tencent.mm.plugin.fts.ui.q2 q2Var = fTSBaseMainUI.L1;
        q2Var.f138151J = true;
        if (!q2Var.f138155t) {
            q2Var.f138155t = true;
            com.tencent.mm.plugin.fts.ui.x2.n(b76, true, q2Var.getCount(), 0, kVar);
        }
        if (b76 != null && b76.length() != 0 && b76.trim().length() != 0) {
            fTSBaseMainUI.T1 = java.lang.Character.isDigit(b76.charAt(0)) ? 15 : 3;
            com.tencent.mm.plugin.fts.ui.r0 r0Var = fTSBaseMainUI.U1;
            if (r0Var == null) {
                com.tencent.mm.plugin.fts.ui.p0 p0Var = new com.tencent.mm.plugin.fts.ui.p0(fTSBaseMainUI);
                fTSBaseMainUI.U1 = p0Var;
                p0Var.f138165d = b76;
                gm0.j1.d().o(106, fTSBaseMainUI, fTSBaseMainUI.U1);
            } else {
                r0Var.f138165d = b76;
            }
            tg3.r1 r1Var = new tg3.r1(b76, 3);
            gm0.j1.d().g(r1Var);
            fTSBaseMainUI.S1 = db5.e1.Q(fTSBaseMainUI, fTSBaseMainUI.getString(com.tencent.mm.R.string.f490573yv), fTSBaseMainUI.getString(com.tencent.mm.R.string.icm), true, true, new com.tencent.mm.plugin.fts.ui.g0(fTSBaseMainUI, r1Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
