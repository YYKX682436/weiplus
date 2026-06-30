package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class b2 extends com.tencent.mm.ui.chatting.adapter.e0 {

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f202125i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f202126m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.ui.chatting.presenter.l2 l2Var, android.view.View convertView) {
        super(convertView);
        kotlin.jvm.internal.o.g(convertView, "convertView");
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.dum);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f202125i = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.tencent.mm.R.id.f484314du0);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f202126m = textView;
        textView.setVisibility(0);
    }
}
