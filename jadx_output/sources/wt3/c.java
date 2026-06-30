package wt3;

/* loaded from: classes5.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.e f449386a;

    public c(wt3.e eVar) {
        this.f449386a = eVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        wt3.e eVar = this.f449386a;
        eVar.f449405n = false;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsGetRecommendAudioTask", "LogStory: getRecommendMusic callback " + i17 + ' ' + i18 + ", " + fVar.f70617c);
        if (i17 != 0 || i18 != 0) {
            yz5.l lVar = eVar.f449404m;
            if (lVar == null) {
                return null;
            }
            lVar.invoke(new java.util.LinkedList());
            return null;
        }
        r45.jh4 jh4Var = (r45.jh4) fVar.f70618d;
        eVar.f449394c = jh4Var.f377812d;
        java.util.LinkedList linkedList = jh4Var.f377813e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsGetRecommendAudioTask", "get audio list count:" + linkedList.size() + ", " + jh4Var);
        yz5.l lVar2 = eVar.f449404m;
        if (lVar2 == null) {
            return null;
        }
        lVar2.invoke(linkedList);
        return null;
    }
}
