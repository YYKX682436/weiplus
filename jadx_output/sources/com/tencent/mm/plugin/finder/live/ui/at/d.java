package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f115404d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f115405e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f115406f;

    public d(java.lang.String chatroom) {
        kotlin.jvm.internal.o.g(chatroom, "chatroom");
        this.f115404d = chatroom;
        this.f115405e = jz5.h.b(com.tencent.mm.plugin.finder.live.ui.at.c.f115403d);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int size;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.List list = this.f115406f;
        if (list != null) {
            int size2 = list.size();
            int i17 = request.f463144b;
            if (i17 < size2) {
                int size3 = list.size();
                int i18 = request.f463145c;
                if (size3 > i17 + i18) {
                    dVar.f463148b = true;
                    size = i18 + i17;
                } else {
                    size = list.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i17 < size) {
                    arrayList.add(list.get(i17));
                    i17++;
                }
                for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList)) {
                    if (((int) z3Var.E2) != 0 && !com.tencent.mm.storage.z3.m4(z3Var.d1())) {
                        dVar.f463149c.add(new com.tencent.mm.plugin.finder.ui.at.x(0, z3Var, 3, this.f115404d));
                    }
                }
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return -1;
    }

    @Override // ym3.f
    public void onCreate() {
        android.database.Cursor B;
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f115404d;
        a17.z0(str);
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(str);
        if (m17 != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) m17;
            linkedList.remove(c01.z1.r());
            p75.n0 n0Var = dm.e2.N1;
            p75.d dVar = dm.e2.P1;
            p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
            g17.f352656c = "FinderLiveAtGroupDataSource";
            g17.f352657d = dVar.l(m17);
            g17.f352659f = kz5.c0.i(new p75.g("showHead", true), new g95.c());
            p75.l0 a18 = g17.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f115405e).getValue()).Q4();
            if (Q4 != null && (B = Q4.B(a18.f352636a, a18.f352637b)) != null) {
                while (B.moveToNext()) {
                    try {
                        arrayList.add(B.getString(0));
                    } finally {
                    }
                }
                vz5.b.a(B, null);
            }
            linkedList.clear();
            linkedList.addAll(arrayList);
        } else {
            m17 = null;
        }
        this.f115406f = m17;
    }
}
