package oc2;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344152a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f344153b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f344154c;

    /* renamed from: d, reason: collision with root package name */
    public long f344155d;

    public a1(java.lang.String callTag) {
        boolean z17;
        kotlin.jvm.internal.o.g(callTag, "callTag");
        this.f344152a = callTag;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        this.f344153b = z18;
        this.f344154c = jz5.h.b(oc2.z0.f344325d);
    }

    public static void a(oc2.a1 a1Var, java.lang.String tag, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            tag = "End";
        }
        a1Var.getClass();
        kotlin.jvm.internal.o.g(tag, "tag");
        if (a1Var.f344153b) {
            a1Var.b().add(new jz5.l(tag, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(')');
            java.util.LinkedList<jz5.l> b17 = a1Var.b();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
            for (jz5.l lVar : b17) {
                arrayList.add("step:" + ((java.lang.String) lVar.f302833d) + " cost:" + (((java.lang.Number) lVar.f302834e).longValue() - a1Var.f344155d));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i(a1Var.f344152a, sb6.toString());
        }
    }

    public static void d(oc2.a1 a1Var, java.lang.String tag, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        a1Var.getClass();
        kotlin.jvm.internal.o.g(tag, "tag");
        if (a1Var.f344153b) {
            a1Var.b().add(new jz5.l(tag, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
                sb6.append(java.lang.Thread.currentThread().getName());
                sb6.append(')');
                java.util.LinkedList<jz5.l> b17 = a1Var.b();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
                for (jz5.l lVar : b17) {
                    arrayList.add("step:" + ((java.lang.String) lVar.f302833d) + " cost:" + (((java.lang.Number) lVar.f302834e).longValue() - a1Var.f344155d));
                }
                sb6.append(arrayList);
                com.tencent.mars.xlog.Log.i(a1Var.f344152a, sb6.toString());
            }
        }
    }

    public final java.util.LinkedList b() {
        return (java.util.LinkedList) ((jz5.n) this.f344154c).getValue();
    }

    public final void c() {
        if (this.f344153b) {
            b().clear();
            this.f344155d = java.lang.System.currentTimeMillis();
            b().add(new jz5.l("Start", java.lang.Long.valueOf(this.f344155d)));
        }
    }
}
