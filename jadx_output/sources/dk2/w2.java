package dk2;

/* loaded from: classes.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f234271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f234272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.o12 f234273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f234275i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234276m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(int i17, int i18, yz5.q qVar, r45.o12 o12Var, java.lang.String str, r45.hx0 hx0Var, dk2.r4 r4Var) {
        super(0);
        this.f234270d = i17;
        this.f234271e = i18;
        this.f234272f = qVar;
        this.f234273g = o12Var;
        this.f234274h = str;
        this.f234275i = hx0Var;
        this.f234276m = r4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f234270d;
        r45.o12 o12Var = this.f234273g;
        yz5.q qVar = this.f234272f;
        if (i17 == 0 && this.f234271e == 0) {
            if (qVar != null) {
                qVar.invoke(java.lang.Boolean.TRUE, "", o12Var);
            }
        } else if (qVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.String str = this.f234274h;
            qVar.invoke(bool, str != null ? str : "", o12Var);
        }
        r45.hx0 hx0Var = this.f234275i;
        if (hx0Var.getInteger(0) == 106) {
            r45.l12 l12Var = new r45.l12();
            com.tencent.mm.protobuf.g byteString = hx0Var.getByteString(1);
            l12Var.parseFrom(byteString != null ? byteString.g() : null);
            ((ws2.j2) this.f234276m.m(ws2.j2.class)).f449061h.remove(java.lang.Long.valueOf(l12Var.getLong(0)));
        }
        return jz5.f0.f302826a;
    }
}
