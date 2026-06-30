package com.tencent.mm.view.manager;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.c f213611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.view.manager.c cVar, android.view.View view) {
        super(0);
        this.f213611d = cVar;
        this.f213612e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f213611d.f213617c) {
            this.f213612e.setTranslationY(0.0f);
        }
        return jz5.f0.f302826a;
    }
}
