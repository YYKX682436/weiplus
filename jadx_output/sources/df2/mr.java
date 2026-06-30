package df2;

/* loaded from: classes3.dex */
public final class mr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f230798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.h f230799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f230800g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(df2.lt ltVar, java.util.Set set, dk2.h hVar, com.tencent.mm.sdk.platformtools.o4 o4Var) {
        super(1);
        this.f230797d = ltVar;
        this.f230798e = set;
        this.f230799f = hVar;
        this.f230800g = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.f result = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(result, "result");
        int i17 = result.f70615a;
        if (((i17 == 0 && result.f70616b == 0) || hc2.p.b(i17, result.f70616b)) && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) result.f70618d).getCustom(2)) != null) {
            java.lang.String str = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "showtips after commentDetail");
            df2.lt.g7(this.f230797d, this.f230798e, this.f230799f, this.f230800g, finderObject);
        }
        return jz5.f0.f302826a;
    }
}
