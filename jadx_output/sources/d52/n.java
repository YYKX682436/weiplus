package d52;

/* loaded from: classes13.dex */
public final class n extends d52.a {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f226545b = kotlinx.coroutines.z0.a(new d52.g());

    /* renamed from: c, reason: collision with root package name */
    public final u26.w f226546c = u26.z.a(10, null, null, 6, null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f226547d = jz5.h.b(new d52.m(this));

    @Override // d52.a
    public void a(d52.b bVar) {
        if (bVar == null) {
            return;
        }
        jz5.g gVar = this.f226547d;
        android.os.Message obtainMessage = ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = bVar;
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).sendMessage(obtainMessage);
    }
}
