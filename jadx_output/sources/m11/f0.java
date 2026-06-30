package m11;

/* loaded from: classes12.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f322686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f322688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f322689g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f322690h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322691i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m11.l0 f322692m;

    public f0(m11.l0 l0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str, float f17, boolean z17, int i17, java.lang.String str2) {
        this.f322692m = l0Var;
        this.f322686d = f9Var;
        this.f322687e = str;
        this.f322688f = f17;
        this.f322689g = z17;
        this.f322690h = i17;
        this.f322691i = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f322692m.s0(this.f322686d, this.f322687e, true, this.f322688f, true, false, this.f322689g, this.f322690h);
        if (m11.l0.f322735v == -1) {
            boolean equals = "1".equals(j62.e.g().a("clicfg_c2c_image_checkrefresh_check_diff", "1", false, true));
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "checkrefreshCheckDiff, check = " + equals);
            m11.l0.f322735v = equals ? 1 : 0;
        }
        this.f322692m.f322744n.d(new m11.e0(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|loadImageBackground";
    }
}
