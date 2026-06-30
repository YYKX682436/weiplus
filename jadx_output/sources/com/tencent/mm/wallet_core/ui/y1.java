package com.tencent.mm.wallet_core.ui;

/* loaded from: classes11.dex */
public class y1 extends com.tencent.mm.ui.contact.item.d {
    public final com.tencent.mm.wallet_core.ui.x1 A;
    public final com.tencent.mm.wallet_core.ui.w1 B;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f214271y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f214272z;

    public y1(int i17) {
        super(0, i17);
        this.A = new com.tencent.mm.wallet_core.ui.x1(this);
        this.B = new com.tencent.mm.wallet_core.ui.w1(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.A;
    }
}
