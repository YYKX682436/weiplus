package rk4;

/* loaded from: classes11.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(yz5.l lVar) {
        super(1);
        this.f396962d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.ting.TingFinderContactInfo tingFinderContactInfo;
        bw5.d0 d0Var = (bw5.d0) obj;
        if (d0Var != null) {
            boolean[] zArr = d0Var.f26266h;
            tingFinderContactInfo = new com.tencent.pigeon.ting.TingFinderContactInfo(zArr[1] ? d0Var.f26262d : "", zArr[2] ? d0Var.f26263e : "", zArr[3] ? d0Var.f26264f : "", java.lang.Boolean.valueOf(d0Var.f26265g));
        } else {
            tingFinderContactInfo = null;
        }
        this.f396962d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(tingFinderContactInfo)));
        return jz5.f0.f302826a;
    }
}
