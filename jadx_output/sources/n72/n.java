package n72;

/* loaded from: classes14.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f335265d;

    /* renamed from: e, reason: collision with root package name */
    public final android.hardware.Camera f335266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n72.q f335267f;

    public n(n72.q qVar, byte[] bArr, android.hardware.Camera camera) {
        this.f335267f = qVar;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f335265d = bArr2;
        this.f335266e = camera;
        qVar.L.set(qVar.L.get() + 1);
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        if (this.f335267f.f335282q && this.f335267f.f335283r && this.f335267f.G == 2 && (bArr = this.f335265d) != null && bArr.length > 0) {
            k72.j.f304725a.a(bArr, this.f335266e);
            this.f335265d = null;
            this.f335267f.L.set(this.f335267f.L.get() - 1);
        }
    }
}
