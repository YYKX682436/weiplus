package if0;

/* loaded from: classes12.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final if0.a0 f291012a = new if0.a0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f291013b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.v3 f291014c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f291015d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f291016e;

    static {
        com.tencent.mm.sdk.platformtools.o4 mmkv = com.tencent.mm.sdk.platformtools.o4.M("__ting_rec_local_file_mmkv_key__");
        f291013b = mmkv;
        kotlin.jvm.internal.o.f(mmkv, "mmkv");
        f291014c = new com.tencent.mm.sdk.platformtools.v3(mmkv, 2592000L);
        f291015d = jz5.h.b(if0.z.f291060d);
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("authorResult_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public final void b(int i17, java.lang.String str) {
        ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Bi("MusicRec", i17, str);
    }

    public final java.lang.String c(java.lang.String str) {
        return r26.n0.D(str, "/", false, 2, null) ? (java.lang.String) kz5.n0.i0(r26.n0.f0(str, new java.lang.String[]{"/"}, false, 0, 6, null)) : str;
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f291015d).getValue();
    }

    public final int e() {
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).mj()) {
            return 0;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.player.RepairerConfigTingRecLocalFile());
    }

    public final java.lang.String f(java.lang.String str, java.lang.String str2) {
        return "recResult_" + com.tencent.mm.sdk.platformtools.w2.a(str + '-' + str2);
    }
}
