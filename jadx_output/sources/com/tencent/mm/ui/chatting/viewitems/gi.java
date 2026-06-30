package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class gi implements db5.u4 {
    public gi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
    }

    @Override // db5.u4
    public void a(android.view.View view) {
        android.widget.TextView textView;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc)) == null) {
            return;
        }
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setPadding(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.E1.intValue(), textView.getPaddingTop(), com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.E1.intValue(), textView.getPaddingBottom());
    }
}
