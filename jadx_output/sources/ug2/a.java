package ug2;

/* loaded from: classes3.dex */
public final class a implements ug2.f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ch1 f427511a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f427512b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.d42 f427513c;

    /* renamed from: d, reason: collision with root package name */
    public long f427514d;

    public a(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f427511a = msg;
        r45.d42 d42Var = null;
        if (msg.getInteger(1) == 20096) {
            r45.d42 d42Var2 = new r45.d42();
            com.tencent.mm.protobuf.g byteString = msg.getByteString(4);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    d42Var2.parseFrom(g17);
                    d42Var = d42Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
        }
        this.f427513c = d42Var;
    }

    @Override // ug2.f
    public void a(long j17) {
        this.f427514d = j17;
    }

    @Override // ug2.f
    public ug2.e b() {
        return ug2.e.f427524f;
    }

    @Override // ug2.f
    public long c() {
        return this.f427514d;
    }

    @Override // ug2.f
    public ug2.d priority() {
        return ug2.d.f427519d;
    }
}
