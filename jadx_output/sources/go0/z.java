package go0;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f273912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f273913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(go0.f0 f0Var, android.graphics.Bitmap bitmap, boolean z17) {
        super(0);
        this.f273911d = f0Var;
        this.f273912e = bitmap;
        this.f273913f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f1 f1Var = this.f273911d.f273767p;
        if (f1Var != null) {
            boolean z17 = this.f273913f;
            if (f1Var.f273772u) {
                z17 = !z17;
            }
            android.graphics.Bitmap bitmap = this.f273912e;
            if (bitmap != null) {
                go0.o0 o0Var = f1Var.f273773v;
                if (o0Var == null) {
                    f1Var.f273773v = new go0.o0(f1Var.f330947c, f1Var.f330948d, 0, 0, 12, null);
                } else {
                    o0Var.w(f1Var.f330947c, f1Var.f330948d);
                }
                f1Var.y(f1Var.f273773v, f1Var.f330947c, f1Var.f330948d);
                go0.o0 o0Var2 = f1Var.f273773v;
                if (o0Var2 != null) {
                    o0Var2.x(bitmap, bitmap.getWidth(), bitmap.getHeight(), z17);
                }
                f1Var.A = true;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBlendConfig use renderBlend:");
                go0.o0 o0Var3 = f1Var.f273773v;
                sb6.append(o0Var3 != null ? java.lang.Integer.valueOf(o0Var3.hashCode()) : null);
                sb6.append(" config:");
                sb6.append(bitmap.hashCode());
                sb6.append(",flip:");
                sb6.append(z17);
                sb6.append('\n');
                f1Var.x(sb6.toString());
            } else {
                f1Var.A = false;
                go0.o0 o0Var4 = f1Var.f273773v;
                if (o0Var4 != null) {
                    o0Var4.x(null, 0, 0, z17);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateBlendConfig not use renderBlend:");
                go0.o0 o0Var5 = f1Var.f273773v;
                sb7.append(o0Var5 != null ? java.lang.Integer.valueOf(o0Var5.hashCode()) : null);
                sb7.append('\n');
                f1Var.x(sb7.toString());
            }
        }
        return jz5.f0.f302826a;
    }
}
