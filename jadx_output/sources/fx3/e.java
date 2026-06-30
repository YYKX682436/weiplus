package fx3;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx3.f f267135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fx3.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f267135d = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fx3.e(this.f267135d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fx3.e eVar = (fx3.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.LinkedList linkedList = ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).f471388m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.o.d(linkedList);
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            jz5.l lVar = (jz5.l) obj2;
            java.lang.String format = new java.text.SimpleDateFormat("dd HH:mm:ss.SSS").format(lVar.f302833d);
            arrayList.add(new fx3.h(java.lang.String.valueOf(i17), i17, "[" + lVar.f302833d + '-' + format + "]\n" + ((java.lang.String) lVar.f302834e)));
            i17 = i18;
        }
        j75.f Q6 = this.f267135d.Q6();
        if (Q6 != null) {
            Q6.B3(new fx3.g(arrayList));
        }
        return jz5.f0.f302826a;
    }
}
