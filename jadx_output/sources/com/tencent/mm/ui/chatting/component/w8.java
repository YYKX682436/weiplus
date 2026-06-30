package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f200160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        super(0);
        this.f200160d = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView y07 = this.f200160d.y0();
        if (y07 != null) {
            y07.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
