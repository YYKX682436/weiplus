package wa2;

/* loaded from: classes3.dex */
public final class h0 implements ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f444125d;

    public h0(wa2.n0 n0Var) {
        this.f444125d = n0Var;
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        h81.a aVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOverStart: dy=");
        sb6.append(i18);
        sb6.append(", isInterceptTouchEvent=");
        wa2.n0 n0Var = this.f444125d;
        sb6.append(n0Var.f444160o);
        sb6.append(", disabled=");
        sb6.append(n0Var.getDisabled());
        sb6.append(", isEnableDragExit=");
        sb6.append(((java.lang.Boolean) ((jz5.n) n0Var.f444156h).getValue()).booleanValue());
        com.tencent.mars.xlog.Log.i("GestureFrameLayout", sb6.toString());
        if (n0Var.getDisabled()) {
            com.tencent.mars.xlog.Log.i("GestureFrameLayout", "onOverStart: disabled=true, return");
            return false;
        }
        if (i18 >= 0 || n0Var.f444160o != 0) {
            com.tencent.mars.xlog.Log.i("GestureFrameLayout", "onOverStart: 条件不满足, dy >= 0 或 isInterceptTouchEvent != 0");
        } else {
            com.tencent.mars.xlog.Log.i("GestureFrameLayout", "onOverStart: dy < 0 且 isInterceptTouchEvent=0, 准备进入拖拽模式, isInterceptTouchEvent → 1");
            n0Var.f444160o = 1;
            try {
                android.content.Context context = n0Var.getContentView().getContext();
                jz5.f0 f0Var = null;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
                if (appCompatActivity != null && (aVar = (h81.a) pf5.z.f353948a.a(appCompatActivity).d(h81.a.class)) != null) {
                    ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) aVar).R6();
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.w("GestureFrameLayout", "onOverStart: contentView.context is not AppCompatActivity, context=".concat(n0Var.getContentView().getContext().getClass().getSimpleName()));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("GestureFrameLayout", "onOverStart: UICProvider.of failed, context=" + n0Var.getContentView().getContext().getClass().getSimpleName() + ", error=" + e17.getMessage(), e17);
            }
        }
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }
}
