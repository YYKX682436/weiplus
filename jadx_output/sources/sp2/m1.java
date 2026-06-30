package sp2;

/* loaded from: classes2.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f411084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f411086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f411087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f411088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f411089i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f411090m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(boolean z17, sp2.o2 o2Var, com.tencent.mm.protobuf.g gVar, int i17, boolean z18, int i18, long j17) {
        super(0);
        this.f411084d = z17;
        this.f411085e = o2Var;
        this.f411086f = gVar;
        this.f411087g = i17;
        this.f411088h = z18;
        this.f411089i = i18;
        this.f411090m = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.dk2 dk2Var;
        sp2.o2 o2Var = this.f411085e;
        boolean z17 = this.f411084d;
        com.tencent.mm.protobuf.g byteString = (z17 || (dk2Var = o2Var.A) == null) ? null : dk2Var.getByteString(6);
        java.lang.String str = (java.lang.String) ((jz5.n) o2Var.R).getValue();
        java.util.List c17 = z17 ? kz5.p0.f313996d : sp2.o2.c(o2Var, "loadDataWithCgi");
        com.tencent.mm.ui.MMActivity mMActivity = o2Var.f411121a;
        kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        int d17 = ((com.tencent.mm.plugin.finder.ui.MMFinderUI) mMActivity).getD();
        r45.o72 o72Var = o2Var.f411128d0;
        java.lang.String str2 = o2Var.V;
        com.tencent.mm.protobuf.g gVar = this.f411086f;
        com.tencent.mm.protobuf.g gVar2 = gVar == null ? (z17 && this.f411087g == 0) ? o2Var.Q : null : gVar;
        boolean z18 = this.f411088h;
        com.tencent.mm.protobuf.g c18 = z18 ? cq2.q.f221428a.c() : null;
        r45.rk0 rk0Var = cq2.q.f221439l;
        int i17 = this.f411087g;
        int i18 = this.f411089i;
        kotlin.jvm.internal.o.d(str);
        aq2.a aVar = new aq2.a(i17, i18, byteString, str, c17, d17, this.f411090m, o72Var, null, 0, 0.0f, false, str2, gVar2, c18, false, rk0Var, 36608, null);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi needRequestWithMoreObjects=" + z18 + ", req=" + aVar);
        return new aq2.b(aVar, null, o2Var.f411121a, 2, null);
    }
}
