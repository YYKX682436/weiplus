package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class xn extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f200262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        super(2);
        this.f200262d = hoVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        com.tencent.mm.ui.chatting.component.kn oldStatus = (com.tencent.mm.ui.chatting.component.kn) obj;
        com.tencent.mm.ui.chatting.component.kn newStatus = (com.tencent.mm.ui.chatting.component.kn) obj2;
        kotlin.jvm.internal.o.g(oldStatus, "oldStatus");
        kotlin.jvm.internal.o.g(newStatus, "newStatus");
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = this.f200262d.f199183m;
        if (loadableTextView == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        if (newStatus == com.tencent.mm.ui.chatting.component.kn.f199376d) {
            loadableTextView.setText("");
            i17 = 4;
        } else {
            i17 = 0;
        }
        loadableTextView.setVisibility(i17);
        return jz5.f0.f302826a;
    }
}
