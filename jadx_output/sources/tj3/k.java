package tj3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f419756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f419757e;

    public k(tj3.p pVar, android.graphics.Rect rect) {
        this.f419756d = pVar;
        this.f419757e = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tj3.p pVar = this.f419756d;
        boolean z17 = pVar.f419792k;
        android.graphics.Rect rect = this.f419757e;
        if (z17) {
            boolean z18 = pVar.f419791j;
            pVar.b().setX((rect.right - pVar.b().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)) - pVar.b().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr));
            pVar.b().setY((rect.bottom - pVar.b().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)) - pVar.b().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1));
            pVar.b().setVisibility(z18 ? 0 : 4);
        }
        pVar.c().setVisibility(pVar.f419791j ? 0 : 4);
        if (pVar.f419791j) {
            pVar.d().setVisibility(0);
            android.widget.TextView d17 = pVar.d();
            android.view.ViewGroup.LayoutParams layoutParams = pVar.d().getLayoutParams();
            if (layoutParams != null) {
                int width = rect.width() - pVar.a();
                pVar.d().setMaxWidth(width);
                pVar.d().setWidth(width);
                layoutParams.width = width;
                layoutParams.height = pVar.d().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479720dd);
            } else {
                layoutParams = null;
            }
            d17.setLayoutParams(layoutParams);
        }
    }
}
