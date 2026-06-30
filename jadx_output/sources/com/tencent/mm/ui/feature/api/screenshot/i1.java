package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f208488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, android.view.View view, android.view.WindowManager.LayoutParams layoutParams) {
        super(0);
        this.f208486d = j1Var;
        this.f208487e = view;
        this.f208488f = layoutParams;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.feature.api.screenshot.x xVar = this.f208486d.f208501g;
        if (xVar == null) {
            return null;
        }
        xVar.a(com.tencent.mm.R.id.v19, this.f208487e, this.f208488f);
        return jz5.f0.f302826a;
    }
}
