package ht2;

/* loaded from: classes2.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f284853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284854e;

    public l(yz5.p pVar, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f284853d = pVar;
        this.f284854e = weImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f284853d.invoke(null, this.f284854e);
    }
}
