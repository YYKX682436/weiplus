package im2;

/* loaded from: classes3.dex */
public final class d5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f292293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f292294f;

    public d5(im2.h6 h6Var, com.tencent.mm.protocal.protobuf.FinderContact finderContact, boolean z17) {
        this.f292292d = h6Var;
        this.f292293e = finderContact;
        this.f292294f = z17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        im2.h6 h6Var = this.f292292d;
        if (itemId == h6Var.Q) {
            h6Var.N = null;
            im2.h6.f(h6Var, false, this.f292293e, this.f292294f);
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            h6Var.Y().f410659n.getLong(0);
            long j17 = h6Var.Y().f410648c;
            int i18 = !h6Var.Y().f410654i ? 1 : 0;
            r0Var.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("is_finder", java.lang.String.valueOf(i18));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.L1, hashMap, null, null, null, null, false, 124, null);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, liveid = " + ((java.lang.String) hashMap.get("liveid")) + ", feedid = " + ((java.lang.String) hashMap.get("feedid")) + ", is_finder = " + ((java.lang.String) hashMap.get("is_finder")));
        }
    }
}
