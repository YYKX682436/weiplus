package ql5;

/* loaded from: classes3.dex */
public class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.listview.PullDownListView f364615d;

    public l(com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView) {
        this.f364615d = pullDownListView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f364615d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) pullDownListView.G.getLayoutParams();
        marginLayoutParams.topMargin = num.intValue();
        pullDownListView.G.setLayoutParams(marginLayoutParams);
    }
}
