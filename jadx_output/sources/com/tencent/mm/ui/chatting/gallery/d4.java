package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.g4 f200865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.ui.chatting.gallery.g4 g4Var) {
        super(2);
        this.f200865d = g4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        com.tencent.mm.ui.chatting.gallery.g4 g4Var = this.f200865d;
        if (str == null || str2 == null) {
            g4Var.f200946a.f265423t.setVisibility(8);
        } else {
            g4Var.f200946a.f265423t.setVisibility(0);
        }
        g4Var.f200946a.f265421r.setText(str);
        g4Var.f200946a.f265422s.setText(str2);
        return jz5.f0.f302826a;
    }
}
