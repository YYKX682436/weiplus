package ms4;

/* loaded from: classes8.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.h f331015a;

    public f(ms4.h hVar) {
        this.f331015a = hVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.fs3 fs3Var = (r45.fs3) fVar.f70618d;
        if (fs3Var == null) {
            return null;
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return fs3Var;
        }
        this.f331015a.f331030f.postValue(java.lang.Long.valueOf(fs3Var.f374585d));
        os4.h.l(fs3Var.f374585d);
        return fs3Var;
    }
}
