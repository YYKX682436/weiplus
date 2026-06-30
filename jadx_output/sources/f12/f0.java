package f12;

/* loaded from: classes4.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f258604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f12.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258604d = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f12.f0(this.f258604d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object next;
        boolean z17;
        f21.d0 d0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.LinkedList eggList = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K().f258898d;
        kotlin.jvm.internal.o.f(eggList, "eggList");
        java.util.Iterator it = eggList.iterator();
        do {
            java.lang.Object obj2 = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            f21.e eVar = (f21.e) next;
            if (eVar.f258878n >= 5) {
                java.lang.String str = eVar.f258872e;
                f12.j0 j0Var = this.f258604d;
                if (kotlin.jvm.internal.o.b(str, j0Var.f258617d) && (d0Var = eVar.f258879o) != null && kotlin.jvm.internal.o.b(d0Var.f258852d, j0Var.f258619f)) {
                    java.util.LinkedList keyWords = eVar.f258871d;
                    kotlin.jvm.internal.o.f(keyWords, "keyWords");
                    java.util.Iterator it6 = keyWords.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        if (kotlin.jvm.internal.o.b(((f21.f) next2).f258891d, j0Var.f258618e)) {
                            obj2 = next2;
                            break;
                        }
                    }
                    z17 = obj2 != null;
                }
            }
        } while (!z17);
        return next;
    }
}
