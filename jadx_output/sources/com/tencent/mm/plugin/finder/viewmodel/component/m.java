package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class m implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.s f135102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Resources f135103e;

    public m(com.tencent.mm.plugin.finder.viewmodel.component.s sVar, android.content.res.Resources resources) {
        this.f135102d = sVar;
        this.f135103e = resources;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            this.f135102d.getClass();
            android.content.res.Resources resources = this.f135103e;
            g4Var.d(10021, resources.getColor(com.tencent.mm.R.color.f478532ac), resources.getString(com.tencent.mm.R.string.f491290cn4));
        }
    }
}
