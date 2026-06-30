package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class d2 {

    /* renamed from: o, reason: collision with root package name */
    public static int f200849o = 100000;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f200850a;

    /* renamed from: c, reason: collision with root package name */
    public int f200852c;

    /* renamed from: d, reason: collision with root package name */
    public int f200853d;

    /* renamed from: e, reason: collision with root package name */
    public int f200854e;

    /* renamed from: h, reason: collision with root package name */
    public int f200857h;

    /* renamed from: i, reason: collision with root package name */
    public int f200858i;

    /* renamed from: j, reason: collision with root package name */
    public int f200859j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.k1 f200860k;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200855f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f200856g = false;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f200861l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f200862m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f200863n = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f200851b = new java.util.LinkedList();

    public d2(long j17, java.lang.String str, com.tencent.mm.ui.chatting.gallery.k1 k1Var, java.lang.Boolean bool, int i17) {
        this.f200850a = str;
        this.f200860k = k1Var;
        if (k1Var.f201101s) {
            ((java.util.LinkedList) this.f200851b).add(com.tencent.mm.ui.chatting.gallery.j1.q(str, k1Var.f201092g));
            f200849o = 0;
            return;
        }
        f200849o = 100000;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AutoList <init>, currentMsg does not exist, currentMsgId = ");
            sb6.append(j17);
            sb6.append(", stack = ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            iz5.a.g(sb6.toString(), false);
            return;
        }
        ((java.util.LinkedList) this.f200851b).add(Li);
        if (k1Var.f201105w == null) {
            if (i17 == 1) {
                return;
            }
        }
        if (i17 == 2) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.gallery.b2(this, j17, bool, k1Var), "ImageGalleryPrepareData");
        k1Var.f201092g.f200655r3 = new com.tencent.mm.ui.chatting.gallery.c2(this, j17, k1Var);
    }

    public static void a(com.tencent.mm.ui.chatting.gallery.d2 d2Var, boolean z17, long j17) {
        if (z17) {
            d2Var.getClass();
            d2Var.f200851b = new java.util.LinkedList();
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(d2Var.f200850a, j17);
            if (Li.getMsgId() == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AutoList <init>, currentMsg does not exist, currentMsgId = ");
                sb6.append(j17);
                sb6.append(", stack = ");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                iz5.a.g(sb6.toString(), false);
                return;
            }
            ((java.util.LinkedList) d2Var.f200851b).add(Li);
        }
        int i17 = d2Var.f200857h;
        d2Var.f200852c = i17;
        d2Var.f200853d = d2Var.f200858i;
        d2Var.f200854e = d2Var.f200859j;
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "totalCount %s min %s start %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d2Var.f200853d), java.lang.Integer.valueOf(d2Var.f200854e));
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "min spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis()));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        d2Var.c(j17, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "loadMsgInfo spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        d2Var.c(j17, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "loadMsgInfo spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = d2Var.f200860k;
        k1Var.notifyDataSetChanged();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = k1Var.f201092g;
        if (imageGalleryUI.isFinishing()) {
            return;
        }
        int i18 = f200849o;
        if (i18 > 0) {
            android.util.SparseArray sparseArray = k1Var.f228471f;
            k1Var.d(i18 - 1, (android.view.View) sparseArray.get(i18 - 1), imageGalleryUI.f200637n);
            if (z17) {
                int i19 = f200849o + 1;
                k1Var.d(i19, (android.view.View) sparseArray.get(i19), imageGalleryUI.f200637n);
            }
        }
        d2Var.f200855f = true;
    }

    public com.tencent.mm.storage.f9 b(int i17) {
        int i18 = (i17 - f200849o) + this.f200854e;
        int size = (this.f200853d + ((java.util.LinkedList) this.f200851b).size()) - 1;
        int i19 = this.f200853d;
        if (i18 < i19 || i18 > size) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoList", "get, invalid pos " + i18 + ", min = " + this.f200853d + ", max = " + size);
            return null;
        }
        if (i18 == i19) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f200851b).get(0);
            if (this.f200855f && this.f200856g) {
                c(f9Var.getMsgId(), false);
            }
            return f9Var;
        }
        if (i18 == size && size < this.f200852c - 1) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f200851b;
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) linkedList.get(linkedList.size() - 1);
            if (this.f200855f && this.f200856g) {
                c(f9Var2.getMsgId(), true);
            }
            return f9Var2;
        }
        if (i18 - i19 < ((java.util.LinkedList) this.f200851b).size()) {
            return (com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f200851b).get(i18 - this.f200853d);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AutoList", "get error, invalid pos " + i18 + ", min = " + this.f200853d + ", max = " + size);
        return null;
    }

    public final void c(long j17, final boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List list;
        java.lang.String sb6;
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "start loadMsgInfo, currentMsgId = " + j17 + ", forward = " + z17);
        boolean z18 = com.tencent.mm.ui.chatting.gallery.k1.D;
        final java.lang.String str3 = this.f200850a;
        if (!z18) {
            final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
            g9Var.getClass();
            if (str3 == null || str3.isEmpty()) {
                str = "MicroMsg.AutoList";
                str2 = str3;
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid, limit = 10");
                list = null;
            } else {
                final long G2 = g9Var.G2(str3, j17);
                if (G2 == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, msg is null");
                    str = "MicroMsg.AutoList";
                    list = null;
                } else {
                    final java.lang.String X8 = g9Var.X8(str3);
                    final long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str3);
                    if (g9Var.Da(X8)) {
                        final int i17 = 10;
                        str = "MicroMsg.AutoList";
                        list = ot0.c3.l().e("getImgVideoMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$m7
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                java.lang.String str4 = X8;
                                java.lang.String str5 = str3;
                                int i18 = i17;
                                boolean z19 = z17;
                                long j18 = m07;
                                long j19 = G2;
                                ot0.z2 z2Var = ot0.z2.f348822a;
                                com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                                return new java.util.ArrayList(z2Var.i0(g9Var2.f193989r, str4, str5, i18, z19, j18, j19, g9Var2.v4()));
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$n7
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                java.lang.String str4;
                                com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                                g9Var2.getClass();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                boolean z19 = z17;
                                java.lang.String str5 = X8;
                                long j18 = m07;
                                java.lang.String str6 = str3;
                                long j19 = G2;
                                int i18 = i17;
                                if (z19) {
                                    str4 = "select * from " + str5 + " where" + g9Var2.P0(j18) + g9Var2.Z8(str6) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime > " + j19 + " order by createTime ASC limit " + i18;
                                } else {
                                    str4 = "select * from " + str5 + " where" + g9Var2.P0(j18) + g9Var2.Z8(str6) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < " + j19 + " order by createTime DESC limit " + i18;
                                }
                                android.database.Cursor f17 = g9Var2.f193989r.f(str4, null, 2);
                                while (f17.moveToNext()) {
                                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                                    f9Var.convertFrom(f17);
                                    arrayList.add(f9Var);
                                }
                                if (!z19) {
                                    java.util.Collections.reverse(arrayList);
                                }
                                f17.close();
                                return new java.util.ArrayList(arrayList);
                            }
                        });
                    } else {
                        str = "MicroMsg.AutoList";
                        if (g9Var.Pb(X8)) {
                            str2 = str3;
                            list = ot0.z2.f348822a.i0(g9Var.f193989r, X8, str3, 10, z17, m07, G2, g9Var.v4());
                        } else {
                            str2 = str3;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            android.database.Cursor f17 = g9Var.f193989r.f(z17 ? "select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str2) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime > " + G2 + " order by createTime ASC limit 10" : "select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str2) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < " + G2 + " order by createTime DESC limit 10", null, 2);
                            while (f17.moveToNext()) {
                                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                                f9Var.convertFrom(f17);
                                arrayList.add(f9Var);
                            }
                            if (!z17) {
                                java.util.Collections.reverse(arrayList);
                            }
                            f17.close();
                            list = arrayList;
                        }
                    }
                }
            }
            if (list != null || list.size() == 0) {
                com.tencent.mars.xlog.Log.w(str, "loadMsgInfo fail, addedMsgList is null, forward = " + z17);
            }
            java.lang.String str4 = str;
            com.tencent.mars.xlog.Log.i(str4, "loadMsgInfo done, new added list, size = " + list.size() + ", forward = " + z17);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i18 = 0; i18 < list.size(); i18++) {
                if (com.tencent.mm.ui.chatting.gallery.k1.L((com.tencent.mm.storage.f9) list.get(i18)) || com.tencent.mm.ui.chatting.gallery.k1.K((com.tencent.mm.storage.f9) list.get(i18))) {
                    arrayList2.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) list.get(i18)).getMsgId()));
                }
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.l0 Di = m11.b1.Di();
            java.lang.Long[] lArr = (java.lang.Long[]) arrayList2.toArray(new java.lang.Long[0]);
            Di.getClass();
            int length = lArr.length;
            java.lang.String str5 = "(";
            boolean z19 = true;
            int i19 = 0;
            while (i19 < length) {
                long longValue = lArr[i19].longValue();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str5);
                sb7.append(z19 ? java.lang.Long.valueOf(longValue) : "," + longValue);
                str5 = sb7.toString();
                i19++;
                z19 = false;
            }
            java.lang.String str6 = str5 + ")";
            java.util.HashMap hashMap = new java.util.HashMap();
            if (pt0.p.f358218a1.a("ImgInfo2")) {
                android.database.Cursor D3 = Di.D3("ImgInfo2", null, "msglocalid in " + str6 + " AND msgTalker=?", new java.lang.String[]{"" + str2}, null, null, null);
                while (D3.moveToNext()) {
                    m11.b0 b0Var = new m11.b0();
                    b0Var.b(D3, false);
                    hashMap.put(java.lang.Long.valueOf(b0Var.f322634b), b0Var);
                }
                D3.close();
            } else {
                android.database.Cursor D32 = Di.D3("ImgInfo2", null, "msglocalid in " + str6, null, null, null, null);
                while (D32.moveToNext()) {
                    m11.b0 b0Var2 = new m11.b0();
                    b0Var2.b(D32, false);
                    hashMap.put(java.lang.Long.valueOf(b0Var2.f322634b), b0Var2);
                }
                D32.close();
            }
            for (m11.b0 b0Var3 : hashMap.values()) {
                this.f200862m.put(java.lang.Long.valueOf(b0Var3.f322633a), b0Var3);
                long j18 = b0Var3.f322634b;
                if (j18 != 0) {
                    this.f200861l.put(java.lang.Long.valueOf(j18), b0Var3);
                }
            }
            com.tencent.mars.xlog.Log.i(str4, "loadImgInfo spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            if (z17) {
                this.f200851b.addAll(list);
                return;
            }
            this.f200851b.addAll(0, list);
            int size = this.f200853d - list.size();
            this.f200853d = size;
            if (size < 0) {
                com.tencent.mars.xlog.Log.e(str4, "loadMsgInfo fail, min should not be minus, min = " + this.f200853d);
                return;
            } else {
                com.tencent.mars.xlog.Log.i(str4, "min from " + (this.f200853d + list.size()) + " to " + this.f200853d);
                return;
            }
        }
        com.tencent.mm.storage.v j19 = c01.d9.b().j();
        long j27 = com.tencent.mm.ui.chatting.gallery.k1.C;
        j19.getClass();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (str3 == null || str3.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid, limit = 10");
        } else {
            xg3.m0 m0Var = j19.f193895a;
            long G22 = ((com.tencent.mm.storage.g9) m0Var).G2(str3, j17);
            if (G22 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, msg is null");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (z17) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("select * from ");
                    sb8.append(j19.e(str3));
                    sb8.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                    sb8.append(j19.l(str3, j27));
                    sb8.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime > ");
                    m0Var.getClass();
                    sb8.append(G22);
                    sb8.append("  order by createTime ASC limit 10");
                    sb6 = sb8.toString();
                } else {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("select * from ");
                    sb9.append(j19.e(str3));
                    sb9.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                    sb9.append(j19.l(str3, j27));
                    sb9.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < ");
                    m0Var.getClass();
                    sb9.append(G22);
                    sb9.append("  order by createTime DESC limit 10");
                    sb6 = sb9.toString();
                }
                android.database.Cursor B = j19.d().B(sb6, null);
                if (B.moveToFirst()) {
                    while (!B.isAfterLast()) {
                        com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                        f9Var2.convertFrom(B);
                        B.moveToNext();
                        if (z17) {
                            arrayList3.add(f9Var2);
                        } else {
                            arrayList3.add(0, f9Var2);
                        }
                    }
                }
                B.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.BizChatMessageStorage", "getBizChatImgVideoMessage spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
                list = arrayList3;
                str = "MicroMsg.AutoList";
            }
        }
        list = null;
        str = "MicroMsg.AutoList";
        str2 = str3;
        if (list != null) {
        }
        com.tencent.mars.xlog.Log.w(str, "loadMsgInfo fail, addedMsgList is null, forward = " + z17);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("AutoList, Size = " + this.f200851b.size());
        sb6.append("; Content = {");
        java.util.Iterator it = this.f200851b.iterator();
        while (it.hasNext()) {
            sb6.append(((com.tencent.mm.storage.f9) it.next()).getMsgId());
            sb6.append(",");
        }
        sb6.append("}");
        return sb6.toString();
    }
}
