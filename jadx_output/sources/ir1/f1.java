package ir1;

/* loaded from: classes5.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f293970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293971e;

    public f1(ir1.i1 i1Var, android.view.View view) {
        this.f293970d = i1Var;
        this.f293971e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        ir1.i1 i1Var = this.f293970d;
        i1Var.N.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        android.view.View view = this.f293971e;
        view.getLocationOnScreen(iArr2);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.o_p);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = ((iArr[0] + (i1Var.N.getWidth() / 2)) - iArr2[0]) - (findViewById.getWidth() / 2);
        findViewById.setLayoutParams(layoutParams2);
    }
}
