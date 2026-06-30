package zk3;

/* loaded from: classes8.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f473491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f473493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f473494g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f473495h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(zk3.w0 w0Var, int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, int i18, android.graphics.Bitmap bitmap) {
        super(0);
        this.f473491d = w0Var;
        this.f473492e = i17;
        this.f473493f = multiTaskInfo;
        this.f473494g = i18;
        this.f473495h = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.lr4 v07;
        zk3.w0 w0Var = this.f473491d;
        android.view.ViewParent parent = w0Var.getRootView().getParent();
        java.lang.Integer num = null;
        if ((parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null) != null) {
            float width = r1.getWidth() / this.f473492e;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f473493f;
            if (multiTaskInfo != null && (v07 = multiTaskInfo.v0()) != null) {
                num = java.lang.Integer.valueOf(v07.getInteger(9));
            }
            if (num != null && num.intValue() == 90) {
                width = r1.getHeight() / this.f473494g;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(width, width);
            ((android.widget.ImageView) w0Var.getRootView().findViewById(com.tencent.mm.R.id.ui9)).setImageMatrix(matrix);
            ((android.widget.ImageView) w0Var.getRootView().findViewById(com.tencent.mm.R.id.ui9)).setImageBitmap(this.f473495h);
        }
        return jz5.f0.f302826a;
    }
}
