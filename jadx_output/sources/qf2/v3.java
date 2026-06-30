package qf2;

/* loaded from: classes.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362620d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.v3(this.f362620d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.v3 v3Var = (qf2.v3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.m02 m02Var = (r45.m02) ((xg2.i) this.f362620d).f454393b;
        com.tencent.mars.xlog.Log.i("VoiceRoomController", "modifyCityShow success");
        java.util.LinkedList list = m02Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getRet_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            boolean z17 = false;
            if (((r45.ix0) obj2).getInteger(0) == 21) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.ix0 ix0Var = (r45.ix0) obj2;
        if (ix0Var != null) {
            com.tencent.mars.xlog.Log.i("VoiceRoomController", "modifyCityShow result: " + ix0Var.getInteger(1) + " msg: " + ix0Var.getString(2));
        }
        return jz5.f0.f302826a;
    }
}
