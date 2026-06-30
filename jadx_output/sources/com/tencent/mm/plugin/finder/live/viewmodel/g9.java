package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(0);
        this.f117118d = v9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117118d;
        android.widget.ProgressBar progressBar = v9Var.f117489h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        v9Var.Q6(v9Var.f117497s);
        int i17 = v9Var.f117494p;
        if (i17 != 1 && i17 != 2) {
            zl2.r4.f473950a.W2(v9Var.f117496r, v9Var.f117497s, v9Var.f117498t);
        } else if (v9Var.f117502x) {
            pm0.v.V(i17 == 2 ? 2000L : 0L, new com.tencent.mm.plugin.finder.live.viewmodel.f9(v9Var));
        }
        android.app.Activity context = v9Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var = (com.tencent.mm.plugin.finder.live.viewmodel.s8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.live.viewmodel.s8.class);
        if (s8Var != null) {
            s8Var.P6();
            s8Var.O6();
        }
        return jz5.f0.f302826a;
    }
}
