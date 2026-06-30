package mz0;

/* loaded from: classes5.dex */
public final class y0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333081d;

    public y0(mz0.b2 b2Var) {
        this.f333081d = b2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        mz0.b2 b2Var = this.f333081d;
        com.tencent.mm.mj_template.sns.compose.widget.m7 o76 = b2Var.o7();
        kotlin.jvm.internal.o.d(list);
        o76.d(list);
        b2Var.z7();
    }
}
