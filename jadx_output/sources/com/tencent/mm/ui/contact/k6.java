package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public class k6 implements com.tencent.mm.ui.contact.item.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.p6 f206995a;

    public k6(com.tencent.mm.ui.contact.p6 p6Var) {
        this.f206995a = p6Var;
    }

    @Override // com.tencent.mm.ui.contact.item.e1
    public void a() {
        com.tencent.mm.ui.contact.p6 p6Var = this.f206995a;
        com.tencent.mm.ui.contact.item.e1 e1Var = p6Var.D;
        if (e1Var != null) {
            e1Var.a();
        }
        com.tencent.mm.ui.contact.item.q1 q1Var = p6Var.E;
        if (q1Var != null) {
            q1Var.i(false);
        }
    }

    @Override // com.tencent.mm.ui.contact.item.e1
    public void b() {
        com.tencent.mm.ui.contact.p6 p6Var = this.f206995a;
        com.tencent.mm.ui.contact.item.e1 e1Var = p6Var.D;
        if (e1Var != null) {
            if (p6Var.H) {
                e1Var.b();
            } else {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                android.content.Context context = p6Var.K;
                u1Var.g(context.getString(com.tencent.mm.R.string.ifi));
                u1Var.n(context.getString(com.tencent.mm.R.string.ifj));
                u1Var.l(new com.tencent.mm.ui.contact.l6(p6Var));
                u1Var.q(false);
            }
        }
        com.tencent.mm.ui.contact.item.q1 q1Var = p6Var.E;
        if (q1Var != null) {
            q1Var.i(false);
        }
    }
}
