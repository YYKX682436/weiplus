package te2;

/* loaded from: classes8.dex */
public final class j9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f418143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f418144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f418145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(te2.m9 m9Var, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, bm2.p8 p8Var) {
        super(1);
        this.f418143d = m9Var;
        this.f418144e = wxRecyclerView;
        this.f418145f = p8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        int intValue = ((java.lang.Number) obj).intValue();
        this.f418143d.getClass();
        if (intValue >= 0 && (wxRecyclerView = this.f418144e) != null) {
            wxRecyclerView.post(new te2.g9(this.f418145f, intValue, wxRecyclerView));
        }
        return jz5.f0.f302826a;
    }
}
