package j32;

/* loaded from: classes4.dex */
public class a extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f297396f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f297397g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f297398h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f297399i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f297400m;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, h32.b bVar) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f297396f = str == null ? "" : str;
        this.f297397g = str2 == null ? "" : str2;
        this.f297398h = str3 == null ? "" : str3;
        this.f297399i = str4 == null ? "" : str4;
        this.f297400m = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f I() {
        return new r45.i80();
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f J() {
        return new r45.j80();
    }

    @Override // h32.a
    public void K(com.tencent.mm.protobuf.f fVar) {
        r45.i80 i80Var = (r45.i80) fVar;
        i80Var.f376805d = this.f297396f;
        i80Var.f376806e = this.f297397g;
        i80Var.f376807f = this.f297398h;
        i80Var.f376808g = this.f297399i;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1799;
    }

    @Override // h32.a
    public java.lang.String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/mydevice/connectedrouter";
    }

    @Override // h32.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        v0Var.toString();
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        h32.b bVar = (h32.b) this.f297400m.get();
        if (bVar != null) {
            bVar.a(i18, i19, str, this);
        }
    }
}
