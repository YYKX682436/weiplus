package m93;

/* loaded from: classes8.dex */
public class d implements m93.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f325024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m93.i f325026d;

    public d(m93.i iVar, java.lang.String str, long j17, int i17) {
        this.f325026d = iVar;
        this.f325023a = str;
        this.f325024b = j17;
        this.f325025c = i17;
    }

    @Override // m93.h
    public void a() {
        com.tencent.mars.xlog.Log.w("LiteApp.LiteAppGetA8Key", "preAuth failed %s", this.f325023a);
    }

    @Override // m93.h
    public void b(m93.g gVar) {
        com.tencent.mars.xlog.Log.i("LiteApp.LiteAppGetA8Key", "preAuth success %s", this.f325023a);
        this.f325026d.d(new m93.c(this, gVar));
    }
}
