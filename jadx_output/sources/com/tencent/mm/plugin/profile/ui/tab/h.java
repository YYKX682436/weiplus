package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.c f154340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f154341e;

    public h(com.tencent.mm.plugin.profile.ui.tab.c cVar, boolean z17) {
        this.f154340d = cVar;
        this.f154341e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wr3.n0 n0Var;
        r45.s5 s5Var;
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        yr3.i iVar = (yr3.i) this.f154340d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = iVar.f464849a;
        if (this.f154341e) {
            u3Var.dismiss();
            yr3.w wVar = yr3.w.f465059a;
            yr3.f fVar = iVar.f464850b.f464929e;
            if (fVar == null || (n0Var = fVar.f464804c) == null) {
                n0Var = wr3.n0.f448842f;
            }
            wVar.f(n0Var, iVar.f464851c, iVar.f464852d, (fVar == null || (s5Var = fVar.f464802a) == null || (p5Var = s5Var.f385514i) == null || (linkedList = p5Var.f382754e) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
            return;
        }
        com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "success item delete failed");
        u3Var.dismiss();
        android.content.Context context = iVar.f464853e.f464961d;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.f490949na5);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }
}
