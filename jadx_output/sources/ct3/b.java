package ct3;

/* loaded from: classes9.dex */
public final class b implements ct3.c {

    /* renamed from: a, reason: collision with root package name */
    public final v05.b f222302a;

    public b(v05.b commonAppMsg) {
        kotlin.jvm.internal.o.g(commonAppMsg, "commonAppMsg");
        this.f222302a = commonAppMsg;
    }

    @Override // ct3.c
    public java.lang.String a() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.r();
        }
        return null;
    }

    @Override // ct3.c
    public int b() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.F();
        }
        return 0;
    }

    @Override // ct3.c
    public java.lang.String c() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.getString(e17.f368364d + 2);
        }
        return null;
    }

    @Override // ct3.c
    public long d() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.getLong(e17.f368364d + 0);
        }
        return 0L;
    }

    public final v05.a e() {
        v05.b bVar = this.f222302a;
        return (v05.a) bVar.getCustom(bVar.f432315e + 8);
    }

    @Override // ct3.c
    public java.lang.String getTitle() {
        v05.b bVar = this.f222302a;
        return bVar.getString(bVar.f368365d + 2);
    }
}
