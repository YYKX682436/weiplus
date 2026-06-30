package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class r extends com.tencent.mm.ui.contact.item.c0 {
    public java.lang.CharSequence G;
    public boolean H;
    public final com.tencent.mm.storage.z3 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.item.q f206921J;

    public r(int i17, com.tencent.mm.storage.z3 z3Var) {
        super(i17);
        this.f206921J = new com.tencent.mm.ui.contact.item.q(this);
        this.I = z3Var;
        this.H = z3Var.I == 1;
    }

    @Override // com.tencent.mm.ui.contact.item.c0, com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        super.a(context, bVar);
        com.tencent.mm.storage.z3 z3Var = this.I;
        this.H = z3Var.I == 1;
        this.G = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.B.d1()).z0(z3Var.d1());
    }

    @Override // com.tencent.mm.ui.contact.item.c0, com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.f206921J;
    }
}
