package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class xl extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f205996b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.base.NoMeasuredTextView f205997c;

    public xl(com.tencent.mm.ui.chatting.viewitems.yl ylVar) {
    }

    public com.tencent.mm.ui.chatting.viewitems.xl a(android.view.View view) {
        if (view == null) {
            com.tencent.mars.xlog.Log.e("MicrMsg.ChattingItemHardDeviceMsgLike", "hy: error when inflating");
        } else {
            super.create(view);
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.f205996b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.i1b);
            this.f205997c = (com.tencent.mm.ui.base.NoMeasuredTextView) view.findViewById(com.tencent.mm.R.id.o_k);
        }
        return this;
    }
}
