package xt2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f457016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f457017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f457018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer, com.tencent.mm.plugin.finder.live.plugin.l lVar, so2.j5 j5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457016e = finderLiveShopPromoteContainer;
        this.f457017f = lVar;
        this.f457018g = j5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.t0(this.f457016e, this.f457017f, this.f457018g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x025a A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
