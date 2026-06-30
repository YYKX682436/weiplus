package zv2;

/* loaded from: classes10.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126408g).getValue()).r()).intValue() == 1) {
            return true;
        }
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
        return ((j37 != null ? j37.field_extFlag : 0) & 67108864) != 0;
    }

    public final boolean b() {
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F8).getValue()).r()).intValue() != 1) {
            return false;
        }
        java.lang.String str = ((r45.n74) ((jz5.n) zv2.l0.f476409m).getValue()).f381130d;
        return !(str == null || str.length() == 0);
    }
}
