package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.m f207556d;

    public n(com.tencent.mm.ui.conversation.banner.m mVar) {
        this.f207556d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.banner.m mVar = this.f207556d;
        mVar.m();
        c01.d9.b().o().b(mVar.f207549m);
        c01.d9.b().o().b(mVar.f207550n);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
