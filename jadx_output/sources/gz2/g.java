package gz2;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f277734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f277736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list, java.lang.String str, int i17) {
        super(0);
        this.f277734d = list;
        this.f277735e = str;
        this.f277736f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gz2.i iVar = gz2.i.f277740a;
        java.util.List<jz5.l> list = this.f277734d;
        java.lang.String str = this.f277735e;
        int i17 = this.f277736f;
        synchronized (iVar) {
            if (list != null) {
                for (jz5.l lVar : list) {
                    gz2.i.a(iVar, str, ((java.lang.String) lVar.f302833d) + '-' + ((java.lang.String) lVar.f302834e));
                }
            }
            gz2.i.a(iVar, str, "_totalCount_");
            gz2.i.f277744e.put(str, java.lang.Integer.valueOf(i17));
            if (gz2.i.f277745f == null) {
                com.tencent.mars.xlog.Log.i("Finder.LiveBatchReporter", "start");
                gz2.i.f277745f = kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new gz2.h(iVar, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
