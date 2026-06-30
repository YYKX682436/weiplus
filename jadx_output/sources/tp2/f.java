package tp2;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f421137g;

    /* renamed from: a, reason: collision with root package name */
    public final r45.qt2 f421138a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f421139b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f421140c;

    /* renamed from: d, reason: collision with root package name */
    public final int f421141d;

    /* renamed from: e, reason: collision with root package name */
    public final sp2.k f421142e;

    /* renamed from: f, reason: collision with root package name */
    public int f421143f;

    public f(r45.qt2 contextObj, com.tencent.mm.ui.MMActivity baseContext, androidx.fragment.app.Fragment fragment, int i17, sp2.k kVar) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        this.f421138a = contextObj;
        this.f421139b = baseContext;
        this.f421140c = fragment;
        this.f421141d = i17;
        this.f421142e = kVar;
        this.f421143f = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if ((r15 != null ? r15.f301095a : 0) == 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(tp2.f r36, int r37, so2.j5 r38, java.util.ArrayList r39, android.view.View r40, java.lang.String r41, java.lang.String r42, boolean r43, int r44, android.os.Bundle r45, so2.j5 r46, long r47, jq2.a r49, long r50, android.content.Intent r52, java.util.List r53, int r54, java.lang.Object r55) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tp2.f.b(tp2.f, int, so2.j5, java.util.ArrayList, android.view.View, java.lang.String, java.lang.String, boolean, int, android.os.Bundle, so2.j5, long, jq2.a, long, android.content.Intent, java.util.List, int, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(tp2.f r24, so2.j5 r25, int r26, int r27, android.view.View r28, java.util.ArrayList r29, java.lang.String r30, int r31, android.os.Bundle r32, so2.j5 r33, jq2.a r34, long r35, int r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tp2.f.d(tp2.f, so2.j5, int, int, android.view.View, java.util.ArrayList, java.lang.String, int, android.os.Bundle, so2.j5, jq2.a, long, int, java.lang.Object):void");
    }

    public final java.lang.String a(android.os.Bundle bundle) {
        cl0.g gVar = new cl0.g();
        try {
            java.util.Set<java.lang.String> keySet = bundle.keySet();
            java.util.Iterator<java.lang.String> it = keySet != null ? keySet.iterator() : null;
            if (it != null) {
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    gVar.s(next, bundle.get(next));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("NewEntranceViewItemClick", "bundleToString err:" + e17.getMessage());
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x009a, code lost:
    
        if ((r14 <= r12 && r12 < -1) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(int r12, android.view.View r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tp2.f.c(int, android.view.View, java.lang.String):java.lang.String");
    }

    public /* synthetic */ f(r45.qt2 qt2Var, com.tencent.mm.ui.MMActivity mMActivity, androidx.fragment.app.Fragment fragment, int i17, sp2.k kVar, int i18, kotlin.jvm.internal.i iVar) {
        this(qt2Var, mMActivity, fragment, i17, (i18 & 16) != 0 ? null : kVar);
    }
}
