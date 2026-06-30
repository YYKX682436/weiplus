package x85;

/* loaded from: classes9.dex */
public final class n extends x85.k implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public x85.j f452600d;

    public n(int i17, byte[] bArr, byte[] bArr2, im5.b bVar, x85.j jVar) {
        this.f452600d = jVar;
        if (bVar != null) {
            bVar.keep(this);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", i17);
        bundle.putByteArray("page_buff", bArr);
        bundle.putByteArray("ctx_buff", bArr2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, x85.r.class, new x85.m(this));
    }

    @Override // im5.a
    public void dead() {
        this.f452600d = null;
    }
}
