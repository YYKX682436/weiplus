package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ra extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        super(0);
        this.f124180d = obVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124180d;
        return new ks2.j(obVar.getContext(), obVar.getUsername());
    }
}
