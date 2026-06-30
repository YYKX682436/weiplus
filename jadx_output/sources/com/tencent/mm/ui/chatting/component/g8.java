package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class g8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        super(0);
        this.f199083d = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199083d;
        android.view.View F0 = y8Var.F0();
        android.widget.TextView textView = F0 != null ? (android.widget.TextView) F0.findViewById(com.tencent.mm.R.id.vob) : null;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479575r));
        }
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.ui.chatting.component.f8(y8Var));
        }
        return textView;
    }
}
