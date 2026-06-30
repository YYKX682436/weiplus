package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f141247a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f141248b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f141249c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f141250d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f141251e;

    public c1(com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var, android.view.View view) {
        this.f141251e = view;
        this.f141247a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.avt);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.avq);
        this.f141248b = imageView;
        this.f141249c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m49);
        this.f141250d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.avs);
        if (d1Var.f141255e.f141155h == null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            android.content.Context context = d1Var.f141254d;
            layoutParams.width = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479837gm);
            layoutParams.height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479837gm);
            imageView.setLayoutParams(layoutParams);
        }
    }
}
