package dz0;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz0.x f245044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f245045e;

    public w(dz0.x xVar, com.tencent.maas.model.MJMusicInfo mJMusicInfo) {
        this.f245044d = xVar;
        this.f245045e = mJMusicInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz0.x xVar = this.f245044d;
        java.util.List list = (java.util.List) xVar.f245052c.getValue();
        java.lang.Object obj = null;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo = this.f245045e;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.maas.model.MJMusicInfo) next).getMusicID(), mJMusicInfo.getMusicID())) {
                    obj = next;
                    break;
                }
            }
            obj = (com.tencent.maas.model.MJMusicInfo) obj;
        }
        if (obj == null) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: insert other music");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(mJMusicInfo);
            java.util.List list2 = (java.util.List) xVar.f245052c.getValue();
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            androidx.lifecycle.j0 j0Var = xVar.f245050a;
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (hashSet.add(((com.tencent.maas.model.MJMusicInfo) obj2).getMusicID())) {
                    arrayList2.add(obj2);
                }
            }
            j0Var.postValue(arrayList2);
        }
        xVar.f245051b.setValue(mJMusicInfo);
    }
}
