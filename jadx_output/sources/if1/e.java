package if1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl1.a f291064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f291065e;

    public e(if1.g gVar, gl1.a aVar, byte[] bArr) {
        this.f291064d = aVar;
        this.f291065e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f291064d.setImageByteArray(this.f291065e);
    }
}
