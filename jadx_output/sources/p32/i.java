package p32;

/* loaded from: classes12.dex */
public class i extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f351469f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f351470g;

    public i(java.lang.String str, h32.b bVar) {
        this.f351469f = str;
        this.f351470g = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f I() {
        return new r45.dc0();
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f J() {
        return new r45.ec0();
    }

    @Override // h32.a
    public void K(com.tencent.mm.protobuf.f fVar) {
        ((r45.dc0) fVar).f372298d = this.f351469f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1792;
    }

    @Override // h32.a
    public java.lang.String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/delfollow";
    }

    @Override // h32.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.plugin.exdevice.model.l3.Ri().z0(this.f351469f);
        }
        h32.b bVar = (h32.b) this.f351470g.get();
        if (bVar != null) {
            bVar.a(i18, i19, str, this);
        }
    }
}
