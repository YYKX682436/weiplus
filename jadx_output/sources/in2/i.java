package in2;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(in2.s sVar) {
        super(1);
        this.f292845d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f292845d.f292891p1;
        if (wxRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$4$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$4$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
