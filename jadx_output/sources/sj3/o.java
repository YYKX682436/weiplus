package sj3;

/* loaded from: classes14.dex */
public class o extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.CollapseView f408661f;

    public o(com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView, android.view.View view, int i17) {
        this.f408661f = collapseView;
        this.f408659d = view;
        this.f408660e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17;
        this.f408661f.f150326y = f17 == 1.0f;
        android.view.View view = this.f408659d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i18 = this.f408660e;
        layoutParams.height = f17 == 1.0f ? -2 : sj3.i1.f408566k + ((int) (i18 * f17));
        view.getLayoutParams().width = f17 != 1.0f ? sj3.i1.f408566k + ((int) (i18 * f17)) : -2;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        if (f17 == 1.0f) {
            i17 = sj3.i1.f408563h;
        } else {
            i17 = sj3.i1.f408562g + ((int) ((sj3.i1.f408563h - r0) * f17));
        }
        layoutParams2.bottomMargin = i17;
        ((android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (sj3.i1.f408562g * (1.0f - f17));
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
