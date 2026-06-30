package jx0;

/* loaded from: classes5.dex */
public class n extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f302386d;

    public n(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout mJSlidingTabLayout, android.content.Context context) {
        super(context);
        this.f302386d = new java.util.ArrayList();
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        ((java.util.ArrayList) this.f302386d).clear();
    }
}
