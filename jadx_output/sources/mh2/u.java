package mh2;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f326465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f326466f;

    public u(com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget, zi2.w wVar, r45.yx1 yx1Var) {
        this.f326464d = kTVInteractiveWidget;
        this.f326465e = wVar;
        this.f326466f = yx1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$populatePauseResumeButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mh2.o oVar = mh2.o.f326428g;
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget = this.f326464d;
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget.a(kTVInteractiveWidget, oVar);
        kTVInteractiveWidget.getClass();
        r45.yx1 yx1Var = this.f326466f;
        boolean z17 = yx1Var.f391465n;
        zi2.w wVar = this.f326465e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("KTVInteractiveWidget", "resume song " + yx1Var.f391459e + ", name: " + yx1Var.f391466o.f371143d.f370351e);
            wVar.getClass();
            ch2.o2 o2Var = (ch2.o2) wVar.U0(ch2.o2.class);
            if (o2Var != null) {
                o2Var.Q0(yx1Var, new mh2.s(yx1Var, kTVInteractiveWidget));
            }
        } else {
            com.tencent.mars.xlog.Log.i("KTVInteractiveWidget", "pause song " + yx1Var.f391459e + ", name: " + yx1Var.f391466o.f371143d.f370351e);
            wVar.getClass();
            ch2.o2 o2Var2 = (ch2.o2) wVar.U0(ch2.o2.class);
            if (o2Var2 != null) {
                o2Var2.R5(yx1Var, new mh2.t(yx1Var, kTVInteractiveWidget));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$populatePauseResumeButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
