package db5;

/* loaded from: classes4.dex */
public final class b5 implements db5.y4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMOverScrollView f228294a;

    public b5(com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView) {
        this.f228294a = mMOverScrollView;
    }

    public int c() {
        return this.f228294a.getScrollY();
    }

    public void d(int i17) {
        this.f228294a.scrollBy(0, i17);
    }

    public void e(int i17, int i18) {
        com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView = this.f228294a;
        mMOverScrollView.f197506p = false;
        if (i18 < 0) {
            mMOverScrollView.f197500g.startScroll(0, c(), 0, i17, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
        } else {
            mMOverScrollView.f197500g.startScroll(0, c(), 0, i17, i18);
        }
        mMOverScrollView.f197507q = true;
        mMOverScrollView.postInvalidate();
    }
}
