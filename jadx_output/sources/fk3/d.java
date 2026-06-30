package fk3;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263548d;

    public d(fk3.o oVar) {
        this.f263548d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f263548d;
        ek3.e eVar = oVar.f263588d;
        if (eVar != null) {
            if ((eVar != null ? eVar.getParent() : null) != null) {
                ek3.e eVar2 = oVar.f263588d;
                android.view.ViewParent parent = eVar2 != null ? eVar2.getParent() : null;
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(oVar.f263588d);
            }
        }
    }
}
