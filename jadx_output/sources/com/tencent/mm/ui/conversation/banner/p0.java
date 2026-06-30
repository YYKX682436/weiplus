package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.q0 f207560d;

    public p0(com.tencent.mm.ui.conversation.banner.q0 q0Var) {
        this.f207560d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/TryNewInitBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TryNewInitBanner", "summerinit onClick trynewinit layout start try");
        this.f207560d.k(8);
        new com.tencent.mm.autogen.events.TriggerInitEvent().e();
        com.tencent.mars.xlog.Log.i("MicroMsg.TryNewInitBanner", "summerinit onClick tryNeeInitAgain done callBack (now by event to notice initbanner)");
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
