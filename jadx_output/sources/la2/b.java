package la2;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f317503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f317504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f317505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f317506g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d85.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, yz5.l lVar, int i17, java.lang.String str) {
        super(1);
        this.f317503d = f0Var;
        this.f317504e = f0Var2;
        this.f317505f = lVar;
        this.f317506g = i17;
        this.f317507h = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + this.f317503d + ", onClick clickType:" + intValue);
        this.f317504e.f310116d = intValue;
        yz5.l lVar = this.f317505f;
        if (intValue == 2) {
            lVar.invoke(java.lang.Boolean.FALSE);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_TIME_INT_SYNC, java.lang.Integer.valueOf(this.f317506g + 1));
        } else if (intValue == 3) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_TIME_INT_SYNC, Integer.MAX_VALUE);
            lVar.invoke(java.lang.Boolean.FALSE);
        } else if (intValue == 4) {
            lVar.invoke(java.lang.Boolean.TRUE);
            java.lang.String username = this.f317507h;
            kotlin.jvm.internal.o.g(username, "username");
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiHelper", "modMaterialPoiSwitchCallback, isEnable:true");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f280090e.o(true, new la2.c(true, username), username);
        }
        return jz5.f0.f302826a;
    }
}
