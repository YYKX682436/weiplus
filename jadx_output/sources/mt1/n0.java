package mt1;

/* loaded from: classes12.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f331242a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f331243b;

    static {
        int i17;
        mt1.f0 f0Var = mt1.f0.f331217d;
        java.util.List i18 = kz5.c0.i(new jz5.l(f0Var, mt1.h0.f331221d), new jz5.l(f0Var, mt1.i0.f331229d), new jz5.l(f0Var, mt1.j0.f331231d), new jz5.l(new mt1.g0("1", "clicfg_clean_new_filters", "0"), mt1.m0.f331240d));
        f331242a = i18;
        java.util.ListIterator listIterator = i18.listIterator(i18.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else if (((java.lang.Boolean) ((yz5.a) ((jz5.l) listIterator.previous()).f302833d).invoke()).booleanValue()) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        f331243b = i17 + 1;
    }
}
