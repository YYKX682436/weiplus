package hw;

@j95.b
/* loaded from: classes7.dex */
public final class j1 extends i95.w implements gw.j {

    /* renamed from: d, reason: collision with root package name */
    public boolean f285390d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f285391e = jz5.h.b(new hw.h1(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f285392f = jz5.h.b(new hw.f1(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f285393g = jz5.h.b(hw.g1.f285380d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f285394h = jz5.h.b(new hw.i1(this));

    public static final void wi(hw.j1 j1Var) {
        if (j1Var.f285390d) {
            return;
        }
        jz5.g gVar = ew.e.f256965a;
        if (((java.lang.Number) ((jz5.n) ew.e.f256967c).getValue()).intValue() <= 0) {
            return;
        }
        fp.d0.n("owl");
        fp.d0.n("ilink_protobuf");
        fp.d0.n("magic_brush_zidl");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicFlutterPluginFeatureService", "load mb zidl lib");
        j1Var.f285390d = true;
    }

    public final fw.h Ai() {
        return (fw.h) ((jz5.n) this.f285392f).getValue();
    }

    public final fw.w Bi() {
        return (fw.w) ((jz5.n) this.f285393g).getValue();
    }
}
