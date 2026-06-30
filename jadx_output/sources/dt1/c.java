package dt1;

/* loaded from: classes12.dex */
public class c extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f243136i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f243137m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f243138n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f243139o;

    /* renamed from: p, reason: collision with root package name */
    public final m11.d f243140p;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, m11.d r15) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.c.<init>(int, java.lang.String, java.lang.String, java.lang.String, m11.d):void");
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.e("Byp.CgiBypSendImage", "[onSendFailed] bizType=" + this.f243136i + " sessionId=" + this.f243137m + " toUsername=" + this.f243139o + " fromUsername=" + this.f243138n + " errCode:" + i18 + " errMsg:" + str);
        ((e80.j) this.f243140p.f322670u).a(resp.f385130d, c01.id.e(), i17, i18, "");
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSendImage", "[onSendSuccessfully] bizType=" + this.f243136i + " msgSvrId=" + resp.f385130d + "  sessionId=" + this.f243137m + " toUsername=" + this.f243139o + " fromUsername=" + this.f243138n);
        ((e80.j) this.f243140p.f322670u).a(resp.f385130d, c01.id.e(), 0, 0, "");
    }
}
