package ij5;

/* loaded from: classes.dex */
public final class a0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f291749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f291750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f291751f;

    public a0(java.util.HashMap hashMap, ij5.d0 d0Var, wi5.z zVar) {
        this.f291749d = hashMap;
        this.f291750e = d0Var;
        this.f291751f = zVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p13.v vVar;
        ij5.d0 d0Var;
        j75.f stateCenter;
        wi5.n0 n0Var;
        p13.v vVar2 = (p13.v) obj;
        int i17 = 0;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f291749d;
        hashMap.put(num, vVar2);
        ij5.d0 d0Var2 = this.f291750e;
        j75.f Q6 = d0Var2.Q6();
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List list = vVar2.f351160e;
            if (list != null) {
                int i18 = 0;
                for (java.lang.Object obj2 : list) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    p13.y yVar = (p13.y) obj2;
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f351187e, true);
                    if (n17 == null || n17.s2()) {
                        vVar = vVar2;
                        d0Var = d0Var2;
                    } else {
                        vi5.h hVar = new vi5.h(0L, yVar, vVar2.f351159d, i18, 1, null);
                        ri5.h hVar2 = ri5.j.I;
                        int i27 = ri5.j.W;
                        java.lang.String d17 = n17.d1();
                        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                        java.lang.String id6 = hVar2.a(d17, i27, i17);
                        androidx.appcompat.app.AppCompatActivity activity = d0Var2.getActivity();
                        java.lang.String str = (java.lang.String) ((jz5.n) d0Var2.f291764g).getValue();
                        kotlin.jvm.internal.o.f(str, "<get-selectShowHeadDisplay>(...)");
                        java.lang.String str2 = (java.lang.String) ((jz5.n) d0Var2.f291765h).getValue();
                        kotlin.jvm.internal.o.f(str2, "<get-chatroomSessionWord>(...)");
                        kotlin.jvm.internal.o.g(activity, "activity");
                        kotlin.jvm.internal.o.g(id6, "id");
                        vVar = vVar2;
                        si5.e b17 = si5.b.f408325a.b(activity, hVar.f437633c, n17, hVar.f437632b, null);
                        d0Var = d0Var2;
                        java.lang.String d18 = n17.d1();
                        kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                        java.lang.CharSequence charSequence = b17.f408329a;
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        ri5.j jVar = new ri5.j(id6, i27, d18, charSequence, hVar, 0, 32, null);
                        jVar.n(b17.f408330b);
                        if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
                            jVar.f396127x = n0Var.e();
                            java.lang.String str3 = jVar.f396111f;
                            jVar.f396126w = n0Var.f(str3);
                            boolean d19 = n0Var.d(str3);
                            jVar.f396125v = d19;
                            jVar.f396115l1 = !d19 && n0Var.e(str3);
                        }
                        if (jVar.f396126w) {
                            jVar.f396119p = str;
                        } else {
                            jVar.f396119p = str2;
                        }
                        jVar.f396120q = activity.getResources().getColor(com.tencent.mm.R.color.f478491c);
                        arrayList.add(jVar);
                    }
                    vVar2 = vVar;
                    d0Var2 = d0Var;
                    i18 = i19;
                    i17 = 0;
                }
            }
            Q6.B3(new wi5.v(this.f291751f, hashMap, arrayList));
        }
        return jz5.f0.f302826a;
    }
}
