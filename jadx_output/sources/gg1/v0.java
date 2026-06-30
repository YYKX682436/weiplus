package gg1;

/* loaded from: classes7.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271633d;

    public v0(gg1.c1 c1Var) {
        this.f271633d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.c1 c1Var = this.f271633d;
        android.content.Context context = c1Var.f271535a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.Context context2 = c1Var.f271535a.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        dp.a.makeText(context, i65.a.r(context2, com.tencent.mm.R.string.s_), 0).show();
    }
}
