package cx;

@j95.b
/* loaded from: classes7.dex */
public final class a2 extends i95.w implements bx.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f224370d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f224371e = jz5.h.b(new cx.y1(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f224372f = jz5.h.b(new cx.w1(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f224373g = jz5.h.b(new cx.v1(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f224374h = jz5.h.b(cx.x1.f224483d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f224375i = jz5.h.b(new cx.z1(this));

    public static final void wi(cx.a2 a2Var) {
        if (a2Var.f224370d || yw.x0.f466500a.a() <= 0) {
            return;
        }
        fp.d0.n("owl");
        fp.d0.n("ilink_protobuf");
        fp.d0.n("magic_brush_zidl");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicFlutterPluginFeatureService", "load mb zidl lib");
        a2Var.f224370d = true;
    }

    public final ax.a Ai() {
        return (ax.a) ((jz5.n) this.f224373g).getValue();
    }

    public final ax.b Bi() {
        return (ax.b) ((jz5.n) this.f224372f).getValue();
    }

    public final dq0.q Di() {
        return (dq0.q) ((jz5.n) this.f224371e).getValue();
    }
}
