package sc2;

/* loaded from: classes2.dex */
public final class t7 {
    public t7(kotlin.jvm.internal.i iVar) {
    }

    public final ad2.h a(int i17, int i18) {
        if (i17 == 1 && i18 == 1) {
            i17 = 0;
        }
        switch (i17) {
            case 0:
                return new sc2.m3();
            case 1:
                return new sc2.m3();
            case 2:
                return new sc2.b4();
            case 3:
                return new sc2.b3();
            case 4:
                return new sc2.u4();
            case 5:
                return new sc2.f5();
            case 6:
                return new sc2.g2();
            case 7:
                return new sc2.i2();
            case 8:
            case 9:
            case 10:
            case 17:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            case 38:
            case 39:
            case 40:
            case 41:
            default:
                return null;
            case 11:
                return new sc2.r();
            case 12:
                return new sc2.o();
            case 13:
                return new sc2.n();
            case 14:
                return new sc2.s4();
            case 15:
                return new sc2.z3();
            case 16:
                return new sc2.t4();
            case 18:
                return new sc2.e5();
            case 19:
                return new sc2.m4();
            case 20:
                return new sc2.w2();
            case 21:
                return new sc2.p8();
            case 24:
                return new sc2.k2();
            case 28:
                return new sc2.h1();
            case 29:
                return new sc2.g4();
            case 30:
                return new sc2.j4();
            case 31:
                return new sc2.m2();
            case 32:
                return new sc2.c4();
            case 33:
                return new sc2.d4();
            case 34:
                return new sc2.c5();
            case 35:
                return new sc2.u3();
            case 36:
                return new sc2.u3();
            case 37:
                return new sc2.b5();
            case 42:
                return new defpackage.k();
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                return new sc2.m6();
            case 44:
                return new sc2.p3();
        }
    }

    public final int b(int i17, int i18) {
        if (i17 == 1 && i18 == 1) {
            i17 = 0;
        }
        java.lang.Integer num = (java.lang.Integer) sc2.a8.I.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
