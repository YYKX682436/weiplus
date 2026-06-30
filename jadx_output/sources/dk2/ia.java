package dk2;

/* loaded from: classes3.dex */
public final class ia extends dk2.t4 {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f233619b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f233620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f233619b = jz5.h.b(new dk2.ha(this));
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20128) {
            return null;
        }
        r45.aj1 aj1Var = new r45.aj1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        byte[] g17 = byteString != null ? byteString.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            aj1Var.parseFrom(g17);
            return aj1Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            return null;
        }
    }

    public final boolean F() {
        dk2.zf t17 = t();
        dk2.fg fgVar = t17 instanceof dk2.fg ? (dk2.fg) t17 : null;
        return (fgVar != null ? fgVar.q() : null) != null;
    }

    public final dk2.zf t() {
        return (dk2.zf) ((jz5.n) this.f233619b).getValue();
    }
}
