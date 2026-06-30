package com.tencent.mm.ui.contact.item;

/* loaded from: classes.dex */
public final class j1 implements com.tencent.mm.ui.contact.u8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.q1 f206886a;

    public j1(com.tencent.mm.ui.contact.item.q1 q1Var) {
        this.f206886a = q1Var;
    }

    @Override // com.tencent.mm.ui.contact.u8
    public void a(int i17, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.ui.contact.item.q1.g(this.f206886a, name, i17);
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.r(i17, name);
    }

    @Override // com.tencent.mm.ui.contact.u8
    public void onFinish() {
        this.f206886a.i(false);
    }
}
