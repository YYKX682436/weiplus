package zk3;

/* loaded from: classes8.dex */
public final class t0 implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f473506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f473507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f473508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f473509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f473510e;

    public t0(int i17, int i18, float f17, android.graphics.Rect rect, zk3.w0 w0Var) {
        this.f473506a = i17;
        this.f473507b = i18;
        this.f473508c = f17;
        this.f473509d = rect;
        this.f473510e = w0Var;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18 = this.f473506a;
        int i17 = this.f473507b;
        float f19 = this.f473508c;
        float f27 = 1;
        float f28 = f27 - f17;
        float height = (((i17 * f19) - this.f473509d.height()) / 2) * f28 * (f27 / f19);
        float f29 = i17 - height;
        zk3.w0 w0Var = this.f473510e;
        bk3.a aVar = w0Var.f473517d;
        if (aVar != null) {
            aVar.setMaskAlpha((int) (255 * f28));
        }
        bk3.a aVar2 = w0Var.f473517d;
        if (aVar2 != null) {
            aVar2.a(0.0f, height, f18, f29);
        }
        bk3.a aVar3 = w0Var.f473517d;
        if (aVar3 != null) {
            int i18 = ek3.e.f253609u;
            int i19 = ek3.e.f253609u;
            aVar3.b(0.0f, 0.0f, 0.0f, 0.0f, (i19 * f28) / f19, (i19 * f28) / f19, (i19 * f28) / f19, (i19 * f28) / f19);
        }
        bk3.a aVar4 = w0Var.f473517d;
        if (aVar4 != null) {
            aVar4.postInvalidate();
        }
    }
}
