package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f117310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.u f117311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.live.viewmodel.u uVar) {
        super(0);
        this.f117310d = appCompatActivity;
        this.f117311e = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f117310d;
        com.tencent.mm.plugin.finder.live.viewmodel.u uVar = this.f117311e;
        com.tencent.mm.plugin.finder.live.viewmodel.o oVar = new com.tencent.mm.plugin.finder.live.viewmodel.o(appCompatActivity, uVar);
        oVar.setBuContext(uVar.f117430e);
        return oVar;
    }
}
