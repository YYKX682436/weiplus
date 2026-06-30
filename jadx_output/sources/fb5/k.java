package fb5;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fb5.m f260893e;

    public k(fb5.m mVar, java.util.List list) {
        this.f260893e = mVar;
        this.f260892d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f260893e.a(this.f260892d);
    }
}
