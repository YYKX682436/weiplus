package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.e f207496d;

    public b(com.tencent.mm.ui.conversation.banner.e eVar) {
        this.f207496d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/ADBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.banner.e eVar = this.f207496d;
        com.tencent.mm.ui.conversation.banner.f fVar = eVar.f207498m;
        if (fVar != null && eVar.f207501p != null) {
            com.tencent.mm.ui.conversation.banner.g gVar = (com.tencent.mm.ui.conversation.banner.g) fVar.f207503o.get(0);
            com.tencent.mm.ui.conversation.banner.d dVar = eVar.f207501p;
            p35.b bVar = gVar.f207506a;
            java.lang.String str = bVar.f351707a;
            java.lang.String str2 = bVar.f351714h;
            com.tencent.mm.ui.conversation.banner.c cVar = (com.tencent.mm.ui.conversation.banner.c) dVar;
            cVar.getClass();
            p35.b.a();
            ((e21.z0) c01.d9.b().w()).c(new e21.u(2, str));
            ((com.tencent.mm.app.plugin.j) o25.z1.a()).c((android.content.Context) cVar.f207497a.f402842g.get(), str2, true, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/ADBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
