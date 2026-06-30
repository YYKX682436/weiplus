package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e0 f118792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.live.widget.e0 e0Var) {
        super(0);
        this.f118792d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View I;
        I = this.f118792d.I();
        return (com.tencent.mm.ui.widget.imageview.WeImageView) I.findViewById(com.tencent.mm.R.id.f6b);
    }
}
