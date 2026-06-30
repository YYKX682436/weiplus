package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f151020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.e1 f151021e;

    public a1(java.lang.Object obj, com.tencent.mm.plugin.mv.ui.uic.e1 e1Var) {
        this.f151020d = obj;
        this.f151021e = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String username;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvInfoUIC$mediaChangeListener$1$onChange$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderContact contact = ((com.tencent.mm.protocal.protobuf.FinderObject) this.f151020d).getContact();
        if (contact != null && (username = contact.getUsername()) != null) {
            this.f151021e.O6(username, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvInfoUIC$mediaChangeListener$1$onChange$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
