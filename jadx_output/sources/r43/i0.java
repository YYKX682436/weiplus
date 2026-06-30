package r43;

/* loaded from: classes.dex */
public class i0 implements j45.k {
    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        if ((!str.startsWith("game") && !str.startsWith("gamelife")) || !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return false;
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        return true;
    }
}
