package rv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final rv.c f399832e;

    /* renamed from: f, reason: collision with root package name */
    public static final rv.d f399833f;

    /* renamed from: g, reason: collision with root package name */
    public static final rv.d f399834g;

    /* renamed from: h, reason: collision with root package name */
    public static final rv.d f399835h;

    /* renamed from: i, reason: collision with root package name */
    public static final rv.d f399836i;

    /* renamed from: m, reason: collision with root package name */
    public static final rv.d f399837m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ rv.d[] f399838n;

    /* renamed from: d, reason: collision with root package name */
    public final int f399839d;

    static {
        rv.d dVar = new rv.d(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 10000);
        f399833f = dVar;
        rv.d dVar2 = new rv.d("EMBED_EXCERPT", 1, 312);
        f399834g = dVar2;
        rv.d dVar3 = new rv.d("EMBED_EXCERPT_FOR_COMMENT_SHARE", 2, 313);
        f399835h = dVar3;
        rv.d dVar4 = new rv.d("EMBED_EXCERPT_FOR_ADDED_INFO", 3, 314);
        f399836i = dVar4;
        rv.d dVar5 = new rv.d("EMBED_EXCERPT_FOR_UNDERLINE_COMMENT", 4, com.tencent.mapsdk.internal.km.f50100e);
        f399837m = dVar5;
        rv.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f399838n = dVarArr;
        rz5.b.a(dVarArr);
        f399832e = new rv.c(null);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f399839d = i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final rv.d a(java.lang.String r3) {
        /*
            rv.d r0 = rv.d.f399833f
            rv.c r1 = rv.d.f399832e
            r1.getClass()
            java.lang.String r1 = "url"
            kotlin.jvm.internal.o.g(r3, r1)
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5b
            android.net.Uri r1 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "fromsharesource"
            java.lang.String r1 = r1.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L55
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L5b
            switch(r2) {
                case -1026963764: goto L48;
                case 501138862: goto L3c;
                case 950398559: goto L30;
                case 1642146323: goto L23;
                default: goto L22;
            }     // Catch: java.lang.Throwable -> L5b
        L22:
            goto L55
        L23:
            java.lang.String r2 = "underlinecomment"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L2d
            goto L55
        L2d:
            rv.d r1 = rv.d.f399837m     // Catch: java.lang.Throwable -> L5b
            goto L56
        L30:
            java.lang.String r2 = "comment"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L39
            goto L55
        L39:
            rv.d r1 = rv.d.f399835h     // Catch: java.lang.Throwable -> L5b
            goto L56
        L3c:
            java.lang.String r2 = "addedinfo"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L45
            goto L55
        L45:
            rv.d r1 = rv.d.f399836i     // Catch: java.lang.Throwable -> L5b
            goto L56
        L48:
            java.lang.String r2 = "underline"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L52
            goto L55
        L52:
            rv.d r1 = rv.d.f399834g     // Catch: java.lang.Throwable -> L5b
            goto L56
        L55:
            r1 = r0
        L56:
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)     // Catch: java.lang.Throwable -> L5b
            goto L66
        L5b:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)
        L66:
            boolean r2 = kotlin.Result.m527isFailureimpl(r1)
            if (r2 == 0) goto L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            rv.d r0 = (rv.d) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getEmbedExcerptSceneWithUrl: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ", scene="
            r1.append(r3)
            int r3 = r0.f399839d
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "BrandEmbedExcerptOpenArticleScene"
            com.tencent.mars.xlog.Log.i(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.d.a(java.lang.String):rv.d");
    }

    public static rv.d valueOf(java.lang.String str) {
        return (rv.d) java.lang.Enum.valueOf(rv.d.class, str);
    }

    public static rv.d[] values() {
        return (rv.d[]) f399838n.clone();
    }
}
