package sr2;

/* loaded from: classes2.dex */
public final class v implements mv2.w0 {
    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
    }

    @Override // mv2.w0
    public void onPostFakeOk(long j17) {
    }

    @Override // mv2.w0
    public void onPostNotify(long j17, boolean z17) {
    }

    @Override // mv2.w0
    public void onPostOk(long j17, long j18) {
        jz5.f0 f0Var;
        r45.kc4 kc4Var;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j18);
        if (h17 == null || (kc4Var = (r45.kc4) h17.getPostInfo().getCustom(18)) == null) {
            f0Var = null;
        } else {
            int integer = kc4Var.getInteger(5);
            com.tencent.mars.xlog.Log.e("FinderPostToCommentListener", "onPostOk: localId=" + j17 + ", svrID=" + pm0.v.u(j18) + " refFeedInfoType:" + kc4Var.getInteger(4) + " needPostToComment:" + integer);
            if (integer == 0) {
                return;
            }
            cu2.m mVar = cu2.m.f222420a;
            long j19 = kc4Var.getLong(0);
            java.lang.String string = kc4Var.getString(1);
            if (string == null) {
                string = "";
            }
            java.lang.String userName = h17.getUserName();
            java.lang.String string2 = kc4Var.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String string3 = kc4Var.getString(2);
            com.tencent.mm.plugin.finder.storage.yj0 c17 = mVar.c(j19, string, userName, string2, null, "", string3 == null ? "" : string3, "", "", "", 1, c01.id.c(), false, null, null, 0, kz5.p0.f313996d, null, 0, new cu2.a(false, false, kc4Var.getString(7), 3, null), null);
            i95.m c18 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            r45.l60 l60Var = new r45.l60();
            l60Var.set(1, java.lang.Integer.valueOf(kc4Var.getInteger(4)));
            l60Var.set(0, java.lang.Long.valueOf(j18));
            new bq.m(c17, null, l60Var, null, 0).l().q(new cq.w(null, null));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderPostToCommentListener", "onPostOk: localId=" + j17 + ", svrID=" + pm0.v.u(j18));
        }
    }

    @Override // mv2.w0
    public void onPostStart(long j17) {
    }
}
