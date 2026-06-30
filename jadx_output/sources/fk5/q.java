package fk5;

/* loaded from: classes12.dex */
public final class q implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f263671a;

    public q(com.tencent.mm.storage.f9 f9Var) {
        this.f263671a = f9Var;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        java.util.Map map = kotlin.jvm.internal.m0.h(obj) ? (java.util.Map) obj : null;
        if (map != null) {
            fk5.y yVar = fk5.y.f263683d;
            com.tencent.mm.storage.f9 f9Var = this.f263671a;
            kotlin.jvm.internal.o.d(f9Var);
            yVar.e(f9Var, map, true);
        }
    }
}
