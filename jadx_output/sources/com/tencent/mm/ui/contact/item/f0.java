package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class f0 extends com.tencent.mm.ui.contact.item.a {
    public final com.tencent.mm.ui.contact.item.e0 C;
    public final com.tencent.mm.ui.contact.item.d0 D;

    public f0(int i17) {
        super(4, i17);
        this.C = new com.tencent.mm.ui.contact.item.e0(this);
        this.D = new com.tencent.mm.ui.contact.item.d0(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        if (this.B == null) {
            this.f206818y = "";
            this.f206819z = "";
            return;
        }
        java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(this.B);
        this.f206818y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, wi6, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        this.f206819z = this.B.d1();
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.C;
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public boolean d() {
        return true;
    }
}
