package te2;

/* loaded from: classes10.dex */
public final class u9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f418477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.y9 f418479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f81 f418480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f418481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(int i17, int i18, te2.y9 y9Var, r45.f81 f81Var, yz5.l lVar) {
        super(0);
        this.f418477d = i17;
        this.f418478e = i18;
        this.f418479f = y9Var;
        this.f418480g = f81Var;
        this.f418481h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f418481h;
        int i17 = this.f418478e;
        te2.y9 y9Var = this.f418479f;
        int i18 = this.f418477d;
        if (i18 == 0 && i17 == 0) {
            dk2.s sVar = ((mm2.m6) y9Var.f418150e.a(mm2.m6.class)).f329241f;
            r45.f81 f81Var = this.f418480g;
            sVar.f(f81Var, y9Var.f418149d);
            java.util.LinkedList list = f81Var.getList(1);
            int size = list != null ? list.size() : 0;
            com.tencent.mars.xlog.Log.i(y9Var.f418549m, "loadSongListData - success, size: " + size);
            lVar.invoke(java.lang.Integer.valueOf(size));
        } else {
            com.tencent.mars.xlog.Log.i(y9Var.f418549m, "loadSongListData - failed, errType: " + i18 + ", errCode: " + i17);
            lVar.invoke(0);
        }
        return jz5.f0.f302826a;
    }
}
