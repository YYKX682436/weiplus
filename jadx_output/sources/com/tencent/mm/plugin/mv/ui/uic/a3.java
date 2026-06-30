package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes4.dex */
public final class a3 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f151024d;

    public a3(com.tencent.mm.plugin.mv.ui.uic.c3 c3Var) {
        this.f151024d = c3Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.ss4 ss4Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncBeatTrack sceneEnd errType:");
            sb6.append(aVar.f359285b);
            sb6.append(" errCode:");
            int i17 = aVar.f359286c;
            sb6.append(i17);
            sb6.append(" errMsg:");
            sb6.append(aVar.f359287d);
            sb6.append(" flexSize:");
            r45.tr4 tr4Var = (r45.tr4) aVar.f359289f;
            sb6.append((tr4Var == null || (linkedList2 = tr4Var.f386746e) == null) ? null : new java.lang.Integer(linkedList2.size()));
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerDataUIC", sb6.toString());
            if (i17 == 0 && (ss4Var = (r45.ss4) this.f151024d.f151076f.getValue()) != null) {
                ss4Var.set(6, java.lang.Integer.valueOf((tr4Var == null || (linkedList = tr4Var.f386746e) == null) ? 20 : linkedList.size()));
            }
        }
        return jz5.f0.f302826a;
    }
}
