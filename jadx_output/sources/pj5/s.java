package pj5;

/* loaded from: classes9.dex */
public final class s implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f355405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj5.l f355406e;

    public s(in5.s0 s0Var, pj5.l lVar) {
        this.f355405d = s0Var;
        this.f355406e = lVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f355405d;
        rl5.r rVar = new rl5.r(s0Var.f293121e, view);
        rVar.C = true;
        rVar.f397355y = pj5.p.f355400a;
        rVar.f397354x = new pj5.r(s0Var, this.f355406e);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        rVar.n(iArr[0] + ((int) (view.getWidth() / 2.0f)), iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
