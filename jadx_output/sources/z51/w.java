package z51;

/* loaded from: classes10.dex */
public final class w extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MultiTouchImageView f470228f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f470229g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470230h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f470231i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f470232j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f470233k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y51.a pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f470230h = "";
        this.f470232j = true;
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoThumbViewPc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        kotlin.jvm.internal.o.g(config, "config");
        super.d(config);
        java.lang.String str = config.f1718b.f1719a;
        kotlin.jvm.internal.o.f(str, "getThumbPath(...)");
        this.f470230h = str;
        a61.d dVar = config.f1717a;
        this.f470231i = dVar.f1727d;
        f("needLongPressToPlay >> " + this.f470231i);
        this.f470232j = dVar.f1731h;
        if (this.f470230h.length() == 0) {
            throw new java.lang.IllegalArgumentException("thumb path is Empty");
        }
    }

    @Override // z51.x
    public void j() {
        kotlinx.coroutines.r2 r2Var = this.f470229g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        super.j();
    }
}
