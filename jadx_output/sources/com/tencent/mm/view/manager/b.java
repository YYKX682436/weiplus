package com.tencent.mm.view.manager;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.h1 f213614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View view, com.tencent.mm.pluginsdk.ui.h1 h1Var) {
        super(0);
        this.f213613d = view;
        this.f213614e = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f213613d.setTranslationY(((ym5.f0) this.f213614e).f463290p * 1.0f);
        return jz5.f0.f302826a;
    }
}
