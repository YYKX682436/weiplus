package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class t1 extends com.tencent.mm.ui.tools.v4 {
    public t1(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter, int i17, com.tencent.mm.ui.tools.t4 t4Var) {
        super(i17, t4Var);
    }

    @Override // com.tencent.mm.ui.tools.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        int i28;
        int length = spanned.length();
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        int e17 = length > i19 ? com.tencent.mm.ui.tools.v4.e(spanned.subSequence(0, i19).toString(), t4Var) : com.tencent.mm.ui.tools.v4.e(spanned.toString(), t4Var);
        int e18 = spanned.length() > i27 ? com.tencent.mm.ui.tools.v4.e(spanned.subSequence(i27, spanned.length()).toString(), t4Var) : 0;
        int e19 = com.tencent.mm.ui.tools.v4.e(charSequence.toString(), t4Var);
        int i29 = (1000 - e17) - e18;
        int a17 = com.tencent.mm.ui.tools.v4.a(charSequence.toString());
        if (e17 + e19 + e18 <= 1000) {
            return charSequence;
        }
        int i37 = i29 - a17;
        return (i17 < 0 || charSequence.length() < (i28 = (i37 >= 0 ? i37 : 0) + i17)) ? "" : charSequence.subSequence(i17, i28);
    }
}
