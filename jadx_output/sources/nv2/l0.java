package nv2;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f340529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f340530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f340531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f340533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f340534i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.t21 f340535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.bc1 f340536n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f340537o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, r45.qt2 qt2Var, java.lang.String str, int i17, int i18, r45.t21 t21Var, r45.bc1 bc1Var, yz5.l lVar) {
        super(0);
        this.f340529d = finderItem;
        this.f340530e = z17;
        this.f340531f = qt2Var;
        this.f340532g = str;
        this.f340533h = i17;
        this.f340534i = i18;
        this.f340535m = t21Var;
        this.f340536n = bc1Var;
        this.f340537o = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f340529d;
        boolean isQAFeed = finderItem.isQAFeed();
        yz5.l lVar = this.f340537o;
        r45.qt2 qt2Var = this.f340531f;
        if (isQAFeed) {
            int i17 = this.f340530e ? 3 : 103;
            java.lang.String f17 = xy2.c.f(qt2Var);
            java.lang.String str = this.f340532g;
            if (str == null) {
                str = "";
            }
            pm0.v.T(new ho2.h(i17, f17, str, this.f340529d, "FinderLocal_" + java.lang.System.nanoTime()).l(), new nv2.j0(lVar));
        } else {
            pm0.v.T(new db2.h0(new db2.a5(finderItem.getId(), finderItem.getDupFlag(), finderItem.getObjectNonceId(), this.f340530e, this.f340533h, this.f340534i, this.f340532g, this.f340535m, this.f340536n), qt2Var).l(), new nv2.k0(lVar));
        }
        return jz5.f0.f302826a;
    }
}
