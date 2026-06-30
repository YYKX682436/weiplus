package kv4;

/* loaded from: classes12.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.f0 f312693d;

    public d0(kv4.f0 f0Var) {
        this.f312693d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHotSearchTitleItem$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kv4.f0 f0Var = this.f312693d;
        rv4.p pVar = f0Var.f312698a;
        pVar.getClass();
        pVar.f400532g = java.lang.System.currentTimeMillis();
        pVar.k(vu4.a.f440237J, vu4.b.B, "", pVar.f400531f, pVar.g(false, null, false));
        f0Var.f312698a.n(rv4.r.f400552e, 1, new kv4.c0(f0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHotSearchTitleItem$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
