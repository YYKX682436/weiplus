package mh2;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.v0 f326488e;

    public x(com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget, lj2.v0 v0Var) {
        this.f326487d = kTVInteractiveWidget;
        this.f326488e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupTuningBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget.a(this.f326487d, mh2.o.f326426e);
        lj2.v0 v0Var = this.f326488e;
        lf2.a aVar = (lf2.a) v0Var.o(lf2.a.class);
        if (aVar != null) {
            aVar.a7(2);
        }
        lf2.a aVar2 = (lf2.a) v0Var.o(lf2.a.class);
        if (aVar2 != null) {
            aVar2.Z6(2, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupTuningBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
