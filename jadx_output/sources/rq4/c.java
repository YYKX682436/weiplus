package rq4;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: m, reason: collision with root package name */
    public static final rq4.b f398938m = new rq4.b(null);

    /* renamed from: a, reason: collision with root package name */
    public rq4.a f398939a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f398940b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f398941c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f398942d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f398943e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f398944f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f398945g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f398946h;

    /* renamed from: i, reason: collision with root package name */
    public long f398947i;

    /* renamed from: j, reason: collision with root package name */
    public long f398948j;

    /* renamed from: k, reason: collision with root package name */
    public long f398949k;

    /* renamed from: l, reason: collision with root package name */
    public long f398950l;

    public final void a() {
        sq4.b bVar;
        java.util.HashMap hashMap = this.f398940b;
        sq4.b bVar2 = (sq4.b) hashMap.get("InitCamera");
        if (bVar2 != null) {
            bVar2.a();
        }
        if (this.f398947i != 0 || (bVar = (sq4.b) hashMap.get("InitCamera")) == null) {
            return;
        }
        this.f398947i = bVar.f411381i;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "onCameraInitFinish cost " + this.f398947i);
    }
}
