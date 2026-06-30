package dz0;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.j0 f245050a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.j0 f245051b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.g0 f245052c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.g0 f245053d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f245054e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f245055f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f245056g;

    public x() {
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(kz5.p0.f313996d);
        this.f245050a = j0Var;
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0();
        this.f245051b = j0Var2;
        this.f245052c = j0Var;
        this.f245053d = j0Var2;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f245054e = new androidx.lifecycle.j0(bool);
        this.f245055f = new androidx.lifecycle.j0(bool);
        this.f245056g = "";
    }

    public final void a(com.tencent.maas.model.MJMusicInfo musicInfo) {
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: " + musicInfo.getMusicID() + ", " + musicInfo.getSongName());
        ((ku5.t0) ku5.t0.f312615d).B(new dz0.w(this, musicInfo));
    }

    public final void b(java.util.List musicInfoList) {
        kotlin.jvm.internal.o.g(musicInfoList, "musicInfoList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMusicInfoList: size=");
        sb6.append(musicInfoList.size());
        sb6.append(", first=");
        com.tencent.maas.model.MJMusicInfo mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) kz5.n0.a0(musicInfoList, 0);
        sb6.append(mJMusicInfo != null ? mJMusicInfo.getSongName() : null);
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
        androidx.lifecycle.j0 j0Var = this.f245050a;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : musicInfoList) {
            if (hashSet.add(((com.tencent.maas.model.MJMusicInfo) obj).getMusicID())) {
                arrayList.add(obj);
            }
        }
        j0Var.postValue(arrayList);
    }
}
