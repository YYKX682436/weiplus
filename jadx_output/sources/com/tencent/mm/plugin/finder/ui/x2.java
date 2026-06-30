package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderConversationFragment f130001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment) {
        super(0);
        this.f130001d = finderConversationFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderConversationFragment.I;
        android.view.View view = this.f130001d.f206301h;
        kotlin.jvm.internal.o.d(view);
        return vb2.g.a(view.findViewById(com.tencent.mm.R.id.eb9));
    }
}
