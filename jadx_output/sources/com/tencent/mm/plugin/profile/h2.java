package com.tencent.mm.plugin.profile;

/* loaded from: classes9.dex */
public final class h2 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wl f153482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f153483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f153485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f153486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.t1 f153487i;

    public h2(r45.wl wlVar, kotlin.jvm.internal.f0 f0Var, java.lang.String str, long j17, int i17, com.tencent.mm.plugin.profile.t1 t1Var) {
        this.f153482d = wlVar;
        this.f153483e = f0Var;
        this.f153484f = str;
        this.f153485g = j17;
        this.f153486h = i17;
        this.f153487i = t1Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "handleLikeBlock errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        com.tencent.mm.plugin.profile.t1 t1Var = this.f153487i;
        kotlin.jvm.internal.f0 f0Var = this.f153483e;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtilsKt", "handleLikeBlock: sync blockStatus=" + f0Var.f310116d + " failed");
            if (t1Var == null) {
                return 0;
            }
            t1Var.a();
            return 0;
        }
        r45.wl wlVar = this.f153482d;
        if (wlVar.M == null) {
            wlVar.M = new r45.el();
        }
        r45.el elVar = wlVar.M;
        kotlin.jvm.internal.o.d(elVar);
        elVar.f373591d = f0Var.f310116d;
        qr3.c0.c(wlVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "handleLikeBlock: update LoveStatus.block=" + f0Var.f310116d + " and saved");
        gr3.e.d(this.f153484f, f0Var.f310116d == 1 ? 605 : 604, this.f153485g, null, this.f153486h, 0, 0, null, null, null, 0, 0, 4032, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "handleLikeBlock: sync blockStatus=" + f0Var.f310116d + " success");
        if (t1Var == null) {
            return 0;
        }
        t1Var.onSuccess(f0Var.f310116d);
        return 0;
    }
}
