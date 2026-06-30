package dk2;

/* loaded from: classes3.dex */
public final class v5 extends dk2.t4 implements dk2.cg, dk2.fg {

    /* renamed from: b, reason: collision with root package name */
    public boolean f234235b;

    /* renamed from: c, reason: collision with root package name */
    public int f234236c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f234237d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f234238e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234239f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.eg
    public boolean A() {
        return this.f234235b;
    }

    @Override // dk2.cg
    public void B(boolean z17) {
        this.f234238e = z17;
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20124) {
            return null;
        }
        r45.ei1 ei1Var = new r45.ei1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        byte[] g17 = byteString != null ? byteString.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            ei1Var.parseFrom(g17);
            return ei1Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            return null;
        }
    }

    @Override // dk2.fg
    public void E(java.lang.String str) {
        this.f234239f = str;
    }

    @Override // dk2.fg
    public java.lang.String b() {
        return this.f234239f;
    }

    @Override // dk2.eg
    public void c(boolean z17) {
        this.f234235b = z17;
    }

    @Override // dk2.cg
    public void d(boolean z17) {
        this.f234237d = z17;
    }

    @Override // dk2.cg
    public boolean g() {
        return this.f234238e;
    }

    @Override // dk2.cg
    public boolean o() {
        return this.f234237d;
    }

    @Override // dk2.fg
    public jz5.l q() {
        java.lang.Object D = D();
        r45.ei1 ei1Var = D instanceof r45.ei1 ? (r45.ei1) D : null;
        if (ei1Var == null) {
            return null;
        }
        java.lang.String string = ei1Var.getString(0);
        com.tencent.mm.protobuf.g byteString = ei1Var.getByteString(1);
        if (string == null || byteString == null) {
            return null;
        }
        return new jz5.l(string, byteString);
    }

    @Override // dk2.cg
    public int s() {
        return this.f234236c;
    }

    @Override // dk2.cg
    public void w(int i17) {
        this.f234236c = i17;
    }
}
