package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class d1 extends com.tencent.mm.ui.contact.item.a {
    public final com.tencent.mm.ui.contact.item.b1 C;
    public final com.tencent.mm.ui.contact.item.c1 D;

    public d1(int i17) {
        super(7, i17);
        this.C = new com.tencent.mm.ui.contact.item.b1(this);
        this.D = new com.tencent.mm.ui.contact.item.c1(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.C;
    }
}
