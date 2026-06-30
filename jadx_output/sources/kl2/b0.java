package kl2;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f308752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kl2.e0 e0Var) {
        super(1);
        this.f308752d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ql1 ql1Var;
        long longValue = ((java.lang.Number) obj).longValue();
        kl2.e0 e0Var = this.f308752d;
        r45.f82 f82Var = e0Var.f308766i;
        if (f82Var != null && (ql1Var = (r45.ql1) f82Var.getCustom(2)) != null) {
            ql1Var.set(1, java.lang.Long.valueOf(longValue));
            e0Var.f308765h.setText(e0Var.f308758a.getResources().getString(com.tencent.mm.R.string.ebm, java.lang.Long.valueOf(longValue)));
            ((il2.r) e0Var.f308759b).u1(ql1Var, false);
            e0Var.f308761d.invoke();
        }
        return jz5.f0.f302826a;
    }
}
