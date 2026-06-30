package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.ui.k3 implements l75.z0 {
    public int[] A;
    public java.lang.String[] B;
    public db5.f6 C;
    public db5.b6 D;
    public final db5.c6 E;
    public com.tencent.mm.ui.contact.AddressUI.AddressUIFragment F;
    public final java.util.Set G;
    public int H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f206671J;
    public boolean K;
    public final java.lang.ref.WeakReference L;
    public final java.util.LinkedList M;
    public boolean N;
    public final java.util.HashMap P;
    public final db5.v8 Q;
    public final android.util.SparseArray R;
    public final java.util.HashSet S;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f206672v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f206673w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f206674x;

    /* renamed from: y, reason: collision with root package name */
    public final int f206675y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f206676z;

    static {
        i65.a.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f479413yk);
        i65.a.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f479232tk);
    }

    public e(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        super(true, context, 5000);
        this.f206672v = null;
        this.f206673w = null;
        this.f206674x = null;
        this.f206676z = "";
        this.E = com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.G = new java.util.HashSet();
        this.H = 0;
        this.I = true;
        this.f206671J = false;
        this.K = false;
        this.M = new java.util.LinkedList();
        this.P = new java.util.HashMap();
        this.Q = new com.tencent.mm.ui.contact.b(this);
        this.R = new android.util.SparseArray();
        new android.util.SparseArray();
        this.S = new java.util.HashSet();
        new java.util.HashMap();
        this.L = new java.lang.ref.WeakReference(context);
        this.f209021h = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f206672v = str;
        this.f206673w = str2;
        this.f206675y = i17;
        this.f206671J = z17;
        new java.util.LinkedList();
        new java.util.LinkedList();
        c01.z1.r();
        this.f209017d = "MiscroMsg.AddressDrawWithCacheAdapter";
    }

    public final void A(com.tencent.mm.ui.contact.d dVar) {
        dVar.f206654g.setVisibility(8);
        dVar.f206648a.setVisibility(8);
        dVar.f206653f.setVisibility(8);
    }

    public void B() {
        int count = getCount();
        if (count == 0) {
            return;
        }
        this.H = k(0);
        com.tencent.mm.ui.f3 f3Var = this.f209019f;
        if (f3Var == null ? false : f3Var.f250438a.y()) {
            java.lang.System.currentTimeMillis();
            java.util.HashSet hashSet = new java.util.HashSet();
            this.A = new int[30];
            this.B = new java.lang.String[30];
            int i17 = 0;
            for (int i18 = this.H; i18 < count; i18++) {
                com.tencent.mm.storage.g item = getItem(i18);
                if (item != null) {
                    java.lang.String w17 = w(item, i18);
                    if (hashSet.add(w17)) {
                        this.A[i17] = i18 - this.H;
                        this.B[i17] = w17;
                        i17++;
                    }
                }
            }
            java.lang.System.currentTimeMillis();
        } else {
            java.lang.System.currentTimeMillis();
            java.util.List list = this.f206674x;
            java.lang.String str = this.f206672v;
            java.lang.String str2 = this.f206673w;
            java.lang.String str3 = this.f206676z;
            this.A = c01.e2.w(null, str, str2, list, str3);
            this.B = c01.e2.y(null, str, str2, str3, this.f206674x);
            java.lang.System.currentTimeMillis();
        }
        java.util.HashSet hashSet2 = (java.util.HashSet) this.G;
        hashSet2.clear();
        int[] iArr = this.A;
        if (iArr != null) {
            for (int i19 : iArr) {
                hashSet2.add(java.lang.Integer.valueOf(i19 - 1));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r0.moveToFirst() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        r1.add(r0.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r0.moveToNext() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(java.util.List r5) {
        /*
            r4 = this;
            int r0 = r4.f206675y
            r1 = 2
            if (r0 == r1) goto Lc
            java.lang.String r2 = c01.z1.r()
            r5.add(r2)
        Lc:
            c01.f r2 = c01.d9.b()
            xg3.r0 r2 = r2.y()
            java.lang.String r3 = "@t.qq.com"
            com.tencent.mm.storage.ka r2 = (com.tencent.mm.storage.ka) r2
            com.tencent.mm.storage.ja r2 = r2.m0(r3)
            if (r2 == 0) goto L23
            java.lang.String r2 = r2.f195058b
            r5.add(r2)
        L23:
            r2 = 3
            if (r0 == r2) goto L31
            r2 = 5
            if (r0 == r2) goto L31
            r2 = 4
            if (r0 == r2) goto L31
            r2 = 1
            if (r0 == r2) goto L31
            if (r0 != 0) goto L90
        L31:
            java.util.Set r0 = c01.e2.f37117a
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.tencent.mm.plugin.messenger.foundation.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "select username from rcontact where "
            r2.<init>(r3)
            java.lang.String r3 = com.tencent.mm.storage.k4.M()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l75.k0 r0 = r0.f195071d
            r3 = 0
            android.database.Cursor r0 = r0.f(r2, r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 != 0) goto L65
            goto L7c
        L65:
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L79
        L6b:
            r2 = 0
            java.lang.String r2 = r0.getString(r2)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L6b
        L79:
            r0.close()
        L7c:
            java.util.Iterator r0 = r1.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r5.add(r1)
            goto L80
        L90:
            java.lang.String r0 = "blogapp"
            r5.add(r0)
            r4.f206674x = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.e.C(java.util.List):void");
    }

    @Override // com.tencent.mm.ui.k3
    public e95.h f() {
        return (e95.h) v();
    }

    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment;
        if (obj != null && (obj instanceof java.lang.String) && a1Var == c01.d9.b().q()) {
            java.lang.String str = (java.lang.String) obj;
            if (com.tencent.mm.storage.z3.E4(str) || this.S.contains(str)) {
                return;
            }
            n(str, 2);
            if (!this.K || (addressUIFragment = this.F) == null) {
                return;
            }
            addressUIFragment.K = true;
        }
    }

    @Override // com.tencent.mm.ui.k3, android.widget.Adapter
    public int getCount() {
        return super.getCount();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.contact.d dVar;
        java.lang.ref.WeakReference weakReference = this.L;
        android.content.Context context = (android.content.Context) weakReference.get();
        if (context == null) {
            return view;
        }
        boolean z17 = this.N;
        java.util.LinkedList linkedList = this.M;
        if (!z17) {
            for (int i18 = 0; i18 < 8; i18++) {
                linkedList.add(com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f487990dg, (android.view.ViewGroup) null));
            }
            this.N = true;
        }
        com.tencent.mm.storage.g item = getItem(i17);
        if (view == null) {
            if (linkedList.size() > 0) {
                view = (android.view.View) linkedList.getFirst();
                linkedList.removeFirst();
            } else {
                view = android.view.View.inflate(context, com.tencent.mm.R.layout.f487990dg, null);
            }
            dVar = new com.tencent.mm.ui.contact.d();
            dVar.f206648a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) view.findViewById(com.tencent.mm.R.id.k3e);
            dVar.f206649b = noMeasuredTextView;
            noMeasuredTextView.setLayoutCallback(this.Q);
            dVar.f206649b.i(0, i65.a.h(this.f209021h, com.tencent.mm.R.dimen.f479897ia));
            dVar.f206649b.setShouldEllipsize(true);
            if (dVar.f206649b.getPaint() != null) {
                com.tencent.mm.ui.bk.r0(dVar.f206649b.getPaint(), 0.1f);
            }
            dVar.f206649b.setTextColor(i65.a.e(this.f209021h, com.tencent.mm.R.color.a0c));
            dVar.f206649b.setGravity(16);
            dVar.f206650c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482746mt);
            dVar.f206651d = view.findViewById(com.tencent.mm.R.id.f483918cg5);
            dVar.f206652e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kjo);
            dVar.f206653f = (com.tencent.mm.ui.contact.CategoryTipView) view.findViewById(com.tencent.mm.R.id.cfy);
            dVar.f206654g = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cfw);
            android.view.ViewGroup.LayoutParams layoutParams = dVar.f206651d.getLayoutParams();
            layoutParams.height = (int) (i65.a.f(this.f209021h, com.tencent.mm.R.dimen.f479613ao) * i65.a.A(this.f209021h));
            dVar.f206651d.setLayoutParams(layoutParams);
            view.setTag(dVar);
        } else {
            dVar = (com.tencent.mm.ui.contact.d) view.getTag();
        }
        if (item != null) {
            int i19 = i17 - 1;
            com.tencent.mm.storage.g item2 = getItem(i19);
            int i27 = i17 + 1;
            com.tencent.mm.storage.g item3 = getItem(i27);
            int y17 = item2 == null ? -1 : y(item2, i19);
            int y18 = y(item, i17);
            if (item3 != null) {
                y(item3, i27);
            }
            dVar.f206653f.setTag(java.lang.Integer.valueOf(y18));
            if (!this.I) {
                A(dVar);
            } else if (i17 < 0 || y18 == y17) {
                A(dVar);
            } else {
                java.lang.String w17 = w(item, i17);
                if (com.tencent.mm.sdk.platformtools.t8.K0(w17)) {
                    A(dVar);
                } else {
                    dVar.f206654g.setVisibility(0);
                    dVar.f206648a.setVisibility(0);
                    dVar.f206648a.setText(w17);
                    com.tencent.mm.ui.contact.CategoryTipView categoryTipView = dVar.f206653f;
                    ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                    categoryTipView.a(ef4.i.f252447b);
                }
            }
            java.lang.String w18 = w(item, i17);
            java.lang.String w19 = item3 == null ? null : w(item3, i27);
            int paddingLeft = dVar.f206651d.getPaddingLeft();
            android.app.Activity activity = (android.app.Activity) weakReference.get();
            if (w18 == null || w18.equals(w19)) {
                dVar.f206649b.setBackground(com.tencent.mm.ui.zk.d(activity, com.tencent.mm.R.attr.f478322gp));
                dVar.f206651d.setBackground(null);
            } else {
                dVar.f206649b.setBackground(null);
                dVar.f206651d.setBackground(com.tencent.mm.ui.zk.d(activity, com.tencent.mm.R.attr.f478322gp));
            }
            dVar.f206651d.setPadding(paddingLeft, 0, 0, 0);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(dVar.f206650c, item.e(), null);
            s(item, dVar);
            t(item, dVar);
            ((com.tencent.mm.ui.chatting.view.AvatarImageView) dVar.f206650c).getClass();
            ((com.tencent.mm.ui.chatting.view.AvatarImageView) dVar.f206650c).setTag(item.e());
        }
        dVar.f206650c.setOnClickListener(new com.tencent.mm.ui.contact.a(this));
        return view;
    }

    @Override // com.tencent.mm.ui.k3
    public com.tencent.mm.ui.f3 h(e95.h hVar) {
        return android.os.Looper.myLooper() != android.os.Looper.getMainLooper() ? new com.tencent.mm.ui.f3(this, hVar) : new com.tencent.mm.ui.f3(this, hVar, true);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        c01.z1.r();
        if (this.A == null) {
            B();
        }
        if (getCount() == 0) {
            super.notifyDataSetChanged();
            return;
        }
        int k17 = k(0);
        this.H = k17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AddressAdapter", "newcursor favourCount %d", java.lang.Integer.valueOf(k17));
        super.notifyDataSetChanged();
    }

    public void s(com.tencent.mm.storage.g gVar, com.tencent.mm.ui.contact.d dVar) {
        java.lang.CharSequence charSequence = null;
        if (com.tencent.mm.storage.z3.m4(gVar.e())) {
            java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(gVar.field_openImAppid, gVar.field_descWordingId);
            if (com.tencent.mm.sdk.platformtools.t8.K0(fj6)) {
                dVar.f206649b.g(null, 0, 0);
            } else {
                if ("3552365301".equals(gVar.field_openImAppid)) {
                    fj6 = "@" + fj6;
                }
                dVar.f206649b.g(fj6, com.tencent.mm.R.color.f479292v8, 14);
            }
        } else {
            dVar.f206649b.g(null, 0, 0);
        }
        if (com.tencent.mm.storage.z3.q4(gVar.e()) || c01.e2.E(gVar.e())) {
            dVar.f206649b.setCompoundRightDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.open_im_main_logo);
            dVar.f206649b.setDrawRightDrawable(true);
        } else {
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = dVar.f206649b;
            if (noMeasuredTextView.G) {
                noMeasuredTextView.setDrawRightDrawable(false);
            }
        }
        try {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = this.f209021h;
            java.lang.String c17 = gVar.c();
            java.lang.String e17 = gVar.e();
            if (c17 == null || c17.length() <= 0) {
                c17 = e17;
            }
            charSequence = ((ke0.e) xVar).bj(context, c17, i65.a.h(this.f209021h, com.tencent.mm.R.dimen.f479897ia));
        } catch (java.lang.Exception unused) {
        }
        if (charSequence == null) {
            charSequence = "";
        }
        dVar.f206649b.setText(charSequence);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).rj(dVar.f206649b, gVar.e(), bi4.c.CONTACT_LIST);
    }

    public void t(com.tencent.mm.storage.g gVar, com.tencent.mm.ui.contact.d dVar) {
        try {
            dVar.f206652e.setText((java.lang.CharSequence) null);
            dVar.f206652e.setVisibility(8);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final boolean u() {
        java.lang.String str = this.f206672v;
        return str.equals("@micromsg.qq.com") || str.equals("@all.contact.without.chatroom") || str.equals("@all.contact.without.chatroom.without.openim");
    }

    public android.database.Cursor v() {
        java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("weixin");
        android.database.Cursor A = ((com.tencent.mm.storage.k4) c01.d9.b().q()).A(this.f206672v, this.f206673w, this.f206674x, linkedList, u(), this.f206671J);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.c(this, linkedList));
        java.lang.System.currentTimeMillis();
        return A;
    }

    public java.lang.String w(com.tencent.mm.storage.g gVar, int i17) {
        if (i17 < this.H) {
            return z(com.tencent.mm.R.string.f489901ex);
        }
        int i18 = gVar.field_showHead;
        if (i18 == 31) {
            return "";
        }
        if (i18 == 123) {
            return "#";
        }
        if (i18 == 33) {
            return z(com.tencent.mm.R.string.f489862ds);
        }
        if (i18 == 43) {
            return z(com.tencent.mm.R.string.i4y);
        }
        if (i18 == 32) {
            return z(com.tencent.mm.R.string.f489901ex);
        }
        android.util.SparseArray sparseArray = this.R;
        java.lang.String str = (java.lang.String) sparseArray.get(i18);
        if (str != null) {
            return str;
        }
        java.lang.String valueOf = java.lang.String.valueOf((char) gVar.field_showHead);
        sparseArray.put(gVar.field_showHead, valueOf);
        return valueOf;
    }

    @Override // android.widget.Adapter
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.g getItem(int i17) {
        if (this.f209019f == null) {
            q(f());
        }
        a("getItem", false);
        this.f209019f.f250438a.moveToPosition(i17);
        e95.a item = this.f209019f.f250438a.getItem(i17);
        if (item != null) {
            e95.h hVar = this.f209019f.f250438a;
            item.v();
        } else {
            com.tencent.mars.xlog.Log.e(this.f209017d, "newcursor getItem error %d", java.lang.Integer.valueOf(i17));
        }
        return (com.tencent.mm.storage.g) item;
    }

    public int y(com.tencent.mm.storage.g gVar, int i17) {
        if (i17 < this.H) {
            return 32;
        }
        if (gVar != null) {
            return gVar.field_showHead;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AddressAdapter", "contact is null, position:%d", java.lang.Integer.valueOf(i17));
        return -1;
    }

    public final java.lang.String z(int i17) {
        android.util.SparseArray sparseArray = this.R;
        java.lang.String str = (java.lang.String) sparseArray.get(i17);
        if (str != null) {
            return str;
        }
        java.lang.String string = this.f209021h.getString(i17);
        sparseArray.put(i17, string);
        return string;
    }
}
