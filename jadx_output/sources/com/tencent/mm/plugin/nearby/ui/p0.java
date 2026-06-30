package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes15.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b64 f152196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.q0 f152197e;

    public p0(com.tencent.mm.plugin.nearby.ui.q0 q0Var, r45.b64 b64Var) {
        this.f152197e = q0Var;
        this.f152196d = b64Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$NearbyFriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearby.ui.q0 q0Var = this.f152197e;
        com.tencent.mm.plugin.nearby.ui.l0 l0Var = (com.tencent.mm.plugin.nearby.ui.l0) ((java.util.HashMap) q0Var.f152202g.f152094n).get(this.f152196d.f370550d);
        if (l0Var != null) {
            l0Var.f152172j++;
            l0Var.f152175m = true;
            l0Var.f152174l |= 2;
        }
        q0Var.f152202g.V6();
        q0Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$NearbyFriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
