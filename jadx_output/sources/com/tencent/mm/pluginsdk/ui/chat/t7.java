package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        super(0);
        this.f190666d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(android.view.ViewConfiguration.get(this.f190666d.f190220b.getContext()).getScaledTouchSlop());
    }
}
