package qa1;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qa1.h f360977f;

    public d(qa1.h hVar, int i17, int i18) {
        this.f360977f = hVar;
        this.f360975d = i17;
        this.f360976e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f360977f;
        android.graphics.SurfaceTexture b17 = hVar.f360999o.b();
        int i17 = this.f360975d;
        int i18 = this.f360976e;
        super/*gh.k*/.onSurfaceTextureSizeChanged(b17, i17, i18);
        hVar.f360998n.t(i17, i18);
    }
}
