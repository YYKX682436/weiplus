package p21;

/* loaded from: classes9.dex */
public abstract class i {
    public static boolean a() {
        return q21.d.a() != null && ((va3.z0) q21.d.a()).e();
    }

    public static com.tencent.mm.ui.widget.dialog.j0 b(android.content.Context context, int i17, java.lang.Runnable runnable) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        i0Var.g(com.tencent.mm.R.string.f490573yv);
        i0Var.d(i17);
        i0Var.f(com.tencent.mm.R.string.f490455vj);
        p21.g gVar = new p21.g(runnable);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.E = gVar;
        aVar.A = true;
        aVar.G = new p21.h(runnable);
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        a17.show();
        return a17;
    }
}
