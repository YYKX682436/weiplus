package ht2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f284943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.view.MMPAGView mMPAGView) {
        super(1);
        this.f284943d = mMPAGView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f284943d;
        mMPAGView.post(new ht2.y(mMPAGView));
        return jz5.f0.f302826a;
    }
}
