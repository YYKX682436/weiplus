package h62;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cf3 f279200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h62.n f279201e;

    public m(h62.n nVar, r45.cf3 cf3Var) {
        this.f279201e = nVar;
        this.f279200d = cf3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        h62.n nVar = this.f279201e;
        nVar.getClass();
        r45.cf3 cf3Var = this.f279200d;
        if (cf3Var != null && cf3Var.BaseResponse.f376959d == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = cf3Var.f371521h;
            if (linkedList != null && linkedList.size() > 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.hm0 hm0Var = (r45.hm0) it.next();
                    j62.a aVar = new j62.a();
                    aVar.a(hm0Var.f376286g);
                    arrayList.add(aVar);
                }
            }
            h62.d vj6 = h62.d.vj();
            int i17 = cf3Var.f371519f;
            java.util.LinkedList linkedList2 = cf3Var.f371520g;
            vj6.Jj(i17, linkedList2, arrayList);
            nVar.I(cf3Var.f371517d);
            int i18 = cf3Var.f371518e;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_INTERVAL_SEC_INT, java.lang.Integer.valueOf(i18));
            int i19 = cf3Var.f371522i;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_NEED_LOCAL_LIST_INT, java.lang.Integer.valueOf(i19));
            java.lang.String str = cf3Var.f371523m;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_GLOBAL_SEQ_STRING, str);
            if (nVar.f279204f == 0) {
                h62.d.vj().Cj(true);
            }
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(i18);
            objArr[1] = java.lang.Integer.valueOf(i19);
            objArr[2] = str;
            objArr[3] = java.lang.Integer.valueOf(arrayList.size());
            objArr[4] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExptApp", "updateExpt interval[%d] nextReqNeedLocalList[%d] globalSeq[%s] updateList[%d] deleteList[%d]", objArr);
            r3 = 1;
        }
        if (r3 != 0) {
            jx3.f.INSTANCE.idkeyStat(863L, 156L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(863L, 157L, 1L, false);
        }
    }
}
