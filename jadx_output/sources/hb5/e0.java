package hb5;

/* loaded from: classes9.dex */
public class e0 extends android.widget.BaseAdapter implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int N = 0;
    public hb5.k0 A;
    public hb5.k0 C;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280164d;

    /* renamed from: e, reason: collision with root package name */
    public final int f280165e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f280166f;

    /* renamed from: g, reason: collision with root package name */
    public o11.g f280167g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f280168h;

    /* renamed from: i, reason: collision with root package name */
    public int f280169i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f280170m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f280171n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f280172o;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f280177t;

    /* renamed from: u, reason: collision with root package name */
    public hb5.k0 f280178u;

    /* renamed from: w, reason: collision with root package name */
    public hb5.k0 f280180w;

    /* renamed from: x, reason: collision with root package name */
    public hb5.k0 f280181x;

    /* renamed from: z, reason: collision with root package name */
    public hb5.k0 f280183z;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f280173p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f280174q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f280175r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f280176s = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f280179v = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f280182y = new java.util.ArrayList();
    public final java.util.ArrayList B = new java.util.ArrayList();
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public boolean G = true;
    public boolean H = true;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f280163J = 0;
    public int K = 0;
    public boolean L = false;
    public int M = 0;

    public e0(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = false;
        this.f280168h = context;
        this.f280164d = str;
        this.f280165e = i17;
        this.f280170m = i17 == 1 || i17 == 2;
        this.f280171n = i17 == 1 || i17 == 3;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (i17 == 1 || i17 == 4)) {
            z17 = true;
        }
        this.f280172o = z17;
        this.f280169i = i17 != 1 ? Integer.MAX_VALUE : 3;
        o11.f fVar = new o11.f();
        java.lang.String str3 = s01.r.f401924a;
        fVar.f342083g = qk.b.a(str);
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
        fVar.f342097u = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479767eo) * 0.1f;
        fVar.f342096t = true;
        this.f280167g = fVar.a();
        if (this.f280172o) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor o17 = r01.q3.cj().o1(str2, true);
            while (o17.moveToNext()) {
                r45.co coVar = new r45.co();
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(o17);
                qk.o oVar = new qk.o();
                oVar.convertFrom(o17);
                coVar.f371676d = z3Var.d1();
                coVar.f371677e = z3Var;
                coVar.f371678f = oVar;
                fb5.n nVar = new fb5.n();
                nVar.f260898b = coVar;
                if (oVar.F0()) {
                    nVar.f260897a = "!1";
                } else if (coVar.f371677e.w2()) {
                    nVar.f260897a = "!2";
                } else {
                    int c27 = coVar.f371677e.c2();
                    if (c27 >= 97 && c27 <= 122) {
                        c27 -= 32;
                    }
                    if (c27 < 65 || c27 > 90) {
                        nVar.f260897a = "#";
                    } else {
                        nVar.f260897a = ((char) c27) + "";
                    }
                }
                arrayList.add(nVar);
            }
            o17.close();
            java.util.Collections.sort(arrayList, new hb5.d0(this, null));
            this.f280177t = arrayList;
        }
        if (this.f280170m) {
            c01.d9.e().a(1364, this);
        }
    }

    public final void a() {
        this.M = 0;
        this.f280174q.clear();
        this.f280173p.clear();
        this.f280175r.clear();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hb5.k0 getItem(int i17) {
        int i18 = this.I;
        if (i17 >= i18) {
            int i19 = this.f280163J;
            if (i17 < i19) {
                if (i17 == i18) {
                    if (this.f280181x == null) {
                        this.f280181x = new hb5.k0(5, 2);
                    }
                    return this.f280181x;
                }
                if (i17 == this.K - 1 && this.G && d()) {
                    if (this.f280183z == null) {
                        this.f280183z = new hb5.k0(3, 2);
                    }
                    return this.f280183z;
                }
                int i27 = (i17 - this.I) - 1;
                if (i27 >= 0) {
                    java.util.ArrayList arrayList = this.f280182y;
                    if (i27 < arrayList.size()) {
                        return (hb5.k0) arrayList.get(i27);
                    }
                }
            } else {
                if (i17 == i19) {
                    if (this.A == null) {
                        this.A = new hb5.k0(5, 3);
                    }
                    return this.A;
                }
                if (i17 == this.K - 1 && this.H && d()) {
                    if (this.C == null) {
                        this.C = new hb5.k0(3, 3);
                    }
                    return this.C;
                }
                int i28 = (i17 - this.f280163J) - 1;
                if (i28 >= 0) {
                    java.util.ArrayList arrayList2 = this.B;
                    if (i28 < arrayList2.size()) {
                        return (hb5.k0) arrayList2.get(i28);
                    }
                }
            }
        } else {
            if (i17 == 0) {
                if (this.f280178u == null) {
                    this.f280178u = new hb5.k0(5, 1);
                }
                return this.f280178u;
            }
            if (i17 == i18 - 1 && this.E && d()) {
                if (this.f280180w == null) {
                    this.f280180w = new hb5.k0();
                }
                hb5.k0 k0Var = this.f280180w;
                k0Var.f280210a = 4;
                k0Var.f280211b = 1;
                return this.f280180w;
            }
            if (i17 == this.I - 1 && this.D && d()) {
                if (this.f280180w == null) {
                    this.f280180w = new hb5.k0();
                }
                hb5.k0 k0Var2 = this.f280180w;
                k0Var2.f280210a = 3;
                k0Var2.f280211b = 1;
                return this.f280180w;
            }
            int i29 = i17 - 1;
            if (i29 >= 0) {
                java.util.ArrayList arrayList3 = this.f280179v;
                if (i29 < arrayList3.size()) {
                    return (hb5.k0) arrayList3.get(i29);
                }
            }
        }
        return new hb5.k0();
    }

    public final boolean d() {
        return this.f280165e == 1;
    }

    public final boolean f() {
        return this.f280165e == 2;
    }

    public final void g() {
        com.tencent.mm.ui.bizchat.BizChatSearchUI bizChatSearchUI = (com.tencent.mm.ui.bizchat.BizChatSearchUI) this.f280168h;
        bizChatSearchUI.getClass();
        if (d()) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f280166f)) {
                bizChatSearchUI.f197933n.setVisibility(8);
                bizChatSearchUI.f197932m.setVisibility(8);
                return;
            } else if (this.K <= 0) {
                bizChatSearchUI.f197933n.setVisibility(0);
                bizChatSearchUI.f197932m.setVisibility(8);
                return;
            } else {
                bizChatSearchUI.f197933n.setVisibility(8);
                bizChatSearchUI.f197932m.setVisibility(0);
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f280166f)) {
            bizChatSearchUI.f197933n.setVisibility(0);
            bizChatSearchUI.f197933n.setText("");
            bizChatSearchUI.f197932m.setVisibility(8);
        } else if (f() && this.E) {
            bizChatSearchUI.f197933n.setVisibility(0);
            bizChatSearchUI.f197933n.setText(com.tencent.mm.R.string.ao7);
            bizChatSearchUI.f197932m.setVisibility(8);
        } else if (f() && this.L) {
            bizChatSearchUI.f197933n.setVisibility(0);
            bizChatSearchUI.f197933n.setText(com.tencent.mm.R.string.ao8);
            bizChatSearchUI.f197932m.setVisibility(8);
        } else if (this.K <= 0) {
            bizChatSearchUI.f197933n.setVisibility(0);
            android.widget.TextView textView = bizChatSearchUI.f197933n;
            java.lang.String string = bizChatSearchUI.getString(com.tencent.mm.R.string.icq);
            java.lang.String string2 = bizChatSearchUI.getString(com.tencent.mm.R.string.icp);
            java.lang.String str = this.f280166f;
            textView.setText(o13.q.d(string, string2, p13.i.a(str, str, false, false)).f351105a);
            bizChatSearchUI.f197932m.setVisibility(8);
        } else {
            bizChatSearchUI.f197933n.setVisibility(8);
            bizChatSearchUI.f197932m.setVisibility(0);
        }
        if (f()) {
            if (this.F) {
                bizChatSearchUI.U6(1);
            } else if (this.D) {
                bizChatSearchUI.U6(2);
            } else {
                bizChatSearchUI.U6(0);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.K;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        hb5.k0 item = getItem(i17);
        if (item != null) {
            return item.f280210a;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x035b, code lost:
    
        if (r3 != r26.K) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0325  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb5.e0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }

    public final void h(boolean z17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4 = this.f280179v;
        arrayList4.clear();
        java.util.ArrayList arrayList5 = this.f280182y;
        arrayList5.clear();
        java.util.ArrayList arrayList6 = this.B;
        arrayList6.clear();
        int i17 = 0;
        while (true) {
            int i18 = this.f280169i;
            arrayList = this.f280174q;
            if (i17 >= java.lang.Math.min(i18, arrayList.size())) {
                break;
            }
            arrayList4.add(new hb5.k0(1, arrayList.get(i17)));
            i17++;
        }
        int i19 = 0;
        while (true) {
            int i27 = this.f280169i;
            arrayList2 = this.f280175r;
            if (i19 >= java.lang.Math.min(i27, arrayList2.size())) {
                break;
            }
            arrayList5.add(new hb5.k0(2, arrayList2.get(i19)));
            i19++;
        }
        int i28 = 0;
        while (true) {
            int i29 = this.f280169i;
            arrayList3 = this.f280176s;
            if (i28 >= java.lang.Math.min(i29, arrayList3.size())) {
                break;
            }
            arrayList6.add(new hb5.k0(6, arrayList3.get(i28)));
            i28++;
        }
        int size = arrayList.size();
        int size2 = arrayList2.size();
        int size3 = arrayList3.size();
        if (this.f280165e != 2) {
            this.D = arrayList.size() > this.f280169i;
        }
        this.G = arrayList2.size() > this.f280169i;
        int size4 = arrayList3.size();
        int i37 = this.f280169i;
        this.H = size4 > i37;
        if (size > 0 || this.E) {
            int min = java.lang.Math.min(size, i37) + 1;
            if (d()) {
                r3 = ((this.E || this.D) ? 1 : 0) + min;
            } else {
                r3 = min;
            }
        }
        this.I = r3;
        if (size2 > 0) {
            r3 = r3 + 1 + java.lang.Math.min(size2, this.f280169i);
            if (d()) {
                r3 += this.G ? 1 : 0;
            }
        }
        this.f280163J = r3;
        if (size3 > 0) {
            r3 = r3 + 1 + java.lang.Math.min(size3, this.f280169i);
            if (d()) {
                r3 += this.H ? 1 : 0;
            }
        }
        this.K = r3;
        if (z17) {
            notifyDataSetChanged();
            g();
        }
    }

    public final void j(java.lang.String str) {
        java.util.List list;
        r45.co coVar;
        java.util.ArrayList arrayList = this.f280176s;
        arrayList.clear();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (list = this.f280177t) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                fb5.n nVar = (fb5.n) it.next();
                boolean z17 = false;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && nVar != null && (coVar = (r45.co) nVar.f260898b) != null) {
                    java.lang.String g27 = coVar.f371677e.g2();
                    java.lang.String T0 = coVar.f371677e.T0();
                    java.lang.String U0 = coVar.f371677e.U0();
                    java.lang.String upperCase = str.toUpperCase();
                    if ((!com.tencent.mm.sdk.platformtools.t8.K0(g27) && g27.toUpperCase().indexOf(upperCase) != -1) || ((!com.tencent.mm.sdk.platformtools.t8.K0(T0) && T0.toUpperCase().indexOf(upperCase) != -1) || (!com.tencent.mm.sdk.platformtools.t8.K0(U0) && U0.toUpperCase().startsWith(upperCase)))) {
                        z17 = true;
                    }
                }
                if (z17) {
                    arrayList.add(nVar);
                }
            }
        }
        h(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r7.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        r0 = new s01.h();
        r0.convertFrom(r7);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r7.moveToNext() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            s01.g r0 = r01.q3.aj()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            r3 = 0
            if (r2 == 0) goto L14
            goto L5b
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "select BizChatInfo.* from BizChatConversation , BizChatInfo where BizChatConversation.brandUserName = '"
            r2.<init>(r4)
            java.lang.String r4 = r6.f280164d
            r2.append(r4)
            java.lang.String r5 = "' and BizChatInfo.brandUserName = '"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "' and BizChatConversation.bizChatId = BizChatInfo.bizChatLocalId and BizChatInfo.chatName like '%"
            r2.append(r4)
            r2.append(r7)
            java.lang.String r7 = "%' order by BizChatConversation.flag desc , BizChatConversation.lastMsgTime desc"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String[] r2 = new java.lang.String[r3]
            android.database.Cursor r7 = r0.rawQuery(r7, r2)
            if (r7 == 0) goto L5b
            boolean r0 = r7.moveToFirst()
            if (r0 == 0) goto L58
        L47:
            s01.h r0 = new s01.h
            r0.<init>()
            r0.convertFrom(r7)
            r1.add(r0)
            boolean r0 = r7.moveToNext()
            if (r0 != 0) goto L47
        L58:
            r7.close()
        L5b:
            r6.a()
            java.util.Iterator r7 = r1.iterator()
        L62:
            boolean r0 = r7.hasNext()
            java.util.ArrayList r1 = r6.f280174q
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r7.next()
            s01.h r0 = (s01.h) r0
            boolean r2 = r0.y0()
            if (r2 == 0) goto L80
            boolean r4 = r6.f280171n
            if (r4 == 0) goto L80
            java.util.ArrayList r1 = r6.f280175r
            r1.add(r0)
            goto L62
        L80:
            if (r2 != 0) goto L62
            boolean r2 = r6.f280170m
            if (r2 == 0) goto L62
            r1.add(r0)
            java.util.ArrayList r1 = r6.f280173p
            r1.add(r0)
            goto L62
        L8f:
            boolean r7 = r6.f280170m
            if (r7 == 0) goto L9e
            int r7 = r1.size()
            int r0 = r6.f280169i
            if (r7 > r0) goto L9c
            r3 = 1
        L9c:
            r6.E = r3
        L9e:
            r6.h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb5.e0.k(java.lang.String, boolean):void");
    }

    public final android.text.SpannableString l(android.content.Context context, android.text.Spannable spannable, int i17, boolean z17) {
        android.text.SpannableString n17;
        if (z17) {
            n17 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, spannable, i17);
        } else {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            n17 = com.tencent.mm.pluginsdk.ui.span.c0.n(context, spannable, i17);
        }
        android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.ForegroundColorSpan.class);
        if (foregroundColorSpanArr != null) {
            for (android.text.style.ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                n17.setSpan(foregroundColorSpan, spannable.getSpanStart(foregroundColorSpan), spannable.getSpanEnd(foregroundColorSpan), spannable.getSpanFlags(foregroundColorSpan));
            }
        }
        return n17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gi5 gi5Var;
        boolean z17;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.protobuf.f fVar2;
        if (this.f280170m && m1Var.getType() == 1364 && (m1Var instanceof s01.e0)) {
            this.F = false;
            s01.e0 e0Var = (s01.e0) m1Var;
            r45.wj wjVar = null;
            com.tencent.mm.modelbase.o oVar = e0Var.f401864e;
            r45.vj vjVar = (oVar == null || (fVar2 = oVar.f70710a.f70684a) == null) ? null : (r45.vj) fVar2;
            java.lang.String str2 = vjVar.f388298e;
            java.lang.String str3 = vjVar.f388297d;
            if (str2.equals(this.f280166f) && str3.equals(this.f280164d) && this.M == vjVar.f388299f) {
                if (i17 != 0 || i18 != 0) {
                    if (f()) {
                        this.E = false;
                        this.L = true;
                        g();
                        return;
                    }
                    return;
                }
                com.tencent.mm.modelbase.o oVar2 = e0Var.f401864e;
                if (oVar2 != null && (fVar = oVar2.f70711b.f70700a) != null) {
                    wjVar = (r45.wj) fVar;
                }
                if (wjVar == null || (gi5Var = wjVar.f389213d) == null || gi5Var.f375288d != 0) {
                    if (f()) {
                        this.E = false;
                        this.L = true;
                        g();
                        return;
                    }
                    return;
                }
                java.util.LinkedList<r45.uj> linkedList = wjVar.f389214e;
                boolean z18 = wjVar.f389215f;
                if (str2.equals(this.f280166f)) {
                    this.E = false;
                    this.M += linkedList.size();
                    boolean d17 = d();
                    java.util.ArrayList arrayList = this.f280173p;
                    java.util.ArrayList arrayList2 = this.f280174q;
                    if (d17) {
                        if (arrayList2.size() < arrayList.size()) {
                            k(str2, true);
                            return;
                        } else if (arrayList2.size() > arrayList.size()) {
                            h(true);
                            return;
                        }
                    }
                    if (f()) {
                        this.D = z18;
                    }
                    if (this.f280165e == 3) {
                        return;
                    }
                    for (r45.uj ujVar : linkedList) {
                        r45.xj xjVar = ujVar.f387407d;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(xjVar.f390153d)) {
                            java.util.Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (xjVar.f390153d.equals(((s01.h) it.next()).field_bizChatServId)) {
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    z17 = false;
                                    break;
                                }
                            }
                            if (!z17) {
                                arrayList2.add(ujVar);
                            }
                        }
                    }
                    h(true);
                }
            }
        }
    }
}
