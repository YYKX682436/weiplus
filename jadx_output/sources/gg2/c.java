package gg2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.d f271665d;

    public c(gg2.d dVar) {
        this.f271665d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View p17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpNineteenItem$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gg2.d dVar = this.f271665d;
        dVar.k();
        in5.s0 s0Var = dVar.f271664a.f417149i;
        if (s0Var != null && (p17 = s0Var.p(com.tencent.mm.R.id.tid)) != null) {
            p17.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpNineteenItem$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
