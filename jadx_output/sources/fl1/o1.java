package fl1;

/* loaded from: classes7.dex */
public final class o1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.p1 f263837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.h1 f263838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263839f;

    public o1(fl1.p1 p1Var, fl1.h1 h1Var, int i17) {
        this.f263837d = p1Var;
        this.f263838e = h1Var;
        this.f263839f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        fl1.p1 p1Var = this.f263837d;
        fl1.j1 j1Var = p1Var.f263844f.f263853f;
        if (j1Var != null) {
            j1Var.a(p1Var.f263842d, this.f263838e, this.f263839f);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
