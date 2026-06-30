package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.SpeechInputLayout f189905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout) {
        super(0);
        this.f189905d = speechInputLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.w2 w2Var = this.f189905d.f189831p;
        if (w2Var != null) {
            w2Var.onHide();
        }
        return jz5.f0.f302826a;
    }
}
