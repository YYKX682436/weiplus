package pi5;

/* loaded from: classes.dex */
public final class u extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f354884d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f354885e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f354886f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f354887g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f354888h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f354889i;

    public u(androidx.appcompat.app.AppCompatActivity activity, java.lang.String chatroom, java.lang.String quoteMember, java.lang.String quoteShowHeadDisplay) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(chatroom, "chatroom");
        kotlin.jvm.internal.o.g(quoteMember, "quoteMember");
        kotlin.jvm.internal.o.g(quoteShowHeadDisplay, "quoteShowHeadDisplay");
        this.f354884d = activity;
        this.f354885e = chatroom;
        this.f354886f = quoteMember;
        this.f354887g = quoteShowHeadDisplay;
        jz5.h.b(pi5.s.f354880d);
        this.f354889i = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int size;
        java.util.Iterator it;
        int i17;
        com.tencent.mm.storage.a3 a3Var;
        j75.f stateCenter;
        wi5.n0 n0Var;
        pi5.u uVar = this;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        int i18 = 0;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.LinkedList linkedList = uVar.f354889i;
        com.tencent.mm.storage.a3 a3Var2 = uVar.f354888h;
        int i19 = 1;
        if (linkedList != null && a3Var2 != null) {
            int size2 = linkedList.size();
            int i27 = request.f463144b;
            if (i27 < size2) {
                int size3 = linkedList.size();
                int i28 = request.f463145c;
                if (size3 > i27 + i28) {
                    dVar.f463148b = true;
                    size = i28 + i27;
                } else {
                    size = linkedList.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i27 < size) {
                    arrayList.add(linkedList.get(i27));
                    i27++;
                }
                java.util.Iterator it6 = g95.e.f269801a.f(arrayList).iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it6.next();
                    if (((int) z3Var.E2) != 0) {
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i29 = ri5.j.R;
                        java.lang.String d17 = z3Var.d1();
                        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                        java.lang.String id6 = hVar.a(d17, i29, i18);
                        ui5.a aVar = ui5.b.f428141g;
                        androidx.appcompat.app.AppCompatActivity activity = uVar.f354884d;
                        kotlin.jvm.internal.o.g(activity, "activity");
                        kotlin.jvm.internal.o.g(id6, "id");
                        java.lang.String quoteFromHeadDisplay = uVar.f354887g;
                        kotlin.jvm.internal.o.g(quoteFromHeadDisplay, "quoteFromHeadDisplay");
                        it = it6;
                        si5.e a17 = si5.b.f408325a.a(activity, z3Var, bVar.f428143b, bVar.f428144c, bVar.f428142a);
                        java.lang.String d18 = z3Var.d1();
                        kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                        java.lang.CharSequence charSequence = a17.f408329a;
                        java.lang.String str = "";
                        ri5.j jVar = new ri5.j(id6, i29, d18, charSequence == null ? "" : charSequence, bVar, 0, 32, null);
                        jVar.n(a17.f408330b);
                        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                        if (b0Var != null) {
                            java.lang.String fj6 = ((l41.q2) b0Var).fj(z3Var.Q0(), z3Var.G0());
                            if (fj6 != null) {
                                str = fj6;
                            }
                        }
                        jVar.f396116m = str;
                        if (!com.tencent.mm.sdk.platformtools.t8.J0(str) && kotlin.jvm.internal.o.b("3552365301", z3Var.Q0())) {
                            jVar.f396116m = "@" + ((java.lang.Object) jVar.f396116m);
                        }
                        if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
                            jVar.f396127x = n0Var.e();
                            java.lang.String str2 = jVar.f396111f;
                            jVar.f396126w = n0Var.f(str2);
                            boolean d19 = n0Var.d(str2);
                            jVar.f396125v = d19;
                            jVar.f396115l1 = !d19 && n0Var.e(str2);
                        }
                        i17 = 1;
                        jVar.f396118o = true;
                        jVar.f396119p = quoteFromHeadDisplay;
                        jVar.f396120q = activity.getResources().getColor(com.tencent.mm.R.color.f478491c);
                        jVar.f396124u = true;
                        dVar.f463149c.add(jVar);
                    } else {
                        it = it6;
                        i17 = i19;
                        a3Var = a3Var2;
                    }
                    uVar = this;
                    it6 = it;
                    i19 = i17;
                    a3Var2 = a3Var;
                    i18 = 0;
                }
            }
        }
        v65.i.b(scope, null, new pi5.t(b17, dVar, null), i19, null);
        return b17;
    }

    @Override // ym3.f
    public int getPriority() {
        return -1;
    }

    @Override // ym3.f
    public void onCreate() {
        this.f354888h = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f354885e);
        this.f354889i.add(this.f354886f);
    }
}
