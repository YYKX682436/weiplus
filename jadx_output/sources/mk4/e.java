package mk4;

/* loaded from: classes14.dex */
public final class e implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk4.h f327147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f327148b;

    public e(mk4.h hVar, kotlin.jvm.internal.h0 h0Var) {
        this.f327147a = hVar;
        this.f327148b = h0Var;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        mk4.h hVar = this.f327147a;
        com.tencent.mars.xlog.Log.i(hVar.d(), "captureFrame end result:" + i17 + " isValid:" + hVar.f327159f + '.');
        if (i17 == 0 && hVar.f327159f) {
            hVar.f327158e = (android.graphics.Bitmap) this.f327148b.f310123d;
        }
    }
}
