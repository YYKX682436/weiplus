package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f202167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202169f;

    public d3(com.tencent.mm.ui.chatting.presenter.n3 n3Var, boolean z17, int i17) {
        this.f202169f = n3Var;
        this.f202167d = z17;
        this.f202168e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.database.Cursor cursor;
        java.util.LinkedList linkedList;
        java.lang.String str;
        com.tencent.mm.ui.chatting.presenter.n3 n3Var;
        java.util.LinkedList linkedList2;
        android.database.Cursor cursor2;
        java.lang.String str2;
        java.lang.String str3;
        android.database.Cursor cursor3;
        android.database.Cursor cursor4;
        com.tencent.mm.ui.chatting.presenter.n3 n3Var2;
        java.util.LinkedList linkedList3;
        android.database.Cursor cursor5;
        long j17;
        boolean z17 = this.f202167d;
        com.tencent.mm.ui.chatting.presenter.n3 n3Var3 = this.f202169f;
        if (z17) {
            if (n3Var3.f202360h == -1) {
                n3Var3.f202369t = ((com.tencent.mm.storage.g9) c01.d9.b().u()).S3(n3Var3.f202359g);
            } else {
                n3Var3.f202369t = c01.d9.b().j().k(n3Var3.f202359g, n3Var3.f202360h);
            }
        }
        int i17 = this.f202168e;
        int max = i17 >= 0 ? java.lang.Math.max(n3Var3.f202369t - i17, 200) : 200;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(max));
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        long j18 = n3Var3.f202360h;
        java.util.ArrayList arrayList = n3Var3.f202357e;
        if (j18 == -1) {
            cursor = ((com.tencent.mm.storage.g9) c01.d9.b().u()).p1(n3Var3.f202359g, arrayList.size() - n3Var3.f202368s, max);
        } else {
            com.tencent.mm.storage.v j19 = c01.d9.b().j();
            java.lang.String str4 = n3Var3.f202359g;
            long j27 = n3Var3.f202360h;
            int size = arrayList.size() - n3Var3.f202368s;
            j19.getClass();
            if (str4 == null || str4.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
                cursor = null;
            } else {
                java.lang.String e17 = j19.e(str4);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ( select * from ");
                sb6.append(e17);
                sb6.append("  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                sb6.append(j19.i(str4));
                sb6.append(j19.l(str4, j27));
                sb6.append("AND type IN (3,39,13,43,62,44,268435505,486539313) order by createTime DESC limit ");
                j19.f193895a.getClass();
                sb6.append(max);
                sb6.append(" OFFSET ");
                sb6.append(size);
                sb6.append(") order by createTime ASC ");
                cursor = j19.d().B(sb6.toString(), null);
            }
        }
        if (cursor == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] NULL == cursor ");
            return;
        }
        long j28 = 0;
        while (cursor.moveToNext()) {
            try {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(cursor);
                long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var.getCreateTime()));
                if (j28 != a17) {
                    j17 = a17;
                    linkedList4.add(new com.tencent.mm.ui.chatting.adapter.w(f9Var.getCreateTime()));
                    n3Var3.f202368s++;
                } else {
                    j17 = a17;
                }
                linkedList4.add(new com.tencent.mm.ui.chatting.adapter.w(f9Var));
                j28 = j17;
            } catch (java.lang.Throwable th6) {
                cursor.close();
                throw th6;
            }
        }
        cursor.close();
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        if (linkedList4.size() - n3Var3.f202368s == max) {
            final long j29 = ((com.tencent.mm.ui.chatting.adapter.w) linkedList4.get(0)).f198449d;
            final long b17 = com.tencent.mm.ui.gridviewheaders.a.e().b(j29);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] list size:%s start:%s end:%s", java.lang.Integer.valueOf(linkedList4.size()), java.lang.Long.valueOf(b17), java.lang.Long.valueOf(j29));
            if (n3Var3.f202360h == -1) {
                xg3.m0 u17 = c01.d9.b().u();
                final java.lang.String str5 = n3Var3.f202359g;
                final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) u17;
                g9Var.getClass();
                if (str5 == null || str5.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
                    cursor5 = null;
                } else {
                    final java.lang.String X8 = g9Var.X8(str5);
                    if (g9Var.Da(X8)) {
                        cursor5 = ot0.c3.l().c("getAllImgVideoMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$j2
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                java.lang.String str6 = X8;
                                java.lang.String str7 = str5;
                                long j37 = b17;
                                long j38 = j29;
                                ot0.z2 z2Var = ot0.z2.f348822a;
                                com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                                return z2Var.j(g9Var2.f193989r, str6, str7, g9Var2.y4(), j37, j38);
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$l2
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                                g9Var2.getClass();
                                return g9Var2.f193989r.f("select * from " + X8 + " where" + g9Var2.Z8(str5) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime >= " + b17 + " AND createTime< " + j29 + " order by createTime ASC", null, 2);
                            }
                        });
                    } else if (g9Var.Pb(X8)) {
                        cursor5 = ot0.z2.f348822a.j(g9Var.f193989r, X8, str5, g9Var.y4(), b17, j29);
                    } else {
                        cursor5 = g9Var.f193989r.f("select * from " + X8 + " where" + g9Var.Z8(str5) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime >= " + b17 + " AND createTime< " + j29 + " order by createTime ASC", null, 2);
                    }
                }
                cursor4 = cursor5;
                n3Var = n3Var3;
                linkedList2 = linkedList4;
                str = "MicroMsg.MediaHistoryGalleryPresenter";
            } else {
                com.tencent.mm.storage.v j37 = c01.d9.b().j();
                str = "MicroMsg.MediaHistoryGalleryPresenter";
                java.lang.String str6 = n3Var3.f202359g;
                long j38 = n3Var3.f202360h;
                j37.getClass();
                if (str6 == null) {
                    n3Var = n3Var3;
                    linkedList2 = linkedList4;
                    cursor2 = null;
                    str2 = "MicroMsg.BizChatMessageStorage";
                    str3 = "getImgMessage fail, argument is invalid";
                } else if (str6.length() == 0) {
                    n3Var = n3Var3;
                    linkedList2 = linkedList4;
                    str2 = "MicroMsg.BizChatMessageStorage";
                    str3 = "getImgMessage fail, argument is invalid";
                    cursor2 = null;
                } else {
                    linkedList2 = linkedList4;
                    java.lang.String e18 = j37.e(str6);
                    n3Var = n3Var3;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select * from ");
                    sb7.append(e18);
                    sb7.append("  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                    sb7.append(j37.l(str6, j38));
                    sb7.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime >= ");
                    j37.f193895a.getClass();
                    sb7.append(b17);
                    sb7.append(" AND createTime< ");
                    sb7.append(j29);
                    sb7.append(" order by createTime ASC");
                    cursor3 = j37.d().B(sb7.toString(), null);
                    cursor4 = cursor3;
                }
                com.tencent.mars.xlog.Log.e(str2, str3);
                cursor3 = cursor2;
                cursor4 = cursor3;
            }
            java.util.Date date = new java.util.Date(j29);
            long a18 = com.tencent.mm.ui.gridviewheaders.a.e().a(date);
            while (cursor4 != null) {
                try {
                    if (!cursor4.moveToNext()) {
                        break;
                    }
                    com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                    f9Var2.convertFrom(cursor4);
                    long a19 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var2.getCreateTime()));
                    if (a18 == a19 || com.tencent.mm.ui.gridviewheaders.a.e().a(date) == a19) {
                        n3Var2 = n3Var;
                        if (linkedList2.size() > 0 && linkedList5.size() == 0) {
                            linkedList3 = linkedList2;
                            linkedList5.add(0, (com.tencent.mm.ui.chatting.adapter.w) linkedList3.remove(0));
                            linkedList5.add(new com.tencent.mm.ui.chatting.adapter.w(f9Var2));
                            linkedList2 = linkedList3;
                            n3Var = n3Var2;
                        }
                    } else {
                        linkedList5.add(new com.tencent.mm.ui.chatting.adapter.w(f9Var2.getCreateTime()));
                        n3Var2 = n3Var;
                        n3Var2.f202368s++;
                        a18 = a19;
                    }
                    linkedList3 = linkedList2;
                    linkedList5.add(new com.tencent.mm.ui.chatting.adapter.w(f9Var2));
                    linkedList2 = linkedList3;
                    n3Var = n3Var2;
                } catch (java.lang.Throwable th7) {
                    cursor4.close();
                    throw th7;
                }
            }
            linkedList = linkedList2;
            if (cursor4 != null) {
                cursor4.close();
            }
        } else {
            linkedList = linkedList4;
            str = "MicroMsg.MediaHistoryGalleryPresenter";
        }
        java.util.LinkedList linkedList6 = new java.util.LinkedList();
        linkedList6.addAll(linkedList5);
        linkedList6.addAll(linkedList);
        com.tencent.mars.xlog.Log.i(str, "[loadData] linkedList:%s linkedList1:%s finalAddList:%s", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList5.size()), java.lang.Integer.valueOf(linkedList6.size()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.c3(this, linkedList6));
    }
}
