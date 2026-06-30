package eo2;

/* loaded from: classes2.dex */
public abstract class a {
    public static final boolean a(java.lang.Long l17) {
        if (l17 == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderMemberExt", "qa extMask %d", l17);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127881pc).getValue()).r()).intValue() == 1 && (l17.longValue() & 1) > 0;
    }
}
