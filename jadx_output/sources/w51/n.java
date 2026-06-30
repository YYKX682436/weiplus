package w51;

/* loaded from: classes15.dex */
public class n {
    public static final java.text.DateFormat C = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.ENGLISH);
    public final android.content.Context A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f442989a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.picker.base.view.WheelView f442990b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.picker.base.view.WheelView f442991c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.picker.base.view.WheelView f442992d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.picker.base.view.WheelView f442993e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.picker.base.view.WheelView f442994f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.picker.base.view.WheelView f442995g;

    /* renamed from: h, reason: collision with root package name */
    public int f442996h;

    /* renamed from: i, reason: collision with root package name */
    public o51.f f442997i;

    /* renamed from: j, reason: collision with root package name */
    public boolean[] f442998j;

    /* renamed from: k, reason: collision with root package name */
    public int f442999k;

    /* renamed from: l, reason: collision with root package name */
    public int f443000l;

    /* renamed from: m, reason: collision with root package name */
    public int f443001m;

    /* renamed from: n, reason: collision with root package name */
    public int f443002n;

    /* renamed from: o, reason: collision with root package name */
    public int f443003o;

    /* renamed from: p, reason: collision with root package name */
    public int f443004p;

    /* renamed from: q, reason: collision with root package name */
    public int f443005q;

    /* renamed from: r, reason: collision with root package name */
    public int f443006r;

    /* renamed from: s, reason: collision with root package name */
    public int f443007s;

    /* renamed from: t, reason: collision with root package name */
    public int f443008t;

    /* renamed from: u, reason: collision with root package name */
    public int f443009u;

    /* renamed from: v, reason: collision with root package name */
    public int f443010v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f443011w;

    /* renamed from: x, reason: collision with root package name */
    public v51.a f443012x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f443013y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f443014z;

    public n(android.content.Context context) {
        this.f442999k = 1900;
        this.f443000l = 2100;
        this.f443001m = 1;
        this.f443002n = 12;
        this.f443003o = 1;
        this.f443004p = 31;
        this.f443005q = 0;
        this.f443006r = 0;
        this.f443007s = 23;
        this.f443008t = 59;
        this.f443011w = false;
        this.f443013y = java.util.Arrays.asList("1", "3", "5", "7", "8", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "12");
        this.f443014z = java.util.Arrays.asList("4", "6", "9", "11");
        this.B = true;
        this.A = context;
    }

    public static void a(w51.n nVar, int i17, int i18, int i19, int i27, java.util.List list, java.util.List list2) {
        int c17 = nVar.c(nVar.f442992d);
        int currentItem = nVar.f442992d.getCurrentItem();
        if (list.contains(java.lang.String.valueOf(i18))) {
            if (i27 > 31) {
                i27 = 31;
            }
            nVar.f442992d.setAdapter(new o51.d(i19, i27));
        } else if (list2.contains(java.lang.String.valueOf(i18))) {
            if (i27 > 30) {
                i27 = 30;
            }
            nVar.f442992d.setAdapter(new o51.d(i19, i27));
        } else if ((i17 % 4 != 0 || i17 % 100 == 0) && i17 % 400 != 0) {
            if (i27 > 28) {
                i27 = 28;
            }
            nVar.f442992d.setAdapter(new o51.d(i19, i27));
        } else {
            if (i27 > 29) {
                i27 = 29;
            }
            nVar.f442992d.setAdapter(new o51.d(i19, i27));
        }
        if (currentItem > nVar.f442992d.getAdapter().getItemsCount() - 1) {
            nVar.f442992d.setCurrentItem(nVar.f442992d.getAdapter().getItemsCount() - 1);
        }
        if (nVar.c(nVar.f442992d) != c17) {
            int c18 = ((o51.d) nVar.f442992d.getAdapter()).c();
            int d17 = ((o51.d) nVar.f442992d.getAdapter()).d();
            if (c17 <= d17) {
                nVar.f442992d.setCurrentItem(0);
            } else if (c17 >= c18) {
                nVar.f442992d.setCurrentItem(r3.getAdapter().getItemsCount() - 1);
            } else {
                nVar.f442992d.setCurrentItem(c17 - d17);
            }
        }
    }

    public final void b(com.tencent.mm.picker.base.view.WheelView wheelView) {
        if (this.f443012x != null) {
            wheelView.setOnItemSelectedListener(new w51.m(this));
        }
    }

    public int c(com.tencent.mm.picker.base.view.WheelView wheelView) {
        java.lang.Object item;
        if (!(wheelView.getAdapter() instanceof o51.d) || (item = wheelView.getAdapter().getItem(wheelView.getCurrentItem())) == null) {
            return 0;
        }
        return ((java.lang.Integer) item).intValue();
    }

    public java.lang.String d() {
        return java.lang.String.valueOf(c(this.f442990b) + "-" + c(this.f442991c) + "-" + c(this.f442992d) + " " + c(this.f442993e) + ":" + c(this.f442994f) + ":" + c(this.f442995g));
    }

    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < 6; i17++) {
            if (i17 == 0) {
                this.f442990b.setVisibility(this.f442998j[i17] ? 0 : 8);
                if (this.f442998j[i17]) {
                    arrayList.add(this.f442990b);
                }
            } else if (i17 == 1) {
                this.f442991c.setVisibility(this.f442998j[i17] ? 0 : 8);
                if (this.f442998j[i17]) {
                    arrayList.add(this.f442991c);
                }
            } else if (i17 == 2) {
                this.f442992d.setVisibility(this.f442998j[i17] ? 0 : 8);
                if (this.f442998j[i17]) {
                    arrayList.add(this.f442992d);
                }
            } else if (i17 == 3) {
                this.f442993e.setVisibility(this.f442998j[i17] ? 0 : 8);
                if (this.f442998j[i17]) {
                    arrayList.add(this.f442993e);
                }
            } else if (i17 == 4) {
                this.f442994f.setVisibility(this.f442998j[i17] ? 0 : 8);
                if (this.f442998j[i17]) {
                    arrayList.add(this.f442994f);
                }
            } else if (i17 == 5) {
                this.f442995g.setVisibility(this.f442998j[i17] ? 0 : 8);
                if (this.f442998j[i17]) {
                    arrayList.add(this.f442995g);
                }
            }
        }
        return arrayList;
    }

    public void f(int i17) {
        this.f443010v = i17;
        this.f442992d.setDividerColor(i17);
        this.f442991c.setDividerColor(this.f443010v);
        this.f442990b.setDividerColor(this.f443010v);
        this.f442993e.setDividerColor(this.f443010v);
        this.f442994f.setDividerColor(this.f443010v);
        this.f442995g.setDividerColor(this.f443010v);
    }

    public void g(boolean z17, int i17) {
        if (i17 <= 0) {
            i17 = com.tencent.mm.R.string.hih;
        }
        this.f443011w = z17;
        o51.f fVar = this.f442997i;
        fVar.f343093g = z17;
        fVar.f343094h = i17;
        com.tencent.mm.picker.base.view.WheelView wheelView = this.f442990b;
        wheelView.B = z17;
        wheelView.C = i17;
        this.f442991c.setLongTermMonthDay(z17);
        this.f442992d.setLongTermMonthDay(z17);
    }

    public n(android.content.Context context, boolean z17) {
        this.f442999k = 1900;
        this.f443000l = 2100;
        this.f443001m = 1;
        this.f443002n = 12;
        this.f443003o = 1;
        this.f443004p = 31;
        this.f443005q = 0;
        this.f443006r = 0;
        this.f443007s = 23;
        this.f443008t = 59;
        this.f443011w = false;
        this.f443013y = java.util.Arrays.asList("1", "3", "5", "7", "8", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "12");
        this.f443014z = java.util.Arrays.asList("4", "6", "9", "11");
        this.B = true;
        this.A = context;
        this.B = z17;
    }
}
