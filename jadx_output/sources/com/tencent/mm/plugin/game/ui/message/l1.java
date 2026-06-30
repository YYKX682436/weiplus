package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class l1 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.m1 f141583a;

    public l1(com.tencent.mm.plugin.game.ui.message.m1 m1Var, com.tencent.mm.plugin.game.ui.message.k1 k1Var) {
        this.f141583a = m1Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        com.tencent.mm.plugin.game.ui.message.m1 m1Var = this.f141583a;
        m1Var.f141588e = true;
        m1Var.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
        com.tencent.mm.plugin.game.ui.message.m1 m1Var = this.f141583a;
        m1Var.f141588e = false;
        m1Var.notifyDataSetChanged();
    }
}
