package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v51 f129455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(r45.v51 v51Var, com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        super(1);
        this.f129455d = v51Var;
        this.f129456e = finderFansListUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList list = this.f129455d.getList(5);
        if (list == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129456e;
        ((bu2.b) ((jz5.n) finderFansListUI.A).getValue()).a();
        ((bu2.b) ((jz5.n) finderFansListUI.A).getValue()).c(list);
        return jz5.f0.f302826a;
    }
}
