package xb;

/* loaded from: classes15.dex */
public class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.robinhood.ticker.TickerView f452873d;

    public g(com.robinhood.ticker.TickerView tickerView) {
        this.f452873d = tickerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.robinhood.ticker.TickerView tickerView = this.f452873d;
        tickerView.f45830f.a(valueAnimator.getAnimatedFraction());
        tickerView.a();
        tickerView.invalidate();
    }
}
