package t00;

/* loaded from: classes9.dex */
public final class m1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414343x;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    @Override // t00.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r5, android.content.Context r6, org.json.JSONObject r7, c00.n3 r8, org.json.JSONObject r9) {
        /*
            r4 = this;
            java.lang.String r5 = "data"
            kotlin.jvm.internal.o.g(r7, r5)
            java.lang.String r5 = "callback"
            kotlin.jvm.internal.o.g(r8, r5)
            java.lang.String r5 = "stringList"
            org.json.JSONArray r5 = r7.optJSONArray(r5)
            r6 = 0
            r9 = 0
            if (r5 == 0) goto L26
            int r0 = r5.length()
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = r9
        L1b:
            if (r2 >= r0) goto L27
            java.lang.String r3 = r5.getString(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L1b
        L26:
            r1 = r6
        L27:
            java.lang.String r5 = "sentenceList"
            org.json.JSONArray r5 = r7.optJSONArray(r5)
            if (r5 == 0) goto L42
            int r6 = r5.length()
            java.lang.String[] r7 = new java.lang.String[r6]
            r0 = r9
        L36:
            if (r0 >= r6) goto L41
            java.lang.String r2 = r5.getString(r0)
            r7[r0] = r2
            int r0 = r0 + 1
            goto L36
        L41:
            r6 = r7
        L42:
            int r5 = y02.u0.f458632d
            com.tencent.unit_rc.BaseObjectDef r5 = urgen.ur_E2DE.UR_A8F4.UR_1332()
            y02.s0 r5 = (y02.s0) r5
            if (r5 != 0) goto L4d
            return
        L4d:
            r7 = 1
            if (r1 == 0) goto L70
            int r0 = r1.length
            if (r0 != 0) goto L55
            r0 = r7
            goto L56
        L55:
            r0 = r9
        L56:
            r0 = r0 ^ r7
            if (r0 == 0) goto L70
            r6 = r5
            y02.u0 r6 = (y02.u0) r6
            long r2 = r6.getCppPointer()
            byte[] r6 = urgen.ur_E2DE.UR_A8F4.UR_E8DC(r2, r1)
            bw5.j6 r0 = new bw5.j6
            r0.<init>()
            com.tencent.mm.protobuf.f r6 = y02.k.c(r6, r0)
            bw5.j6 r6 = (bw5.j6) r6
            goto L91
        L70:
            if (r6 == 0) goto Ld7
            int r0 = r6.length
            if (r0 != 0) goto L77
            r0 = r7
            goto L78
        L77:
            r0 = r9
        L78:
            r0 = r0 ^ r7
            if (r0 == 0) goto Ld7
            r0 = r5
            y02.u0 r0 = (y02.u0) r0
            long r0 = r0.getCppPointer()
            byte[] r6 = urgen.ur_E2DE.UR_A8F4.UR_4588(r0, r6)
            bw5.j6 r0 = new bw5.j6
            r0.<init>()
            com.tencent.mm.protobuf.f r6 = y02.k.c(r6, r0)
            bw5.j6 r6 = (bw5.j6) r6
        L91:
            y02.u0 r5 = (y02.u0) r5
            byte[] r6 = r6.toByteArray()
            long r0 = r5.getCppPointer()
            kotlin.jvm.internal.o.d(r6)
            byte[] r6 = urgen.ur_E2DE.UR_A8F4.UR_5C65(r0, r6)
            bw5.k6 r0 = new bw5.k6
            r0.<init>()
            com.tencent.mm.protobuf.f r6 = y02.k.c(r6, r0)
            bw5.k6 r6 = (bw5.k6) r6
            byte[] r6 = r6.toByteArray()
            long r0 = r5.getCppPointer()
            kotlin.jvm.internal.o.d(r6)
            java.lang.String r5 = urgen.ur_E2DE.UR_A8F4.UR_0158(r0, r6)
            int r6 = r5.length()
            if (r6 != 0) goto Lc3
            r9 = r7
        Lc3:
            if (r9 == 0) goto Lc9
            r8.a()
            goto Ld6
        Lc9:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "result"
            r6.put(r7, r5)
            r8.b(r6)
        Ld6:
            return
        Ld7:
            r8.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.m1.c(int, android.content.Context, org.json.JSONObject, c00.n3, org.json.JSONObject):void");
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
