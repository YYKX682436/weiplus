package um2;

/* loaded from: classes3.dex */
public final class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f428797e;

    public f5(um2.x5 x5Var, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f428796d = x5Var;
        this.f428797e = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um2.x5 x5Var = this.f428796d;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = x5Var.f429086x;
        if (etVar != null) {
            etVar.N = null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f428797e.f365323d.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, x5Var.f429074t);
        }
    }
}
