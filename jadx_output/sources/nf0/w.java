package nf0;

/* loaded from: classes.dex */
public class w implements com.tencent.mm.ui.cd, j45.k {
    @Override // com.tencent.mm.ui.ad, j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        if ((!str.endsWith(".TopStoryHomeUI") && !str.endsWith(".TopStoryHomeAffinityUI")) || !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return false;
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        return true;
    }
}
