package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes12.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.e f207491d;

    public a(com.tencent.mm.ui.conversation.banner.e eVar) {
        this.f207491d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/ADBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.banner.e eVar = this.f207491d;
        com.tencent.mm.ui.conversation.banner.f fVar = eVar.f207498m;
        if (fVar != null && eVar.f207501p != null) {
            com.tencent.mm.ui.conversation.banner.g gVar = (com.tencent.mm.ui.conversation.banner.g) fVar.f207503o.get(0);
            com.tencent.mm.ui.conversation.banner.d dVar = eVar.f207501p;
            java.lang.String str = gVar.f207506a.f351707a;
            ((com.tencent.mm.ui.conversation.banner.c) dVar).getClass();
            p35.b.a();
            ((e21.z0) c01.d9.b().w()).c(new e21.u(3, str));
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/ADBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
