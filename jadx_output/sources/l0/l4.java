package l0;

/* loaded from: classes14.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f314374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.k f314375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(float f17, a0.k kVar) {
        super(1);
        this.f314374d = f17;
        this.f314375e = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.f drawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(drawWithContent, "$this$drawWithContent");
        u1.o0 o0Var = (u1.o0) drawWithContent;
        o0Var.b();
        float f17 = this.f314374d;
        if (!p2.h.a(f17, 0.0f)) {
            float density = f17 * o0Var.getDensity();
            float b17 = d1.k.b(o0Var.a()) - (density / 2);
            g1.h.e(drawWithContent, this.f314375e.f193b, d1.f.a(0.0f, b17), d1.f.a(d1.k.d(o0Var.a()), b17), density, 0, null, 0.0f, null, 0, com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX, null);
        }
        return jz5.f0.f302826a;
    }
}
