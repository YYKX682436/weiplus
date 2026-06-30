package x51;

/* loaded from: classes4.dex */
public abstract class j1 {
    public static r45.cu5 a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        return cu5Var;
    }

    public static java.lang.String b(com.tencent.mm.protobuf.g gVar) {
        if (gVar == null) {
            return null;
        }
        return gVar.i();
    }

    public static boolean c(r45.du5... du5VarArr) {
        if (du5VarArr == null) {
            return false;
        }
        for (r45.du5 du5Var : du5VarArr) {
            if (du5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(g(du5Var))) {
                return false;
            }
        }
        return true;
    }

    public static byte[] d(r45.cu5 cu5Var) {
        com.tencent.mm.protobuf.g gVar;
        if (cu5Var == null || (gVar = cu5Var.f371841f) == null) {
            return null;
        }
        return gVar.g();
    }

    public static byte[] e(r45.cu5 cu5Var, byte[] bArr) {
        com.tencent.mm.protobuf.g gVar;
        return (cu5Var == null || (gVar = cu5Var.f371841f) == null) ? bArr : gVar.g();
    }

    public static java.lang.String f(r45.cu5 cu5Var) {
        com.tencent.mm.protobuf.g gVar;
        if (cu5Var == null || (gVar = cu5Var.f371841f) == null) {
            return null;
        }
        return gVar.i();
    }

    public static java.lang.String g(r45.du5 du5Var) {
        if (du5Var == null) {
            return null;
        }
        return du5Var.f372756d;
    }

    public static r45.cu5 h(java.lang.String str, boolean z17) {
        if (str == null) {
            return null;
        }
        byte[] decode = z17 ? android.util.Base64.decode(str, 0) : str.getBytes();
        if (decode == null) {
            return null;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(decode);
        return cu5Var;
    }

    public static r45.du5 i(java.lang.String str) {
        if (str == null) {
            return null;
        }
        r45.du5 du5Var = new r45.du5();
        du5Var.c(str);
        return du5Var;
    }
}
