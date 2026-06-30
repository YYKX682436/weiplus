package ib5;

/* loaded from: classes13.dex */
public class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib5.d f290247d;

    public c(ib5.d dVar) {
        this.f290247d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ib5.d dVar = this.f290247d;
        dVar.f290254g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        dVar.l(dVar.f290254g.getMeasuredWidth(), dVar.f290254g.getMeasuredHeight());
    }
}
