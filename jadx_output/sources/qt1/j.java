package qt1;

/* loaded from: classes2.dex */
public final class j extends qt1.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f366536c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f366537d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f366538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f366539f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.String r2, java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "plateNo"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "wxaAppID"
            kotlin.jvm.internal.o.g(r3, r0)
            r45.xq5 r0 = new r45.xq5
            r0.<init>()
            r0.f390339d = r2
            r0.f390340e = r3
            r0.f390341f = r4
            r45.yq5 r3 = new r45.yq5
            r3.<init>()
            r1.<init>(r0, r3)
            r1.f366536c = r2
            java.lang.String r2 = "MicroMsg.CgiReportPlateNoChosen"
            r1.f366537d = r2
            java.lang.String r2 = "/cgi-bin/mmbiz-bin/wxabusiness/reportuserplateinfo"
            r1.f366538e = r2
            r2 = 6606(0x19ce, float:9.257E-42)
            r1.f366539f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qt1.j.<init>(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // qt1.c
    public int a() {
        return this.f366539f;
    }

    @Override // qt1.c
    public java.lang.String b() {
        return this.f366537d;
    }

    @Override // qt1.c
    public java.lang.String c() {
        return this.f366538e;
    }

    @Override // qt1.c
    public java.lang.Object e(kotlin.coroutines.Continuation continuation) {
        d("send chosen " + this.f366536c);
        return super.e(continuation);
    }
}
