package hf2;

/* loaded from: classes10.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f281048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(hf2.l2 l2Var) {
        super(1);
        this.f281048d = l2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view;
        if (!((java.lang.Boolean) obj).booleanValue() && (view = this.f281048d.f281106c) != null) {
            zl2.r4.f473950a.Q2(view);
        }
        return jz5.f0.f302826a;
    }
}
