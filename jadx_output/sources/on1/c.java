package on1;

/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f346806a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f346807b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f346808c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f346809d;

    static {
        boolean z17;
        boolean z18 = false;
        if (j62.e.g().l("clicfg_recover_new_img_name", true, true, true) || z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        f346807b = z17;
        if (j62.e.g().l("clicfg_recover_new_voice_name", false, true, true) || z65.c.a()) {
            z18 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        f346808c = z18;
        f346809d = com.tencent.mm.sdk.platformtools.o4.J("BackupMsgLogic", gm0.j1.b().h(), 1);
    }

    public static void a(long j17, java.lang.String str) {
        f346809d.D(java.lang.String.valueOf(j17), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.ed b(com.tencent.mm.storage.f9 r12, boolean r13, java.lang.String r14, com.tencent.mm.pointers.PLong r15, java.util.LinkedList r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.c.b(com.tencent.mm.storage.f9, boolean, java.lang.String, com.tencent.mm.pointers.PLong, java.util.LinkedList, boolean, boolean):r45.ed");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(r45.ed r18, java.util.Map r19, java.util.HashMap r20, android.util.Pair r21, java.lang.String r22, com.tencent.mm.pointers.PString r23, com.tencent.mm.pointers.PBool r24, on1.a r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.c.c(r45.ed, java.util.Map, java.util.HashMap, android.util.Pair, java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PBool, on1.a, java.util.List):android.util.Pair");
    }

    public static boolean d(int i17) {
        return i17 == 1 || i17 == 3 || i17 == 34 || i17 == 42 || i17 == 66 || i17 == 43 || i17 == 44 || i17 == 47 || i17 == 48 || i17 == 49 || i17 == 62 || i17 == 10000 || i17 == 838860849;
    }
}
