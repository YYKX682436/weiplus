package ks2;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks2.m f311612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ks2.m mVar) {
        super(1);
        this.f311612d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.sa1 it = (r45.sa1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ks2.m mVar = this.f311612d;
        mVar.f311617d = false;
        mVar.f311616c = true;
        androidx.lifecycle.j0 j0Var = mVar.f311615b;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        j0Var.postValue(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(it.getList(2))));
        return jz5.f0.f302826a;
    }
}
