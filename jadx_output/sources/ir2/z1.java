package ir2;

/* loaded from: classes2.dex */
public class z1 implements ym5.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f294255d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f294256e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f294257f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f294258g;

    public z1(com.tencent.mm.view.RefreshLoadMoreLayout layout, boolean z17, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f294255d = layout;
        this.f294256e = z17;
        this.f294257f = aVar;
        this.f294258g = aVar2;
    }

    @Override // ym5.m1
    public void onChanged() {
        this.f294255d.onChanged();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        yz5.a aVar = this.f294257f;
        this.f294255d.onItemRangeChanged(i17 + (aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : 0), i18, obj);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        yz5.a aVar = this.f294257f;
        this.f294255d.onItemRangeInserted(i17 + (aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : 0), i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        yz5.a aVar = this.f294257f;
        this.f294255d.onItemRangeMoved(i17 + (aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : 0), i18 + (aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : 0), i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        yz5.a aVar = this.f294257f;
        this.f294255d.onItemRangeRemoved(i17 + (aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : 0), i18);
        yz5.a aVar2 = this.f294258g;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }
}
