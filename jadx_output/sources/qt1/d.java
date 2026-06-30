package qt1;

/* loaded from: classes2.dex */
public final class d extends qt1.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f366512c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f366513d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f366514e;

    /* renamed from: f, reason: collision with root package name */
    public final int f366515f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "plateNo"
            kotlin.jvm.internal.o.g(r3, r0)
            r45.ga0 r0 = new r45.ga0
            r0.<init>()
            r0.f375035d = r3
            r45.ha0 r1 = new r45.ha0
            r1.<init>()
            r2.<init>(r0, r1)
            r2.f366512c = r3
            java.lang.String r3 = "MicroMsg.CgiCreatePlateNo"
            r2.f366513d = r3
            java.lang.String r3 = "/cgi-bin/mmbiz-bin/wxabusiness/createuserplateinfo"
            r2.f366514e = r3
            r3 = 5876(0x16f4, float:8.234E-42)
            r2.f366515f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qt1.d.<init>(java.lang.String):void");
    }

    @Override // qt1.c
    public int a() {
        return this.f366515f;
    }

    @Override // qt1.c
    public java.lang.String b() {
        return this.f366513d;
    }

    @Override // qt1.c
    public java.lang.String c() {
        return this.f366514e;
    }

    @Override // qt1.c
    public java.lang.Object e(kotlin.coroutines.Continuation continuation) {
        d("send create " + this.f366512c);
        return super.e(continuation);
    }
}
