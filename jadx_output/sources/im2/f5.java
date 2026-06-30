package im2;

/* loaded from: classes3.dex */
public final class f5 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292317d;

    public f5(im2.h6 h6Var) {
        this.f292317d = h6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        im2.h6 h6Var = this.f292317d;
        h6Var.N = null;
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        h6Var.Y().f410659n.getLong(0);
        long j17 = h6Var.Y().f410648c;
        int i17 = !h6Var.Y().f410654i ? 1 : 0;
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_finder", java.lang.String.valueOf(i17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.M1, hashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, liveid = " + ((java.lang.String) hashMap.get("liveid")) + ", feedid = " + ((java.lang.String) hashMap.get("feedid")) + ", is_finder = " + ((java.lang.String) hashMap.get("is_finder")));
    }
}
