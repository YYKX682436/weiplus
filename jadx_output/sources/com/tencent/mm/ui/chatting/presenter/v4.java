package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class v4 extends com.tencent.mm.ui.chatting.adapter.h0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f202508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.y4 f202509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.ui.chatting.presenter.y4 y4Var, android.view.View view) {
        super(view);
        this.f202509f = y4Var;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f484067pv3);
        this.f202508e = linearLayout;
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(new com.tencent.mm.ui.chatting.presenter.u4(this, y4Var, view));
    }
}
