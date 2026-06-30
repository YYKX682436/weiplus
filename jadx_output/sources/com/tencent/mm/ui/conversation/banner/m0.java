package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f207554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.l0 f207555e;

    public m0(com.tencent.mm.ui.conversation.banner.l0 l0Var, android.content.Intent intent) {
        this.f207555e = l0Var;
        this.f207554d = intent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/OtherOnlineBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean wi6 = iy4.z.wi();
        com.tencent.mm.ui.conversation.banner.l0 l0Var = this.f207555e;
        if (wi6) {
            iy4.z zVar = (iy4.z) i95.n0.c(iy4.z.class);
            android.content.Context context = (android.content.Context) l0Var.f402842g.get();
            zVar.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            try {
                java.util.ArrayList K = ug3.i.K();
                kotlin.jvm.internal.o.f(K, "getOnlineInfoList(...)");
                java.util.List S0 = kz5.n0.S0(K);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(S0, 10));
                java.util.Iterator it = S0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ug3.k) it.next()).toByteArray());
                }
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new iy4.t(arrayList2, context, null), 3, null);
            } catch (java.lang.Exception e17) {
                ot5.g.a("MicroMsg.ExtDeviceService", "enter logged device page failed, error: " + e17.getMessage());
            }
        } else {
            j45.l.j((android.content.Context) l0Var.f402842g.get(), "webwx", ".ui.WebWXLogoutUI", this.f207554d, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
