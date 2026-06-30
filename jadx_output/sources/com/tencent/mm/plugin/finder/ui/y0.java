package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment f130035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment finderBaseConversationFragment) {
        super(0);
        this.f130035d = finderBaseConversationFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f130035d.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        return xy2.c.e(context);
    }
}
