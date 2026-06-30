package r9;

/* loaded from: classes7.dex */
public abstract class w implements r9.j {

    /* renamed from: a, reason: collision with root package name */
    public final r9.z f393438a = new r9.z();

    @Override // r9.j
    public r9.k createDataSource() {
        r9.z zVar = this.f393438a;
        af1.b bVar = (af1.b) this;
        return af1.c.f4463b ? new af1.a(bVar.f4456b, null, bVar.f4457c, bVar.f4458d, bVar.f4459e, bVar.f4460f, zVar) : new r9.s(bVar.f4456b, null, bVar.f4457c, bVar.f4458d, bVar.f4459e, bVar.f4460f, zVar);
    }
}
