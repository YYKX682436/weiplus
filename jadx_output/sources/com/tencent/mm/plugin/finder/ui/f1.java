package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI) {
        super(1);
        this.f129115d = finderBlackListUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v41 it = (r45.v41) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI = this.f129115d;
        kotlinx.coroutines.l.d(v65.m.b(finderBlackListUI), null, null, new com.tencent.mm.plugin.finder.ui.e1(finderBlackListUI, it, null), 3, null);
        return jz5.f0.f302826a;
    }
}
