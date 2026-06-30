package fr2;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f265720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f265721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fr2.p f265722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xg2.h hVar, kotlin.coroutines.Continuation continuation, boolean z17, fr2.p pVar) {
        super(2, continuation);
        this.f265720d = hVar;
        this.f265721e = z17;
        this.f265722f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fr2.h(this.f265720d, continuation, this.f265721e, this.f265722f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fr2.h hVar = (fr2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.f42 f42Var = (r45.f42) ((xg2.i) this.f265720d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("randomEnterLive: cgi success, isPreload=");
        boolean z17 = this.f265721e;
        sb6.append(z17);
        sb6.append(", enter objectId=");
        java.util.LinkedList list = f42Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(list);
        sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        sb6.append(", continue_flag=");
        sb6.append(f42Var.getInteger(3));
        sb6.append(", preload_interval=");
        sb6.append(f42Var.getInteger(5));
        com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", sb6.toString());
        com.tencent.mm.protobuf.g byteString = f42Var.getByteString(2);
        fr2.p pVar = this.f265722f;
        pVar.f265737e = byteString;
        pVar.f265738f = f42Var.getByteString(4);
        int integer = f42Var.getInteger(5);
        if (integer < 0) {
            integer = 0;
        }
        pVar.f265745p = integer * 1000;
        if (f42Var.getInteger(3) == 0) {
            pVar.f265736d.clear();
        }
        java.util.LinkedList list2 = f42Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(list2);
        if (finderObject2 != null) {
            if (z17) {
                pVar.f265747r = finderObject2;
            } else {
                fr2.p.O6(pVar, finderObject2);
            }
        }
        return jz5.f0.f302826a;
    }
}
