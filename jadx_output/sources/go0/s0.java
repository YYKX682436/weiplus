package go0;

/* loaded from: classes14.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.v0 f273836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f273838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f273839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f273840h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(go0.v0 v0Var, int i17, android.util.Size size, android.graphics.Point point, android.util.Size size2) {
        super(0);
        this.f273836d = v0Var;
        this.f273837e = i17;
        this.f273838f = size;
        this.f273839g = point;
        this.f273840h = size2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean bool;
        go0.w0 B;
        go0.w0 B2;
        go0.v0 v0Var = this.f273836d;
        go0.b1 b1Var = v0Var.f273880g;
        android.util.Size size = this.f273840h;
        android.graphics.Point point = this.f273839g;
        android.util.Size size2 = this.f273838f;
        if (b1Var == null || (B2 = b1Var.B()) == null) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(point.x == B2.f273890a && point.y == B2.f273891b && size.getWidth() == B2.f273892c && size.getHeight() == B2.f273893d && size2.getWidth() == B2.f273894e && size2.getHeight() == B2.f273895f);
        }
        go0.b1 b1Var2 = v0Var.f273880g;
        if (b1Var2 != null) {
            b1Var2.R = this.f273837e;
        }
        if (b1Var2 != null && (B = b1Var2.B()) != null) {
            B.f273890a = point.x;
            B.f273891b = point.y;
            B.f273892c = size.getWidth();
            B.f273893d = size.getHeight();
            B.f273894e = size2.getWidth();
            B.f273895f = size2.getHeight();
        }
        go0.b1 b1Var3 = v0Var.f273880g;
        if (b1Var3 != null) {
            android.graphics.Point point2 = new android.graphics.Point(0, size2.getHeight());
            android.graphics.Point point3 = new android.graphics.Point(size2.getWidth(), 0);
            b1Var3.A = point2;
            b1Var3.B = point3;
        }
        if (v0Var.f273882i == go0.q0.f273818e) {
            go0.v0.a(v0Var);
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateRenderOriginal Renderer info:");
            go0.b1 b1Var4 = v0Var.f273880g;
            sb6.append(b1Var4 != null ? b1Var4.C() : null);
            com.tencent.mars.xlog.Log.i("LiveScreenShareRender", sb6.toString());
            go0.b1 b1Var5 = v0Var.f273880g;
            if (b1Var5 != null) {
                b1Var5.P++;
            }
        }
        return jz5.f0.f302826a;
    }
}
