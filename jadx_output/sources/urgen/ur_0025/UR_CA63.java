package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007J#\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\u0010\u0010J+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0013J2\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0007J \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¨\u0006\u001b"}, d2 = {"Lurgen/ur_0025/UR_CA63;", "", "<init>", "()V", "URB_73EF", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", ya.b.INDEX, "", "URB_DCCE", "status", "URB_020C", "sectionArray", "", "", "(Lcom/tencent/unit_rc/BaseObjectDef;[[B)V", "URB_4B65", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "(Lcom/tencent/unit_rc/BaseObjectDef;[[BI)V", "URB_0B66", "item", "categoryId", "", "operation", "URB_90BE", "section", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UR_CA63 {
    public static final urgen.ur_0025.UR_CA63 INSTANCE = new urgen.ur_0025.UR_CA63();

    private UR_CA63() {
    }

    public static final void URB_020C(com.tencent.unit_rc.BaseObjectDef obj, byte[][] sectionArray) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(sectionArray, "sectionArray");
        int length = sectionArray.length;
        bw5.f2[] f2VarArr = new bw5.f2[length];
        for (int i17 = 0; i17 < length; i17++) {
            f2VarArr[i17] = new bw5.f2();
        }
        jm4.r5.c(sectionArray, f2VarArr);
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_0B66(com.tencent.unit_rc.BaseObjectDef obj, byte[] item, java.lang.String categoryId, int index, int operation) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        if (item != null) {
        }
        jm4.b4.f300375d.getClass();
        if (operation == 1) {
            jm4.a4 a4Var = jm4.b4.f300375d;
        } else if (operation == 2) {
            jm4.a4 a4Var2 = jm4.b4.f300375d;
        } else if (operation == 3) {
            jm4.a4 a4Var3 = jm4.b4.f300375d;
        } else {
            if (operation != 4) {
                throw new java.lang.IllegalArgumentException("Invalid RadioSquareEditOperation value: " + operation);
            }
            jm4.a4 a4Var4 = jm4.b4.f300375d;
        }
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_4B65(com.tencent.unit_rc.BaseObjectDef obj, byte[][] sectionArray, int scene) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(sectionArray, "sectionArray");
        int length = sectionArray.length;
        bw5.f2[] f2VarArr = new bw5.f2[length];
        for (int i17 = 0; i17 < length; i17++) {
            f2VarArr[i17] = new bw5.f2();
        }
        jm4.r5.c(sectionArray, f2VarArr);
        bw5.h2 h2Var = scene != 0 ? scene != 1 ? scene != 2 ? scene != 3 ? null : bw5.h2.NormalInitLoad : bw5.h2.ReLoad : bw5.h2.RedDotLoad : bw5.h2.UnKnown;
        android.support.v4.media.f.a(obj);
        kotlin.jvm.internal.o.d(h2Var);
        throw null;
    }

    public static final void URB_73EF(com.tencent.unit_rc.BaseObjectDef obj, int index) {
        kotlin.jvm.internal.o.g(obj, "obj");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_90BE(com.tencent.unit_rc.BaseObjectDef obj, int index, byte[] section) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(section, "section");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_DCCE(com.tencent.unit_rc.BaseObjectDef obj, int status) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.z3.f300453d.getClass();
        switch (status) {
            case 1:
                jm4.y3 y3Var = jm4.z3.f300453d;
                break;
            case 2:
                jm4.y3 y3Var2 = jm4.z3.f300453d;
                break;
            case 3:
                jm4.y3 y3Var3 = jm4.z3.f300453d;
                break;
            case 4:
                jm4.y3 y3Var4 = jm4.z3.f300453d;
                break;
            case 5:
                jm4.y3 y3Var5 = jm4.z3.f300453d;
                break;
            case 6:
                jm4.y3 y3Var6 = jm4.z3.f300453d;
                break;
            default:
                throw new java.lang.IllegalArgumentException("Invalid RadioLoadingStatus value: " + status);
        }
        android.support.v4.media.f.a(obj);
        throw null;
    }
}
