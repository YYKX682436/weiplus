package l01;

/* loaded from: classes7.dex */
public class i implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.t f314775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l01.b f314776f;

    public i(l01.b bVar, java.lang.String str, l01.t tVar) {
        this.f314776f = bVar;
        this.f314774d = str;
        this.f314775e = tVar;
    }

    @Override // l01.u
    public void b() {
        l01.t tVar = this.f314775e;
        if (tVar != null) {
            tVar.a(null);
        }
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "BytesLoadTarget";
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        ik1.h0.a().postToWorker(new l01.h(this));
    }
}
