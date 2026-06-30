package kk5;

/* loaded from: classes.dex */
public final class x implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f308698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk5.c0 f308699e;

    public x(kk5.c0 c0Var, yz5.l handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f308699e = c0Var;
        this.f308698d = handler;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFTSSearchEnd ");
        jz5.f0 f0Var = null;
        sb6.append((vVar == null || (list = vVar.f351160e) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", sb6.toString());
        if (vVar != null) {
            if (kotlin.jvm.internal.o.b(this.f308699e.f308625f, vVar.f351157b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "result code: " + vVar.f351158c);
                if (vVar.f351158c == 0) {
                    java.util.List resultList = vVar.f351160e;
                    kotlin.jvm.internal.o.f(resultList, "resultList");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(resultList, 10));
                    java.util.Iterator it = resultList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((p13.y) it.next()).f351187e);
                    }
                    this.f308698d.invoke(arrayList);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "onFTSSearchEnd currentSearchTask is not equal");
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "onFTSSearchEnd ftsResult is null");
        }
    }
}
