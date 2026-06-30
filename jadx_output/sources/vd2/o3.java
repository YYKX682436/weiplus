package vd2;

/* loaded from: classes3.dex */
public final class o3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f435837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f435838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435842f;

    public o3(long j17, kotlin.jvm.internal.c0 c0Var, java.lang.String str, java.lang.String str2, vd2.g5 g5Var, vd2.g5 g5Var2) {
        this.f435837a = j17;
        this.f435838b = c0Var;
        this.f435839c = str;
        this.f435840d = str2;
        this.f435841e = g5Var;
        this.f435842f = g5Var2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        if (finderObject == null) {
            return null;
        }
        long j17 = this.f435837a;
        vd2.t3.f435922b.put(java.lang.Long.valueOf(j17), new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), finderObject));
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && fVar.f70616b == 0) {
            if (this.f435838b.f310112d) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1837L, 2L, 1L);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpLiveUI liveId: ");
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            if (liveInfo != null) {
                j17 = liveInfo.getLong(0);
            }
            sb6.append(j17);
            sb6.append(", username:");
            java.lang.String username = finderObject.getUsername();
            java.lang.String str = "";
            java.lang.String str2 = this.f435839c;
            if (username == null) {
                username = str2 == null ? "" : str2;
            }
            sb6.append(username);
            com.tencent.mars.xlog.Log.i("Finder.FinderUtilApi", sb6.toString());
            java.lang.String str3 = this.f435840d;
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                java.lang.String username2 = finderObject.getUsername();
                if (username2 != null) {
                    str = username2;
                } else if (str2 != null) {
                    str = str2;
                }
                p52.h.f352016a.f(str3, str);
            }
            vd2.g5 g5Var = this.f435841e;
            if (g5Var == null) {
                return null;
            }
            g5Var.a(null);
        } else {
            vd2.g5 g5Var2 = this.f435842f;
            if (g5Var2 == null) {
                return null;
            }
            g5Var2.a(java.lang.Integer.valueOf(fVar.f70616b));
        }
        return f0Var;
    }
}
