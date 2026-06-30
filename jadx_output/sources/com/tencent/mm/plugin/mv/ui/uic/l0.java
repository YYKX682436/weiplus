package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f151264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151265e;

    public l0(com.tencent.mm.plugin.mv.ui.uic.n0 n0Var, java.lang.String str) {
        this.f151264d = n0Var;
        this.f151265e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm.i8 Ai = ((ja0.m0) ((ka0.q0) i95.n0.c(ka0.q0.class))).Ai(this.f151264d.getActivity());
        if (Ai != null) {
            java.lang.String str = this.f151265e;
            ka0.p0 p0Var = (ka0.p0) i95.n0.c(ka0.p0.class);
            java.lang.String str2 = Ai.field_musicId;
            java.lang.String str3 = Ai.field_songAlbum;
            java.lang.String str4 = Ai.field_songHAlbumUrl;
            ((ja0.k0) p0Var).getClass();
            ll3.o2.Ai().P0(str2, str3, str4, str, false, false);
        }
    }
}
