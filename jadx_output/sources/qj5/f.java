package qj5;

/* loaded from: classes5.dex */
public final class f implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj5.n f363970a;

    public f(qj5.n nVar) {
        this.f363970a = nVar;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        qj5.n nVar = this.f363970a;
        if (nVar.h()) {
            return insets;
        }
        int i17 = insets.a(1).f247045b;
        android.view.ViewGroup.LayoutParams layoutParams = v17.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        android.content.Context context = nVar.f363989w2;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        layoutParams2.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) + i17;
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, com.tencent.mm.R.id.f483443sl0);
        v17.setLayoutParams(layoutParams2);
        return insets;
    }
}
