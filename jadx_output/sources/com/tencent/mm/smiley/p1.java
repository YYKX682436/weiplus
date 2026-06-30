package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class p1 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.smiley.t1 f193334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f193335b;

    public p1(com.tencent.mm.smiley.t1 t1Var, android.text.Spannable spannable) {
        this.f193334a = t1Var;
        this.f193335b = spannable;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        if (!(item instanceof com.tencent.mm.smiley.h1)) {
            return false;
        }
        com.tencent.mm.smiley.g.b().e(this.f193335b, this.f193334a.e((com.tencent.mm.smiley.h1) item), i17, i18, true);
        return false;
    }
}
