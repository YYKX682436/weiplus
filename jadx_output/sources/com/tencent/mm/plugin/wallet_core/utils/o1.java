package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ot4 f180954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.x1 f180955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f180956f;

    public o1(r45.ot4 ot4Var, com.tencent.mm.plugin.wallet_core.utils.x1 x1Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f180954d = ot4Var;
        this.f180955e = x1Var;
        this.f180956f = mMActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.LinkedList linkedList;
        r45.rl6 rl6Var = this.f180954d.f382508e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rl6Var != null && (linkedList = rl6Var.f384987d) != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.hl6) it.next()).f376275h);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            r45.yt5 yt5Var = (r45.yt5) it6.next();
            com.tencent.mm.ui.MMActivity mMActivity = this.f180956f;
            com.tencent.mm.plugin.wallet_core.utils.x1 x1Var = this.f180955e;
            if (x1Var == null || x1Var.b(yt5Var, menuItem)) {
                com.tencent.mm.plugin.wallet_core.utils.z1.c(mMActivity, yt5Var, null);
            } else {
                com.tencent.mm.plugin.wallet_core.utils.z1.c(mMActivity, yt5Var, null);
                x1Var.a(yt5Var, menuItem);
            }
        }
        return false;
    }
}
