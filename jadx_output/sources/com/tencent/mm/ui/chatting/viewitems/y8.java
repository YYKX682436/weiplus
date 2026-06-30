package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class y8 extends com.tencent.mm.ui.chatting.viewitems.g0 {
    public y8(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.ui.chatting.viewitems.y8 a(android.view.View convertView) {
        kotlin.jvm.internal.o.g(convertView, "convertView");
        super.create(convertView);
        com.tencent.mm.ui.chatting.viewitems.b9.f203470b = (com.tencent.mm.ui.widget.MMNeat7extView) convertView.findViewById(com.tencent.mm.R.id.bkl);
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.bkf);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
        this.checkBox = (android.widget.CheckBox) findViewById;
        this.maskView = convertView.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }

    public final void b(com.tencent.mm.ui.chatting.viewitems.y8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.a0 chattingItem, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(chattingItem, "chattingItem");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || v17.f348666i != 91) {
            return;
        }
        byte[] bytes = "wx91d27dbf599dff74".getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        java.lang.String str2 = "[暂不支持此消息格式，请在 <a data-miniprogram-appid = \"" + r26.n0.Z(encodeToString, "\n") + "\" data-miniprogram-path = \" \" href = \"www.qq.com\">hello world</a>中查看]";
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = com.tencent.mm.ui.chatting.viewitems.b9.f203470b;
        kotlin.jvm.internal.o.d(mMNeat7extView);
        android.content.Context context = mMNeat7extView.getContext();
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = com.tencent.mm.ui.chatting.viewitems.b9.f203470b;
        kotlin.jvm.internal.o.d(mMNeat7extView2);
        int textSize = (int) mMNeat7extView2.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString u17 = com.tencent.mm.pluginsdk.ui.span.c0.u(context, str2, textSize, 1, null, null, true);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = com.tencent.mm.ui.chatting.viewitems.b9.f203470b;
        kotlin.jvm.internal.o.d(mMNeat7extView3);
        mMNeat7extView3.b(u17);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView4 = com.tencent.mm.ui.chatting.viewitems.b9.f203470b;
        kotlin.jvm.internal.o.d(mMNeat7extView4);
        mMNeat7extView4.setClickable(true);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return com.tencent.mm.ui.chatting.viewitems.b9.f203470b;
    }
}
