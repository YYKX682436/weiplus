package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class c4 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.Panel f139059d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f139060e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f139061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.PanelGridView f139062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.tencent.mm.plugin.game.chatroom.view.PanelGridView panelGridView, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f139062g = panelGridView;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.kop);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f139060e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.kou);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f139061f = (android.widget.TextView) findViewById2;
        itemView.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.b4(this, itemView, panelGridView));
    }
}
