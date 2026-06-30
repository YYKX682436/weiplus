package jm3;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f300324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(boolean z17) {
        super(2);
        this.f300324d = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        fm3.q itemData = (fm3.q) obj2;
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = fm3.g0.f264070a.c();
        c17.f59489r = c17.b("FeedId", itemData.a(), true);
        c17.f59490s = c17.b("FinderUin", itemData.b(), true);
        int i17 = fm3.g0.f264072c;
        if (i17 == 3) {
            c17.f59493v = fm3.g0.f264073d;
        }
        c17.f59495x = intValue;
        c17.f59496y = i17;
        c17.A = itemData.d();
        c17.f59497z = this.f300324d ? 1L : 2L;
        c17.f59482k = 4L;
        c17.k();
        c17.o();
        return jz5.f0.f302826a;
    }
}
