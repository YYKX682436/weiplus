package qt1;

/* loaded from: classes2.dex */
public final class k extends qt1.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f366540c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f366541d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f366542e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f366543f;

    /* renamed from: g, reason: collision with root package name */
    public final int f366544g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "oldPlateNo"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "newPlateNo"
            kotlin.jvm.internal.o.g(r4, r0)
            r45.at6 r0 = new r45.at6
            r0.<init>()
            r0.f370258d = r3
            r0.f370259e = r4
            r45.bt6 r1 = new r45.bt6
            r1.<init>()
            r2.<init>(r0, r1)
            r2.f366540c = r3
            r2.f366541d = r4
            java.lang.String r3 = "MicroMsg.CgiUpdatePlateNo"
            r2.f366542e = r3
            java.lang.String r3 = "/cgi-bin/mmbiz-bin/wxabusiness/updateuserplateinfo"
            r2.f366543f = r3
            r3 = 4063(0xfdf, float:5.693E-42)
            r2.f366544g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qt1.k.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // qt1.c
    public int a() {
        return this.f366544g;
    }

    @Override // qt1.c
    public java.lang.String b() {
        return this.f366542e;
    }

    @Override // qt1.c
    public java.lang.String c() {
        return this.f366543f;
    }

    @Override // qt1.c
    public java.lang.Object e(kotlin.coroutines.Continuation continuation) {
        d("send update plateNo " + this.f366540c + "=>" + this.f366541d);
        return super.e(continuation);
    }
}
