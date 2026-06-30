package ry2;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ry2.j f401398a = new ry2.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f401399b = kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.string.exl)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.string.csv)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.string.f491932m11)), new jz5.l(6, java.lang.Integer.valueOf(com.tencent.mm.R.string.f492046o12)));

    public final void a(androidx.appcompat.app.AppCompatActivity activity, java.util.List menuData, java.lang.String str) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(menuData, "menuData");
        boolean z17 = !(str == null || str.length() == 0);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(activity, 1, z17);
        if (z17) {
            k0Var.q(str, 17);
        }
        k0Var.f211872n = new ry2.g(menuData, activity);
        k0Var.f211881s = new ry2.i(menuData);
        k0Var.f211892z = new ry2.h(menuData);
        k0Var.v();
    }
}
