package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class m9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f116478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f116479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(android.widget.TextView textView, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f116478d = textView;
        this.f116479e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f116478d.setText(no0.l.a(no0.m.f338730a, this.f116479e.f310116d, ":", false, false, false, 24, null));
        return jz5.f0.f302826a;
    }
}
