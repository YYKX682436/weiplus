package r36;

/* loaded from: classes16.dex */
public class y extends m36.b implements r36.b0 {

    /* renamed from: e, reason: collision with root package name */
    public final r36.c0 f369469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.z f369470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r36.z zVar, r36.c0 c0Var) {
        super("OkHttp %s", zVar.f369474g);
        this.f369470f = zVar;
        this.f369469e = c0Var;
    }

    @Override // m36.b
    public void a() {
        r36.b bVar;
        r36.z zVar = this.f369470f;
        r36.c0 c0Var = this.f369469e;
        r36.b bVar2 = r36.b.INTERNAL_ERROR;
        try {
            try {
                try {
                    c0Var.c(this);
                    do {
                    } while (c0Var.b(false, this));
                    bVar = r36.b.NO_ERROR;
                    try {
                        bVar2 = r36.b.CANCEL;
                        zVar.a(bVar, bVar2);
                    } catch (java.io.IOException unused) {
                        bVar2 = r36.b.PROTOCOL_ERROR;
                        zVar.a(bVar2, bVar2);
                        m36.e.c(c0Var);
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        zVar.a(bVar, bVar2);
                    } catch (java.io.IOException unused2) {
                    }
                    m36.e.c(c0Var);
                    throw th;
                }
            } catch (java.io.IOException unused3) {
                bVar = bVar2;
            } catch (java.lang.Throwable th7) {
                th = th7;
                bVar = bVar2;
                zVar.a(bVar, bVar2);
                m36.e.c(c0Var);
                throw th;
            }
        } catch (java.io.IOException unused4) {
        }
        m36.e.c(c0Var);
    }
}
