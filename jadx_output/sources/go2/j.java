package go2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f273987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(go2.z zVar) {
        super(0);
        this.f273987d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.h32 h32Var;
        int i17;
        r45.j32 j32Var;
        java.util.LinkedList list;
        r45.j32 j32Var2;
        java.util.LinkedList list2;
        r45.j32 j32Var3;
        java.util.LinkedList list3;
        go2.z zVar = this.f273987d;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) zVar.H.get(zVar.D);
        kk.l lVar = zVar.H;
        if (l2Var != null && (h32Var = l2Var.f123916e) != null) {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(zVar.D);
            if (l2Var2 == null || (j32Var3 = l2Var2.f123923l) == null || (list3 = j32Var3.getList(0)) == null) {
                i17 = -1;
            } else {
                i17 = -1;
                int i18 = 0;
                for (java.lang.Object obj : list3) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(h32Var.getString(4), ((r45.h32) obj).getString(4))) {
                        i17 = i18;
                    }
                    i18 = i19;
                }
            }
            if (i17 != -1) {
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var3 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(zVar.D);
                if (l2Var3 != null && (j32Var2 = l2Var3.f123923l) != null && (list2 = j32Var2.getList(0)) != null) {
                }
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var4 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(zVar.D);
                if (l2Var4 != null && (j32Var = l2Var4.f123923l) != null && (list = j32Var.getList(0)) != null) {
                    list.add(i17, h32Var);
                }
            }
        }
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = zVar.C;
        if (s4Var == null) {
            kotlin.jvm.internal.o.o("moreLiveListWidget");
            throw null;
        }
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var5 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(zVar.D);
        zy2.ic.a(s4Var, l2Var5 != null ? l2Var5.f123923l : null, null, false, null, 0, 0, null, 126, null);
        return jz5.f0.f302826a;
    }
}
