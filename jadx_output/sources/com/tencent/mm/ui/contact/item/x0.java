package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class x0 extends com.tencent.mm.ui.contact.item.a {
    public java.lang.CharSequence C;
    public final com.tencent.mm.ui.contact.item.w0 D;
    public final com.tencent.mm.ui.contact.item.b E;

    public x0(int i17) {
        super(6, i17);
        this.D = new com.tencent.mm.ui.contact.item.w0(this);
        this.E = new com.tencent.mm.ui.contact.item.v0(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        java.lang.String string = context.getString(com.tencent.mm.R.string.icq);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.icp);
        java.lang.String str = this.f206848q;
        this.C = o13.q.d(string, string2, p13.i.a(str, str, false, false)).f351105a;
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.D;
    }
}
