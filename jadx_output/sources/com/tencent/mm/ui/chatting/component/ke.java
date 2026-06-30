package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class ke extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f199363d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f199364e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.ee f199365f;

    public ke(android.content.Context context, java.util.List list, com.tencent.mm.ui.chatting.component.ee eeVar) {
        this.f199363d = context;
        this.f199364e = list;
        this.f199365f = eeVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f199364e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list = this.f199364e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.tencent.mm.ui.chatting.component.fe feVar = (com.tencent.mm.ui.chatting.component.fe) k3Var;
        com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = (com.tencent.mm.chatroom.storage.GroupToolItem) list.get(i17);
        android.view.View view = feVar.f199051d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomaa@app.origin");
        android.widget.TextView textView = feVar.f199053f;
        android.widget.ImageView imageView = feVar.f199052e;
        if (D0) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f481869bj5);
            textView.setText(com.tencent.mm.R.string.ftd);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomlive@app.origin")) {
            imageView.setImageDrawable(i65.a.i(this.f199363d, com.tencent.mm.R.drawable.bj6));
            textView.setText(com.tencent.mm.R.string.f490401ty);
        } else {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(groupToolItem.f63682d);
            if (Bi == null) {
                ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(groupToolItem.f63682d, new com.tencent.mm.ui.chatting.component.ie(this, feVar));
            } else {
                x(feVar, Bi);
            }
        }
        android.view.View view2 = feVar.f199051d;
        view2.setTag(groupToolItem);
        view2.setOnClickListener(new com.tencent.mm.ui.chatting.component.je(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.component.fe(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488446tj, viewGroup, false));
    }

    public final void x(com.tencent.mm.ui.chatting.component.fe feVar, k91.v5 v5Var) {
        n11.a.b().h(v5Var != null ? v5Var.field_smallHeadURL : "", feVar.f199052e, com.tencent.mm.ui.chatting.component.fe.f199050g);
        feVar.f199053f.setText(v5Var != null ? v5Var.field_nickname : "");
    }
}
