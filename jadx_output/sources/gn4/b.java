package gn4;

/* loaded from: classes10.dex */
public class b extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gn4.c f273589n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gn4.c cVar, android.content.Context context) {
        super(context);
        this.f273589n = cVar;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View view, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.e3 e3Var) {
        gn4.c cVar = this.f273589n;
        int[] c17 = cVar.c(cVar.f292961a.getLayoutManager(), view);
        int i17 = c17[0];
        int i18 = c17[1];
        int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
        if (k17 > 0) {
            e3Var.b(i17, i18, k17, this.f12176i);
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        return java.lang.Math.min(100, super.l(i17));
    }
}
