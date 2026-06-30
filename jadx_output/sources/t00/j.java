package t00;

/* loaded from: classes9.dex */
public final class j implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414333n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r7.length == 0) != false) goto L15;
     */
    @Override // t00.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r3, android.content.Context r4, org.json.JSONObject r5, c00.n3 r6, org.json.JSONObject r7) {
        /*
            r2 = this;
            java.lang.String r3 = "data"
            kotlin.jvm.internal.o.g(r5, r3)
            java.lang.String r3 = "callback"
            kotlin.jvm.internal.o.g(r6, r3)
            java.lang.String r3 = "stringList"
            org.json.JSONArray r3 = r5.optJSONArray(r3)
            r4 = 0
            if (r3 == 0) goto L25
            int r5 = r3.length()
            java.lang.String[] r7 = new java.lang.String[r5]
            r0 = r4
        L1a:
            if (r0 >= r5) goto L26
            java.lang.String r1 = r3.getString(r0)
            r7[r0] = r1
            int r0 = r0 + 1
            goto L1a
        L25:
            r7 = 0
        L26:
            r3 = 1
            if (r7 == 0) goto L31
            int r5 = r7.length
            if (r5 != 0) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r4
        L2f:
            if (r5 == 0) goto L32
        L31:
            r4 = r3
        L32:
            if (r4 == 0) goto L38
            r6.a()
            return
        L38:
            int r4 = y02.c.f458597d
            com.tencent.unit_rc.BaseObjectDef r4 = urgen.ur_E2DE.UR_C62C.UR_1332()
            y02.a r4 = (y02.a) r4
            if (r4 == 0) goto L5e
            y02.t1[] r5 = y02.t1.f458631d
            t00.i r5 = new t00.i
            r5.<init>(r7, r6)
            y02.c r4 = (y02.c) r4
            java.lang.String r6 = "jsonStrList"
            kotlin.jvm.internal.o.g(r7, r6)
            y02.o1 r6 = new y02.o1
            r6.<init>()
            r6.f458622h = r5
            long r4 = r4.getCppPointer()
            urgen.ur_E2DE.UR_C62C.UR_B8C5(r4, r7, r3, r6)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.j.c(int, android.content.Context, org.json.JSONObject, c00.n3, org.json.JSONObject):void");
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
