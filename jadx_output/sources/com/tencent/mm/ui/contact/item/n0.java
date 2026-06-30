package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class n0 extends com.tencent.mm.ui.contact.item.d {
    public final com.tencent.mm.ui.contact.item.l0 A;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f206903y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.item.m0 f206904z;

    public n0(int i17) {
        super(0, i17);
        this.f206904z = new com.tencent.mm.ui.contact.item.m0(this);
        this.A = new com.tencent.mm.ui.contact.item.l0(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.f206904z;
    }
}
