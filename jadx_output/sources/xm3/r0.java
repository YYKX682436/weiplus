package xm3;

/* loaded from: classes4.dex */
public final class r0 {
    public r0(kotlin.jvm.internal.i iVar) {
    }

    public final kotlinx.coroutines.flow.j a(v65.i scope, ym3.d response) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(response, "response");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xm3.q0(b17, response, null), 1, null);
        return b17;
    }

    public final ym3.d b(int i17, ym3.c request, yz5.l creator) {
        int i18;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(creator, "creator");
        ym3.d dVar = new ym3.d(request);
        int i19 = request.f463144b;
        if (i17 > i19) {
            int i27 = 0;
            while (true) {
                i18 = request.f463145c;
                arrayList = dVar.f463149c;
                if (i27 >= i18) {
                    break;
                }
                int i28 = i19 + i27;
                if (i19 + i27 < i17) {
                    arrayList.add(creator.invoke(java.lang.Integer.valueOf(i28)));
                }
                i27++;
            }
            dVar.f463148b = arrayList.size() >= i18;
        } else {
            dVar.f463148b = false;
        }
        return dVar;
    }
}
