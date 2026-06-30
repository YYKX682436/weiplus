package dt1;

/* loaded from: classes12.dex */
public final class f extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f243149i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f243150m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f243151n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f243152o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f243153p;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.f.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    @Override // dt1.a
    public long H() {
        return this.f243153p.getMsgId();
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.e("Byp.CgiBypSendText", "[onSendFailed] bizType=" + this.f243149i + " sessionId=" + this.f243150m + " toUsername=" + this.f243152o + " fromUsername=" + this.f243151n + " text=,errCode" + i18);
        com.tencent.mm.storage.f9 f9Var = this.f243153p;
        f9Var.r1(5);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.getMsgId(), f9Var);
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.storage.f9 f9Var = this.f243153p;
        f9Var.r1(2);
        f9Var.o1(resp.f385130d);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.getMsgId(), f9Var);
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSendText", "[onSendSuccessfully] bizType=" + this.f243149i + " msgSvrId=" + resp.f385130d + " text= sessionId=" + this.f243150m + " toUsername=" + this.f243152o + " fromUsername=" + this.f243151n);
    }
}
