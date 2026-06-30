package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class t1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.MultiSelectContactView f191324d;

    public t1(com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView) {
        this.f191324d = multiSelectContactView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f191324d.f189785e.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 == getItemCount() - 1 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.pluginsdk.ui.z1 z1Var = (com.tencent.mm.pluginsdk.ui.z1) k3Var;
        if (getItemViewType(i17) != 1) {
            java.lang.String str = (java.lang.String) this.f191324d.f189785e.get(i17);
            android.view.View view = z1Var.itemView;
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jbx);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactAdapter", "onBindViewHolder", "(Lcom/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactAdapter", "onBindViewHolder", "(Lcom/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
            com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
            android.widget.ImageView imageView = z1Var.f192103d;
            wVar.Ai(imageView, str, null);
            ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            imageView.setContentDescription(c01.a2.e(str));
            view.setTag(str);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f191324d;
        return (i17 != 1 || multiSelectContactView.f189792o.booleanValue()) ? new com.tencent.mm.pluginsdk.ui.z1(multiSelectContactView, multiSelectContactView.f189791n.inflate(com.tencent.mm.R.layout.cjk, (android.view.ViewGroup) null, false), i17) : new com.tencent.mm.pluginsdk.ui.z1(multiSelectContactView, multiSelectContactView.f189791n.inflate(com.tencent.mm.R.layout.c5i, (android.view.ViewGroup) null, false), i17);
    }
}
