package com.tencent.mm.plugin.masssend.ui;

/* loaded from: classes5.dex */
public class MassSendLayout extends com.tencent.mm.ui.BasePanelKeybordLayout {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f148536n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ChatFooter f148537o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.j5 f148538p;

    public MassSendLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148538p = new kf3.c1(this);
        ((android.app.Activity) context).getWindow().setSoftInputMode(32);
    }

    @Override // com.tencent.mm.ui.BasePanelKeybordLayout
    public java.util.List<android.view.View> getPanelView() {
        return new java.util.ArrayList();
    }

    public void setChatFooter(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f148537o = chatFooter;
        com.tencent.mm.pluginsdk.ui.chat.j5 j5Var = this.f148538p;
        if (j5Var == null) {
            chatFooter.getClass();
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) chatFooter.J1;
        if (linkedList.contains(j5Var)) {
            return;
        }
        linkedList.add(j5Var);
    }

    public void setPanel(android.view.View view) {
        this.f148536n = view;
    }

    public MassSendLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f148538p = new kf3.c1(this);
        ((android.app.Activity) context).getWindow().setSoftInputMode(32);
    }
}
