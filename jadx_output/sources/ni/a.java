package ni;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ni.a f337169a = new ni.a();

    public oi.e a(oi.d dVar, long j17, int i17) {
        ni.b bVar = ni.b.f337170d;
        bVar.getClass();
        int ordinal = dVar.ordinal();
        boolean z17 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return bVar.a(bVar.f337172b, j17, i17);
            }
            if (ordinal != 3) {
                return null;
            }
            return (oi.e) ((java.util.HashMap) bVar.f337173c).get(java.lang.Long.valueOf(j17));
        }
        if (i17 != 34069 && i17 != 34070 && i17 != 34071 && i17 != 34072 && i17 != 34073 && i17 != 34074) {
            z17 = false;
        }
        if (z17) {
            i17 = 34067;
        }
        return bVar.a(bVar.f337171a, j17, i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r10 != 34067) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0074, code lost:
    
        if (r5 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x007e, code lost:
    
        if (r10 == 36161) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(oi.d r9, int r10, long r11, oi.e r13) {
        /*
            r8 = this;
            ni.b r0 = ni.b.f337170d
            r0.getClass()
            oi.d r6 = oi.d.TEXTURE
            oi.d r7 = oi.d.BUFFER
            r1 = 1
            r2 = 0
            if (r9 != r6) goto L22
            r3 = 3553(0xde1, float:4.979E-42)
            if (r10 == r3) goto L80
            r3 = 32879(0x806f, float:4.6073E-41)
            if (r10 == r3) goto L80
            r3 = 35866(0x8c1a, float:5.0259E-41)
            if (r10 == r3) goto L80
            r3 = 34067(0x8513, float:4.7738E-41)
            if (r10 != r3) goto L81
            goto L80
        L22:
            if (r9 != r7) goto L77
            r3 = 34962(0x8892, float:4.8992E-41)
            if (r10 == r3) goto L4f
            r3 = 36662(0x8f36, float:5.1374E-41)
            if (r10 == r3) goto L4f
            r3 = 36663(0x8f37, float:5.1376E-41)
            if (r10 == r3) goto L4f
            r3 = 34963(0x8893, float:4.8994E-41)
            if (r10 == r3) goto L4f
            r3 = 35051(0x88eb, float:4.9117E-41)
            if (r10 == r3) goto L4f
            r3 = 35052(0x88ec, float:4.9118E-41)
            if (r10 == r3) goto L4f
            r3 = 35982(0x8c8e, float:5.0422E-41)
            if (r10 == r3) goto L4f
            r3 = 35345(0x8a11, float:4.9529E-41)
            if (r10 != r3) goto L4d
            goto L4f
        L4d:
            r3 = r2
            goto L50
        L4f:
            r3 = r1
        L50:
            r4 = 37568(0x92c0, float:5.2644E-41)
            if (r10 == r4) goto L67
            r4 = 37102(0x90ee, float:5.1991E-41)
            if (r10 == r4) goto L67
            r4 = 36671(0x8f3f, float:5.1387E-41)
            if (r10 == r4) goto L67
            r4 = 37074(0x90d2, float:5.1952E-41)
            if (r10 != r4) goto L65
            goto L67
        L65:
            r4 = r2
            goto L68
        L67:
            r4 = r1
        L68:
            r5 = 35882(0x8c2a, float:5.0281E-41)
            if (r10 != r5) goto L6f
            r5 = r1
            goto L70
        L6f:
            r5 = r2
        L70:
            if (r3 != 0) goto L80
            if (r4 != 0) goto L80
            if (r5 == 0) goto L81
            goto L80
        L77:
            oi.d r3 = oi.d.RENDER_BUFFERS
            if (r9 != r3) goto L81
            r3 = 36161(0x8d41, float:5.0672E-41)
            if (r10 != r3) goto L81
        L80:
            r2 = r1
        L81:
            if (r2 != 0) goto L84
            goto Lae
        L84:
            int r9 = r9.ordinal()
            if (r9 == 0) goto La6
            if (r9 == r1) goto L9c
            r10 = 3
            if (r9 == r10) goto L90
            goto Lae
        L90:
            java.util.Map r9 = r0.f337173c
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.put(r10, r13)
            goto Lae
        L9c:
            java.util.Map r1 = r0.f337172b
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r7
            r0.b(r1, r2, r3, r5, r6)
            goto Lae
        La6:
            java.util.Map r1 = r0.f337171a
            r2 = r10
            r3 = r11
            r5 = r13
            r0.b(r1, r2, r3, r5, r6)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.a.b(oi.d, int, long, oi.e):void");
    }
}
