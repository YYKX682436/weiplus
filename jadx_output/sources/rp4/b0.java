package rp4;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f398613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, rp4.f0 f0Var, int i17) {
        super(0);
        this.f398612d = str;
        this.f398613e = f0Var;
        this.f398614f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rp4.f0 f0Var = this.f398613e;
        if (kotlin.jvm.internal.o.b(this.f398612d, f0Var.f398637o)) {
            if (!f0Var.B) {
                ju3.d0 d0Var = f0Var.f398630e;
                if (d0Var != null) {
                    ju3.d0.k(d0Var, ju3.c0.L2, null, 2, null);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = f0Var.f398646x;
                if (mMProgressLoading != null) {
                    mMProgressLoading.setProgress(0);
                }
                android.view.View view = f0Var.f398645w;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$3$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$3$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                f0Var.B = true;
            }
            com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading2 = f0Var.f398646x;
            if (mMProgressLoading2 != null) {
                mMProgressLoading2.setProgress(this.f398614f);
            }
        }
        return jz5.f0.f302826a;
    }
}
