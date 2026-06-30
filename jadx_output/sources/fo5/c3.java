package fo5;

/* loaded from: classes10.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ er4.r f264966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(java.lang.String str, er4.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264965d = str;
        this.f264966e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.c3(this.f264965d, this.f264966e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.c3 c3Var = (fo5.c3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        vx3.i iVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.a aVar2 = fo5.f3.f264986c;
        if (aVar2 != null) {
            fo5.r0 r0Var = (fo5.r0) aVar2;
            er4.r rVar = this.f264966e;
            if (rVar != null && (str = this.f264965d) != null) {
                java.lang.ref.WeakReference weakReference = r0Var.f265094m;
                fo5.y yVar = new fo5.y(rVar);
                gp5.e eVar = r0Var.f265089h;
                eVar.getClass();
                rq4.q.f399080n = true;
                if (!(str.length() == 0) && (iVar = (vx3.i) mx3.f0.f332551d.getValue()) != null) {
                    android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
                    if (appCompatActivity != null) {
                        androidx.lifecycle.o mo133getLifecycle = appCompatActivity.mo133getLifecycle();
                        kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
                        eVar.f274466g = cy3.q.b(appCompatActivity, mo133getLifecycle, "", iVar, 1L, 9, 0, "", false, false, new gp5.c(iVar, yVar, appCompatActivity, str, eVar), null, 2112, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
