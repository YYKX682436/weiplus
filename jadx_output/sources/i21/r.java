package i21;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f287916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i21.s f287917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i21.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f287917e = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new i21.r(this.f287917e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i21.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f287916d;
        i21.s sVar = this.f287917e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sVar.getClass();
            r45.rt6 rt6Var = new r45.rt6();
            rt6Var.set(6, sVar.f287918a);
            rt6Var.set(2, 0);
            rt6Var.set(3, 0);
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            rt6Var.set(5, cu5Var);
            rt6Var.set(4, 0);
            rt6Var.set(1, sVar.f287921d);
            rt6Var.set(7, java.lang.Integer.valueOf(sVar.f287920c));
            rt6Var.set(8, sVar.f287919b);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 575;
            lVar.f70666c = "/cgi-bin/micromsg-bin/uploadcardimg";
            lVar.f70664a = rt6Var;
            lVar.f70665b = new r45.st6();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f287916d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i18 = fVar.f70615a;
        int i19 = fVar.f70616b;
        sVar.getClass();
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sVar.f287918a, true);
            if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                r45.o80 o80Var = new r45.o80();
                java.util.LinkedList linkedList = sVar.f287919b;
                if (!linkedList.isEmpty()) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.fu fuVar = (r45.fu) it.next();
                        r45.c5 c5Var = new r45.c5();
                        c5Var.f371292d = fuVar.getString(0);
                        c5Var.f371293e = fuVar.getString(1);
                        linkedList2.add(c5Var);
                    }
                    if (o80Var.f382018d == null) {
                        o80Var.f382018d = new java.util.LinkedList();
                    }
                    o80Var.f382018d.addAll(linkedList2);
                    n17.O2(o80Var);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
                } else if (sVar.f287920c == 0) {
                    n17.O2(null);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadCardImgCgi", "upload card img error");
        }
        return fVar;
    }
}
