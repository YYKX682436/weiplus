package dk2;

/* loaded from: classes3.dex */
public final class ye extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f234391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f234392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(androidx.appcompat.app.AppCompatActivity appCompatActivity, yz5.a aVar) {
        super(1);
        this.f234391d = appCompatActivity;
        this.f234392e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        int i17;
        java.util.List list = (java.util.List) obj;
        if (list != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f234391d;
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            if (c1Var != null && c1Var.Y4) {
                if (list.isEmpty() ^ true) {
                    db5.t7.makeText(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.fw6), 1).show();
                }
            }
            dk2.k6 k6Var = dk2.ef.f233390j;
            k6Var.getClass();
            boolean z17 = list.isEmpty() ^ true;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!com.tencent.mm.storage.z3.R4((java.lang.String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                i17 = arrayList.size();
            } else {
                i17 = 0;
            }
            int size = z17 ? list.size() - i17 : 0;
            java.util.List<os5.n> externalLiveCallbacks = k6Var.f233683a;
            kotlin.jvm.internal.o.f(externalLiveCallbacks, "externalLiveCallbacks");
            synchronized (externalLiveCallbacks) {
                for (os5.n nVar : externalLiveCallbacks) {
                    com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", "onShareToConversation result:" + z17 + " shareUserCount:" + i17 + " shareRoomCount:" + size);
                    ((h63.d1) nVar).e(z17, i17, size);
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            dk2.ef efVar = dk2.ef.f233372a;
            yz5.a aVar = this.f234392e;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "share2Friend fail");
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
