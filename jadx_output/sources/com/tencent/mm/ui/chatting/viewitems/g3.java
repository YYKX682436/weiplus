package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.g f204013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(z01.g gVar) {
        super(1);
        this.f204013d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.e3 holder = (com.tencent.mm.ui.chatting.viewitems.e3) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView = holder.f203842b;
        if (chattingAskShareMvvmView != null) {
            chattingAskShareMvvmView.setViewModel(this.f204013d);
        }
        return jz5.f0.f302826a;
    }
}
