package sb3;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f405431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f405432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb3.c f405433f;

    public a(sb3.c cVar, java.util.Set set, java.lang.ref.WeakReference weakReference) {
        this.f405433f = cVar;
        this.f405431d = set;
        this.f405432e = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            for (java.lang.String str : this.f405431d) {
                if (this.f405432e.get() == null || this.f405433f.f405438d) {
                    com.tencent.mars.xlog.Log.i("AsyncSoundPool", "context = null or soundPool is stopped");
                    this.f405433f.f405435a.release();
                    this.f405433f.f405436b.clear();
                    ((java.util.HashMap) this.f405433f.f405437c).clear();
                    return;
                }
                android.content.res.AssetFileDescriptor openFd = ((android.content.Context) this.f405432e.get()).getResources().getAssets().openFd(str);
                sb3.c cVar = this.f405433f;
                cVar.f405436b.put(str, java.lang.Integer.valueOf(cVar.f405435a.load(openFd, 0)));
                openFd.close();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AsyncSoundPool", "load sound file error:" + e17.getMessage());
        }
    }
}
