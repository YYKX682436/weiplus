package mh2;

/* loaded from: classes10.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326480d;

    public w(com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget) {
        this.f326480d = kTVInteractiveWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupOriginalToggleBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mh2.o oVar = mh2.o.f326427f;
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget = this.f326480d;
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget.a(kTVInteractiveWidget, oVar);
        lj2.v0 v0Var = kTVInteractiveWidget.f111669m;
        zi2.w wVar = v0Var instanceof zi2.w ? (zi2.w) v0Var : null;
        if (wVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupOriginalToggleBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((kotlinx.coroutines.flow.h3) ((om2.e) wVar.P0(om2.e.class)).f346290f).k(java.lang.Boolean.valueOf(!((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) wVar.P0(om2.e.class)).f346290f).getValue()).booleanValue()));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupOriginalToggleBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
