package fr2;

/* loaded from: classes2.dex */
public final class k extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr2.p f265729a;

    public k(fr2.p pVar) {
        this.f265729a = pVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.x1 x1Var = ml2.x1.f328219z;
            android.app.Activity context = this.f265729a.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                str = "";
            }
            ((b92.d1) zbVar).wi(new ml2.f0(null, null, 0, "", 0L, 0L, x1Var, str, 0, "", null, false, false, 0, null, null, null, null, 0L, null, 0, 0L, 0, null, null, null, 67107840, null));
        }
    }
}
