package gm2;

/* loaded from: classes3.dex */
public final class t1 implements gm2.z1 {

    /* renamed from: c, reason: collision with root package name */
    public static final gm2.r1 f273481c = new gm2.r1(null);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f273482d = jz5.h.b(gm2.m1.f273432d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f273483e = jz5.h.b(gm2.n1.f273435d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f273484f = jz5.h.b(gm2.o1.f273457d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f273485g = jz5.h.b(gm2.l1.f273428d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f273486h = jz5.h.b(gm2.q1.f273464d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f273487i = jz5.h.b(gm2.k1.f273423d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f273488j = jz5.h.b(gm2.p1.f273459d);

    /* renamed from: a, reason: collision with root package name */
    public final gm2.c2 f273489a;

    /* renamed from: b, reason: collision with root package name */
    public final gm2.e2 f273490b;

    public t1(gm2.c2 spanMode, gm2.e2 sizeMode) {
        kotlin.jvm.internal.o.g(spanMode, "spanMode");
        kotlin.jvm.internal.o.g(sizeMode, "sizeMode");
        this.f273489a = spanMode;
        this.f273490b = sizeMode;
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return android.graphics.Color.parseColor("#FFFFFF");
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 1;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int c(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int d(java.lang.Object obj) {
        return f273481c.b(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public int[] e(java.lang.Object obj) {
        int[] iArr;
        int intValue = ((java.lang.Number) obj).intValue();
        int a17 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16.0f);
        int a18 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 20.0f);
        int a19 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 11.0f);
        boolean z17 = 1 <= intValue && intValue < 10;
        gm2.e2 e2Var = this.f273490b;
        if (z17) {
            iArr = new int[2];
            int ordinal = e2Var.ordinal();
            if (ordinal == 1) {
                iArr[0] = (int) ((a18 * 20.0f) / 30.0f);
                iArr[1] = a18;
            } else if (ordinal != 2) {
                iArr[0] = (int) ((a17 * 20.0f) / 30.0f);
                iArr[1] = a17;
            } else {
                iArr[0] = (int) ((a19 * 20.0f) / 30.0f);
                iArr[1] = a19;
            }
        } else {
            if (10 <= intValue && intValue < 20) {
                iArr = new int[2];
                int ordinal2 = e2Var.ordinal();
                if (ordinal2 == 1) {
                    iArr[0] = (int) ((a18 * 25.0f) / 30.0f);
                    iArr[1] = a18;
                } else if (ordinal2 != 2) {
                    iArr[0] = (int) ((a17 * 25.0f) / 30.0f);
                    iArr[1] = a17;
                } else {
                    iArr[0] = (int) ((a19 * 25.0f) / 30.0f);
                    iArr[1] = a19;
                }
            } else {
                if ((((((20 <= intValue && intValue < 30) || (30 <= intValue && intValue < 40)) || (40 <= intValue && intValue < 50)) || (50 <= intValue && intValue < 60)) || (60 <= intValue && intValue < 70)) || (70 <= intValue && intValue <= Integer.MAX_VALUE)) {
                    iArr = new int[2];
                    int ordinal3 = e2Var.ordinal();
                    if (ordinal3 == 1) {
                        iArr[0] = a18;
                        iArr[1] = a18;
                    } else if (ordinal3 != 2) {
                        iArr[0] = a17;
                        iArr[1] = a17;
                    } else {
                        iArr[0] = a19;
                        iArr[1] = a19;
                    }
                } else {
                    iArr = new int[2];
                    int ordinal4 = e2Var.ordinal();
                    if (ordinal4 == 1) {
                        iArr[0] = a18;
                        iArr[1] = a18;
                    } else if (ordinal4 != 2) {
                        iArr[0] = a17;
                        iArr[1] = a17;
                    } else {
                        iArr[0] = a19;
                        iArr[1] = a19;
                    }
                }
            }
        }
        return iArr;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        return i(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public gm2.u1 g(int i17) {
        int B = zl2.q4.f473933a.B(i17);
        boolean z17 = 70 <= B && B < 80;
        gm2.c2 c2Var = this.f273489a;
        gm2.r1 r1Var = f273481c;
        if (z17) {
            float i18 = gm2.c1.f273320a.i();
            gm2.c2 c2Var2 = gm2.c2.f273349h;
            gm2.s1 d17 = r1Var.d();
            return new gm2.u1(i18, c2Var == c2Var2 ? d17.f273471b : d17.f273473d, c2Var == c2Var2 ? r1Var.d().f273472c : r1Var.d().f273474e, c2Var == gm2.c2.f273351m ? r1Var.d().f273477h : r1Var.d().f273478i, r1Var.d().f273475f, r1Var.d().f273476g);
        }
        if (80 <= B && B < 90) {
            float i19 = gm2.c1.f273320a.i();
            gm2.c2 c2Var3 = gm2.c2.f273349h;
            gm2.s1 e17 = r1Var.e();
            return new gm2.u1(i19, c2Var == c2Var3 ? e17.f273471b : e17.f273473d, c2Var == c2Var3 ? r1Var.e().f273472c : r1Var.e().f273474e, c2Var == gm2.c2.f273351m ? r1Var.e().f273477h : r1Var.e().f273478i, r1Var.e().f273475f, r1Var.e().f273476g);
        }
        if (90 <= B && B < 100) {
            float i27 = gm2.c1.f273320a.i();
            gm2.c2 c2Var4 = gm2.c2.f273349h;
            gm2.s1 f17 = r1Var.f();
            return new gm2.u1(i27, c2Var == c2Var4 ? f17.f273471b : f17.f273473d, c2Var == c2Var4 ? r1Var.f().f273472c : r1Var.f().f273474e, c2Var == gm2.c2.f273351m ? r1Var.f().f273477h : r1Var.f().f273478i, r1Var.f().f273475f, r1Var.f().f273476g);
        }
        if (!(100 <= B && B <= Integer.MAX_VALUE)) {
            return null;
        }
        float i28 = gm2.c1.f273320a.i();
        gm2.c2 c2Var5 = gm2.c2.f273349h;
        gm2.s1 c17 = r1Var.c();
        return new gm2.u1(i28, c2Var == c2Var5 ? c17.f273471b : c17.f273473d, c2Var == c2Var5 ? r1Var.c().f273472c : r1Var.c().f273474e, c2Var == gm2.c2.f273351m ? r1Var.c().f273477h : r1Var.c().f273478i, r1Var.c().f273475f, r1Var.c().f273476g);
    }

    @Override // gm2.z1
    public gm2.v1 h(int i17) {
        int B = zl2.q4.f473933a.B(i17);
        boolean z17 = 70 <= B && B < 80;
        gm2.r1 r1Var = f273481c;
        if (z17) {
            return new gm2.v1(1000, 3000, r1Var.d().f273470a, r1Var.g(), r1Var.a(), null, 0);
        }
        boolean z18 = 80 <= B && B < 90;
        jz5.g gVar = f273488j;
        if (z18) {
            android.graphics.Bitmap bitmap = r1Var.e().f273470a;
            android.graphics.Bitmap g17 = r1Var.g();
            android.graphics.Bitmap a17 = r1Var.a();
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            return new gm2.v1(1000, 3000, bitmap, g17, a17, (android.graphics.Bitmap) value, 80);
        }
        if (90 <= B && B < 100) {
            android.graphics.Bitmap bitmap2 = r1Var.f().f273470a;
            android.graphics.Bitmap g18 = r1Var.g();
            android.graphics.Bitmap a18 = r1Var.a();
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            return new gm2.v1(1000, 3000, bitmap2, g18, a18, (android.graphics.Bitmap) value2, 90);
        }
        if (!(100 <= B && B <= Integer.MAX_VALUE)) {
            return null;
        }
        android.graphics.Bitmap bitmap3 = r1Var.c().f273470a;
        android.graphics.Bitmap g19 = r1Var.g();
        android.graphics.Bitmap a19 = r1Var.a();
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        return new gm2.v1(1000, 3000, bitmap3, g19, a19, (android.graphics.Bitmap) value3, 100);
    }

    public int i(int i17) {
        int ordinal = this.f273489a.ordinal();
        if (ordinal == 1) {
            if (1 <= i17 && i17 < 10) {
                return com.tencent.mm.R.drawable.a9e;
            }
            if (10 <= i17 && i17 < 20) {
                return com.tencent.mm.R.drawable.a9c;
            }
            if (20 <= i17 && i17 < 30) {
                return com.tencent.mm.R.drawable.a9g;
            }
            if (30 <= i17 && i17 < 40) {
                return com.tencent.mm.R.drawable.a9i;
            }
            if (40 <= i17 && i17 < 50) {
                return com.tencent.mm.R.drawable.a9k;
            }
            if (50 <= i17 && i17 < 60) {
                return com.tencent.mm.R.drawable.a9m;
            }
            if (60 <= i17 && i17 < 70) {
                return com.tencent.mm.R.drawable.a9o;
            }
            if (70 <= i17 && i17 < 80) {
                return com.tencent.mm.R.drawable.a9q;
            }
            if (80 <= i17 && i17 < 90) {
                return com.tencent.mm.R.drawable.a9r;
            }
            if (90 <= i17 && i17 < 100) {
                return com.tencent.mm.R.drawable.a9s;
            }
            return 100 <= i17 && i17 <= Integer.MAX_VALUE ? com.tencent.mm.R.drawable.a9a : com.tencent.mm.R.drawable.a9e;
        }
        if (ordinal != 3) {
            if (1 <= i17 && i17 < 10) {
                return com.tencent.mm.R.drawable.a9d;
            }
            if (10 <= i17 && i17 < 20) {
                return com.tencent.mm.R.drawable.a9b;
            }
            if (20 <= i17 && i17 < 30) {
                return com.tencent.mm.R.drawable.a9f;
            }
            if (30 <= i17 && i17 < 40) {
                return com.tencent.mm.R.drawable.a9h;
            }
            if (40 <= i17 && i17 < 50) {
                return com.tencent.mm.R.drawable.a9j;
            }
            if (50 <= i17 && i17 < 60) {
                return com.tencent.mm.R.drawable.a9l;
            }
            if (60 <= i17 && i17 < 70) {
                return com.tencent.mm.R.drawable.a9n;
            }
            if (70 <= i17 && i17 < 80) {
                return com.tencent.mm.R.drawable.a9p;
            }
            if (80 <= i17 && i17 < 90) {
                return com.tencent.mm.R.drawable.a99;
            }
            if (90 <= i17 && i17 < 100) {
                return com.tencent.mm.R.drawable.a9_;
            }
            return 100 <= i17 && i17 <= Integer.MAX_VALUE ? com.tencent.mm.R.drawable.a98 : com.tencent.mm.R.drawable.a9d;
        }
        if (1 <= i17 && i17 < 10) {
            return com.tencent.mm.R.drawable.a9d;
        }
        if (10 <= i17 && i17 < 20) {
            return com.tencent.mm.R.drawable.a9u;
        }
        if (20 <= i17 && i17 < 30) {
            return com.tencent.mm.R.drawable.a9v;
        }
        if (30 <= i17 && i17 < 40) {
            return com.tencent.mm.R.drawable.a9w;
        }
        if (40 <= i17 && i17 < 50) {
            return com.tencent.mm.R.drawable.a9x;
        }
        if (50 <= i17 && i17 < 60) {
            return com.tencent.mm.R.drawable.a9y;
        }
        if (60 <= i17 && i17 < 70) {
            return com.tencent.mm.R.drawable.a9z;
        }
        if (70 <= i17 && i17 < 80) {
            return com.tencent.mm.R.drawable.a_0;
        }
        if (80 <= i17 && i17 < 90) {
            return com.tencent.mm.R.drawable.a_1;
        }
        if (90 <= i17 && i17 < 100) {
            return com.tencent.mm.R.drawable.a_2;
        }
        return 100 <= i17 && i17 <= Integer.MAX_VALUE ? com.tencent.mm.R.drawable.a9t : com.tencent.mm.R.drawable.a9d;
    }

    public /* synthetic */ t1(gm2.c2 c2Var, gm2.e2 e2Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? gm2.c2.f273348g : c2Var, (i17 & 2) != 0 ? gm2.e2.f273361g : e2Var);
    }
}
