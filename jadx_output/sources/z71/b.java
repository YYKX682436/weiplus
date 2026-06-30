package z71;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static z71.b f470510a;

    public static z71.b a() {
        if (f470510a == null) {
            f470510a = new z71.b();
        }
        return f470510a;
    }

    public java.lang.String b(java.lang.String str) {
        r45.f03 Dj;
        try {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0(str);
            return (L0 == null || (Dj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, str)) == null || Dj.f373897q == null) ? "" : java.lang.String.format("{\"tipsid\":\"%s\";\"ctrltype\":%d;\"showtype\":%d;\"expose_count\":%d;\"first_expose_time\":%d;\"rece_time\":%d;\"redDotShowInfoExt\":%s}", L0.field_tipsId, java.lang.Integer.valueOf(L0.field_ctrType), java.lang.Integer.valueOf(Dj.f373887d), java.lang.Integer.valueOf(Dj.f373897q.f383656d), java.lang.Long.valueOf(Dj.f373897q.f383658f), java.lang.Long.valueOf(L0.field_time), nk6.A(L0.field_ctrInfo).toString().replace(",", ";"));
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public boolean c() {
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z17 = !((c01.z1.j() & 34359738368L) != 0);
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AiFinderData", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", java.lang.Boolean.valueOf(el6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        return el6 && z17 && !z18;
    }

    public boolean d() {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        boolean z17 = !((c01.z1.j() & 9007199254740992L) != 0);
        boolean Ai = ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiFinderData", "[isShowLiveEntrance] openLiveFriends:%s enableFinderLiveEntry:%s, isTeenMode:%s", java.lang.Boolean.valueOf(Ai), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(isTeenMode));
        return z17 && Ai && !isTeenMode;
    }
}
