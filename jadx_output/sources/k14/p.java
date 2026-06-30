package k14;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {
    public p(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k14.p(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        k14.p pVar = new k14.p((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        k14.t tVar = k14.t.f303377a;
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        tVar.d().getClass();
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_902ac54f", "hearing_aid_audio_zip");
        java.util.RandomAccess randomAccess = kz5.p0.f313996d;
        if (Ui != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HearingAidDownloadResource", "downloadResources local success");
            k14.t.f303379c.set(true);
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            tVar.d().getClass();
            qVar.c("ilinkres_902ac54f");
            java.util.LinkedList linkedList = qVar.f217548e;
            if (linkedList != null) {
                linkedList.add("hearing_aid_audio_zip");
            }
            java.util.LinkedList linkedList2 = qVar.f217549f;
            if (linkedList2 != null) {
                java.util.RandomAccess parameter = tVar.d().getParameter();
                if (parameter != null) {
                    randomAccess = parameter;
                }
                linkedList2.addAll(randomAccess);
            }
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new k14.q());
        } else {
            k14.t.f303380d.set(true);
            com.tencent.wechat.aff.udr.q qVar2 = new com.tencent.wechat.aff.udr.q();
            tVar.d().getClass();
            qVar2.c("ilinkres_902ac54f");
            java.util.LinkedList linkedList3 = qVar2.f217548e;
            if (linkedList3 != null) {
                linkedList3.add("hearing_aid_audio_zip");
            }
            java.util.LinkedList linkedList4 = qVar2.f217549f;
            if (linkedList4 != null) {
                java.util.RandomAccess parameter2 = tVar.d().getParameter();
                if (parameter2 != null) {
                    randomAccess = parameter2;
                }
                linkedList4.addAll(randomAccess);
            }
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar2, new k14.r());
        }
        return jz5.f0.f302826a;
    }
}
