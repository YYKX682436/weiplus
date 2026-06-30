package j45;

/* loaded from: classes11.dex */
public class e implements j45.i {
    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(j45.k.class)).all().iterator();
        while (it.hasNext()) {
            if (((j45.k) ((fs.q) it.next()).get()).b(context, str, intent, i17, x7Var)) {
                return true;
            }
        }
        return false;
    }
}
