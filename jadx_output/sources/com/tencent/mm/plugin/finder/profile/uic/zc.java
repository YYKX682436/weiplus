package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class zc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.jd f124424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f124425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(com.tencent.mm.plugin.finder.profile.uic.jd jdVar, androidx.fragment.app.Fragment fragment) {
        super(0);
        this.f124424d = jdVar;
        this.f124425e = fragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.jd jdVar = this.f124424d;
        java.lang.String username = jdVar.getUsername();
        kotlin.jvm.internal.o.d(username);
        return new com.tencent.mm.plugin.finder.feed.model.FinderProfileProductLoader(username, jdVar.getContextObj(), this.f124425e);
    }
}
