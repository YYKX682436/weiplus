package jx0;

/* loaded from: classes5.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f302387a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f302388b;

    public o(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout mJSlidingTabLayout) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(mJSlidingTabLayout.getContext());
        this.f302387a = relativeLayout;
        android.widget.TextView textView = new android.widget.TextView(mJSlidingTabLayout.getContext());
        this.f302388b = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.setClipChildren(true);
        relativeLayout.setClipToPadding(false);
        relativeLayout.addView(textView, layoutParams);
    }
}
