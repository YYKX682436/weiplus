package im3;

/* loaded from: classes10.dex */
public final class k extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oc5 f292705d;

    public k(r45.oc5 previewItemObj) {
        kotlin.jvm.internal.o.g(previewItemObj, "previewItemObj");
        this.f292705d = previewItemObj;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        r45.oc5 oc5Var = this.f292705d;
        int size = oc5Var.f382150e.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.ny5 ny5Var = (r45.ny5) oc5Var.f382150e.get(i17);
            r45.mc5 mc5Var = ny5Var.f381765d;
            if (mc5Var != null) {
                boolean z17 = kotlin.jvm.internal.o.b(oc5Var.f382151f, ny5Var.f381766e) && kotlin.jvm.internal.o.b(oc5Var.f382152g, mc5Var.f380363d);
                java.util.ArrayList arrayList = dVar.f463149c;
                java.lang.String str = mc5Var.f380363d;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = ny5Var.f381766e;
                im3.j jVar = new im3.j(str, 0, mc5Var, str2 != null ? str2 : "");
                jVar.f292702h = true;
                jVar.f292703i = z17;
                arrayList.add(jVar);
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }
}
