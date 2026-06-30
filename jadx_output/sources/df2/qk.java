package df2;

/* loaded from: classes3.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f231166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f231167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.pl f231168f;

    public qk(android.widget.TextView textView, android.widget.RelativeLayout.LayoutParams layoutParams, df2.pl plVar) {
        this.f231166d = textView;
        this.f231167e = layoutParams;
        this.f231168f = plVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = pm0.v.t(this.f231166d)[0];
        df2.pl plVar = this.f231168f;
        android.widget.TextView textView = plVar.f231099y;
        kotlin.jvm.internal.o.d(textView);
        int dimensionPixelSize = i17 - textView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int i18 = dimensionPixelSize >= 0 ? dimensionPixelSize : 0;
        android.widget.RelativeLayout.LayoutParams layoutParams = this.f231167e;
        layoutParams.setMargins(i18, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        android.widget.TextView textView2 = plVar.f231099y;
        if (textView2 == null) {
            return;
        }
        textView2.setLayoutParams(layoutParams);
    }
}
