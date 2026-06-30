package xk3;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f455043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMImageView f455044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f455045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xk3.o f455047h;

    public l(android.widget.FrameLayout frameLayout, com.tencent.mm.ui.MMImageView mMImageView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, java.lang.String str, xk3.o oVar) {
        this.f455043d = frameLayout;
        this.f455044e = mMImageView;
        this.f455045f = weImageView;
        this.f455046g = str;
        this.f455047h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredWidth = (int) (this.f455043d.getMeasuredWidth() * 0.75d);
        com.tencent.mm.ui.MMImageView mMImageView = this.f455044e;
        mMImageView.setVisibility(0);
        this.f455045f.setVisibility(8);
        mMImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(measuredWidth, measuredWidth, 17));
        n11.a.b().g(this.f455046g, mMImageView);
        this.f455047h.getClass();
        if (mMImageView != null) {
            mMImageView.setOutlineProvider(new xk3.n(true, true, 4.0f));
        }
        if (mMImageView != null) {
            mMImageView.setClipToOutline(true);
        }
        mMImageView.invalidate();
    }
}
