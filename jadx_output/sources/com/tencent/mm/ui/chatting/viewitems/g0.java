package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class g0 implements com.tencent.mm.ui.chatting.adapter.q {
    public static final int STATUS_EDIT = 1;
    public static final int STATUS_NORMAL = 0;
    private byte _hellAccFlag_;
    public com.tencent.mm.ui.chatting.view.ChattingAvatarImageView avatarIV;
    public com.tencent.mm.ui.base.MaskLayout avatarMask;
    public com.tencent.mm.ui.chatting.viewitems.a0 chattingItem;
    public android.widget.CheckBox checkBox;
    public android.view.View clickArea;
    public android.view.View convertView;
    public android.view.View historyMsgTip;
    public android.view.View maskView;
    public android.view.View noMoreMsgTip;
    public android.widget.ImageView stateIV;
    public android.widget.TextView timeTV;
    public android.widget.ProgressBar uploadingPB;
    public android.widget.TextView userTV;
    private com.tencent.mm.ui.chatting.adapter.q chatHolder = com.tencent.mm.ui.chatting.adapter.p.f198437a;
    private q31.n quoteView = null;

    public void create(android.view.View view) {
        this.convertView = view;
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.avatarIV = (com.tencent.mm.ui.chatting.view.ChattingAvatarImageView) view.findViewById(com.tencent.mm.R.id.f483642bk1);
        this.historyMsgTip = view.findViewById(com.tencent.mm.R.id.bm7);
        this.noMoreMsgTip = view.findViewById(com.tencent.mm.R.id.bpw);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.avatarMask = (com.tencent.mm.ui.base.MaskLayout) view.findViewById(com.tencent.mm.R.id.f483645bk4);
        this.clickArea = view.findViewById(com.tencent.mm.R.id.bkg);
        this.stateIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqx);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.q
    public int getAdapterPosition() {
        return this.chatHolder.getAdapterPosition();
    }

    public com.tencent.mm.storage.f9 getCurrentMsgInfo(yb5.d dVar) {
        return com.tencent.mm.ui.chatting.viewitems.er.b(this.chatHolder, dVar);
    }

    public android.view.View getMainContainerView() {
        return this.clickArea;
    }

    public q31.n getQuoteView() {
        return this.quoteView;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.q
    public kotlinx.coroutines.y0 getViewHolderScope() {
        return this.chatHolder.getViewHolderScope();
    }

    public void resetChatBubbleWidth(android.view.View view, int i17) {
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) (i17 / j65.f.f297943g);
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    public void resetChatBubbleWidthWithNewStyle(android.view.View view, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "resetChatBubbleWidthWithNewStyle, use new style");
        if (view != null) {
            int c17 = (int) (com.tencent.mm.ui.gk.c() * 5.0d);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = c17;
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    public void setChatHolder(com.tencent.mm.ui.chatting.adapter.q qVar) {
        this.chatHolder = qVar;
    }

    public void setChattingItem(com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        this.chattingItem = a0Var;
    }

    public void setQuoteView(q31.n nVar) {
        this.quoteView = nVar;
    }

    public void showEditView(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.widget.CheckBox checkBox = this.checkBox;
        if (checkBox != null && checkBox.getVisibility() != i17) {
            this.checkBox.setVisibility(i17);
        }
        android.view.View view = this.maskView;
        if (view == null || view.getVisibility() == i17) {
            return;
        }
        android.view.View view2 = this.maskView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder", "showEditView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder", "showEditView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
