package h11;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f278066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h11.e f278067e;

    public b(h11.e eVar, int i17) {
        this.f278067e = eVar;
        this.f278066d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l0(this.f278066d).doScene(this.f278067e.dispatcher(), new h11.a(this));
    }
}
