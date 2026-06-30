package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class id extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f173986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        super(0);
        this.f173986d = textStatusLikeListFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.uc ucVar = this.f173986d.f173647r;
        if (ucVar != null) {
            ucVar.b();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("dataLoader");
        throw null;
    }
}
