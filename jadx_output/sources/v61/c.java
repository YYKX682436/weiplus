package v61;

/* loaded from: classes5.dex */
public abstract class c {
    public static final void a(android.content.Context context, java.lang.String mobileInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mobileInfo, "mobileInfo");
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        i0Var.d(com.tencent.mm.R.string.o7s);
        i0Var.e(com.tencent.mm.R.string.o58);
        i0Var.f211821b.F = new v61.b(mobileInfo, context);
        i0Var.f(com.tencent.mm.R.string.f490454vi);
        i0Var.b(true).show();
    }
}
