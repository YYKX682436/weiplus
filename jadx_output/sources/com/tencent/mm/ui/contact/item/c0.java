package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class c0 extends com.tencent.mm.ui.contact.item.a {
    public java.lang.CharSequence C;
    public int D;
    public final com.tencent.mm.ui.contact.item.b0 E;
    public final com.tencent.mm.ui.contact.item.a0 F;

    public c0(int i17) {
        super(4, i17);
        this.D = 0;
        this.E = new com.tencent.mm.ui.contact.item.b0(this);
        this.F = new com.tencent.mm.ui.contact.item.a0(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        if (this.D == 0 || this.C == null) {
            if (this.B == null) {
                this.f206818y = "";
                this.f206819z = "";
                return;
            }
            java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(this.B);
            this.f206818y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, wi6, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
            this.f206819z = this.B.d1();
        }
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.E;
    }
}
