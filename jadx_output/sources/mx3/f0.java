package mx3;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mx3.f0 f332548a = new mx3.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f332549b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f332550c;

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.lifecycle.j0 f332551d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f332552e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f332553f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f332554g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f332555h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f332556i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f332557j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f332558k;

    static {
        java.lang.String str = lp0.b.X() + "app_ringtone";
        f332549b = str;
        f332550c = str + '/';
        f332551d = new androidx.lifecycle.j0();
        f332552e = "phonering.mp3";
        f332553f = "playend.mp3";
        f332554g = "close_sound.mp3";
        f332555h = "voip_bad_netstatus_hint.mp3";
        f332556i = "animation_ringonte_ring.wxam";
        f332557j = "animation_ringonte_ring_dark.wxam";
        f332558k = "animation_ringtone_ring_gold.wxam";
    }

    public static final java.lang.Object b(java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new mx3.c0(str, z17, null), continuation);
    }

    public static final android.net.Uri c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f332550c;
        sb6.append(str);
        java.lang.String str2 = f332553f;
        sb6.append(str2);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb6.toString());
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            f332548a.a();
        }
        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(context, new com.tencent.mm.vfs.r6(str + str2));
        kotlin.jvm.internal.o.f(b17, "getUriForFile(...)");
        return b17;
    }

    public static final java.lang.String f(boolean z17) {
        mx3.f0 f0Var = f332548a;
        return z17 ? f0Var.d(f332557j) : f0Var.d(f332556i);
    }

    public static final java.lang.String g(java.lang.String toUser, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String t17 = r26.i0.t(fileName, "/", " ", false);
        if (t17.length() == 0) {
            t17 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f332550c);
        sb6.append(toUser.length() > 0 ? toUser.concat("/") : "");
        sb6.append(t17);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb6.toString());
        com.tencent.mm.vfs.r6 s17 = r6Var.s();
        if (s17 != null && !s17.m()) {
            s17.J();
        }
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public static final boolean h() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_bluetooth_sco_ringtone_fix, true);
    }

    public static final boolean i() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_forbid_setmode_while_invited_ringing, false);
    }

    public static final boolean j() {
        if (!fp.h.c(29)) {
            return false;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_ringtone_channel_grant_permission, true);
    }

    public final void a() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f332549b);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.System.currentTimeMillis();
        if (!fp.q.b("phonering")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RingBackHelper", "copyRingtone failed, expansions not ready.");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("assets:///");
        java.lang.String str = f332552e;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.String str2 = f332550c;
        sb8.append(str2);
        sb8.append(str);
        com.tencent.mm.vfs.w6.c(sb7, sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("assets:///");
        java.lang.String str3 = f332553f;
        sb9.append(str3);
        com.tencent.mm.vfs.w6.c(sb9.toString(), str2 + str3);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("assets:///");
        java.lang.String str4 = f332554g;
        sb10.append(str4);
        com.tencent.mm.vfs.w6.c(sb10.toString(), str2 + str4);
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("assets:///");
        java.lang.String str5 = f332555h;
        sb11.append(str5);
        com.tencent.mm.vfs.w6.c(sb11.toString(), str2 + str5);
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("assets:///");
        java.lang.String str6 = f332556i;
        sb12.append(str6);
        com.tencent.mm.vfs.w6.c(sb12.toString(), str2 + str6);
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder("assets:///");
        java.lang.String str7 = f332557j;
        sb13.append(str7);
        com.tencent.mm.vfs.w6.c(sb13.toString(), str2 + str7);
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder("assets:///");
        java.lang.String str8 = f332558k;
        sb14.append(str8);
        com.tencent.mm.vfs.w6.c(sb14.toString(), str2 + str8);
        java.lang.System.currentTimeMillis();
    }

    public final java.lang.String d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = f332550c;
        sb6.append(str2);
        sb6.append(str);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb6.toString());
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            a();
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(str2 + str).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final java.lang.String e(int i17, java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        return f332550c + i17 + '_' + mediaId + ".ringtone";
    }

    public final boolean k() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multitalk_start_sco_when_ring, false);
    }
}
