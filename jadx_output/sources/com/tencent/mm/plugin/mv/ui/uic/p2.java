package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gs4 f151354e;

    public p2(androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.gs4 gs4Var) {
        this.f151353d = appCompatActivity;
        this.f151354e = gs4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm.i8 Ai = ((ja0.m0) ((ka0.q0) i95.n0.c(ka0.q0.class))).Ai(this.f151353d);
        if (Ai != null) {
            ka0.p0 p0Var = (ka0.p0) i95.n0.c(ka0.p0.class);
            java.lang.String str = Ai.field_musicId;
            java.lang.String str2 = Ai.field_songAlbum;
            r45.gs4 gs4Var = this.f151354e;
            java.lang.String str3 = gs4Var.f375515f;
            java.lang.String str4 = gs4Var.f375513d;
            ((ja0.k0) p0Var).getClass();
            ll3.o2.Ai().P0(str, str2, str3, str4, false, false);
        }
    }
}
