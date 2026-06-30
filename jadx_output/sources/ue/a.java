package ue;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue.e f426762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ue.e eVar) {
        super(0);
        this.f426762d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        ue.e eVar = this.f426762d;
        synchronized (eVar) {
            arrayList = new java.util.ArrayList(eVar.f426773i);
            arrayList.addAll(eVar.f426774m);
            eVar.f426773i.clear();
            eVar.f426774m.clear();
        }
        com.tencent.mars.xlog.Log.i("WorkerNativeJsRuntimeWrapper", "postCleanupJob count:" + arrayList.size());
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.appbrand.jsruntime.x xVar = (com.tencent.mm.plugin.appbrand.jsruntime.x) arrayList.get(i17);
            if (xVar != null) {
                xVar.onDestroy();
            }
        }
        return jz5.f0.f302826a;
    }
}
