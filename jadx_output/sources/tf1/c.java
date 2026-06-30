package tf1;

/* loaded from: classes7.dex */
public class c implements tf.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf1.f f418856a;

    public c(tf1.f fVar) {
        this.f418856a = fVar;
    }

    @Override // tf.m
    public void a(android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onSnapshotGot");
        java.util.Iterator it = new java.util.ArrayList(this.f418856a.f418863i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).c(bitmap);
        }
    }
}
