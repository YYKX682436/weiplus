package vv1;

/* loaded from: classes9.dex */
public abstract class d implements java.lang.Runnable, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final wv1.a f440405d;

    /* renamed from: e, reason: collision with root package name */
    public vv1.a f440406e;

    /* renamed from: f, reason: collision with root package name */
    public long f440407f;

    /* renamed from: g, reason: collision with root package name */
    public long f440408g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f440409h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f440410i = new vv1.c(this);

    public d(wv1.a aVar, vv1.a aVar2, im5.b bVar) {
        this.f440405d = aVar;
        this.f440406e = aVar2;
        if (bVar != null) {
            bVar.keep(this);
        }
    }

    public synchronized void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Base", "callFail");
        vv1.a aVar = this.f440406e;
        if (aVar != null) {
            aVar.c();
            this.f440406e = null;
        }
    }

    public synchronized void b(long j17, long j18) {
        vv1.a aVar;
        this.f440407f = j17;
        this.f440408g = j18;
        if (this.f440409h && (aVar = this.f440406e) != null) {
            aVar.a(j17, j18);
        }
    }

    public synchronized void c(com.tencent.mm.choosemsgfile.compat.MsgFile msgFile) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Base", "onDownloadSuccess msgFile:%s", msgFile);
        vv1.a aVar = this.f440406e;
        if (aVar != null) {
            aVar.d(msgFile);
            this.f440406e = null;
        }
    }

    public abstract boolean d();

    @Override // im5.a
    public void dead() {
    }

    public abstract boolean j();

    public abstract void k();

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.i(this.f440410i, 2000L);
        k();
    }

    public java.lang.String toString() {
        return "MsgFileWorker_Base{mMsgItem=" + this.f440405d + '}';
    }
}
