package mh2;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326478d;

    public v(com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget) {
        this.f326478d = kTVInteractiveWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ch2.o2 o2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupFinishSingingBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mh2.o oVar = mh2.o.f326429h;
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget = this.f326478d;
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget.a(kTVInteractiveWidget, oVar);
        lj2.v0 v0Var = kTVInteractiveWidget.f111669m;
        if (v0Var != null && (o2Var = (ch2.o2) v0Var.o(ch2.o2.class)) != null) {
            o2Var.e7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupFinishSingingBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
