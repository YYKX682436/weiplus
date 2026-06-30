package wc3;

/* loaded from: classes7.dex */
public final class d extends wc3.b {
    @Override // wc3.b
    public void destroy() {
        super.destroy();
    }

    @Override // wc3.b, jc3.u
    public void n() {
        cl0.g gVar = new cl0.g();
        cl0.g gVar2 = new cl0.g();
        android.util.DisplayMetrics displayMetrics = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics();
        kotlin.jvm.internal.o.f(displayMetrics, "getDisplayMetrics(...)");
        gVar2.o("width", ik1.w.e(displayMetrics.widthPixels));
        gVar2.o("height", 100);
        gVar2.o("top", 100);
        gVar2.o("left", 0);
        java.lang.String gVar3 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar3, "toString(...)");
        gVar.h("msg", "api:createCanvas:".concat(gVar3));
        java.lang.String gVar4 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        jc3.j0 j0Var = this.f444507e;
        if (j0Var == null) {
            kotlin.jvm.internal.o.o("magicBrush");
            throw null;
        }
        ((rc3.w0) j0Var).k("postMessage", gVar4);
        cl0.g gVar5 = new cl0.g();
        cl0.g gVar6 = new cl0.g();
        android.util.DisplayMetrics displayMetrics2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics();
        kotlin.jvm.internal.o.f(displayMetrics2, "getDisplayMetrics(...)");
        gVar6.o("width", ik1.w.e(displayMetrics2.widthPixels));
        gVar6.o("height", 100);
        gVar6.o("top", 250);
        gVar6.o("left", 0);
        java.lang.String gVar7 = gVar6.toString();
        kotlin.jvm.internal.o.f(gVar7, "toString(...)");
        gVar5.h("msg", "api:createCanvas:".concat(gVar7));
        java.lang.String gVar8 = gVar5.toString();
        kotlin.jvm.internal.o.f(gVar8, "toString(...)");
        jc3.j0 j0Var2 = this.f444507e;
        if (j0Var2 != null) {
            ((rc3.w0) j0Var2).k("postMessage", gVar8);
        } else {
            kotlin.jvm.internal.o.o("magicBrush");
            throw null;
        }
    }
}
