package sn1;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f409982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f409983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f409984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f409985g;

    public b(boolean z17, int i17, byte[] bArr, int i18) {
        this.f409982d = z17;
        this.f409983e = i17;
        this.f409984f = bArr;
        this.f409985g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        sn1.h hVar = sn1.i.f410015i;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupBaseScene", "callbackToNotify, onNotify is null");
            return;
        }
        hVar.b(this.f409982d, this.f409983e, this.f409984f, this.f409985g);
    }
}
