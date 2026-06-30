package kc2;

/* loaded from: classes15.dex */
public final class m1 extends kc2.c0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f306456s;

    /* renamed from: t, reason: collision with root package name */
    public final kc2.x1 f306457t;

    /* renamed from: u, reason: collision with root package name */
    public final kc2.x1 f306458u;

    /* renamed from: v, reason: collision with root package name */
    public final kc2.x1 f306459v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f306460w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m1(kc2.g1 r8, com.tencent.mm.sdk.platformtools.n3 r9, zy2.fa r10, java.lang.String r11, java.lang.String r12, java.util.List r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L6
            java.lang.String r11 = ""
        L6:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto Ld
            java.lang.String r12 = "Search.Entrance"
        Ld:
            r5 = r12
            r11 = r14 & 32
            if (r11 == 0) goto L18
            java.lang.String r11 = "find_friends_by_search"
            java.util.List r13 = kz5.b0.c(r11)
        L18:
            r6 = r13
            java.lang.String r11 = "manager"
            kotlin.jvm.internal.o.g(r8, r11)
            java.lang.String r11 = "handler"
            kotlin.jvm.internal.o.g(r9, r11)
            java.lang.String r11 = "redDotManager"
            kotlin.jvm.internal.o.g(r10, r11)
            java.lang.String r11 = "leftEntrancePath"
            kotlin.jvm.internal.o.g(r4, r11)
            java.lang.String r11 = "rightEntrancePath"
            kotlin.jvm.internal.o.g(r5, r11)
            java.lang.String r11 = "findTabPreferenceKey"
            kotlin.jvm.internal.o.g(r6, r11)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "FinderKaraInfoManager.Search"
            r7.f306456s = r8
            kc2.x1 r8 = kc2.x1.f306538z
            r7.f306457t = r8
            kc2.x1 r8 = kc2.x1.f306537y
            r7.f306458u = r8
            kc2.x1 r8 = kc2.x1.A
            r7.f306459v = r8
            com.tencent.mm.storage.u3 r8 = com.tencent.mm.storage.u3.USERINFO_FINDER_KARA_SEARCH_LAST_EXIT_STRING_SYNC
            r7.f306460w = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kc2.m1.<init>(kc2.g1, com.tencent.mm.sdk.platformtools.n3, zy2.fa, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.i):void");
    }

    @Override // kc2.c0
    public kc2.x1 b() {
        return this.f306457t;
    }

    @Override // kc2.c0
    public kc2.x1 d() {
        return this.f306458u;
    }

    @Override // kc2.c0
    public com.tencent.mm.storage.u3 g() {
        return this.f306460w;
    }

    @Override // kc2.c0
    public kc2.x1 i() {
        return this.f306459v;
    }

    @Override // kc2.c0
    public java.lang.String m() {
        return this.f306456s;
    }

    @Override // kc2.c0
    public boolean n() {
        if ((c01.z1.j() & 2097152) != 0) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerPathChecker", "isShowSearchEntrance settingClose!");
        } else {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (!su4.r2.l()) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerPathChecker", "isShowSearchEntrance in teen mode!");
        }
        return false;
    }
}
