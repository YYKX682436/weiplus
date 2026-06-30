package um2;

/* loaded from: classes3.dex */
public final class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f428780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428781e;

    public e5(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, um2.x5 x5Var) {
        this.f428780d = mgVar;
        this.f428781e = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f428780d.f365323d.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            um2.x5 x5Var = this.f428781e;
            com.tencent.mm.plugin.finder.live.plugin.et etVar = x5Var.f429086x;
            if (etVar != null) {
                etVar.N = null;
            }
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, x5Var.f429074t);
        }
    }
}
