package pi5;

/* loaded from: classes.dex */
public final class r extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f354876d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f354877e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f354878f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f354879g;

    public r(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f354876d = activity;
        this.f354877e = new java.util.ArrayList();
        this.f354878f = jz5.h.b(new pi5.q(this));
        this.f354879g = jz5.h.b(new pi5.p(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f354877e;
        int size = arrayList.size();
        int i17 = request.f463144b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f463145c + i17;
            if (size2 > i18) {
                dVar.f463148b = true;
            } else {
                i18 = arrayList.size();
            }
            while (i17 < i18) {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                java.lang.String str3 = (java.lang.String) obj;
                ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 0, null, false, 223, null);
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(str3);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Z;
                ri5.j a17 = ti5.d.f419663i.a(this.f354876d, hVar.a(str3, i19, 0), z3Var, i19, dVar2);
                java.util.ArrayList arrayList2 = (java.util.ArrayList) ((jz5.n) this.f354878f).getValue();
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                if (arrayList2 == null || (str2 = (java.lang.String) arrayList2.get(i17)) == null) {
                    f0Var = null;
                } else {
                    a17.f396112g = str2;
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomApplicantsDataSource", "nickname of " + str3 + " is null");
                }
                java.util.ArrayList arrayList3 = (java.util.ArrayList) ((jz5.n) this.f354879g).getValue();
                if (arrayList3 == null || (str = (java.lang.String) arrayList3.get(i17)) == null) {
                    f0Var2 = null;
                } else {
                    a17.E = str;
                }
                if (f0Var2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomApplicantsDataSource", "avatarUrl of " + str3 + " is null");
                }
                dVar.f463149c.add(a17);
                i17++;
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return 1;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f354877e;
        arrayList.clear();
        java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(this.f354876d.getIntent().getStringExtra("custom_contact"), ",");
        if (O1 != null) {
            java.util.Iterator it = O1.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomApplicantsDataSource", "usernameList: " + arrayList.size());
    }
}
