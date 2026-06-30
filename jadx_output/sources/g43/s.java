package g43;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g43.x f268781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g43.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268781d = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.s(this.f268781d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g43.s sVar = (g43.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        g43.x xVar = this.f268781d;
        java.lang.String str = xVar.f268796f;
        if (str != null) {
            jz5.g gVar = xVar.f268798h;
            java.util.List jd6 = ((y33.h) gVar.getValue()).jd(str, 400);
            long e37 = ((y33.h) gVar.getValue()).e3(str);
            com.tencent.stubs.logger.Log.i("GameChatRoom.ChatroomMemberViewModel", "getMemberFromLocal localMemberNum = " + e37);
            int i17 = 0;
            boolean z17 = e37 > 400;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(jd6, 10));
            for (java.lang.Object obj2 : jd6) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                y33.g gVar2 = (y33.g) obj2;
                arrayList.add(i17 == 0 ? new w33.c(new jz5.l(java.lang.Boolean.TRUE, "其他成员"), gVar2.t0(), false, 201, 4, null) : i17 == jd6.size() + (-1) ? new w33.c(null, gVar2.t0(), z17, 201, 1, null) : new w33.c(null, gVar2.t0(), false, 201, 5, null));
                i17 = i18;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (!xVar.f268799i.contains(((w33.c) next).f442710b.f442715a)) {
                    arrayList2.add(next);
                }
            }
            xVar.f268794d.postValue(w33.b.a(xVar.O6(), null, null, null, new jz5.l(java.lang.Boolean.TRUE, arrayList2), 7, null));
        }
        return jz5.f0.f302826a;
    }
}
