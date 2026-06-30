package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class e8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f198962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        super(0);
        this.f198962d = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View F0 = this.f198962d.F0();
        if (F0 != null) {
            return F0.findViewById(com.tencent.mm.R.id.voa);
        }
        return null;
    }
}
