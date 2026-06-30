package qt1;

/* loaded from: classes2.dex */
public final class e extends qt1.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f366516c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f366517d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f366518e;

    /* renamed from: f, reason: collision with root package name */
    public final int f366519f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "plateNo"
            kotlin.jvm.internal.o.g(r3, r0)
            r45.pd0 r0 = new r45.pd0
            r0.<init>()
            r0.f382955d = r3
            r45.qd0 r1 = new r45.qd0
            r1.<init>()
            r2.<init>(r0, r1)
            r2.f366516c = r3
            java.lang.String r3 = "MicroMsg.CgiDeletePlateNo"
            r2.f366517d = r3
            java.lang.String r3 = "/cgi-bin/mmbiz-bin/wxabusiness/deleteuserplateinfo"
            r2.f366518e = r3
            r3 = 5988(0x1764, float:8.391E-42)
            r2.f366519f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qt1.e.<init>(java.lang.String):void");
    }

    @Override // qt1.c
    public int a() {
        return this.f366519f;
    }

    @Override // qt1.c
    public java.lang.String b() {
        return this.f366517d;
    }

    @Override // qt1.c
    public java.lang.String c() {
        return this.f366518e;
    }

    @Override // qt1.c
    public java.lang.Object e(kotlin.coroutines.Continuation continuation) {
        d("send delete plateNo:" + this.f366516c);
        return super.e(continuation);
    }
}
