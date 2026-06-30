package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ga extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public androidx.recyclerview.widget.RecyclerView H;
    public final java.util.List I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.z9 f118416J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.I = new java.util.ArrayList();
        this.f118416J = new com.tencent.mm.plugin.finder.live.widget.z9(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e9n;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0194  */
    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(android.view.View r34) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.ga.N(android.view.View):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    public final pk2.o9 b() {
        com.tencent.mm.plugin.finder.live.viewmodel.s5 s5Var;
        df2.ox oxVar;
        pk2.o9 o9Var;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (oxVar = (df2.ox) k0Var.getController(df2.ox.class)) != null && (o9Var = oxVar.f231016q) != null) {
            return o9Var;
        }
        android.content.Context context = this.f118183e;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity == null || (s5Var = (com.tencent.mm.plugin.finder.live.viewmodel.s5) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.live.viewmodel.s5.class)) == null) {
            return null;
        }
        return s5Var.f117394d;
    }
}
