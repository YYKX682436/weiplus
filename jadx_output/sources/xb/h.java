package xb;

/* loaded from: classes15.dex */
public class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.robinhood.ticker.TickerView f452874d;

    public h(com.robinhood.ticker.TickerView tickerView) {
        this.f452874d = tickerView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.robinhood.ticker.TickerView tickerView = this.f452874d;
        java.util.ArrayList arrayList = tickerView.f45830f.f452864a;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            xb.d dVar = (xb.d) arrayList.get(i17);
            dVar.a();
            dVar.f452860n = dVar.f452858l;
        }
        tickerView.a();
        tickerView.invalidate();
    }
}
