package nx1;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f341278a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.ArrayList f341279b;

    public static void a() {
        java.util.ArrayList arrayList = f341279b;
        if (arrayList != null) {
            arrayList.clear();
        }
        f341278a = "";
        o72.p5.f343441b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r4) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = nx1.b.f341279b
            if (r1 != 0) goto La
            return r0
        La:
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            ix1.a r2 = (ix1.a) r2
            ix1.a r2 = com.tencent.mm.plugin.component.editor.u1.a(r2)
            r3 = 0
            if (r2 != 0) goto L22
            goto L69
        L22:
            int r4 = r2.b()
            r5 = 2
            r6 = 6
            if (r4 == r5) goto L32
            if (r4 == r6) goto L32
            r7 = 4
            if (r4 == r7) goto L32
            r7 = 5
            if (r4 != r7) goto L50
        L32:
            int r7 = r2.b()
            if (r7 != r5) goto L3e
            r7 = r2
            ix1.j r7 = (ix1.j) r7
            java.lang.String r7 = r7.f295322s
            goto L43
        L3e:
            r7 = r2
            ix1.d r7 = (ix1.d) r7
            java.lang.String r7 = r7.f295329r
        L43:
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r8 != 0) goto L52
            boolean r7 = com.tencent.mm.vfs.w6.j(r7)
            if (r7 != 0) goto L50
            goto L52
        L50:
            r7 = 1
            goto L53
        L52:
            r7 = r3
        L53:
            if (r4 == r5) goto L57
            if (r4 != r6) goto L68
        L57:
            java.lang.String r4 = com.tencent.mm.plugin.component.editor.u1.i(r2)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L69
            boolean r4 = com.tencent.mm.vfs.w6.j(r4)
            if (r4 != 0) goto L68
            goto L69
        L68:
            r3 = r7
        L69:
            if (r3 == 0) goto Le
            r0.add(r2)
            goto Le
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.b.b():java.util.ArrayList");
    }

    public static int c(android.content.Context context) {
        java.lang.String str;
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(com.tencent.mm.sdk.platformtools.b0.a());
        java.util.ArrayList arrayList = f341279b;
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
            str = a17 instanceof android.text.Spanned ? lx1.c.a((android.text.Spanned) a17) : a17.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EditorClipboardManager", "get clipboard data error : ", e17);
            str = "";
        }
        return str.equals(f341278a) ? 3 : 2;
    }

    public static boolean d(android.content.Context context) {
        return com.tencent.mm.sdk.platformtools.b0.b(context).length() >= 16384 || com.tencent.mm.plugin.component.editor.u1.h(com.tencent.mm.sdk.platformtools.b0.b(context).toString()) >= 16384;
    }

    public static void e(android.content.Context context, java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = f341279b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        f341279b = arrayList;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = f341279b;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ix1.a aVar = (ix1.a) it.next();
                kk.j jVar = com.tencent.mm.plugin.component.editor.u1.f96637a;
                java.lang.String str = aVar == null ? "" : aVar.b() == 2 ? ((ix1.j) aVar).f295322s : ((ix1.d) aVar).f295329r;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    hashSet.add(str);
                }
                java.lang.String i17 = com.tencent.mm.plugin.component.editor.u1.i(aVar);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                    hashSet.add(i17);
                }
            }
        }
        o72.p5.f343441b = hashSet;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (f341279b != null) {
            for (int i18 = 0; i18 < f341279b.size(); i18++) {
                if (i18 != f341279b.size() - 1) {
                    sb6.append(com.tencent.mm.plugin.component.editor.u1.b(context, (ix1.a) f341279b.get(i18)));
                    sb6.append("<br/>");
                } else {
                    sb6.append(com.tencent.mm.plugin.component.editor.u1.b(context, (ix1.a) f341279b.get(i18)));
                }
            }
        }
        java.lang.String sb7 = sb6.toString();
        kk.j jVar2 = com.tencent.mm.plugin.component.editor.u1.f96637a;
        java.lang.String replaceAll = java.util.regex.Pattern.compile("wa-b>", 2).matcher(java.util.regex.Pattern.compile("<[/]?w(x|n)-[^>]*>", 2).matcher(java.util.regex.Pattern.compile("</wn-todo>", 2).matcher(java.util.regex.Pattern.compile("</wx-li>", 2).matcher(java.util.regex.Pattern.compile("wx-b>", 2).matcher(sb7).replaceAll("wa-b>")).replaceAll("<br/>")).replaceAll("<br/>")).replaceAll("")).replaceAll("wx-b>");
        f341278a = replaceAll;
        com.tencent.mm.sdk.platformtools.b0.e(lx1.a.a(replaceAll));
    }
}
