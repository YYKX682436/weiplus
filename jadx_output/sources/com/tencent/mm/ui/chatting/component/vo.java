package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class vo implements c01.r8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ro f200143a;

    public vo(com.tencent.mm.ui.chatting.component.ro roVar) {
        this.f200143a = roVar;
    }

    @Override // c01.r8
    public void a(java.lang.String str, long j17) {
        if (com.tencent.mm.storage.z3.I4(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b)) {
            com.tencent.mm.ui.chatting.component.ro roVar = this.f200143a;
            db5.e1.K(roVar.f198580d.g(), false, str, roVar.f198580d.s().getString(com.tencent.mm.R.string.k_a), roVar.f198580d.s().getString(com.tencent.mm.R.string.k_8), roVar.f198580d.s().getString(com.tencent.mm.R.string.k__), new com.tencent.mm.ui.chatting.component.uo(this, j17), null);
        }
    }
}
