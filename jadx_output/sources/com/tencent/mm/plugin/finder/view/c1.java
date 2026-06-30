package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class c1 extends com.tencent.mm.ui.widget.dialog.y1 {
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f131744J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.app.Activity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.I = "CustomInputBottomPage";
        this.f131744J = jz5.h.b(new com.tencent.mm.plugin.finder.view.b1(context, this));
    }

    @Override // com.tencent.mm.ui.widget.dialog.y1
    public void q() {
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f131744J).getValue()).d();
        super.q();
    }

    @Override // com.tencent.mm.ui.widget.dialog.y1
    public void s() {
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f131744J).getValue()).f();
        super.s();
    }
}
