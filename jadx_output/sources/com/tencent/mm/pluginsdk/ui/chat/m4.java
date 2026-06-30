package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class m4 implements com.tencent.mm.pluginsdk.ui.chat.n5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190484d;

    public m4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190484d = chatFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.n5
    public void q(float f17, boolean z17) {
        if (z17) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190484d;
            ((ym5.f0) chatFooter.f189999i).d();
            chatFooter.X0(chatFooter.getKeyBordHeightPX());
            com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = chatFooter.f189982f2;
            if (chattingScrollLayout != null) {
                ((java.util.LinkedList) chattingScrollLayout.f190133r).remove(this);
            }
        }
    }
}
