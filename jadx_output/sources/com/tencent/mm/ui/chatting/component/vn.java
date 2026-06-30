package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class vn extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f200142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        super(2);
        this.f200142d = hoVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.component.kn oldStatus = (com.tencent.mm.ui.chatting.component.kn) obj;
        com.tencent.mm.ui.chatting.component.kn newStatus = (com.tencent.mm.ui.chatting.component.kn) obj2;
        kotlin.jvm.internal.o.g(oldStatus, "oldStatus");
        kotlin.jvm.internal.o.g(newStatus, "newStatus");
        com.tencent.mm.ui.chatting.component.kn knVar = com.tencent.mm.ui.chatting.component.kn.f199376d;
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f200142d;
        if (newStatus == knVar) {
            com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView = hoVar.f199182i;
            if (translateControllerView == null) {
                kotlin.jvm.internal.o.o("controllerView");
                throw null;
            }
            com.tencent.mars.xlog.Log.i(translateControllerView.f198572e, "showLanguage: ");
            translateControllerView.post(new com.tencent.mm.ui.chatting.component.hn(translateControllerView));
        } else {
            com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView2 = hoVar.f199182i;
            if (translateControllerView2 == null) {
                kotlin.jvm.internal.o.o("controllerView");
                throw null;
            }
            com.tencent.mars.xlog.Log.i(translateControllerView2.f198572e, "hideLanguage: ");
            translateControllerView2.post(new com.tencent.mm.ui.chatting.component.gn(translateControllerView2));
        }
        return jz5.f0.f302826a;
    }
}
