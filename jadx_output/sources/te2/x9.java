package te2;

/* loaded from: classes8.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.y9 f418533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(te2.y9 y9Var) {
        super(1);
        this.f418533d = y9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        int intValue = ((java.lang.Number) obj).intValue();
        te2.lc lcVar = this.f418533d.f418153h;
        te2.fa faVar = lcVar instanceof te2.fa ? (te2.fa) lcVar : null;
        if (faVar != null && (wxRecyclerView = faVar.f418021t) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongPresenter$setupAdapter$1$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongPresenter$setupAdapter$1$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
