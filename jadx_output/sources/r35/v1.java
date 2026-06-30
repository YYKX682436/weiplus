package r35;

/* loaded from: classes11.dex */
public class v1 extends android.widget.BaseAdapter {
    public static int K = 19;
    public static int L = 19;
    public static int M = 5;
    public java.lang.String C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public lz.g f369288d;

    /* renamed from: e, reason: collision with root package name */
    public r35.e2 f369289e;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f369292h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f369294m;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f369298q;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b0 f369303v;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f369290f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f369291g = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f369295n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f369296o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f369297p = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f369299r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f369300s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public int f369301t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f369302u = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f369304w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f369305x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f369306y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f369307z = true;
    public boolean A = false;
    public final int B = 12;
    public o11.g E = null;
    public boolean F = false;
    public boolean G = false;
    public final boolean H = true;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.HashMap f369287J = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f369293i = false;

    public v1(android.content.Context context) {
        this.f369292h = context;
        context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsListArchAdapter", "init, wrapColNum: %d", java.lang.Integer.valueOf(f(context)));
    }

    public boolean a(int i17) {
        com.tencent.mm.ui.base.preference.r rVar;
        if (this.f369293i) {
            return false;
        }
        if (i17 < this.f369302u) {
            this.f369293i = true;
            lz.g gVar = this.f369288d;
            if (gVar != null && (rVar = ((r35.t1) gVar).f369261a.f369270b) != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
            }
        }
        return true;
    }

    public final r35.b2 c(android.view.View view) {
        r35.b2 b2Var = new r35.b2(this);
        b2Var.f369049g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m6y);
        b2Var.f369043a = (com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView) view.findViewById(com.tencent.mm.R.id.m7e);
        b2Var.f369044b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m6x);
        b2Var.f369045c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m7a);
        b2Var.f369046d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m7b);
        b2Var.f369047e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m7d);
        b2Var.f369048f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m6z);
        b2Var.f369050h = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.spk);
        view.setTag(b2Var);
        return b2Var;
    }

    public final int d() {
        int size;
        int i17;
        int i18;
        int i19;
        if (this.f369295n) {
            size = ((java.util.ArrayList) this.f369300s).size();
        } else {
            boolean z17 = this.f369294m;
            java.util.List list = this.f369299r;
            if (z17) {
                com.tencent.mm.storage.a3 a3Var = this.f369298q;
                if (a3Var == null || a3Var.P0()) {
                    int size2 = ((java.util.ArrayList) list).size();
                    int i27 = K;
                    if (size2 >= i27 - 1) {
                        i17 = i27 - 1;
                        size = i17;
                    } else {
                        size = ((java.util.ArrayList) list).size();
                    }
                } else {
                    int size3 = ((java.util.ArrayList) list).size();
                    i17 = K;
                    if (size3 < i17) {
                        size = ((java.util.ArrayList) list).size();
                    }
                    size = i17;
                }
            } else {
                size = ((java.util.ArrayList) list).size();
            }
        }
        if (size == 0) {
            return M;
        }
        boolean z18 = this.f369305x;
        if (z18 && this.f369304w && this.f369306y) {
            i18 = M;
            i19 = (size + 2) / i18;
        } else if ((z18 && this.f369304w && !this.f369306y) || ((z18 && !this.f369304w && this.f369306y) || (!z18 && this.f369304w && this.f369306y))) {
            i18 = M;
            i19 = (size + 1) / i18;
        } else if ((z18 && !this.f369304w && !this.f369306y) || ((!z18 && this.f369304w && !this.f369306y) || (!z18 && !this.f369304w && this.f369306y))) {
            i18 = M;
            i19 = size / i18;
        } else if (z18 || this.f369304w || this.f369306y) {
            i18 = M;
            i19 = size / i18;
        } else {
            i18 = M;
            i19 = (size - 1) / i18;
        }
        return (i19 + 1) * i18;
    }

    public int f(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (width / (context.getResources().getDimension(com.tencent.mm.R.dimen.f479892i5) + (context.getResources().getDimension(com.tencent.mm.R.dimen.f479884hx) * 2.0f)) < 5.0f || height <= width) {
            this.I = false;
        } else {
            this.I = true;
        }
        float dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f479884hx) * 2.0f;
        boolean z17 = this.I;
        android.content.res.Resources resources = context.getResources();
        int dimension2 = width / ((int) (dimension + (z17 ? resources.getDimension(com.tencent.mm.R.dimen.f479892i5) : resources.getDimension(com.tencent.mm.R.dimen.f479890i3))));
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsListArchAdapter", "[getWrapColNum] :%s", java.lang.Integer.valueOf(dimension2));
        M = dimension2;
        if (dimension2 == 4 && !this.F) {
            K = 15;
            L = 15;
        }
        return dimension2;
    }

    public boolean g(int i17) {
        return i17 < this.f369302u;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A ? java.lang.Math.min(this.B, this.f369301t) : this.f369301t;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 < this.f369302u) {
            return this.f369295n ? ((java.util.ArrayList) this.f369300s).get(i17) : ((java.util.ArrayList) this.f369299r).get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x02fb, code lost:
    
        if (r4.equals(((s01.a0) r11).field_userId) == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05a4  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 1707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.v1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void h() {
        com.tencent.mm.ui.base.preference.r rVar;
        java.util.List list = this.f369290f;
        if (list == null && this.f369291g == null) {
            return;
        }
        boolean z17 = this.f369307z;
        java.util.List list2 = this.f369299r;
        if (!z17) {
            java.util.ArrayList arrayList = this.f369291g;
            if (arrayList != null) {
                arrayList.size();
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                arrayList2.clear();
                if (this.f369291g.size() > 0) {
                    java.util.Iterator it = this.f369291g.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((com.tencent.mm.storage.z3) it.next());
                    }
                }
                this.f369302u = arrayList2.size();
            }
        } else if (list != null) {
            list.size();
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
            arrayList3.clear();
            java.util.ArrayList arrayList4 = (java.util.ArrayList) this.f369300s;
            arrayList4.clear();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (this.f369290f.size() > 0) {
                int i17 = 1;
                for (java.lang.String str : this.f369290f) {
                    if (this.f369295n) {
                        ((r35.t) ((r35.p3) i95.n0.c(r35.p3.class))).getClass();
                        s01.a0 y07 = r01.q3.Vi().y0(str);
                        if (y07 == null || com.tencent.mm.sdk.platformtools.t8.K0(y07.field_userId) || !y07.field_userId.equals(str)) {
                            y07 = new s01.a0();
                            y07.field_userId = str;
                        }
                        arrayList4.add(y07);
                    } else {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                        com.tencent.mm.storage.a3 a3Var = this.f369298q;
                        if (a3Var == null || !str.equals(a3Var.field_roomowner)) {
                            com.tencent.mm.storage.a3 a3Var2 = this.f369298q;
                            if (a3Var2 == null || !a3Var2.G0(n17.d1())) {
                                linkedList.add(new r35.a2(this, n17, 100));
                            } else {
                                linkedList.add(new r35.a2(this, n17, i17));
                                i17++;
                            }
                        } else {
                            linkedList.add(new r35.a2(this, n17, 0));
                        }
                    }
                    j(str);
                }
                j("add_more_user");
                j("del_more_user");
                this.G = !this.F;
                if (this.H) {
                    java.util.Collections.sort(linkedList, new r35.w1(this));
                }
                if (!this.f369295n) {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        arrayList3.add((com.tencent.mm.storage.z3) ((r35.a2) it6.next()).f369039a);
                    }
                }
            }
            if (this.f369295n) {
                this.f369302u = arrayList4.size();
            } else if (this.f369294m) {
                com.tencent.mm.storage.a3 a3Var3 = this.f369298q;
                if (a3Var3 == null || a3Var3.P0()) {
                    int size = arrayList3.size();
                    int i18 = L;
                    this.f369302u = size >= i18 + (-1) ? i18 - 1 : arrayList3.size();
                } else {
                    int size2 = arrayList3.size();
                    int i19 = L;
                    if (size2 < i19) {
                        i19 = arrayList3.size();
                    }
                    this.f369302u = i19;
                }
            } else {
                this.f369302u = arrayList3.size();
            }
        }
        int i27 = this.f369302u;
        if (i27 == 0) {
            this.f369301t = M;
        } else {
            boolean z18 = this.f369305x;
            if (z18 && this.f369304w && this.f369306y) {
                int i28 = M;
                this.f369301t = (((i27 + 2) / i28) + 1) * i28;
            } else if ((z18 && this.f369304w && !this.f369306y) || ((z18 && !this.f369304w && this.f369306y) || (!z18 && this.f369304w && this.f369306y))) {
                int i29 = M;
                this.f369301t = (((i27 + 1) / i29) + 1) * i29;
            } else if ((z18 && !this.f369304w && !this.f369306y) || ((!z18 && this.f369304w && !this.f369306y) || (!z18 && !this.f369304w && this.f369306y))) {
                int i37 = M;
                this.f369301t = ((i27 / i37) + 1) * i37;
            } else if (!z18 && !this.f369304w && !this.f369306y) {
                int i38 = M;
                this.f369301t = (((i27 - 1) / i38) + 1) * i38;
            }
        }
        lz.g gVar = this.f369288d;
        if (gVar == null || (rVar = ((r35.t1) gVar).f369261a.f369270b) == null) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
    }

    public final void j(java.lang.String str) {
        java.util.HashMap hashMap = this.f369287J;
        r35.x1 x1Var = (r35.x1) hashMap.get(str);
        if (x1Var == null || this.F != x1Var.f369322a) {
            hashMap.put(str, new r35.x1(this.F, false));
        }
    }
}
