package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class e4 extends com.tencent.mm.ui.chatting.adapter.e0 {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f202201i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f202202m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.tencent.mm.ui.chatting.presenter.m4 m4Var, android.view.View convertView) {
        super(convertView);
        kotlin.jvm.internal.o.g(convertView, "convertView");
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.dum);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        this.f202201i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.tencent.mm.R.id.f484315du3);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f202202m = textView;
        textView.setVisibility(0);
    }
}
