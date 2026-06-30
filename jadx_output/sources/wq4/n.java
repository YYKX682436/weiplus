package wq4;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f448681a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f448682b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f448683c;

    /* renamed from: d, reason: collision with root package name */
    public wq4.m f448684d;

    public n(wq4.d dVar) {
    }

    public synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
        if (!this.f448682b) {
            if (!this.f448681a) {
                this.f448681a = true;
            }
            this.f448683c = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
            notifyAll();
            this.f448682b = true;
        }
    }

    public synchronized void b(wq4.m mVar) {
        mVar.getId();
        mVar.f448665e = true;
        if (this.f448684d == mVar) {
            this.f448684d = null;
        }
        notifyAll();
    }
}
