package wu;

/* loaded from: classes9.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f449623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(hu.b bVar, android.widget.FrameLayout frameLayout) {
        super(1);
        this.f449622d = bVar;
        this.f449623e = frameLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String k17;
        s15.f n17;
        s15.f n18;
        java.lang.String link;
        a11.c it = (a11.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = it.f504a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hu.b bVar = this.f449622d;
        s15.h hVar = bVar.f284997e;
        int integer = hVar.getInteger(hVar.f303422d + 2);
        te5.t tVar = te5.t.f418749a;
        s15.h hVar2 = bVar.f284997e;
        android.widget.FrameLayout frameLayout = this.f449623e;
        if (integer == 5) {
            i95.m c17 = i95.n0.c(ct.r2.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = frameLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            z01.i iVar = new z01.i();
            java.lang.String link2 = hVar2.getLink();
            java.lang.String str = null;
            if (!java.lang.Boolean.valueOf(!r26.n0.N(link2)).booleanValue()) {
                link2 = null;
            }
            if (link2 == null) {
                s15.h0 d07 = hVar2.d0();
                if (d07 != null && (link = d07.getLink()) != null && java.lang.Boolean.valueOf(!r26.n0.N(link)).booleanValue()) {
                    str = link;
                }
                link2 = str == null ? hVar2.U() : str;
            }
            kotlin.jvm.internal.o.g(link2, "<set-?>");
            iVar.f469051a = link2;
            s15.h0 d08 = hVar2.d0();
            iVar.f469052b = (d08 == null || (n18 = d08.n()) == null) ? -1 : n18.j();
            s15.h0 d09 = hVar2.d0();
            if (d09 == null || (n17 = d09.n()) == null || (k17 = n17.l()) == null) {
                k17 = hVar2.k();
            }
            kotlin.jvm.internal.o.g(k17, "<set-?>");
            iVar.f469053c = k17;
            tVar.m(context, it, iVar);
        }
        i95.m c18 = i95.n0.c(ct.r2.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        android.content.Context context2 = frameLayout.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        z01.e eVar = new z01.e();
        java.lang.String appId = hVar2.getAppId();
        kotlin.jvm.internal.o.g(appId, "<set-?>");
        eVar.f468995a = appId;
        eVar.f468998d = i65.a.h(frameLayout.getContext(), com.tencent.mm.R.dimen.f479642bh);
        tVar.l(context2, it, eVar);
        return jz5.f0.f302826a;
    }
}
