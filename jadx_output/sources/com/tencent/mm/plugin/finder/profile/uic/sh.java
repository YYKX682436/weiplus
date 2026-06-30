package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class sh implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC f124216d;

    public sh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC) {
        this.f124216d = finderProfileTingAudioWithCollectionUIC;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        ms2.c cVar = (ms2.c) holder.f293125i;
        o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
        eVar.getClass();
        bw5.jc jcVar = new bw5.jc();
        r45.dg4 dg4Var = cVar.f330970e;
        jcVar.f28920d = dg4Var != null ? ms2.a.a(dg4Var) : null;
        boolean[] zArr = jcVar.f28923g;
        zArr[1] = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC = this.f124216d;
        java.util.LinkedList<so2.j5> M = finderProfileTingAudioWithCollectionUIC.f123489i.M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        for (so2.j5 j5Var : M) {
            kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.profile.ting.FinderTingAudioListItem");
            arrayList.add(ms2.d.a(((ms2.c) j5Var).f330969d));
        }
        linkedList.addAll(arrayList);
        jcVar.f28921e = linkedList;
        zArr[2] = true;
        jcVar.f28922f = i17;
        zArr[3] = true;
        ((wy2.g) eVar).Di(finderProfileTingAudioWithCollectionUIC.getContext(), jcVar.toByteArray(), null, false);
    }
}
