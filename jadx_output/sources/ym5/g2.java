package ym5;

/* loaded from: classes13.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f463339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f463340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.view.MMPAGView mMPAGView, boolean z17) {
        super(0);
        this.f463339d = mMPAGView;
        this.f463340e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463339d;
        org.libpag.PAGView pAGView = mMPAGView.f213328e;
        boolean z17 = this.f463340e;
        pAGView.setVisibility(z17 ? 8 : 0);
        mMPAGView.f213329f.setVisibility(z17 ? 0 : 8);
        return jz5.f0.f302826a;
    }
}
