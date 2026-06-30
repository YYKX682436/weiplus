package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class c4 extends com.tencent.mm.ui.chatting.adapter.e0 {

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f202147i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f202148m;

    /* renamed from: n, reason: collision with root package name */
    public long f202149n;

    public c4(com.tencent.mm.ui.chatting.presenter.o3 o3Var, android.view.View view) {
        super(view);
        this.f202149n = -1L;
        this.f202147i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dum);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484314du0)).setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dvy);
        this.f202148m = textView;
        textView.setVisibility(0);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dur);
        imageView.setImageResource(com.tencent.mm.R.drawable.as8);
        imageView.setVisibility(0);
    }
}
