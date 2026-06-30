package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class be implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f197880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMTabView f197881f;

    public be(com.tencent.mm.ui.MMTabView mMTabView, java.lang.String str, int i17) {
        this.f197881f = mMTabView;
        this.f197879d = str;
        this.f197880e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMTabView mMTabView = this.f197881f;
        mMTabView.f196915f.setText(this.f197879d);
        mMTabView.f196915f.setBackgroundResource(this.f197880e);
        mMTabView.getUnread();
        la5.b.f317600a.d(mMTabView, mMTabView.getText(), mMTabView.getUnread(), mMTabView.f196916g);
    }
}
