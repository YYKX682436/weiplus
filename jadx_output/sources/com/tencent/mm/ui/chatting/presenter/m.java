package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.ui.chatting.adapter.e0 {

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f202331i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f202332m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f202333n;

    public m(com.tencent.mm.ui.chatting.presenter.n nVar, android.view.View view) {
        super(view);
        this.f202331i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dum);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dur);
        this.f202332m = imageView;
        this.f202333n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484314du0);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dvy)).setVisibility(8);
        imageView.setVisibility(8);
    }
}
