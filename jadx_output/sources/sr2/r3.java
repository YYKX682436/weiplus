package sr2;

/* loaded from: classes10.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f411697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411699h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.b01 f411700i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f411701m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411702n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.b01 f411703o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f411704p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.lang.String str, java.lang.String str2, r45.b01 b01Var, int i17, java.lang.String str3, r45.b01 b01Var2, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411696e = postMainUIC;
        this.f411697f = finderItem;
        this.f411698g = str;
        this.f411699h = str2;
        this.f411700i = b01Var;
        this.f411701m = i17;
        this.f411702n = str3;
        this.f411703o = b01Var2;
        this.f411704p = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sr2.r3(this.f411696e, this.f411697f, this.f411698g, this.f411699h, this.f411700i, this.f411701m, this.f411702n, this.f411703o, this.f411704p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sr2.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411695d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411696e;
            qd2.x xVar = (qd2.x) postMainUIC.W.getValue();
            android.app.Activity context = postMainUIC.getContext();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f411697f;
            java.lang.String T6 = postMainUIC.F7().T6();
            java.lang.String a76 = postMainUIC.F7().a7();
            java.lang.String str = this.f411698g;
            java.lang.String str2 = this.f411699h;
            r45.b01 b01Var = this.f411700i;
            java.util.LinkedList list = b01Var != null ? b01Var.getList(0) : null;
            int i18 = this.f411701m;
            java.lang.String str3 = this.f411702n;
            r45.b01 b01Var2 = this.f411703o;
            java.util.LinkedList list2 = b01Var2 != null ? b01Var2.getList(0) : null;
            int i19 = this.f411704p;
            ya2.p1 p1Var = postMainUIC.I7().f411800d;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            r45.ze2 ze2Var = ((yv2.b) p1Var).f466202h;
            this.f411695d = 1;
            a17 = xVar.a(context, finderItem, bw5.ps0.emMMFinderModFeedScene_DescAndCoverUrl, T6, a76, str, str2, list, i18, str3, list2, i19, ze2Var, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC2 = this.f411696e;
        pf5.e.launchUI$default(postMainUIC2, null, null, new sr2.q3(postMainUIC2, (jz5.l) a17, null), 3, null);
        return jz5.f0.f302826a;
    }
}
