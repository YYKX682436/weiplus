package rk4;

/* loaded from: classes11.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f396855d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.w wVar = (bw5.w) obj;
        if (wVar != null) {
            this.f396855d.f310123d = new com.tencent.pigeon.ting.TingBrandContactInfo(wVar.f34544f[1] ? wVar.f34542d : "", java.lang.Boolean.valueOf(wVar.f34543e));
        }
        return jz5.f0.f302826a;
    }
}
