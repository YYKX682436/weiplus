package yp;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ yp.p C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yp.p pVar) {
        super(0);
        this.C = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        for (int i17 = 0; i17 < 10; i17++) {
            arrayList.add(this.C.m(0));
        }
        com.tencent.mars.xlog.Log.i("DanmakuHolderPool", "preloadTextDanmakuHolder: size = " + arrayList.size());
        synchronized (yp.f.f464380c) {
            yp.f.f464378a.a(0).addAll(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
