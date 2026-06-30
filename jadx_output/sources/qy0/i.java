package qy0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager f367593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367593e = mMMusicManager;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy0.i(this.f367593e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        java.util.LinkedList<r45.mh4> linkedList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367592d;
        com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager = this.f367593e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List list = mMMusicManager.f69743e;
            long j17 = mMMusicManager.f69749n;
            this.f367592d = 1;
            g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new xy0.a(list, 60000L, 10L, j17, 10, null), this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
        }
        r45.jh4 jh4Var = (r45.jh4) g17;
        java.util.ArrayList arrayList = (java.util.ArrayList) mMMusicManager.f69747i;
        arrayList.clear();
        java.util.LinkedList linkedList2 = jh4Var != null ? jh4Var.f377813e : null;
        java.util.List<com.tencent.maas.model.MJMusicInfo> list2 = kz5.p0.f313996d;
        if (linkedList2 == null) {
            linkedList2 = list2;
        }
        arrayList.addAll(linkedList2);
        mMMusicManager.f69749n = jh4Var != null ? jh4Var.f377812d : 0L;
        if (jh4Var != null && (linkedList = jh4Var.f377813e) != null) {
            list2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.mh4 mh4Var : linkedList) {
                java.lang.String valueOf = java.lang.String.valueOf(mh4Var.f380508d);
                java.lang.String str = mh4Var.f380513i;
                java.util.LinkedList singer_name = mh4Var.f380514m;
                kotlin.jvm.internal.o.f(singer_name, "singer_name");
                java.lang.String g07 = kz5.n0.g0(singer_name, null, null, null, 0, null, null, 63, null);
                com.tencent.maas.model.time.MJTime mJTime = new com.tencent.maas.model.time.MJTime();
                java.util.LinkedList lyrics = mh4Var.f380515n;
                kotlin.jvm.internal.o.f(lyrics, "lyrics");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(lyrics, 10));
                java.util.Iterator it = lyrics.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new com.tencent.maas.model.MJLyricInfo(null, null, ((r45.nh4) it.next()).f381400e, null));
                }
                list2.add(new com.tencent.maas.model.MJMusicInfo(valueOf, str, g07, mJTime, arrayList2.toArray(new com.tencent.maas.model.MJLyricInfo[0])));
            }
        }
        ((n0.q4) mMMusicManager.f69744f).setValue(list2);
        for (com.tencent.maas.model.MJMusicInfo mJMusicInfo : list2) {
            java.util.Map map = mMMusicManager.f69752q.f422801k;
            java.lang.String musicID = mJMusicInfo.getMusicID();
            kotlin.jvm.internal.o.f(musicID, "getMusicID(...)");
            map.put(musicID, new java.lang.Long(mMMusicManager.f69749n));
        }
        if (!list2.isEmpty()) {
            ((n0.q4) mMMusicManager.f69745g).setValue(kz5.n0.X(list2));
        }
        return jz5.f0.f302826a;
    }
}
