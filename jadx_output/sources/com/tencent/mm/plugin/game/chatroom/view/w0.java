package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class w0 extends com.tencent.mm.plugin.game.chatroom.view.t0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f139328e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f139329f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f139330g;

    public w0(android.view.View view) {
        super(view);
        this.f139328e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oml);
        this.f139329f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hnd);
        this.f139330g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hk9);
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.t0
    public void i(w33.a aVar, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, int i17, long j17, long j18, java.util.List list) {
    }

    public void j(boolean z17, boolean z18) {
        android.widget.TextView textView = this.f139328e;
        android.widget.ImageView imageView = this.f139329f;
        android.widget.ImageView imageView2 = this.f139330g;
        if (z17) {
            textView.setText("收起小组");
            imageView.setVisibility(8);
            if (com.tencent.mm.ui.bk.C()) {
                imageView2.setImageResource(com.tencent.mm.R.raw.icons_arrow_up_dark);
                return;
            } else {
                imageView2.setImageResource(com.tencent.mm.R.raw.icons_arrow_up_grey);
                return;
            }
        }
        textView.setText("展开小组");
        if (com.tencent.mm.ui.bk.C()) {
            imageView2.setImageResource(com.tencent.mm.R.raw.icons_arrow_down_dark);
        } else {
            imageView2.setImageResource(com.tencent.mm.R.raw.icons_arrow_down_grey);
        }
        if (z18) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }
}
