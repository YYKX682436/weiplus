package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class y7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        super(0);
        this.f190761d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190761d;
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) c8Var.i().findViewById(com.tencent.mm.R.id.sne);
        weImageButton.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.x7(c8Var));
        return weImageButton;
    }
}
