package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class p6 extends com.tencent.mm.ui.chatting.adapter.e0 {

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f202422i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f202423m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f202424n;

    public p6(com.tencent.mm.ui.chatting.presenter.c6 c6Var, android.view.View view) {
        super(view);
        this.f202422i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dum);
        this.f202423m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484314du0);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dvy);
        this.f202424n = textView;
        textView.setVisibility(0);
    }
}
