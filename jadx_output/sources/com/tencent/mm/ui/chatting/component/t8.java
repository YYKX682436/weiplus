package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        super(0);
        this.f199971d = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199971d;
        android.text.TextWatcher textWatcher = y8Var.A;
        if (textWatcher != null) {
            com.tencent.mm.ui.widget.MMEditText E0 = y8Var.E0();
            if (E0 != null) {
                E0.removeTextChangedListener(textWatcher);
            }
            y8Var.A = null;
        }
        y8Var.f200305z = null;
        if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() != 2) {
            com.tencent.mm.ui.chatting.component.y8.n0(y8Var);
        }
        return jz5.f0.f302826a;
    }
}
