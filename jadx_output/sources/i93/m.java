package i93;

/* loaded from: classes11.dex */
public class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI f289755d;

    public m(com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI) {
        this.f289755d = labelSearchUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("translationY")).floatValue();
        com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI = this.f289755d;
        androidx.recyclerview.widget.RecyclerView recyclerView = labelSearchUI.f143386d;
        if (recyclerView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) (((labelSearchUI.f143389g == 0) || labelSearchUI.f143396q.getVisibility() != 0) ? 0.0f : labelSearchUI.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj) - floatValue);
                labelSearchUI.f143386d.setLayoutParams(layoutParams);
            }
        }
    }
}
