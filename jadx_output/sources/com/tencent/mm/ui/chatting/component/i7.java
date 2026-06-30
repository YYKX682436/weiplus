package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.l7 f199212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.k7 f199213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.mm.ui.chatting.component.l7 l7Var, com.tencent.mm.ui.chatting.component.k7 k7Var) {
        super(0);
        this.f199212d = l7Var;
        this.f199213e = k7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup f17;
        com.tencent.mm.pluginsdk.ui.tools.v3 p17 = this.f199212d.f198580d.p();
        if (p17 == null || (f17 = p17.f()) == null) {
            return null;
        }
        f17.addOnLayoutChangeListener(new com.tencent.mm.ui.chatting.component.h7(this.f199213e));
        return jz5.f0.f302826a;
    }
}
