package z51;

/* loaded from: classes10.dex */
public final class h extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public boolean f470187f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y51.a pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f470187f = true;
        this.f470188g = "";
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoPlayErrorViewPc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        kotlin.jvm.internal.o.g(config, "config");
        super.d(config);
        a61.d dVar = config.f1717a;
        this.f470187f = dVar.f1728e;
        java.lang.String str = dVar.f1729f;
        if (str.length() == 0) {
            str = i65.a.r(b(), com.tencent.mm.R.string.o7l);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        this.f470188g = str;
    }
}
