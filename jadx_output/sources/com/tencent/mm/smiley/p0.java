package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class p0 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f193330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193332c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.smiley.q0 f193333d;

    public p0(java.lang.StringBuilder sb6, java.lang.String str, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.smiley.q0 q0Var) {
        this.f193330a = sb6;
        this.f193331b = str;
        this.f193332c = f0Var;
        this.f193333d = q0Var;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        if (item instanceof com.tencent.mm.smiley.b2) {
            kotlin.jvm.internal.f0 f0Var = this.f193332c;
            int i19 = f0Var.f310116d;
            java.lang.StringBuilder sb6 = this.f193330a;
            sb6.append((java.lang.CharSequence) this.f193331b, i19, i17);
            int i27 = ((com.tencent.mm.smiley.b2) item).f193220a.f193259d;
            this.f193333d.getClass();
            com.tencent.mm.smiley.p pVar = com.tencent.mm.smiley.m.f193309a;
            com.tencent.mm.smiley.a2 a2Var = (com.tencent.mm.smiley.a2) pVar.f193326b.get(i27, null);
            java.lang.String str = (java.lang.String) pVar.f193328d.get(a2Var != null ? a2Var.f193214d : 0, null);
            if (str != null) {
                sb6.append(str);
            } else {
                sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490383tg));
            }
            f0Var.f310116d = i18;
        }
        return false;
    }
}
