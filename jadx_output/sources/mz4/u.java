package mz4;

/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f333352a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.ArrayList f333353b;

    public static void a() {
        java.util.ArrayList arrayList = f333353b;
        if (arrayList != null) {
            arrayList.clear();
        }
        f333352a = "";
        o72.p5.f343441b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r4) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = mz4.u.f333353b
            if (r1 != 0) goto La
            return r0
        La:
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            iz4.c r2 = (iz4.c) r2
            r3 = 0
            iz4.c r2 = qz4.c.a(r2, r3)
            r3 = 0
            if (r2 != 0) goto L23
            goto L6a
        L23:
            int r4 = r2.d()
            r5 = 2
            r6 = 6
            if (r4 == r5) goto L33
            if (r4 == r6) goto L33
            r7 = 4
            if (r4 == r7) goto L33
            r7 = 5
            if (r4 != r7) goto L51
        L33:
            int r7 = r2.d()
            if (r7 != r5) goto L3f
            r7 = r2
            iz4.f r7 = (iz4.f) r7
            java.lang.String r7 = r7.f296138t
            goto L44
        L3f:
            r7 = r2
            iz4.o r7 = (iz4.o) r7
            java.lang.String r7 = r7.f296135s
        L44:
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r8 != 0) goto L53
            boolean r7 = com.tencent.mm.vfs.w6.j(r7)
            if (r7 != 0) goto L51
            goto L53
        L51:
            r7 = 1
            goto L54
        L53:
            r7 = r3
        L54:
            if (r4 == r5) goto L58
            if (r4 != r6) goto L69
        L58:
            java.lang.String r4 = qz4.c.k(r2)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L6a
            boolean r4 = com.tencent.mm.vfs.w6.j(r4)
            if (r4 != 0) goto L69
            goto L6a
        L69:
            r3 = r7
        L6a:
            if (r3 == 0) goto Le
            r0.add(r2)
            goto Le
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.u.b():java.util.ArrayList");
    }

    public static int c(android.content.Context context) {
        java.lang.String str;
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(com.tencent.mm.sdk.platformtools.b0.a());
        java.util.ArrayList arrayList = f333353b;
        boolean z17 = arrayList == null || arrayList.size() <= 0;
        if (J0 && z17) {
            return 1;
        }
        if (!J0 && z17) {
            return 2;
        }
        if (J0 && !z17) {
            return 3;
        }
        try {
            java.lang.CharSequence a17 = com.tencent.mm.sdk.platformtools.b0.a();
            str = a17 instanceof android.text.Spanned ? kz4.c.b((android.text.Spanned) a17) : a17.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("WNNoteClipboardManager", "get clipboard data error : ", e17);
            str = "";
        }
        return str.equals(f333352a) ? 3 : 2;
    }

    public static boolean d(android.content.Context context) {
        return com.tencent.mm.sdk.platformtools.b0.b(context).length() >= 16384 || qz4.c.i(com.tencent.mm.sdk.platformtools.b0.b(context).toString()) >= 16384;
    }

    public static void e(android.content.Context context, java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = f333353b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        f333353b = arrayList;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = f333353b;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                iz4.c cVar = (iz4.c) it.next();
                kk.j jVar = qz4.c.f367937a;
                java.lang.String str = cVar == null ? "" : cVar.d() == 2 ? ((iz4.f) cVar).f296138t : ((iz4.o) cVar).f296135s;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    hashSet.add(str);
                }
                java.lang.String k17 = qz4.c.k(cVar);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
                    hashSet.add(k17);
                }
            }
        }
        o72.p5.f343441b = hashSet;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (f333353b != null) {
            for (int i17 = 0; i17 < f333353b.size(); i17++) {
                if (i17 != f333353b.size() - 1) {
                    sb6.append(qz4.c.b(context, (iz4.c) f333353b.get(i17)));
                    sb6.append("<br/>");
                } else {
                    sb6.append(qz4.c.b(context, (iz4.c) f333353b.get(i17)));
                }
            }
        }
        java.lang.String sb7 = sb6.toString();
        kk.j jVar2 = qz4.c.f367937a;
        java.lang.String replaceAll = java.util.regex.Pattern.compile("wa-mark", 2).matcher(java.util.regex.Pattern.compile("wa-b>", 2).matcher(java.util.regex.Pattern.compile("<[/]?w(x|n)-[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</wn-todo>", 2).matcher(java.util.regex.Pattern.compile("</wx-li>", 2).matcher(java.util.regex.Pattern.compile("wx-mark", 2).matcher(java.util.regex.Pattern.compile("wx-b>", 2).matcher(sb7).replaceAll("wa-b>")).replaceAll("wa-mark")).replaceAll("<br/>")).replaceAll("<br/>")).replaceAll("")).replaceAll("wx-b>")).replaceAll("wx-mark");
        f333352a = replaceAll;
        com.tencent.mm.sdk.platformtools.b0.e(kz4.a.a(replaceAll));
    }
}
