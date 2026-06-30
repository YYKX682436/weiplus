package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class bk extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f123575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        super(1);
        this.f123575d = dkVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getItemId() == ((long) this.f123575d.f123641r.hashCode()));
    }
}
