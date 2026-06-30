package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class wz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f136377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.lz f136378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h00 f136379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(android.content.Intent intent, com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var) {
        super(0);
        this.f136377d = intent;
        this.f136378e = lzVar;
        this.f136379f = h00Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f136378e.f135100d;
        android.content.Intent intent = this.f136377d;
        intent.putExtra("finder_username", str);
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = this.f136379f;
        com.tencent.mm.plugin.finder.assist.i0 i0Var = h00Var.f134569g;
        if (i0Var == null) {
            return null;
        }
        i0Var.mk(h00Var.getContext(), intent);
        return jz5.f0.f302826a;
    }
}
