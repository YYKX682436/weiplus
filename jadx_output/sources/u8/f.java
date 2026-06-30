package u8;

/* loaded from: classes15.dex */
public final class f implements u8.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f425250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425251b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f425252c;

    public f(u8.b bVar) {
        t9.p pVar = bVar.P0;
        this.f425252c = pVar;
        pVar.w(12);
        this.f425250a = pVar.p();
        this.f425251b = pVar.p();
    }

    @Override // u8.e
    public int a() {
        int i17 = this.f425250a;
        return i17 == 0 ? this.f425252c.p() : i17;
    }

    @Override // u8.e
    public int b() {
        return this.f425251b;
    }

    @Override // u8.e
    public boolean c() {
        return this.f425250a != 0;
    }
}
