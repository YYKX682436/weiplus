package fl2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f263922a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.k0 f263923b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f263924c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f263925d;

    public e(android.view.View root, com.tencent.mm.plugin.finder.live.view.k0 plugin) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f263922a = root;
        this.f263923b = plugin;
        zl2.r4 r4Var = zl2.r4.f473950a;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = null;
        if (r4Var.v1(root)) {
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = (com.tencent.mm.plugin.finder.live.plugin.nd0) plugin.getPlugin(com.tencent.mm.plugin.finder.live.plugin.nd0.class);
            imageView = (nd0Var == null || (viewGroup3 = nd0Var.f365323d) == null) ? null : (android.widget.ImageView) viewGroup3.findViewById(com.tencent.mm.R.id.r7k);
        } else {
            imageView = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.r7k);
        }
        if (r4Var.v1(root)) {
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var2 = (com.tencent.mm.plugin.finder.live.plugin.nd0) plugin.getPlugin(com.tencent.mm.plugin.finder.live.plugin.nd0.class);
            imageView2 = (nd0Var2 == null || (viewGroup2 = nd0Var2.f365323d) == null) ? null : (android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.r7l);
        } else {
            imageView2 = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.r7l);
        }
        this.f263924c = kz5.c0.i(imageView, imageView2);
        if (r4Var.v1(root)) {
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var3 = (com.tencent.mm.plugin.finder.live.plugin.nd0) plugin.getPlugin(com.tencent.mm.plugin.finder.live.plugin.nd0.class);
            if (nd0Var3 != null && (viewGroup = nd0Var3.f365323d) != null) {
                constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) viewGroup.findViewById(com.tencent.mm.R.id.r7j);
            }
        } else {
            constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.r7j);
        }
        this.f263925d = constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(fl2.e r10, int r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fl2.e.a(fl2.e, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fl2.e.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
