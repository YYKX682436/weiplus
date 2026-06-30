package df2;

/* loaded from: classes.dex */
public final class mh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.oh f230780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.oh ohVar) {
        super(2, continuation);
        this.f230779d = hVar;
        this.f230780e = ohVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.mh(this.f230779d, continuation, this.f230780e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.mh mhVar = (df2.mh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mhVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.LinkedList list = ((r45.ls1) ((xg2.i) this.f230779d).f454393b).getList(1);
        kotlin.jvm.internal.o.f(list, "getFloat_msgs(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            df2.oh ohVar = this.f230780e;
            if (!hasNext) {
                com.tencent.mars.xlog.Log.i(ohVar.f230967m, "getFloatMsgConfig: success,floatMsgConfig privilegeConfigListSize=" + arrayList.size());
                ((mm2.j2) ohVar.business(mm2.j2.class)).f329170r = arrayList;
                com.tencent.mars.xlog.Log.i(ohVar.f230967m, "getFloatMsgConfig: success");
                return jz5.f0.f302826a;
            }
            java.lang.Object next = it.next();
            int integer = ((r45.o84) next).getInteger(0);
            ohVar.getClass();
            if (integer == 1 || integer == 2 || integer == 3) {
                arrayList.add(next);
            }
        }
    }
}
