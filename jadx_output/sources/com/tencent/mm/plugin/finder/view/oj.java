package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class oj extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public db5.g4 f132792d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f132793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.uj f132794f;

    public oj(com.tencent.mm.plugin.finder.view.uj ujVar) {
        this.f132794f = ujVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        db5.g4 g4Var = this.f132792d;
        if (g4Var != null) {
            return g4Var.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r20, int r21) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.oj.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f132794f.f133182a).inflate(com.tencent.mm.R.layout.dls, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.view.pj(inflate);
    }
}
