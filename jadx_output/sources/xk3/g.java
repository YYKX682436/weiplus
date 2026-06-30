package xk3;

/* loaded from: classes8.dex */
public final class g implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk3.i f455029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f455030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f455033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f455035g;

    public g(xk3.i iVar, in5.s0 s0Var, java.lang.String str, android.widget.ImageView imageView, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, android.widget.ImageView imageView2, android.view.View view) {
        this.f455029a = iVar;
        this.f455030b = s0Var;
        this.f455031c = str;
        this.f455032d = imageView;
        this.f455033e = multiTaskInfo;
        this.f455034f = imageView2;
        this.f455035g = view;
    }

    @Override // p11.k
    public final void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object[] objArr) {
        jz5.f0 f0Var = null;
        f0Var = null;
        android.widget.ImageView imageView = view instanceof android.widget.ImageView ? (android.widget.ImageView) view : null;
        if (imageView != null && bitmap != null) {
            xk3.i iVar = this.f455029a;
            iVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenRoundCornerConvert", "loadImage callback " + imageView.hashCode() + ' ' + bitmap);
            androidx.recyclerview.widget.RecyclerView o17 = this.f455030b.o();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o17 != null ? o17.getLayoutManager() : null;
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            int i17 = gridLayoutManager != null ? gridLayoutManager.f11861w : 1;
            com.tencent.mm.plugin.multitask.ui.minusscreen.b.f150559a.getClass();
            float g17 = (com.tencent.mm.ui.bk.g() - (com.tencent.mm.plugin.multitask.ui.minusscreen.a.f150558b * (i17 + 1))) / (i17 * bitmap.getWidth());
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(g17, g17);
            pm0.v.X(new xk3.e(imageView, matrix, bitmap, iVar));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView2 = this.f455032d;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f455033e;
            android.widget.ImageView imageView3 = this.f455034f;
            android.view.View view2 = this.f455035g;
            in5.s0 s0Var = this.f455030b;
            n11.a.b().a(this.f455031c, imageView2);
            pm0.v.X(new xk3.f(multiTaskInfo, imageView3, imageView2, view2, s0Var));
        }
    }
}
