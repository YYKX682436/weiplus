package fl1;

/* loaded from: classes5.dex */
public final class q implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.s f263845d;

    public q(fl1.s sVar) {
        this.f263845d = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        fl1.s sVar = this.f263845d;
        int lineHeight = sVar.f263857g.getLineHeight();
        int height = sVar.f263858h.getHeight();
        if (lineHeight > height) {
            if (sVar.f263859i.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams = sVar.f263859i.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (lineHeight - height) / 2;
            }
        } else if (sVar.f263857g.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.LayoutParams layoutParams2 = sVar.f263857g.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (height - lineHeight) / 2;
        }
        sVar.f263857g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
