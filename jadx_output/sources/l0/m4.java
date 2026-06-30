package l0;

/* loaded from: classes14.dex */
public abstract class m4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f314380a = 20;

    /* renamed from: b, reason: collision with root package name */
    public static final float f314381b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static final float f314382c = 4;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b3, code lost:
    
        if (r7.e(r85) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r72, yz5.l r73, z0.t r74, boolean r75, boolean r76, a2.o1 r77, yz5.p r78, yz5.p r79, yz5.p r80, yz5.p r81, boolean r82, g2.t0 r83, j0.j2 r84, j0.i2 r85, boolean r86, int r87, c0.o r88, e1.a1 r89, l0.m3 r90, n0.o r91, int r92, int r93, int r94) {
        /*
            Method dump skipped, instructions count: 1503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.m4.a(java.lang.String, yz5.l, z0.t, boolean, boolean, a2.o1, yz5.p, yz5.p, yz5.p, yz5.p, boolean, g2.t0, j0.j2, j0.i2, boolean, int, c0.o, e1.a1, l0.m3, n0.o, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0101, code lost:
    
        if (r14 == n0.n.f333620a) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(z0.t r32, yz5.p r33, yz5.p r34, yz5.q r35, yz5.p r36, yz5.p r37, boolean r38, float r39, d0.d2 r40, n0.o r41, int r42) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.m4.b(z0.t, yz5.p, yz5.p, yz5.q, yz5.p, yz5.p, boolean, float, d0.d2, n0.o, int):void");
    }

    public static final int c(int i17, boolean z17, int i18, int i19, int i27, int i28, long j17, float f17, d0.d2 d2Var) {
        float f18 = f314382c * f17;
        d0.e2 e2Var = (d0.e2) d2Var;
        float f19 = e2Var.f225109b * f17;
        float f27 = e2Var.f225111d * f17;
        int max = java.lang.Math.max(i17, i28);
        return java.lang.Math.max(a06.d.b(z17 ? i18 + f18 + max + f27 : f19 + max + f27), java.lang.Math.max(java.lang.Math.max(i19, i27), p2.c.i(j17)));
    }
}
