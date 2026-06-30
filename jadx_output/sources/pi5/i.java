package pi5;

/* loaded from: classes.dex */
public final class i extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f354851d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f354852e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f354853f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f354854g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f354855h;

    public i(androidx.appcompat.app.AppCompatActivity activity, java.lang.String chatroom, java.lang.String ownerHeadDisplay) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(chatroom, "chatroom");
        kotlin.jvm.internal.o.g(ownerHeadDisplay, "ownerHeadDisplay");
        this.f354851d = activity;
        this.f354852e = chatroom;
        this.f354853f = ownerHeadDisplay;
        jz5.h.b(pi5.g.f354847d);
        this.f354855h = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int size;
        com.tencent.mm.storage.a3 a3Var;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.LinkedList linkedList = this.f354855h;
        com.tencent.mm.storage.a3 a3Var2 = this.f354854g;
        if (linkedList != null && a3Var2 != null) {
            int size2 = linkedList.size();
            int i17 = request.f463144b;
            if (i17 < size2) {
                int size3 = linkedList.size();
                int i18 = request.f463145c;
                if (size3 > i17 + i18) {
                    dVar.f463148b = true;
                    size = i18 + i17;
                } else {
                    size = linkedList.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i17 < size) {
                    arrayList.add(linkedList.get(i17));
                    i17++;
                }
                for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList)) {
                    if (((int) z3Var.E2) != 0) {
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i19 = ri5.j.U;
                        java.lang.String d17 = z3Var.d1();
                        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                        dVar.f463149c.add(ui5.b.f428141g.a(this.f354851d, hVar.a(d17, i19, 0), z3Var, i19, this.f354853f, bVar));
                    } else {
                        a3Var = a3Var2;
                    }
                    a3Var2 = a3Var;
                }
            }
        }
        v65.i.b(scope, null, new pi5.h(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public int getPriority() {
        return 1;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.List<java.lang.String> A0;
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f354852e);
        this.f354854g = z07;
        if (z07 == null || (A0 = z07.A0()) == null) {
            return;
        }
        for (java.lang.String str : A0) {
            if (z07.G0(str)) {
                this.f354855h.add(str);
            }
        }
    }
}
