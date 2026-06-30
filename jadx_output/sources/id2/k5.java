package id2;

/* loaded from: classes2.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f290649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(id2.p5 p5Var) {
        super(1);
        this.f290649d = p5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f290649d.f290747h;
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(8);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("loadingBar");
        throw null;
    }
}
