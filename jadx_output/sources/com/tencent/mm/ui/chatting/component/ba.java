package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class ba implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f198728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198729f;

    public ba(com.tencent.mm.ui.chatting.component.da daVar, boolean z17, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, int i17) {
        this.f198727d = z17;
        this.f198728e = chatFooter;
        this.f198729f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f198727d;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f198728e;
        if (!z17) {
            chatFooter.i1(this.f198729f, true, 0, 0);
            return null;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        chatFooter.setKeyboardShow(bool);
        chatFooter.setIgnoreScroll(bool);
        chatFooter.z1();
        return null;
    }
}
