package fe2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.h f261506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fe2.h hVar) {
        super(0);
        this.f261506d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk2.o9 o9Var;
        pk2.d9 d9Var;
        df2.ox oxVar = (df2.ox) this.f261506d.U0(df2.ox.class);
        if (oxVar != null && (o9Var = oxVar.f231016q) != null && (d9Var = o9Var.f356082f) != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("requestCode", 16);
            pk2.o9 o9Var2 = d9Var.f355680w;
            com.tencent.mm.ui.MMActivity mMActivity = o9Var2.f356078d;
            int i17 = bundle.getInt("requestCode");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var2.c(mm2.c1.class)).f328846n;
            if (finderObject != null) {
                o9Var2.k(finderObject, ((mm2.e1) o9Var2.c(mm2.e1.class)).f328988r);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384);
                a17.setEcSource(((mm2.c1) o9Var2.c(mm2.c1.class)).f328786c3);
                android.os.Bundle bundle2 = new android.os.Bundle();
                o25.y1 y1Var = d9Var.f355666i;
                bundle2.putInt("quick_share_item_count", y1Var != null ? ((com.tencent.mm.pluginsdk.forward.m) y1Var).f188722e : 0);
                bundle2.putInt("Select_Conv_Type", 16);
                bundle2.putIntArray("search_range", new int[]{131075});
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub.ah((c61.ub) c17, mMActivity, a17, bundle2, 0, new pk2.x8(o9Var2, i17), 8, null);
                ((mm2.c1) o9Var2.c(mm2.c1.class)).O1 = false;
            }
        }
        return jz5.f0.f302826a;
    }
}
