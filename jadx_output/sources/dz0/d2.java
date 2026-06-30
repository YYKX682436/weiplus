package dz0;

/* loaded from: classes5.dex */
public final class d2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f244817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244815e = maasSdkUIC;
        this.f244816f = n7Var;
        this.f244817g = z17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17 = this.f244817g;
        dz0.d2 d2Var = new dz0.d2(this.f244815e, this.f244816f, z17, (kotlin.coroutines.Continuation) obj3);
        d2Var.f244814d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        d2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Throwable) this.f244814d) == null) {
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244815e;
            maasSdkUIC.t7();
            com.tencent.maas.model.MJMusicInfo currentMusicInfo = this.f244816f.f15742a.getCurrentMusicInfo();
            if (currentMusicInfo != null) {
                dz0.x xVar = maasSdkUIC.f69789m;
                xVar.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMusicInfo: on ");
                sb6.append(java.lang.Thread.currentThread().getName());
                sb6.append(", replaceLastInsert ");
                boolean z17 = this.f244817g;
                sb6.append(z17);
                sb6.append(", Id=");
                sb6.append(currentMusicInfo.getMusicID());
                com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
                currentMusicInfo.getSongName();
                currentMusicInfo.getMusicID();
                androidx.lifecycle.g0 g0Var = xVar.f245052c;
                java.util.List list = (java.util.List) g0Var.getValue();
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext() && !kotlin.jvm.internal.o.b(((com.tencent.maas.model.MJMusicInfo) it.next()).getMusicID(), currentMusicInfo.getMusicID())) {
                    }
                }
                java.util.List list2 = (java.util.List) g0Var.getValue();
                java.lang.Object obj2 = null;
                if (list2 != null) {
                    java.util.Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it6.next();
                        if (kotlin.jvm.internal.o.b(((com.tencent.maas.model.MJMusicInfo) next).getMusicID(), currentMusicInfo.getMusicID())) {
                            obj2 = next;
                            break;
                        }
                    }
                    obj2 = (com.tencent.maas.model.MJMusicInfo) obj2;
                }
                if (obj2 == null) {
                    com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: insert other music");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(currentMusicInfo);
                    java.util.List list3 = (java.util.List) g0Var.getValue();
                    if (list3 != null) {
                        arrayList.addAll(list3);
                    }
                    if (z17) {
                        java.util.Iterator it7 = arrayList.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it7.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            if (kotlin.jvm.internal.o.b(((com.tencent.maas.model.MJMusicInfo) it7.next()).getMusicID(), xVar.f245056g)) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 > 0) {
                            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: remove i=" + i17 + " lastInsertMusicId=" + xVar.f245056g);
                            arrayList.remove(i17);
                        }
                    }
                    java.lang.String musicID = currentMusicInfo.getMusicID();
                    kotlin.jvm.internal.o.f(musicID, "getMusicID(...)");
                    xVar.f245056g = musicID;
                    androidx.lifecycle.j0 j0Var = xVar.f245050a;
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        java.lang.Object next2 = it8.next();
                        if (hashSet.add(((com.tencent.maas.model.MJMusicInfo) next2).getMusicID())) {
                            arrayList2.add(next2);
                        }
                    }
                    j0Var.postValue(arrayList2);
                }
                xVar.f245051b.postValue(currentMusicInfo);
            }
        }
        return jz5.f0.f302826a;
    }
}
