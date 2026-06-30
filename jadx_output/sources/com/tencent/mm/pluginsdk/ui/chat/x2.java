package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class x2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190736d;

    public x2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190736d = chatFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable != null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190736d;
            int width = chatFooter.f189956a4.getWidth();
            int lineCount = chatFooter.f189961b4.getLineCount();
            int i17 = lineCount - chatFooter.f190008j5;
            int abs = java.lang.Math.abs(width - chatFooter.f190063s5);
            com.tencent.mm.pluginsdk.ui.chat.b5 b5Var = com.tencent.mm.pluginsdk.ui.chat.b5.MODE_TRANS;
            if (abs > 100 && chatFooter.f189968c6 == b5Var && i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "afterTextChanged() diffWidth:%s, transWidth:%s, layoutWidth:%s", java.lang.Integer.valueOf(abs), java.lang.Integer.valueOf(chatFooter.f190063s5), java.lang.Integer.valueOf(width));
            }
            if (i17 != 0 && chatFooter.f189968c6 == b5Var) {
                int lineHeight = chatFooter.f189961b4.getLineHeight();
                int selectionStart = chatFooter.f189961b4.getSelectionStart();
                android.text.Layout layout = chatFooter.f189961b4.getLayout();
                if (layout != null) {
                    int lineForOffset = layout.getLineForOffset(selectionStart);
                    int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                    if (lineBottom > lineHeight) {
                        lineHeight = lineBottom;
                    }
                }
                int round = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(chatFooter.getContext(), 20)));
                int round2 = java.lang.Math.round(com.tencent.mm.ui.gk.a(com.tencent.mm.ui.zk.a(chatFooter.getContext(), 42)));
                int i18 = (chatFooter.f189966c4.getVisibility() == 0 || chatFooter.f189984f4.getVisibility() == 0) ? round + round2 : round + round;
                int height = chatFooter.f189956a4.getHeight() + (lineHeight * i17);
                int i19 = lineHeight * lineCount;
                int min = java.lang.Math.min(height, i18 + i19);
                if (i17 >= 0 || lineCount != 1) {
                    i19 = min;
                }
                if (chatFooter.f190010k2) {
                    chatFooter.f190095x5 = java.lang.Math.min(java.lang.Math.max(chatFooter.f190057r5, i19), chatFooter.f190108z5);
                } else {
                    chatFooter.f190095x5 = java.lang.Math.min(java.lang.Math.max(chatFooter.f190057r5, i19), chatFooter.f190102y5);
                    if (chatFooter.f190095x5 == chatFooter.f190102y5 && chatFooter.f189961b4.getPaddingBottom() == 0) {
                        chatFooter.f189961b4.setPadding(round, round, round, round2);
                    }
                }
                int i27 = chatFooter.f190095x5;
                int i28 = chatFooter.f190102y5;
                int i29 = chatFooter.f190008j5;
                chatFooter.A(false);
                chatFooter.f190008j5 = lineCount;
            }
            com.tencent.mm.plugin.transvoice.model.e eVar = chatFooter.N3;
            if (1 == eVar.f175400x) {
                eVar.f175399w = 1;
            }
            if (chatFooter.f189990g4.getVisibility() == 0 && chatFooter.f189998h6) {
                java.lang.String obj = editable.toString();
                chatFooter.f189998h6 = false;
                chatFooter.f189992g6 = obj;
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
