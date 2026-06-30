package t23;

/* loaded from: classes10.dex */
public class h extends t23.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f415158d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415159e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f415160f;

    /* renamed from: g, reason: collision with root package name */
    public final long f415161g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f415162h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f415163i;

    /* renamed from: m, reason: collision with root package name */
    public final long f415164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t23.j f415165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t23.j jVar, java.lang.String str, int i17, java.lang.String str2, long j17, int i18, long j18) {
        super(jVar);
        this.f415165n = jVar;
        this.f415158d = str;
        this.f415159e = i17;
        this.f415160f = str2;
        this.f415161g = j17;
        this.f415164m = j18;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        if (this.f415162h) {
            return false;
        }
        android.graphics.Bitmap b17 = this.f415165n.f415186a.b(this.f415158d, this.f415160f, this.f415161g, null, this.f415164m);
        this.f415163i = b17;
        if (b17 != null && !b17.isRecycled()) {
            return true;
        }
        if (this.f415162h) {
            return false;
        }
        android.graphics.Bitmap f17 = t23.t1.f(this.f415161g, this.f415159e, this.f415158d, this.f415160f, 12288);
        this.f415163i = f17;
        if (f17 == null || f17.isRecycled()) {
            return false;
        }
        this.f415165n.f415186a.c(this.f415158d, this.f415160f, this.f415161g, this.f415163i, null, this.f415164m);
        return true;
    }
}
