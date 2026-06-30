package dv2;

/* loaded from: classes8.dex */
public final class k1 implements com.tencent.mm.plugin.finder.assist.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f243883a;

    public k1(dv2.o1 o1Var) {
        this.f243883a = o1Var;
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void c(com.tencent.mm.plugin.finder.assist.h9 result) {
        com.tencent.mm.plugin.finder.assist.m8 m8Var;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkFinderUtils] end result:");
        boolean z17 = result.f102233a;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", sb6.toString());
        dv2.o1 o1Var = this.f243883a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = o1Var.f243924n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f243924n = null;
        if (!z17 || (m8Var = o1Var.f243921h) == null) {
            return;
        }
        o1Var.f243922i = result;
        m8Var.c(result);
    }
}
