package mm3;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.n f329643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mm3.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329643d = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm3.i(this.f329643d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm3.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kp4.a Ai;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        mm3.n nVar = this.f329643d;
        androidx.appcompat.app.AppCompatActivity activity = nVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.LinkedList P6 = ((com.tencent.mm.plugin.mv.ui.uic.h6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h6.class)).P6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : P6) {
            if (!((jk4.f) obj2).f234476m) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jk4.f fVar = (jk4.f) it.next();
            if (fVar.f234468e || fVar.a()) {
                bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                java.lang.String path = fVar.f234483t;
                kotlin.jvm.internal.o.f(path, "path");
                com.tencent.mm.plugin.vlog.model.l0 Di = ((b92.u2) vVar).Di(path, fVar.a());
                com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) Di;
                i1Var.d(fVar.f234479p);
                i1Var.c(fVar.f234479p + fVar.f234478o);
                i1Var.e(fVar.f234477n);
                i1Var.a(fVar.f234477n + fVar.f234478o);
                if (fVar.a()) {
                    ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                    Ai = new kp4.w((com.tencent.mm.plugin.vlog.model.i1) Di);
                } else {
                    Ai = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ai(Di);
                }
            } else {
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                Ai = new rw2.k(fVar);
            }
            long j17 = fVar.f234479p;
            Ai.f311074d = j17;
            Ai.f311075e = j17 + fVar.f234478o;
            Ai.f311071a = nVar.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
            Ai.f311072b = nVar.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
            arrayList2.add(Ai);
        }
        return arrayList2;
    }
}
