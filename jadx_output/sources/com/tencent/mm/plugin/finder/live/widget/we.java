package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class we implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.cf f120177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120178b;

    public we(com.tencent.mm.plugin.finder.live.widget.cf cfVar, java.lang.String str) {
        this.f120177a = cfVar;
        this.f120178b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.widget.cf cfVar = this.f120177a;
        boolean z17 = true;
        cfVar.g0(true);
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        android.content.Context context = cfVar.f118183e;
        if (i17 == 0 && fVar.f70616b == 0) {
            db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.ddi), com.tencent.mm.R.raw.icons_filled_done);
            yz5.p pVar = cfVar.f118003J;
            if (pVar == null) {
                return null;
            }
            pVar.invoke(java.lang.Boolean.TRUE, this.f120178b);
            return f0Var;
        }
        java.lang.String str = fVar.f70617c;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        db5.t7.g(context, z17 ? context.getResources().getString(com.tencent.mm.R.string.ddh) : fVar.f70617c);
        return f0Var;
    }
}
