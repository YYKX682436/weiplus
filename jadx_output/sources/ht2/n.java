package ht2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f284863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f284864e;

    public n(yz5.p pVar, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f284863d = pVar;
        this.f284864e = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f284863d.invoke(null, this.f284864e);
    }
}
