package ht2;

/* loaded from: classes2.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f284869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f284870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f284871f;

    public o(yz5.p pVar, android.widget.TextView textView, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f284869d = pVar;
        this.f284870e = textView;
        this.f284871f = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f284869d.invoke(this.f284870e, this.f284871f);
    }
}
