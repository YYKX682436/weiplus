package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public final class yb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.zb f206266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(com.tencent.mm.ui.chatting.zb zbVar) {
        super(0);
        this.f206266d = zbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        android.content.Context context = this.f206266d.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
