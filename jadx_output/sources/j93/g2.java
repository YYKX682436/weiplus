package j93;

/* loaded from: classes.dex */
public final class g2 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f298393d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f298394e;

    public g2(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298393d = activity;
        new java.util.ArrayList();
        this.f298394e = new java.util.ArrayList();
        jz5.h.b(j93.f2.f298382d);
        new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        j75.f stateCenter;
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f298394e;
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
            java.util.ArrayList<com.tencent.mm.storage.d4> arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            for (com.tencent.mm.storage.d4 d4Var : arrayList2) {
                ti5.b bVar = new ti5.b(null, null, 0, 0, 0, 0, null, false, 255, null);
                ri5.h hVar = ri5.j.I;
                java.lang.String valueOf = java.lang.String.valueOf(d4Var.field_labelID);
                int i19 = ri5.j.Z;
                java.lang.String id6 = hVar.a(valueOf, i19, 0);
                java.lang.String labelId = java.lang.String.valueOf(d4Var.field_labelID);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d4Var.field_labelName);
                sb6.append('(');
                java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(d4Var.field_labelID));
                sb6.append(j17 != null ? j17.size() : 0);
                sb6.append(')');
                java.lang.String labelName = sb6.toString();
                androidx.appcompat.app.AppCompatActivity activity = this.f298393d;
                kotlin.jvm.internal.o.g(activity, "activity");
                kotlin.jvm.internal.o.g(id6, "id");
                kotlin.jvm.internal.o.g(labelId, "labelId");
                kotlin.jvm.internal.o.g(labelName, "labelName");
                ri5.j jVar = new ri5.j(id6, i19, labelId, labelName, bVar, 0, 32, null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.List j18 = ((b93.b) c93.a.a()).j(labelId);
                if (j18 != null) {
                    if (!(!com.tencent.mm.sdk.platformtools.t8.L0(j18))) {
                        j18 = null;
                    }
                    if (j18 != null) {
                        int i27 = 0;
                        for (java.lang.Object obj : j18) {
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
                            if (n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.D0())) {
                                java.lang.String D0 = n17.D0();
                                kotlin.jvm.internal.o.f(D0, "getContactLabelIds(...)");
                                if (r26.n0.B(D0, labelId, false)) {
                                    if (android.text.TextUtils.isEmpty(n17.P0())) {
                                        arrayList3.add(n17.t0());
                                    } else {
                                        arrayList3.add(n17.P0());
                                    }
                                }
                            }
                            i27 = i28;
                        }
                    }
                }
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList3, ",");
                kotlin.jvm.internal.o.f(c17, "listToString(...)");
                jVar.n(c17);
                if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
                    jVar.f396127x = n0Var.e();
                    java.lang.String str = jVar.f396111f;
                    jVar.f396126w = n0Var.f(str);
                    boolean d17 = n0Var.d(str);
                    jVar.f396125v = d17;
                    jVar.f396115l1 = !d17 && n0Var.e(str);
                }
                jVar.D = true;
                jVar.C = true;
                dVar.f463149c.add(jVar);
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
        java.util.ArrayList f17 = b93.r.wi().f1();
        if (f17 != null) {
            java.util.ArrayList arrayList = this.f298394e;
            arrayList.clear();
            arrayList.addAll(f17);
        }
    }
}
