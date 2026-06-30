package p05;

/* loaded from: classes14.dex */
public final class l4 implements rh0.d0, rh0.e0 {
    public static final p05.z3 R;
    public static final java.lang.String[] S;
    public static final java.lang.String[] T;
    public final int[] A;
    public final long[] B;
    public final int[] C;
    public rh0.b0 D;
    public boolean E;
    public final com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct F;
    public final p05.p4 G;
    public boolean H;
    public final java.util.LinkedList I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.Map f350587J;
    public final java.util.Map K;
    public final java.util.Map L;
    public int M;
    public int N;
    public int O;
    public int P;
    public os0.c Q;

    /* renamed from: a, reason: collision with root package name */
    public final int f350588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f350589b;

    /* renamed from: c, reason: collision with root package name */
    public final rh0.z f350590c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f350591d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f350592e;

    /* renamed from: f, reason: collision with root package name */
    public long f350593f;

    /* renamed from: g, reason: collision with root package name */
    public int f350594g;

    /* renamed from: h, reason: collision with root package name */
    public int f350595h;

    /* renamed from: i, reason: collision with root package name */
    public int f350596i;

    /* renamed from: j, reason: collision with root package name */
    public long f350597j;

    /* renamed from: k, reason: collision with root package name */
    public long f350598k;

    /* renamed from: l, reason: collision with root package name */
    public long f350599l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f350600m;

    /* renamed from: n, reason: collision with root package name */
    public long f350601n;

    /* renamed from: o, reason: collision with root package name */
    public int f350602o;

    /* renamed from: p, reason: collision with root package name */
    public long f350603p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f350604q;

    /* renamed from: r, reason: collision with root package name */
    public final os0.a f350605r;

    /* renamed from: s, reason: collision with root package name */
    public int f350606s;

    /* renamed from: t, reason: collision with root package name */
    public final is0.a f350607t;

    /* renamed from: u, reason: collision with root package name */
    public int f350608u;

    /* renamed from: v, reason: collision with root package name */
    public int f350609v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f350610w;

    /* renamed from: x, reason: collision with root package name */
    public int f350611x;

    /* renamed from: y, reason: collision with root package name */
    public long f350612y;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f350613z;

    static {
        p05.z3 z3Var = new p05.z3(null);
        R = z3Var;
        S = new java.lang.String[]{"/Slimer/natureslim", "/smallhead/smallhead", "/shouquangu/shouquangu", "/shouxiagu/shouxiagu", "/shoubiyi/shoubiyi", "/chin/chin", "/chin/chin1", "/hairline/hairline", "/hairline/hairline1", "/bigeye/bigeye", "/Slimer/boyslim", "/Slimer/girlslim", "/zhailian/zhailian1"};
        T = new java.lang.String[]{"/contour"};
        boolean z17 = p05.e5.f350510a;
        boolean z18 = tq5.k.f421272a;
        tq5.k.f421273b = p05.c5.f350476d;
        z3Var.b();
        com.tencent.mm.xeffect.WeVisReportWrapper.INSTANCE.setImpl(new p05.y3());
    }

    public l4(int i17) {
        this(i17, false, false, false, false, false, null, null, false, ac1.g.CTRL_INDEX, null);
    }

    public static int y(p05.l4 l4Var, is0.c cVar, is0.c cVar2, long j17, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        long j18 = (i18 & 4) != 0 ? 0L : j17;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        boolean z19 = (i18 & 16) != 0 ? false : z17;
        boolean z27 = (i18 & 32) != 0 ? true : z18;
        l4Var.getClass();
        if (cVar == null || cVar2 == null) {
            return -1;
        }
        return rh0.d0.c(l4Var, cVar.f294395e, cVar2.f294395e, j18, i19, z19, z27, false, 64, null);
    }

    public void A(int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "setBeautyConfig: skinSmooth " + i17 + ", eyeMorph " + i18 + ", faceMorph " + i19 + ", skinBright " + i27 + ", eyeBright " + i28);
        if (i17 < 0) {
            p05.q4 q4Var = p05.q4.f350661a;
            i17 = p05.q4.f350662b;
        }
        int[] iArr = this.f350604q;
        iArr[0] = i17;
        if (i18 < 0) {
            p05.q4 q4Var2 = p05.q4.f350661a;
            i18 = p05.q4.f350663c;
        }
        iArr[1] = i18;
        if (i19 < 0) {
            p05.q4 q4Var3 = p05.q4.f350661a;
            i19 = p05.q4.f350664d;
        }
        iArr[2] = i19;
        if (i27 < 0) {
            p05.q4 q4Var4 = p05.q4.f350661a;
            i27 = p05.q4.f350665e;
        }
        iArr[3] = i27;
        if (i28 < 0) {
            p05.q4 q4Var5 = p05.q4.f350661a;
            i28 = p05.q4.f350666f;
        }
        iArr[4] = i28;
    }

    public void B(boolean z17, int i17) {
        if (!z17) {
            h(null, 1.0f);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p05.a3 a3Var = p05.a3.f350439a;
        sb6.append(p05.a3.f350441c);
        sb6.append("/LutFilters/DefaultLut");
        h(sb6.toString(), i17 / 100.0f);
    }

    public void C(boolean z17) {
        if (!z17) {
            D(0, 0);
            D(1, 0);
            D(2, 0);
            D(3, 0);
            D(4, 0);
            return;
        }
        int[] iArr = this.f350604q;
        D(0, iArr[0]);
        D(1, iArr[1]);
        D(2, iArr[2]);
        D(3, iArr[3]);
        D(4, iArr[4]);
        p05.q4 q4Var = p05.q4.f350661a;
        p05.q4.f350669i = new p05.b4(this);
    }

    public void D(int i17, int i18) {
        if (this.f350593f == 0) {
            return;
        }
        if (i17 != 5) {
            if (i17 != 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "setEffectLevel: " + i17 + ", " + i18);
                com.tencent.mm.xeffect.WeEffectRender.nSetEffectLevel(this.f350593f, i17, ((float) i18) / 100.0f, this.f350590c.f395621d);
            } else {
                L(rh0.c0.f395583d, i18);
            }
        } else if (this.f350602o != i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "setRosy: " + i18);
            long j17 = this.f350601n;
            if (j17 > 0 && i18 <= 0) {
                com.tencent.mm.xeffect.WeEffectRender.nRemoveFilter(this.f350593f, j17);
                this.f350601n = 0L;
            }
            if (this.f350601n <= 0 && i18 > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                p05.a3 a3Var = p05.a3.f350439a;
                sb6.append(p05.a3.f350441c);
                sb6.append("/LutFilters/WechatRosy/");
                this.f350601n = com.tencent.mm.xeffect.WeEffectRender.nCreateFilterWithConfig(this.f350593f, sb6.toString());
            }
            long j18 = this.f350601n;
            if (j18 > 0 && i18 > 0) {
                com.tencent.mm.xeffect.WeEffectRender.nSetFilterColorWeight(this.f350593f, j18, i18 / 100.0f);
            }
            this.f350602o = i18;
        }
        s(i17, i18 > 0);
    }

    public void E(com.tencent.mm.xeffect.IWeJsonMessageCallback iWeJsonMessageCallback) {
        long j17 = this.f350593f;
        if (j17 == 0) {
            return;
        }
        com.tencent.mm.xeffect.WeEffectRender.b(j17, iWeJsonMessageCallback);
    }

    public void F(com.tencent.mm.plugin.xlabeffect.XEffectConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        boolean z17 = false;
        D(0, config.f188599g);
        D(1, config.f188600h);
        D(8, config.f188601i);
        D(3, config.f188602m);
        D(4, config.f188603n);
        D(5, config.f188604o);
        int i17 = config.E;
        long j17 = this.f350593f;
        if (j17 != 0) {
            com.tencent.mm.xeffect.WeEffectRender.nSetMouthMorph(j17, i17 / 100.0f);
        }
        int i18 = config.f188605p;
        int i19 = config.f188606q;
        long j18 = this.f350593f;
        if (j18 != 0) {
            com.tencent.mm.xeffect.WeEffectRender.nSetBeautyDeFaceWrinkle(j18, i18 / 100.0f, i19 / 100.0f);
        }
        int i27 = config.f188607r;
        long j19 = this.f350593f;
        if (j19 != 0) {
            com.tencent.mm.xeffect.WeEffectRender.nSetBeautySharpenFilter(j19, i27 / 100.0f);
        }
        int i28 = config.f188608s;
        long j27 = this.f350593f;
        if (j27 != 0) {
            com.tencent.mm.xeffect.WeEffectRender.nSetTeethBright(j27, i28 / 100.0f);
        }
        L(rh0.c0.f395584e, config.f188609t);
        L(rh0.c0.f395585f, config.f188610u);
        L(rh0.c0.f395586g, config.f188611v);
        L(rh0.c0.f395587h, config.f188612w);
        L(rh0.c0.f395588i, config.f188613x);
        L(rh0.c0.f395589m, config.f188614y);
        L(rh0.c0.f395590n, config.f188615z);
        L(rh0.c0.f395591o, config.A);
        L(rh0.c0.f395592p, config.B);
        L(rh0.c0.f395593q, config.C);
        L(rh0.c0.f395594r, config.D);
        L(rh0.c0.f395595s, config.F);
        rh0.a0[] a0VarArr = rh0.a0.f395578d;
        int i29 = config.G;
        long j28 = this.f350593f;
        if (j28 != 0) {
            long[] jArr = this.B;
            long j29 = jArr[0];
            if (j29 >= 0 || i29 > 0) {
                float f17 = i29 / 100.0f;
                int[] iArr = this.C;
                if (i29 > 0) {
                    if (j29 < 0) {
                        jArr[0] = com.tencent.mm.xeffect.WeEffectRender.nCreateSticker(this.f350593f, 0, p05.a3.f350445g + T[0]);
                    }
                    if (iArr[0] != i29) {
                        com.tencent.mm.xeffect.WeEffectRender.nSetMakeUpAlpha(this.f350593f, jArr[0], f17);
                    }
                } else if (j29 >= 0) {
                    com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(j28, j29);
                    jArr[0] = -1;
                }
                iArr[0] = i29;
                int length = jArr.length;
                int i37 = 0;
                while (true) {
                    if (i37 >= length) {
                        break;
                    }
                    if (jArr[i37] >= 0) {
                        z17 = true;
                        break;
                    }
                    i37++;
                }
                if (z17) {
                    this.f350596i = this.f350596i | 128 | 2048;
                }
            }
        }
        if (config.f188608s > 40 || config.G > 40 || config.f188605p > 40 || config.f188606q > 40) {
            this.f350596i |= 32768;
        } else {
            this.f350596i &= -32769;
        }
    }

    public void G(long j17, java.lang.String message, int i17) {
        kotlin.jvm.internal.o.g(message, "message");
        long j18 = this.f350593f;
        if (j18 == 0) {
            return;
        }
        com.tencent.mm.xeffect.WeEffectRender.nReceiveJsonMessage(j18, j17, message, message.length(), i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (((r4.f350611x & 1024) != 0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 1
            if (r5 == 0) goto L10
            int r3 = r4.f350611x
            r3 = r3 & r1
            if (r3 == 0) goto Ld
            r3 = r2
            goto Le
        Ld:
            r3 = r0
        Le:
            if (r3 == 0) goto L1a
        L10:
            if (r5 != 0) goto L22
            int r3 = r4.f350611x
            r1 = r1 & r3
            if (r1 == 0) goto L18
            r0 = r2
        L18:
            if (r0 == 0) goto L22
        L1a:
            r0 = 10
            r4.s(r0, r5)
            r4.M()
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l4.H(boolean):void");
    }

    public void I(boolean z17, float f17, rh0.b0 mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        long j17 = this.f350593f;
        if (j17 == 0) {
            return;
        }
        if (z17 == this.E && mode == this.D) {
            return;
        }
        this.E = z17;
        this.D = mode;
        com.tencent.mm.xeffect.WeEffectRender.nSetSegmentBgBlur(j17, z17, f17, mode.ordinal());
    }

    public void J(int i17, int i18) {
        if (this.f350595h == i17 && this.f350594g == i18) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "setSize: " + i17 + ", " + i18);
        this.f350595h = i17;
        this.f350594g = i18;
        this.f350605r.w(i17, i18);
    }

    public void K(boolean z17) {
        if (z17) {
            D(0, this.f350604q[0]);
        } else {
            D(0, 0);
        }
    }

    public void L(rh0.c0 type, int i17) {
        kotlin.jvm.internal.o.g(type, "type");
        if (this.f350593f == 0) {
            return;
        }
        int ordinal = type.ordinal();
        long[] jArr = this.f350613z;
        long j17 = jArr[ordinal];
        if (j17 >= 0 || i17 > 0) {
            float f17 = i17 / 100.0f;
            if (i17 > 0 && j17 < 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                p05.a3 a3Var = p05.a3.f350439a;
                sb6.append(p05.a3.f350445g);
                sb6.append("/slimer_temp");
                sb6.append(S[ordinal]);
                jArr[ordinal] = com.tencent.mm.xeffect.WeEffectRender.nAddFaceAutoSlimer(this.f350593f, sb6.toString());
                com.tencent.mm.xeffect.WeEffectRender.nSetRenderTextureCropSize(this.f350593f, 0.95f);
            }
            int[] iArr = this.A;
            if (iArr[ordinal] != i17) {
                com.tencent.mm.xeffect.WeEffectRender.nSetSlimerRate(this.f350593f, jArr[ordinal], f17);
            }
            iArr[ordinal] = i17;
            int length = jArr.length;
            boolean z17 = false;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                if (jArr[i18] >= 0) {
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (z17) {
                this.f350596i = this.f350596i | 2048 | 4096;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            r10 = this;
            long r0 = r10.f350593f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r10.f350611x
            r1 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 == 0) goto L23
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L1e
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 != 0) goto L23
            r6 = r3
            goto L24
        L23:
            r6 = r2
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setSegment:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.XLabEffect"
            com.tencent.mars.xlog.Log.i(r1, r0)
            long r4 = r10.f350593f
            r7 = 0
            if (r6 == 0) goto L46
            r2 = 4
        L46:
            r8 = r2
            r9 = -1
            com.tencent.mm.xeffect.WeEffectRender.nSetSegment(r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l4.M():void");
    }

    public long d(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        long j17 = this.f350593f;
        if (j17 == 0) {
            return -1L;
        }
        return com.tencent.mm.xeffect.WeEffectRender.nCreateSticker(j17, 0, path);
    }

    public final void e(p05.o4 o4Var, java.util.Map map, yz5.l lVar, yz5.l lVar2, yz5.p pVar) {
        if (this.f350593f == 0) {
            return;
        }
        if (o4Var.f350633a.length() == 0) {
            return;
        }
        java.lang.String str = o4Var.f350633a;
        p05.a4 a4Var = (p05.a4) map.get(str);
        java.lang.String str2 = o4Var.f350636d;
        if (a4Var != null && !kotlin.jvm.internal.o.b(a4Var.f350452a, str2)) {
            lVar2.invoke(java.lang.Long.valueOf(a4Var.f350453b));
            map.remove(str);
        }
        if (str2.length() == 0) {
            return;
        }
        if (map.get(str) == null) {
            long longValue = ((java.lang.Number) lVar.invoke(str2)).longValue();
            if (longValue != -1) {
                map.put(str, new p05.a4(str2, longValue, 0));
            }
        }
        p05.a4 a4Var2 = (p05.a4) map.get(str);
        if (a4Var2 != null) {
            int i17 = a4Var2.f350454c;
            int i18 = o4Var.f350635c;
            if (i17 != i18) {
                pVar.invoke(java.lang.Long.valueOf(a4Var2.f350453b), java.lang.Float.valueOf(i18 / 100.0f));
                a4Var2.f350454c = i18;
            }
        }
    }

    public void f(p05.e2 e2Var) {
        if (e2Var != null) {
            java.util.LinkedList linkedList = this.I;
            if (linkedList.contains(e2Var)) {
                return;
            }
            linkedList.add(e2Var);
        }
    }

    public void g(java.lang.String str, float f17) {
        if (this.f350593f == 0) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.xeffect.WeEffectRender.nRemoveFilter(this.f350593f, this.f350612y);
            com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "changeFilter: remove filter " + this.f350612y);
            s(9, false);
            return;
        }
        long j17 = this.f350593f;
        kotlin.jvm.internal.o.d(str);
        this.f350612y = com.tencent.mm.xeffect.WeEffectRender.nCreateFilter(j17, str, f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "changeFilter: create filter " + this.f350612y);
        s(9, true);
    }

    public void h(java.lang.String str, float f17) {
        if (this.f350593f == 0) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.xeffect.WeEffectRender.nRemoveFilter(this.f350593f, this.f350612y);
            com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "changeFilter: remove filter " + this.f350612y);
            s(9, false);
            return;
        }
        long j17 = this.f350593f;
        kotlin.jvm.internal.o.d(str);
        long nCreateFilterWithConfig = com.tencent.mm.xeffect.WeEffectRender.nCreateFilterWithConfig(j17, str);
        this.f350612y = nCreateFilterWithConfig;
        com.tencent.mm.xeffect.WeEffectRender.nSetFilterColorWeight(this.f350593f, nCreateFilterWithConfig, f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "changeFilter: create filter " + this.f350612y);
        s(9, true);
    }

    public void i(t85.j jVar) {
        long j17 = this.f350593f;
        if (j17 == 0) {
            return;
        }
        com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(j17, this.f350597j);
        com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, this.f350598k);
        com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, this.f350599l);
        java.util.ArrayList arrayList = this.f350600m;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, ((java.lang.Number) it.next()).longValue());
        }
        this.f350597j = 0L;
        this.f350598k = 0L;
        this.f350599l = 0L;
        arrayList.clear();
        boolean z17 = false;
        s(11, false);
        s(12, false);
        s(13, false);
        if (jVar != null && jVar.a()) {
            z17 = true;
        }
        if (z17) {
            t85.f fVar = jVar.f416481h;
            if (fVar != null) {
                this.f350597j = n(fVar);
                s(11, true);
            }
            t85.f fVar2 = jVar.f416482i;
            if (fVar2 != null) {
                this.f350598k = n(fVar2);
                s(12, true);
            }
            t85.f fVar3 = jVar.f416483j;
            if (fVar3 != null) {
                this.f350599l = n(fVar3);
                s(13, true);
            }
            java.util.ArrayList arrayList2 = jVar.f416484k;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Long.valueOf(n((t85.f) it6.next())));
            }
            arrayList.addAll(arrayList3);
        } else {
            this.f350596i &= -51;
        }
        M();
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "change sticker " + this.f350597j + ", " + this.f350599l + ", " + arrayList);
    }

    public final void j() {
        if (this.f350593f == 0) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f350603p < elapsedRealtime) {
            com.tencent.mm.xeffect.WeEffectRender.nUpdateSticker(this.f350593f);
            long j17 = this.f350603p + 83;
            this.f350603p = j17;
            if (j17 < elapsedRealtime) {
                this.f350603p = elapsedRealtime;
            }
        }
    }

    public final int k(int i17) {
        if (i17 == 90) {
            return 1;
        }
        if (i17 != 180) {
            return i17 != 270 ? 0 : 3;
        }
        return 2;
    }

    public final void l(int i17, int i18, boolean z17, int i19, boolean z18) {
        is0.a aVar = this.f350607t;
        if (!z17) {
            android.opengl.GLES20.glBindFramebuffer(36160, aVar != null ? aVar.f294387e : -1);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
            android.opengl.GLES20.glBindTexture(3553, i18);
            android.opengl.GLES20.glCopyTexImage2D(3553, 0, 32856, 0, 0, this.f350595h, this.f350594g, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            return;
        }
        if (this.Q == null) {
            this.Q = new os0.c(this.f350595h, this.f350594g, 0, 0, 2, 0, 44, null);
        }
        os0.c cVar = this.Q;
        if (cVar != null) {
            cVar.H = i17;
        }
        if (z18) {
            if (cVar != null) {
                cVar.s(360 - i19);
            }
        } else if (cVar != null) {
            cVar.s(i19);
        }
        os0.c cVar2 = this.Q;
        if (cVar2 != null) {
            cVar2.f348007p = !z18;
        }
        if (cVar2 != null) {
            cVar2.o();
        }
        android.opengl.GLES20.glBindFramebuffer(36160, aVar != null ? aVar.f294387e : -1);
        os0.c cVar3 = this.Q;
        is0.c cVar4 = cVar3 != null ? cVar3.f348000i : null;
        kotlin.jvm.internal.o.d(cVar4);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, cVar4.f294395e, 0);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glCopyTexImage2D(3553, 0, 32856, 0, 0, this.f350595h, this.f350594g, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public long m(int i17, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        long j17 = this.f350593f;
        if (j17 == 0) {
            return -1L;
        }
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.mm.xeffect.WeEffectRender.nCreateMakeUp(j17, 4, path) : com.tencent.mm.xeffect.WeEffectRender.nCreateMakeUp(j17, 3, path) : com.tencent.mm.xeffect.WeEffectRender.nCreateMakeUp(j17, 2, path) : com.tencent.mm.xeffect.WeEffectRender.nCreateMakeUp(j17, 1, path) : com.tencent.mm.xeffect.WeEffectRender.nCreateMakeUp(j17, 0, path);
    }

    public long n(t85.f sticker) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(sticker, "sticker");
        if (this.f350593f == 0) {
            return -1L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "create sticker: " + sticker.f416468d + ' ' + sticker.f416467c);
        this.f350596i = this.f350596i | 2 | 4;
        java.util.Collection values = sticker.f416470f.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Collection collection = values;
        if (!collection.isEmpty()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                int i17 = ((t85.e) it.next()).f416460b;
                if (10 <= i17 && i17 < 18) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            this.f350596i |= 32;
        }
        java.util.Collection values2 = sticker.f416470f.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        java.util.Collection collection2 = values2;
        if (!collection2.isEmpty()) {
            java.util.Iterator it6 = collection2.iterator();
            while (it6.hasNext()) {
                int i18 = ((t85.e) it6.next()).f416460b;
                if (100 <= i18 && i18 < 200) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (z18) {
            this.f350596i |= 16;
        }
        java.lang.String str = sticker.f416467c;
        switch (str.hashCode()) {
            case -2052467665:
                if (str.equals("Sticker2D")) {
                    return com.tencent.mm.xeffect.WeEffectRender.nCreateSticker(this.f350593f, 0, sticker.f416468d);
                }
                break;
            case -1890090921:
                if (str.equals("StickerFixed")) {
                    return com.tencent.mm.xeffect.WeEffectRender.nCreateSticker(this.f350593f, 2, sticker.f416468d);
                }
                break;
            case -964830573:
                if (str.equals("FaceDeformation")) {
                    return com.tencent.mm.xeffect.WeEffectRender.nCreateSticker(this.f350593f, 3, sticker.f416468d);
                }
                break;
            case -656591085:
                if (str.equals("Segment")) {
                    return com.tencent.mm.xeffect.WeEffectRender.nCreateSticker(this.f350593f, 1, sticker.f416468d);
                }
                break;
        }
        return com.tencent.mm.xeffect.WeEffectRender.nCreateSticker(this.f350593f, 0, sticker.f416468d);
    }

    public void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy: ");
        sb6.append(this.f350593f);
        sb6.append(' ');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", sb6.toString());
        p05.q4 q4Var = p05.q4.f350661a;
        p05.q4.f350669i = null;
        os0.c cVar = this.Q;
        if (cVar != null) {
            cVar.n();
        }
        this.f350605r.n();
        if (this.f350593f != 0) {
            int i17 = 0;
            for (java.lang.Object obj : this.f350587J.entrySet()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, ((p05.a4) ((java.util.Map.Entry) obj).getValue()).f350453b);
                i17 = i18;
            }
            int i19 = 0;
            for (java.lang.Object obj2 : this.K.entrySet()) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.xeffect.WeEffectRender.nRemoveFilter(this.f350593f, ((p05.a4) ((java.util.Map.Entry) obj2).getValue()).f350453b);
                i19 = i27;
            }
            int i28 = 0;
            for (java.lang.Object obj3 : this.L.entrySet()) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, ((p05.a4) ((java.util.Map.Entry) obj3).getValue()).f350453b);
                i28 = i29;
            }
            com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, this.f350597j);
            com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, this.f350598k);
            com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, this.f350599l);
            java.util.Iterator it = this.f350600m.iterator();
            while (it.hasNext()) {
                com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350593f, ((java.lang.Number) it.next()).longValue());
            }
            com.tencent.mm.xeffect.WeEffectRender.b(this.f350593f, null);
            com.tencent.mm.xeffect.WeEffectRender.nDestroy(this.f350593f);
            com.tencent.mm.xeffect.WeEffectCallbackMgr.INSTANCE.clearCallback(this.f350593f);
            this.f350593f = 0L;
        } else {
            is0.a aVar = this.f350607t;
            if (aVar != null) {
                aVar.close();
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wevision_data_report, false)) {
            this.F.k();
        }
    }

    public int p(java.nio.Buffer dataBuffer, int i17, int i18) {
        java.lang.Object obj;
        int i19;
        kotlin.jvm.internal.o.g(dataBuffer, "dataBuffer");
        long j17 = this.f350593f;
        if (j17 == 0) {
            return -1;
        }
        if (!(j17 != 0 ? com.tencent.mm.xeffect.WeEffectRender.nNeedFaceTrack(j17) : false)) {
            this.f350610w = true;
            return 0;
        }
        if (this.f350608u != i17 || this.f350609v != i18) {
            this.f350608u = i17;
            this.f350609v = i18;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        p4Var.f350652h = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedList linkedList = this.I;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((p05.e2) it.next()).a()));
        }
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            java.lang.Object next = it6.next();
            while (it6.hasNext()) {
                next = java.lang.Integer.valueOf(((java.lang.Number) next).intValue() | ((java.lang.Number) it6.next()).intValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = (num != null ? num.intValue() : 0) | this.f350596i;
        rh0.x xVar = (rh0.x) i95.n0.c(rh0.x.class);
        rh0.z zVar = rh0.z.f395613g;
        java.lang.String wi6 = ((p05.v2) xVar).wi(zVar, "FaceMakeUpLevel");
        boolean z18 = !(wi6 == null || wi6.length() == 0) && com.tencent.mm.sdk.platformtools.t8.B1(wi6) == 1.0f;
        rh0.z zVar2 = this.f350590c;
        if ((zVar2 != zVar && zVar2 != rh0.z.f395614h) || !z18) {
            intValue &= -32769;
        }
        int i27 = this.H ? intValue | 64 : intValue & (-65);
        java.lang.System.nanoTime();
        com.tencent.mm.xeffect.WeEffectRender.nSetFocalLength(this.f350593f, i17 * 3.0f);
        java.lang.System.nanoTime();
        java.lang.System.nanoTime();
        int i28 = this.f350606s;
        if (this.f350592e) {
            i27 &= -2;
            i19 = 0;
        } else {
            i19 = i28;
        }
        int nFaceTrackWithAngle = com.tencent.mm.xeffect.WeEffectRender.nFaceTrackWithAngle(this.f350593f, dataBuffer, i17, i18, i27, i19);
        java.lang.System.nanoTime();
        p4Var.f350647c++;
        long j18 = p4Var.f350646b;
        long j19 = p4Var.f350652h;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        p4Var.f350646b = j18 + (android.os.SystemClock.elapsedRealtime() - j19);
        this.f350610w = nFaceTrackWithAngle == 0;
        return nFaceTrackWithAngle;
    }

    public void q(int i17, boolean z17, int i18, boolean z18) {
        long j17 = this.f350593f;
        if (j17 != 0 ? com.tencent.mm.xeffect.WeEffectRender.nNeedFaceTrack(j17) : false) {
            this.f350606s = k(0);
            this.f350605r.r(i17);
            if (this.f350592e) {
                this.f350605r.j(false);
                os0.a aVar = this.f350605r;
                aVar.f348006o = z17;
                aVar.s(0);
            } else {
                if (z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.XLabEffect", "Upside down is not support on non-rci mode");
                }
                this.f350605r.s(i18);
                this.f350605r.j(z18);
            }
            this.f350605r.f348013v = true;
            this.f350605r.o();
        }
    }

    public final void r() {
        p05.a3 a3Var = p05.a3.f350439a;
        rh0.z zVar = this.f350590c;
        java.lang.String f17 = a3Var.f(zVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "initSettings: " + f17);
        if (this.f350593f == 0 || f17 == null) {
            return;
        }
        java.util.Map Ai = ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).Ai(zVar);
        java.util.Map map = this.f350591d;
        if (map != null) {
            Ai = kz5.c1.t(Ai);
            Ai.putAll(map);
        }
        long j17 = this.f350593f;
        int i17 = com.tencent.mm.xeffect.WeEffectRender.f214802a;
        java.lang.String nInitSettings = com.tencent.mm.xeffect.WeEffectRender.nInitSettings(j17, f17, tq5.i.f421270b.a(Ai));
        if (nInitSettings != null) {
            int i18 = zVar.f395621d;
            com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct wevisionSwitchResStruct = new com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct();
            if (tq5.i.f421269a == 0) {
                tq5.i.f421269a = 2014500;
            }
            wevisionSwitchResStruct.f62979d = tq5.i.f421269a;
            wevisionSwitchResStruct.f62981f = 4;
            wevisionSwitchResStruct.f62980e = i18;
            wevisionSwitchResStruct.f62983h = wevisionSwitchResStruct.b("SwitchRes", nInitSettings, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisConfigReporter", "reportUsage: " + wevisionSwitchResStruct.n());
            wevisionSwitchResStruct.k();
        }
    }

    public void s(int i17, boolean z17) {
        if (z17) {
            this.f350611x |= 1 << i17;
            if (i17 == 14) {
                this.f350596i |= 8192;
                return;
            } else {
                if (i17 != 17) {
                    return;
                }
                this.f350596i |= 2048;
                return;
            }
        }
        this.f350611x &= ~(1 << i17);
        if (i17 == 14) {
            this.f350596i &= -8193;
        } else {
            if (i17 != 17) {
                return;
            }
            this.f350596i &= -2049;
        }
    }

    public void t(long j17) {
        long j18 = this.f350593f;
        if (j18 == 0) {
            return;
        }
        com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(j18, j17);
        com.tencent.mm.xeffect.WeEffectRender.a(this.f350593f, j17, null);
    }

    public void u(p05.e2 e2Var) {
        if (e2Var != null) {
            this.I.remove(e2Var);
        }
    }

    public int v(int i17, int i18, long j17, int i19, int i27, boolean z17, boolean z18, boolean z19, int i28, int i29) {
        if (this.f350593f == 0) {
            l(i17, i18, z17, i19, z19);
            return -1;
        }
        int k17 = k(i27);
        int k18 = k(i19);
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        j();
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        p4Var.f350653i = android.os.SystemClock.elapsedRealtime();
        int nRenderToTextureOutputRotate = com.tencent.mm.xeffect.WeEffectRender.nRenderToTextureOutputRotate(this.f350593f, i17, i18, i28, i29, k18, k17, z17, z19);
        p4Var.a();
        if (z18) {
            android.opengl.GLES20.glFinish();
        }
        android.os.SystemClock.elapsedRealtime();
        return nRenderToTextureOutputRotate;
    }

    public int w(int i17, int i18, long j17, int i19, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        int i27;
        if (this.f350595h == 0 || this.f350594g == 0) {
            return -1;
        }
        if (this.f350593f == 0) {
            l(i17, i18, z17, i19, z19);
            return -1;
        }
        int k17 = k(i19);
        boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        java.lang.System.nanoTime();
        j();
        java.lang.System.nanoTime();
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        p4Var.f350653i = android.os.SystemClock.elapsedRealtime();
        java.lang.System.nanoTime();
        if (this.f350592e) {
            i27 = 0;
            z27 = false;
        } else {
            z27 = z19;
            i27 = k17;
        }
        int nRenderToTexture = com.tencent.mm.xeffect.WeEffectRender.nRenderToTexture(this.f350593f, i17, i18, this.f350595h, this.f350594g, i27, z17, z27);
        java.lang.System.nanoTime();
        p4Var.a();
        if (z18) {
            java.lang.System.nanoTime();
            android.opengl.GLES20.glFinish();
            java.lang.System.nanoTime();
        }
        return nRenderToTexture;
    }

    public int x(byte[] inputBuffer, int i17, int i18, byte[] outputBuffer, int i19, int i27) {
        kotlin.jvm.internal.o.g(inputBuffer, "inputBuffer");
        kotlin.jvm.internal.o.g(outputBuffer, "outputBuffer");
        if (this.f350593f == 0) {
            return -1;
        }
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        p4Var.f350653i = android.os.SystemClock.elapsedRealtime();
        int nRenderToBuffer = com.tencent.mm.xeffect.WeEffectRender.nRenderToBuffer(this.f350593f, inputBuffer, i17, i18, outputBuffer, i19, 0, false);
        android.opengl.GLES20.glFinish();
        p4Var.a();
        return nRenderToBuffer;
    }

    public void z(long j17, com.tencent.mm.xeffect.IWeEffectCallback iWeEffectCallback) {
        long j18 = this.f350593f;
        if (j18 == 0) {
            return;
        }
        com.tencent.mm.xeffect.WeEffectRender.a(j18, j17, iWeEffectCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0144, code lost:
    
        if (r26.n0.B(r0, "Mali-G77", false) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l4(int r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, rh0.z r27, java.util.Map r28, boolean r29, int r30, kotlin.jvm.internal.i r31) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l4.<init>(int, boolean, boolean, boolean, boolean, boolean, rh0.z, java.util.Map, boolean, int, kotlin.jvm.internal.i):void");
    }
}
