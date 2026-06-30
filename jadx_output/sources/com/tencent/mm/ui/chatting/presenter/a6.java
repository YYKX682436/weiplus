package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class a6 extends com.tencent.mm.ui.chatting.adapter.e0 {

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f202117i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f202118m;

    public a6(com.tencent.mm.ui.chatting.presenter.b6 b6Var, android.view.View view) {
        super(view);
        this.f202117i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dum);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484314du0);
        this.f202118m = textView;
        textView.setVisibility(0);
    }
}
