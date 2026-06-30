package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class zl extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f206165b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f206166c;

    public zl(com.tencent.mm.ui.chatting.viewitems.am amVar) {
    }

    public com.tencent.mm.ui.chatting.viewitems.zl a(android.view.View view) {
        if (view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemHardDeviceMsgPush", "hy: error when inflating");
        } else {
            super.create(view);
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.f206165b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486483ld4);
            this.f206166c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o_k);
        }
        return this;
    }
}
