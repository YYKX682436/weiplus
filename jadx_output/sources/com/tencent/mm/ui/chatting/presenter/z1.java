package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class z1 extends com.tencent.mm.ui.chatting.adapter.e0 {

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f202575i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f202576m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f202577n;

    public z1(com.tencent.mm.ui.chatting.presenter.p1 p1Var, android.view.View view) {
        super(view);
        this.f202575i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dum);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484314du0);
        this.f202576m = textView;
        textView.setVisibility(0);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dvy);
        this.f202577n = textView2;
        textView2.setVisibility(0);
    }
}
