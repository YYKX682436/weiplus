package qw;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final qw.a f367051a = new qw.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f367052b = {"gh_43f2581f6fd6", "gh_3dfda90e39d6", "gh_b4af18eac3d5", "gh_f0a92aa7146c", "gh_e087bb5b95e6", "gh_579db1f2cf89", "gh_25d9ac85a4bc", "gh_22b87fa7cb3c", "gh_6e99ff560306", "notifymessage", "qqmail", "qmessage", "tmessage", "floatbottle", "facebookapp", "qqfriend", "newsapp", "feedsapp", "masssendapp", "blogapp", "voipapp", "voicevoipapp", "voiceinputapp", "googlecontact", "fmessage", "medianote", "qqsync", "lbsapp", "shakeapp", "linkedinplugin", "weixin", "gh_051d9102de63"};

    public final boolean a(com.tencent.mm.storage.f9 msg, int i17, int i18) {
        ot0.r0 i19;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.getType() == 34 || msg.getType() == 3 || msg.getType() == 1 || msg.getType() == 452984881 || msg.getType() == 520093745 || msg.getType() == 369098801 || msg.getType() == 452984881 || msg.getType() == 520093745 || msg.getType() == 754974769 || msg.getType() == 1241514033 || msg.getType() == 979370033) {
            return false;
        }
        return (i17 == 3 || i18 == 9 || i18 == 15 || i18 == 17) && msg.t2() && (i19 = com.tencent.mm.storage.c2.i(msg)) != null && !com.tencent.mm.sdk.platformtools.t8.L0(i19.f348581i);
    }

    public final boolean b(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.f(msg.Q0(), "getTalker(...)");
        if (!yo.a.b(f367052b, r0)) {
            java.lang.String Q0 = msg.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true);
            if (!(n17 == null ? false : n17.w2())) {
                return true;
            }
        }
        return false;
    }
}
