package g01;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g01.f f267411e;

    public e(g01.f fVar, java.lang.String str) {
        this.f267411e = fVar;
        this.f267410d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f267411e.f267412a.setMMTitle(this.f267410d);
    }
}
