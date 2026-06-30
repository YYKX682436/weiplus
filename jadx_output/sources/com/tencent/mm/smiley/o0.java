package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class o0 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f193320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.smiley.q0 f193323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f193324f;

    public o0(kotlin.jvm.internal.f0 f0Var, com.tencent.mm.pointers.PInt pInt, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, com.tencent.mm.smiley.q0 q0Var, android.text.Spannable spannable) {
        this.f193319a = f0Var;
        this.f193320b = pInt;
        this.f193321c = f0Var2;
        this.f193322d = f0Var3;
        this.f193323e = q0Var;
        this.f193324f = spannable;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.f0 f0Var = this.f193319a;
        if (f0Var.f310116d < this.f193320b.value && (item instanceof com.tencent.mm.smiley.b2)) {
            int i19 = com.tencent.mm.smiley.e.f193236b;
            com.tencent.mm.smiley.e eVar = com.tencent.mm.smiley.d.f193233a;
            com.tencent.mm.smiley.b2 b2Var = (com.tencent.mm.smiley.b2) item;
            java.lang.String key = java.lang.String.valueOf(b2Var.f193220a.f193259d);
            eVar.getClass();
            kotlin.jvm.internal.o.g(key, "key");
            gr.q qVar = gr.q.f274676a;
            if (((lt0.f) gr.q.f274677b.f274679b).k(key)) {
                this.f193321c.f310116d++;
            } else {
                this.f193322d.f310116d++;
            }
            f0Var.f310116d++;
            this.f193323e.getClass();
            android.graphics.drawable.Drawable a17 = eVar.a(b2Var, true);
            if (a17 != null) {
                this.f193324f.setSpan(new com.tencent.mm.smiley.r0(a17, false, i17, i18), i17, i18, 33);
            }
        }
        return false;
    }
}
