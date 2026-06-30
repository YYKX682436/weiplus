package rk4;

/* loaded from: classes10.dex */
public final class c6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b21.r f396582b;

    public c6(android.content.Context context, b21.r rVar) {
        this.f396581a = context;
        this.f396582b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.yr4 yr4Var = (r45.yr4) fVar.f70618d;
            ll3.h2.f319180a.b(this.f396581a, yr4Var.f391324d, yr4Var.f391325e, yr4Var.f391326f, yr4Var.f391327g, this.f396582b, null, rk4.b6.f396563a);
        }
        return jz5.f0.f302826a;
    }
}
