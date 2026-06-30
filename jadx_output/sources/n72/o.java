package n72;

/* loaded from: classes14.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f335268d;

    /* renamed from: e, reason: collision with root package name */
    public final android.hardware.Camera f335269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n72.q f335270f;

    public o(n72.q qVar, byte[] bArr, android.hardware.Camera camera) {
        this.f335270f = qVar;
        this.f335268d = bArr;
        this.f335269e = camera;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f335270f.f335282q && this.f335270f.f335283r && this.f335270f.G == 2) {
            k72.j.f304725a.a(this.f335268d, this.f335269e);
        }
    }
}
