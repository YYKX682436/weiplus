package ra3;

/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ra3.b0 f393489a = new ra3.b0();

    public static final void a(ra3.b0 b0Var, java.util.List list, java.util.List list2) {
        b0Var.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                ra3.s sVar = (ra3.s) it6.next();
                ut.s0 s0Var = new ut.s0(str, sVar.f393529a);
                java.lang.String str2 = sVar.f393530b;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                s0Var.f430719c = str2;
                kotlinx.coroutines.flow.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new ra3.y(tj6, null), 1, null);
                }
            }
        }
    }

    public static final void b(ra3.b0 b0Var, java.util.List list, java.util.List list2) {
        b0Var.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                ra3.u uVar = (ra3.u) it6.next();
                ut.s0 s0Var = new ut.s0(str, null, 2, null);
                java.lang.String str2 = uVar.f393534c;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                s0Var.f430719c = str2;
                s0Var.f430727k = new c01.g7(uVar.f393532a, uVar.f393533b, uVar.f393534c, uVar.f393535d, uVar.f393536e, uVar.f393537f);
                kotlinx.coroutines.flow.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new ra3.a0(tj6, null), 1, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r6, java.lang.String r7, long r8, org.json.JSONArray r10) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "fileList"
            kotlin.jvm.internal.o.g(r10, r0)
            int r0 = r10.length()
            r1 = 1
            if (r0 >= r1) goto L17
            return
        L17:
            ra3.w r0 = new ra3.w
            r0.<init>(r8, r7)
            ra3.v r7 = new ra3.v
            r7.<init>(r10, r6, r0)
            int r8 = r10.length()
            java.lang.String r9 = "filePath"
            r2 = 0
            if (r8 != r1) goto L3d
            org.json.JSONObject r8 = r10.optJSONObject(r2)
            if (r8 == 0) goto L38
            boolean r8 = r8.has(r9)
            if (r8 != r1) goto L38
            r8 = r1
            goto L39
        L38:
            r8 = r2
        L39:
            if (r8 == 0) goto L3d
            r8 = r1
            goto L3e
        L3d:
            r8 = r2
        L3e:
            if (r8 != 0) goto L5f
            ld5.b r9 = new ld5.b
            r9.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            int r10 = r10.length()
            r1 = r2
        L4f:
            if (r1 >= r10) goto L5b
            java.lang.String r3 = java.lang.String.valueOf(r1)
            r0.add(r3)
            int r1 = r1 + 1
            goto L4f
        L5b:
            r9.p(r0)
            goto Lae
        L5f:
            ec5.a r3 = new ec5.a
            r3.<init>()
            org.json.JSONObject r10 = r10.optJSONObject(r2)
            r4 = 0
            if (r10 == 0) goto L70
            java.lang.String r9 = r10.optString(r9)
            goto L71
        L70:
            r9 = r4
        L71:
            if (r10 == 0) goto L79
            java.lang.String r4 = "fileName"
            java.lang.String r4 = r10.optString(r4)
        L79:
            if (r9 == 0) goto L84
            int r10 = r9.length()
            if (r10 != 0) goto L82
            goto L84
        L82:
            r10 = r2
            goto L85
        L84:
            r10 = r1
        L85:
            if (r10 != 0) goto Lad
            java.lang.Object r9 = r0.invoke(r9)
            java.lang.String r9 = (java.lang.String) r9
            r3.l(r9)
            if (r4 == 0) goto L9a
            int r10 = r4.length()
            if (r10 != 0) goto L99
            goto L9a
        L99:
            r1 = r2
        L9a:
            if (r1 != 0) goto Lad
            java.lang.String r10 = com.tencent.mm.vfs.w6.n(r4)
            long r0 = com.tencent.mm.vfs.w6.k(r9)
            n13.v r9 = n13.v.f334140a
            l15.c r9 = r9.b(r4, r10, r0)
            r3.k(r9)
        Lad:
            r9 = r3
        Lae:
            n13.r r10 = new n13.r
            r10.<init>()
            if (r8 != 0) goto Lbb
            r10.f334122f = r2
            r10.f334123g = r2
            r10.f334124h = r2
        Lbb:
            r10.f334117a = r2
            r8 = 1001(0x3e9, float:1.403E-42)
            r10.f334118b = r8
            r10.f334119c = r7
            java.lang.Class<n13.b0> r7 = n13.b0.class
            i95.m r7 = i95.n0.c(r7)
            n13.b0 r7 = (n13.b0) r7
            dk5.b0 r7 = (dk5.b0) r7
            r7.Bi(r6, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ra3.b0.c(android.content.Context, java.lang.String, long, org.json.JSONArray):void");
    }
}
