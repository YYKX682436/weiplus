package sl0;

/* loaded from: classes11.dex */
public class r0 implements ll0.b {
    public r0(sl0.b1 b1Var) {
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        r45.cb6 cb6Var = new r45.cb6();
        int i17 = cb6Var.f371432h;
        int i18 = cb6Var.f371431g;
        return i17 == 4320 && (i18 & 4096) > 0 ? new int[]{0, 0, 1, 0} : i17 == 720 && (i18 & 4096) > 0 ? new int[]{0, 1, 0, 0} : i17 == 72 && (i18 & 4096) > 0 ? new int[]{1, 0, 0, 0} : new int[]{0, 0, 0, 1};
    }
}
