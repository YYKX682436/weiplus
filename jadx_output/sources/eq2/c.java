package eq2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq2.a f255887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f255889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255890h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f255891i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, jq2.a aVar, java.lang.String str, int i18, int i19, int i27) {
        super(0);
        this.f255886d = i17;
        this.f255887e = aVar;
        this.f255888f = str;
        this.f255889g = i18;
        this.f255890h = i19;
        this.f255891i = i27;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f255886d;
        jq2.a aVar = this.f255887e;
        int i18 = aVar.f301099e;
        com.tencent.mm.protobuf.g f17 = ((gq2.j) aVar.f301101g).f274564g.f();
        java.lang.String str = this.f255888f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(aVar.f301100f);
        int i19 = this.f255889g;
        r45.dd2 dd2Var = new r45.dd2();
        int i27 = this.f255890h;
        dd2Var.set(0, java.lang.Integer.valueOf(i27));
        int i28 = this.f255891i;
        if (i27 != i28 && i28 != 0) {
            java.util.LinkedList list = dd2Var.getList(6);
            r45.dd2 dd2Var2 = new r45.dd2();
            dd2Var2.set(0, java.lang.Integer.valueOf(i28));
            list.add(dd2Var2);
        }
        aq2.a aVar2 = new aq2.a(i17, i18, f17, str, linkedList, i19, 0L, null, dd2Var, 0, 0.0f, false, null, null, null, false, null, 130624, null);
        com.tencent.mars.xlog.Log.i("LiveStreamTabPreloadManager", "#loadDataWithCgi req=" + aVar2);
        return new aq2.c(aVar2, null, null, 2, null);
    }
}
