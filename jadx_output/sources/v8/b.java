package v8;

/* loaded from: classes15.dex */
public class b implements q8.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v8.c f433973a;

    public b(v8.c cVar, v8.a aVar) {
        this.f433973a = cVar;
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        v8.c cVar = this.f433973a;
        if (j17 == 0) {
            return cVar.f433975b;
        }
        long j18 = (cVar.f433977d.f434022i * j17) / 1000000;
        long j19 = cVar.f433976c;
        long j27 = cVar.f433975b;
        long j28 = (((j18 * (j19 - j27)) / cVar.f433979f) - 30000) + j27;
        if (j28 >= j27) {
            j27 = j28;
        }
        return j27 >= j19 ? j19 - 1 : j27;
    }

    @Override // q8.m
    public long g() {
        return (this.f433973a.f433979f * 1000000) / r0.f433977d.f434022i;
    }
}
