package im3;

/* loaded from: classes10.dex */
public final class g extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oc5 f292690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f292691e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f292692f;

    public g(r45.oc5 previewItemObj) {
        kotlin.jvm.internal.o.g(previewItemObj, "previewItemObj");
        this.f292690d = previewItemObj;
        this.f292692f = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        r45.nc5 nc5Var;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        r45.oc5 oc5Var = this.f292690d;
        java.util.LinkedList sourceList = oc5Var.f382149d;
        kotlin.jvm.internal.o.f(sourceList, "sourceList");
        java.util.Iterator it = sourceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.LinkedList sourceList2 = oc5Var.f382149d;
                kotlin.jvm.internal.o.f(sourceList2, "sourceList");
                nc5Var = (r45.nc5) kz5.n0.Z(sourceList2);
                break;
            }
            nc5Var = (r45.nc5) it.next();
            if (kotlin.jvm.internal.o.b(nc5Var.f381246e, this.f292691e)) {
                break;
            }
        }
        if (nc5Var != null) {
            java.util.LinkedList linkedList = nc5Var.f381245d;
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.mc5 mc5Var = (r45.mc5) linkedList.get(i17);
                java.lang.String str = mc5Var.f380363d;
                if (str != null) {
                    boolean contains = this.f292692f.contains(nc5Var.f381246e + '-' + str);
                    java.util.ArrayList arrayList = dVar.f463149c;
                    java.lang.String str2 = nc5Var.f381246e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    im3.j jVar = new im3.j(str, i17, mc5Var, str2);
                    jVar.f292702h = contains;
                    arrayList.add(jVar);
                }
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.LinkedList<r45.ny5> selectItemList = this.f292690d.f382150e;
        kotlin.jvm.internal.o.f(selectItemList, "selectItemList");
        for (r45.ny5 ny5Var : selectItemList) {
            r45.mc5 mc5Var = ny5Var.f381765d;
            if (mc5Var != null) {
                this.f292692f.add(ny5Var.f381766e + '-' + mc5Var.f380363d);
            }
        }
    }
}
