package mj;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326962d;

    public e(android.content.Context context) {
        this.f326962d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i.f326968o = new mj.i(this.f326962d, new com.tencent.matrix.trace.view.FloatFrameView(this.f326962d));
        java.lang.Object obj = mj.i.f326969p;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
