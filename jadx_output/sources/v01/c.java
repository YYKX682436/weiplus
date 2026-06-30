package v01;

/* loaded from: classes7.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f432199e;

    public c(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment, com.tencent.wechat.mm.biz.b bVar) {
        this.f432198d = bizProfileCardFragment;
        this.f432199e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initProfileBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(r01.l1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r01.l1.Zi((r01.l1) c17, this.f432198d.getActivity(), this.f432199e.f217890f, com.tencent.mm.plugin.appbrand.jsapi.pay.k2.CTRL_INDEX, false, 8, null);
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initProfileBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
