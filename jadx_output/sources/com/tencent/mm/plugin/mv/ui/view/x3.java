package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment f151988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f151989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment, yz5.a aVar) {
        super(2);
        this.f151988d = musicMvTabMyPostFragment;
        this.f151989e = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bq.z1 cgi = (bq.z1) obj;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) obj2, "<anonymous parameter 1>");
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = this.f151988d;
        kotlinx.coroutines.y0 a17 = v65.m.a(musicMvTabMyPostFragment);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(a17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.mv.ui.view.w3(musicMvTabMyPostFragment, cgi, this.f151989e, null), 2, null);
        return jz5.f0.f302826a;
    }
}
