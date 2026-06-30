package em2;

/* loaded from: classes3.dex */
public final class e0 extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f255118b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f255120d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f255121e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ba4 f255122f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f255123g;

    /* renamed from: k, reason: collision with root package name */
    public int f255127k;

    /* renamed from: m, reason: collision with root package name */
    public gk2.e f255129m;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f255119c = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public pm2.a f255124h = pm2.a.f356853f;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f255125i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f255126j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f255128l = new java.util.ArrayList();

    public e0(int i17) {
        this.f255118b = i17;
    }

    @Override // hn5.c
    public int a() {
        if (this.f255120d) {
            return 0;
        }
        return this.f255119c.size();
    }

    @Override // hn5.c
    public java.lang.Object b(int i17) {
        java.lang.Object obj = this.f255119c.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c2  */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.view.View, xj2.n] */
    /* JADX WARN: Type inference failed for: r1v20, types: [xj2.i, android.view.View, xj2.n] */
    /* JADX WARN: Type inference failed for: r1v21, types: [wj2.g0, android.view.View] */
    @Override // hn5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View c(int r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: em2.e0.c(int, java.lang.Object):android.view.View");
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((xh2.a) this.f255119c.get(i17)).f454521b;
    }

    public final android.view.View h() {
        android.view.View inflate = android.view.LayoutInflater.from(d().getContext()).inflate(com.tencent.mm.R.layout.atd, (android.view.ViewGroup) d(), false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.agn);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutRatioAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutRatioAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f483293a75);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutRatioAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutRatioAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.ozb);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutRatioAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutRatioAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return inflate;
    }
}
