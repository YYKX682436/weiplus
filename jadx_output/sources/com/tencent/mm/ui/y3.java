package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public final class y3 implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f212573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f212574b;

    public y3(yz5.r rVar, android.view.View view) {
        this.f212573a = rVar;
        this.f212574b = view;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        jz5.o a17 = com.tencent.mm.ui.a4.a(v17);
        this.f212573a.C(this.f212574b, a17.f302841d, a17.f302842e, a17.f302843f);
        return insets;
    }
}
