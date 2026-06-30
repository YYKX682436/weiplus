package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f138327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.w0 f138328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context, com.tencent.mm.plugin.fts.ui.widget.w0 w0Var) {
        super(0);
        this.f138327d = context;
        this.f138328e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fts.ui.widget.w0 w0Var = this.f138328e;
        return new com.tencent.mm.plugin.fts.ui.widget.b1(this.f138327d, (com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl) ((jz5.n) w0Var.f138339q).getValue(), (android.widget.TextView) ((jz5.n) w0Var.f138340r).getValue(), (android.widget.ProgressBar) ((jz5.n) w0Var.f138341s).getValue());
    }
}
