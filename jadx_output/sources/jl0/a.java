package jl0;

/* loaded from: classes13.dex */
public class a implements gl0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl0.a f300192a;

    public a(gl0.a aVar) {
        this.f300192a = aVar;
    }

    @Override // gl0.a
    public void a(fl0.b bVar, long j17, boolean z17, float f17) {
        gl0.a aVar = this.f300192a;
        if (aVar != null) {
            aVar.a(bVar, j17, z17, f17);
        }
        if (nl0.c.f338161c == null) {
            nl0.c.b();
        }
        nl0.f fVar = nl0.c.f338161c;
        java.lang.String str = z17 ? "1" : "0";
        fVar.getClass();
        java.lang.String c17 = bVar != null ? ((pl0.e) bVar).c() : null;
        if (c17 == null) {
            return;
        }
        dm.l9 l9Var = new dm.l9();
        l9Var.field_uid = c17;
        l9Var.field_biz = "MomentVideo";
        l9Var.field_ret = str;
        l9Var.field_save_time = java.lang.System.currentTimeMillis();
        fVar.insert(l9Var);
    }

    @Override // gl0.a
    public void b(fl0.b bVar) {
        gl0.a aVar = this.f300192a;
        if (aVar != null) {
            aVar.b(bVar);
        }
    }
}
