package sj3;

/* loaded from: classes14.dex */
public class p extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.CollapseView f408675f;

    public p(com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView, android.view.View view, int i17) {
        this.f408675f = collapseView;
        this.f408673d = view;
        this.f408674e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        this.f408675f.f150326y = f17 == 1.0f;
        android.view.View view = this.f408673d;
        if (view.getLayoutParams().height == sj3.i1.f408566k || f17 == 1.0f) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i17 = sj3.i1.f408570o;
        int i18 = this.f408674e;
        layoutParams.height = i17 - ((int) (i18 * f17));
        view.getLayoutParams().width = i17 - ((int) (i18 * f17));
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        int i19 = sj3.i1.f408563h;
        int i27 = sj3.i1.f408562g;
        layoutParams2.bottomMargin = i19 - ((int) ((i19 - i27) * f17));
        ((android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (i27 * f17);
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
