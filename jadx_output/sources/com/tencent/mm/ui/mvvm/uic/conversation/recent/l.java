package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class l implements com.tencent.mm.ui.contact.u8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.t f209342a;

    public l(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar) {
        this.f209342a = tVar;
    }

    @Override // com.tencent.mm.ui.contact.u8
    public void a(int i17, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.ui.mvvm.uic.conversation.recent.t.T6(this.f209342a, name, i17);
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.r(i17, name);
    }

    @Override // com.tencent.mm.ui.contact.u8
    public void onFinish() {
        com.tencent.mm.ui.mvvm.uic.conversation.recent.t.U6(this.f209342a);
    }
}
