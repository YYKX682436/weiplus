package l41;

/* loaded from: classes5.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l41.b2 f315779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(java.lang.String str, l41.b2 b2Var) {
        super(1);
        this.f315778d = str;
        this.f315779e = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuService", "sendOpenImKfCard getShareCardContent failed");
        } else {
            java.util.Iterator it = r26.n0.f0(this.f315778d, new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                this.f315779e.Ri((java.lang.String) it.next(), str);
            }
        }
        return jz5.f0.f302826a;
    }
}
