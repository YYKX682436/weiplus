package rr;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final rr.s f399149a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f399150b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f399151c;

    static {
        rr.s sVar = new rr.s();
        f399149a = sVar;
        f399150b = sVar.c();
        f399151c = "_cover";
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFileUtil", "vfs root " + sVar.c());
    }

    public final java.lang.String a() {
        return lp0.b.h() + "emoji/";
    }

    public final java.lang.String b() {
        return a() + "emoji_anim/";
    }

    public final java.lang.String c() {
        return com.tencent.mm.vfs.q7.c("emoji") + '/';
    }

    public final java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return f399150b + str + f399151c;
    }
}
