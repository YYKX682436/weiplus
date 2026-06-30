package df2;

/* loaded from: classes3.dex */
public final class zx implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232004a;

    public zx(java.lang.String str) {
        this.f232004a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328379t2;
        cl0.g gVar = new cl0.g();
        gVar.h("report_extra", this.f232004a);
        zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
    }
}
