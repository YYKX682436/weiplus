package hc2;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f280301a;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f280301a = z65.c.a();
    }

    public static final java.lang.String a(bw5.e0 e0Var) {
        java.util.ArrayList arrayList;
        if (e0Var == null) {
            return "NULL";
        }
        bw5.ev b17 = e0Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uuid=");
        sb6.append(b17.getTipsUuid());
        sb6.append(",id=");
        boolean[] zArr = b17.C;
        sb6.append(zArr[5] ? b17.f27068h : "");
        sb6.append(",type=");
        sb6.append(b17.f27065e);
        sb6.append(",time=");
        sb6.append(e0Var.f26673e);
        sb6.append(",username=");
        sb6.append(zArr[11] ? b17.f27074q : "");
        sb6.append(",pathList=");
        java.util.LinkedList<bw5.vy> linkedList = b17.f27067g;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.vy vyVar : linkedList) {
                arrayList.add(vyVar.N[6] ? vyVar.f34514i : "");
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        return sb6.toString();
    }

    public static final com.tencent.mm.plugin.finder.extension.reddot.jb b(bw5.e0 e0Var) {
        if (e0Var != null) {
            java.lang.String tipsUuid = e0Var.b().getTipsUuid();
            boolean z17 = true;
            if (!(tipsUuid == null || tipsUuid.length() == 0)) {
                bw5.ev b17 = e0Var.b();
                java.lang.String str = b17.C[5] ? b17.f27068h : "";
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                    bw5.ev b18 = e0Var.b();
                    kotlin.jvm.internal.o.f(b18, "getSvrCtrlInfo(...)");
                    byte[] byteArray = b18.toByteArray();
                    r45.vs2 vs2Var = new r45.vs2();
                    vs2Var.parseFrom(byteArray);
                    jbVar.t0(vs2Var);
                    jbVar.field_time = e0Var.f26673e;
                    return jbVar;
                }
            }
            if (f280301a) {
                com.tencent.mm.sdk.platformtools.Log.c("AffToLocalCtrInfo", a(e0Var) + " is invalid!", new java.lang.Object[0]);
            } else {
                com.tencent.mars.xlog.Log.i("AffToLocalCtrInfo", a(e0Var) + " is invalid!");
            }
        }
        return null;
    }
}
