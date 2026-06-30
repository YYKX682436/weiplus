package uj5;

/* loaded from: classes5.dex */
public final class i implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f428459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f428460b;

    public i(kotlinx.coroutines.q qVar, android.graphics.Bitmap bitmap) {
        this.f428459a = qVar;
        this.f428460b = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        kotlinx.coroutines.q qVar = this.f428459a;
        if (i17 == 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(this.f428460b));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnapShotUtilKt", "PixelCopy failed with error code " + i17);
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
    }
}
