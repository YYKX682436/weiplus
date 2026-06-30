package u8;

/* loaded from: classes15.dex */
public final class o implements q8.e, q8.m {

    /* renamed from: p, reason: collision with root package name */
    public static final int f425334p = t9.d0.f("qt  ");

    /* renamed from: e, reason: collision with root package name */
    public int f425339e;

    /* renamed from: f, reason: collision with root package name */
    public int f425340f;

    /* renamed from: g, reason: collision with root package name */
    public long f425341g;

    /* renamed from: h, reason: collision with root package name */
    public int f425342h;

    /* renamed from: i, reason: collision with root package name */
    public t9.p f425343i;

    /* renamed from: j, reason: collision with root package name */
    public int f425344j;

    /* renamed from: k, reason: collision with root package name */
    public int f425345k;

    /* renamed from: l, reason: collision with root package name */
    public q8.g f425346l;

    /* renamed from: m, reason: collision with root package name */
    public u8.n[] f425347m;

    /* renamed from: n, reason: collision with root package name */
    public long f425348n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f425349o;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f425337c = new t9.p(16);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Stack f425338d = new java.util.Stack();

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f425335a = new t9.p(t9.n.f416532a);

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f425336b = new t9.p(4);

    public o(int i17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0006 A[SYNTHETIC] */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(q8.f r25, q8.k r26) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.o.a(q8.f, q8.k):int");
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f425346l = gVar;
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        int i17;
        u8.n[] nVarArr = this.f425347m;
        long j18 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        for (u8.n nVar : nVarArr) {
            u8.t tVar = nVar.f425331b;
            int c17 = t9.d0.c(tVar.f425388e, j17, true, false);
            while (true) {
                i17 = -1;
                if (c17 < 0) {
                    c17 = -1;
                    break;
                }
                if ((tVar.f425389f[c17] & 1) != 0) {
                    break;
                }
                c17--;
            }
            if (c17 == -1) {
                long[] jArr = tVar.f425388e;
                int b17 = t9.d0.b(jArr, j17, true, false);
                while (true) {
                    if (b17 >= jArr.length) {
                        break;
                    }
                    if ((tVar.f425389f[b17] & 1) != 0) {
                        i17 = b17;
                        break;
                    }
                    b17++;
                }
                c17 = i17;
            }
            long j19 = tVar.f425385b[c17];
            if (j19 < j18) {
                j18 = j19;
            }
        }
        return j18;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        return u8.p.a(fVar, false);
    }

    @Override // q8.m
    public long g() {
        return this.f425348n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:454:0x09bd, code lost:
    
        if (r0.f425339e == 2) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x09bf, code lost:
    
        r73.f425339e = 0;
        r73.f425342h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x09c9, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[Catch: all -> 0x0267, TryCatch #0 {all -> 0x0267, blocks: (B:34:0x00a0, B:36:0x00a5, B:38:0x00b0, B:40:0x00bb, B:42:0x00c0, B:44:0x00c8, B:55:0x00cf, B:57:0x00d3, B:58:0x00db, B:60:0x00df, B:61:0x00e7, B:63:0x00eb, B:64:0x00f5, B:66:0x00f9, B:67:0x0102, B:69:0x0106, B:71:0x0112, B:76:0x012b, B:81:0x013f, B:83:0x0143, B:84:0x014b, B:86:0x014f, B:87:0x0157, B:89:0x015b, B:90:0x0163, B:92:0x0167, B:93:0x016f, B:95:0x0173, B:96:0x017b, B:98:0x017f, B:99:0x0187, B:101:0x018b, B:102:0x0194, B:104:0x0198, B:105:0x01a2, B:107:0x01a6, B:108:0x01ae, B:110:0x01b2, B:111:0x01ba, B:113:0x01be, B:114:0x024b, B:120:0x01c4, B:122:0x01ca, B:124:0x01d6, B:125:0x01e8, B:126:0x01ed, B:128:0x01f1, B:131:0x01f7, B:133:0x01fb, B:136:0x0200, B:138:0x0204, B:139:0x020b, B:141:0x020f, B:142:0x0216, B:144:0x021a, B:145:0x0221, B:147:0x0225, B:148:0x022c, B:150:0x0230, B:151:0x0237, B:153:0x023b, B:154:0x0240, B:156:0x0244, B:157:0x0250, B:158:0x0257), top: B:33:0x00a0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r74) {
        /*
            Method dump skipped, instructions count: 2506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.o.h(long):void");
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        int i17;
        this.f425338d.clear();
        this.f425342h = 0;
        this.f425344j = 0;
        this.f425345k = 0;
        if (j17 == 0) {
            this.f425339e = 0;
            this.f425342h = 0;
            return;
        }
        u8.n[] nVarArr = this.f425347m;
        if (nVarArr != null) {
            for (u8.n nVar : nVarArr) {
                u8.t tVar = nVar.f425331b;
                int c17 = t9.d0.c(tVar.f425388e, j18, true, false);
                while (true) {
                    i17 = -1;
                    if (c17 < 0) {
                        c17 = -1;
                        break;
                    } else if ((tVar.f425389f[c17] & 1) != 0) {
                        break;
                    } else {
                        c17--;
                    }
                }
                if (c17 == -1) {
                    long[] jArr = tVar.f425388e;
                    int b17 = t9.d0.b(jArr, j18, true, false);
                    while (true) {
                        if (b17 >= jArr.length) {
                            break;
                        }
                        if ((tVar.f425389f[b17] & 1) != 0) {
                            i17 = b17;
                            break;
                        }
                        b17++;
                    }
                    c17 = i17;
                }
                nVar.f425333d = c17;
            }
        }
    }
}
