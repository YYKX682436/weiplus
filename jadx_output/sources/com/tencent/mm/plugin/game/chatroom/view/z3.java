package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class z3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f139372d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f139373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.PanelGridView f139374f;

    public z3(com.tencent.mm.plugin.game.chatroom.view.PanelGridView panelGridView, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f139374f = panelGridView;
        this.f139373e = new java.util.ArrayList();
        this.f139372d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f139373e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.game.chatroom.view.c4 holder = (com.tencent.mm.plugin.game.chatroom.view.c4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f139373e;
        if (i17 >= arrayList.size()) {
            return;
        }
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.game.autogen.chatroom.Panel panel = (com.tencent.mm.plugin.game.autogen.chatroom.Panel) obj;
        holder.f139059d = panel;
        r53.y.a().e(holder.f139060e, panel.icon, null, null);
        holder.f139061f.setText(panel.desc);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f139372d).inflate(com.tencent.mm.R.layout.f489140bf1, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.game.chatroom.view.c4(this.f139374f, inflate);
    }
}
