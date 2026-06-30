package ry2;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.y f401500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f401502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f401503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f401504h;

    public x(ry2.y yVar, java.lang.String str, boolean z17, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        this.f401500d = yVar;
        this.f401501e = str;
        this.f401502f = z17;
        this.f401503g = bitmap;
        this.f401504h = bitmap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry2.y yVar = this.f401500d;
        yVar.f401513x.add(this.f401501e);
        com.tencent.mars.xlog.Log.i("Finder.PostMixMediaWidget", "add thumb file");
        if (this.f401502f) {
            mv2.f0 f0Var = mv2.f0.f331561a;
            android.graphics.Bitmap bitmap = this.f401503g;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(android.widget.ImageView.ScaleType.FIT_XY.ordinal());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f0Var.l());
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf((int) (f0Var.l() * ((bitmap.getHeight() * 1.0f) / bitmap.getWidth())));
            yVar.p().getLayoutParams().width = valueOf2.intValue();
            yVar.p().getLayoutParams().height = valueOf3.intValue();
            yVar.p().setScaleType(android.widget.ImageView.ScaleType.values()[valueOf.intValue()]);
            yVar.p().requestLayout();
            yVar.p().post(new ry2.v(yVar, this.f401504h));
            yVar.p().setOnClickListener(new ry2.w(yVar));
        }
    }
}
