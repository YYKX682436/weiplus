package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lurgen/ur_0025/URS_626A;", "", "()V", "UR_85FB", "", "UR_A266", "plugin-ting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URS_626A {
    public static final urgen.ur_0025.URS_626A INSTANCE = new urgen.ur_0025.URS_626A();

    private URS_626A() {
    }

    public static final java.lang.String UR_85FB() {
        if (!com.tencent.mm.vfs.w6.j(lp0.b.l())) {
            com.tencent.mm.vfs.w6.u(lp0.b.l());
        }
        java.lang.String str = lp0.b.l() + "Ting/Tmp";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        return str;
    }

    public static final java.lang.String UR_A266() {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("TingAudioCache");
        kotlin.jvm.internal.o.f(c17, "getMainPath(...)");
        return c17;
    }
}
