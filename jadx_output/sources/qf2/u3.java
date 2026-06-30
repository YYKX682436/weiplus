package qf2;

/* loaded from: classes.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362610d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.u3(this.f362610d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.u3 u3Var = (qf2.u3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f362610d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        int i17 = jVar != null ? jVar.f397425f : -1;
        if (jVar == null || (str = jVar.getMessage()) == null) {
            str = "";
        }
        rm0.j jVar2 = aVar2.f454379a;
        com.tencent.mars.xlog.Log.i("VoiceRoomController", "modifyCityShow fail, errCode: " + i17 + " errType: " + (jVar2 != null ? jVar2.f397424e : -1) + " errMsg: " + str);
        return jz5.f0.f302826a;
    }
}
