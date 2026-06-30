package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class a2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f191502d = "MicroMsg.FileSelectorAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final int f191503e = 4;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f191504f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f191505g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.n1 f191506h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.r1 f191507i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.n2 f191508m;

    /* renamed from: n, reason: collision with root package name */
    public int f191509n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191510o;

    public a2(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191510o = fileSelectorUI;
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.o.f(synchronizedList, "synchronizedList(...)");
        this.f191504f = synchronizedList;
        java.util.List synchronizedList2 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.o.f(synchronizedList2, "synchronizedList(...)");
        this.f191505g = synchronizedList2;
        this.f191506h = new com.tencent.mm.pluginsdk.ui.tools.n1(fileSelectorUI, this);
        this.f191507i = new com.tencent.mm.pluginsdk.ui.tools.r1(fileSelectorUI, this);
        this.f191508m = new com.tencent.mm.pluginsdk.ui.tools.n2(fileSelectorUI, this);
        this.f191509n = 1;
    }

    public final boolean a(com.tencent.mm.pluginsdk.ui.tools.d2 d2Var) {
        java.util.Iterator it = this.f191505g.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            com.tencent.mm.pluginsdk.ui.tools.d2 d2Var2 = (com.tencent.mm.pluginsdk.ui.tools.d2) it.next();
            if (d2Var2.f191623a == 4) {
                if (d2Var.f191623a == 4 && (d2Var instanceof com.tencent.mm.pluginsdk.ui.tools.e2) && ((com.tencent.mm.pluginsdk.ui.tools.e2) d2Var).f191602q) {
                    boolean z17 = d2Var.f191562f == d2Var2.f191562f;
                    boolean z18 = d2Var.f191566j == d2Var2.f191566j;
                    boolean b17 = kotlin.jvm.internal.o.b(d2Var.f191565i, d2Var2.f191565i);
                    if (z18 && z17 && b17) {
                        return true;
                    }
                }
            } else if (java.lang.String.valueOf(d2Var.f191565i).equals(d2Var2.f191565i) && d2Var2.f191562f == d2Var.f191562f && d2Var2.f191560d == d2Var.f191560d && kotlin.jvm.internal.o.b(d2Var2.f191561e, d2Var.f191561e)) {
                return true;
            }
        }
    }

    public final int c(java.lang.String str, java.lang.String str2) {
        if (str2 == null || r26.n0.N(str2)) {
            str2 = com.tencent.mm.vfs.w6.n(str);
        }
        return yu.i.f465763a.b(false, str2, false, false);
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.pluginsdk.ui.tools.f2 getItem(int i17) {
        return (com.tencent.mm.pluginsdk.ui.tools.f2) this.f191504f.get(i17);
    }

    public final java.util.ArrayList f(java.util.List list) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.ui.tools.d2 d2Var = (com.tencent.mm.pluginsdk.ui.tools.d2) it.next();
            if (d2Var == null || 1 == (i17 = d2Var.f191623a)) {
                com.tencent.mars.xlog.Log.e(this.f191502d, d2Var == null ? "getListItemFromData, fileItem=null" : "getListItemFromData, type:FileType.TYPE_INVALID");
            } else {
                if (4 != i17 && !kotlin.jvm.internal.o.b(str, d2Var.f191625c)) {
                    com.tencent.mm.pluginsdk.ui.tools.g2 g2Var = new com.tencent.mm.pluginsdk.ui.tools.g2(this.f191510o);
                    java.lang.String str2 = d2Var.f191625c;
                    g2Var.f191625c = str2;
                    if (str2 == null) {
                        str2 = "";
                    }
                    g2Var.f191623a = 2;
                    arrayList.add(g2Var);
                    str = str2;
                }
                arrayList.add(d2Var);
            }
        }
        return arrayList;
    }

    public final android.graphics.Bitmap g(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e(this.f191502d, "getThumbnail fail, path not exist");
            return null;
        }
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191510o;
        android.database.Cursor query = fileSelectorUI.getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id"}, "_data=?", new java.lang.String[]{str}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                int i17 = query.getInt(query.getColumnIndex("_id"));
                query.close();
                android.content.ContentResolver contentResolver = fileSelectorUI.getContentResolver();
                zj0.a aVar = new zj0.a();
                aVar.c(null);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(3);
                aVar.c(java.lang.Long.valueOf(i17));
                aVar.c(contentResolver);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter", "getThumbnail", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.content.ContentResolver contentResolver2 = (android.content.ContentResolver) aVar.a(0);
                zj0.c.f473285a.set(aVar);
                long longValue = ((java.lang.Long) aVar.a(1)).longValue();
                zj0.a a17 = zj0.c.a();
                android.graphics.Bitmap thumbnail = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentResolver2, longValue, ((java.lang.Integer) a17.a(2)).intValue(), (android.graphics.BitmapFactory.Options) a17.a(3));
                yj0.a.e(obj, thumbnail, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter", "getThumbnail", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                return thumbnail;
            }
            query.close();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f191504f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return getItem(i17).f191623a;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0185 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013f A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r26, android.view.View r27, android.view.ViewGroup r28) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.a2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f191503e;
    }

    public final boolean h(java.lang.String fileName) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String lowerCase = fileName.toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return (android.os.Build.VERSION.SDK_INT >= 28 && r26.i0.n(lowerCase, ".heic", false)) || r26.i0.n(lowerCase, ".bmp", false) || r26.i0.n(lowerCase, ".png", false) || r26.i0.n(lowerCase, com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, false) || r26.i0.n(lowerCase, ".jpeg", false) || r26.i0.n(lowerCase, ".gif", false);
    }

    public final void j() {
        int i17 = this.f191509n;
        this.f191504f = i17 != 1 ? i17 != 2 ? i17 != 3 ? new java.util.ArrayList() : f(this.f191508m.f191885f) : f(this.f191507i.f191885f) : f(this.f191506h.f191885f);
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191510o;
        int i18 = fileSelectorUI.f191384x;
        if (i18 == 1 || i18 == 2) {
            android.widget.ListView listView = fileSelectorUI.f191369f;
            if (listView == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            listView.setVisibility(0);
            notifyDataSetChanged();
        } else {
            android.widget.ListView listView2 = fileSelectorUI.f191369f;
            if (listView2 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            listView2.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i(this.f191502d, "loadData: size:" + this.f191504f + " selectedTabType:" + fileSelectorUI.f191384x + " fromType:" + this.f191509n);
    }

    public final void k() {
        int i17;
        j();
        int size = this.f191504f.size();
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191510o;
        if (size > 0 || !(1 == (i17 = this.f191509n) || 2 == i17)) {
            com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView = fileSelectorUI.f191371h;
            if (loadingTipsView == null) {
                return;
            }
            loadingTipsView.setVisibility(8);
            return;
        }
        com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView2 = fileSelectorUI.f191371h;
        if (loadingTipsView2 != null) {
            loadingTipsView2.a();
        }
    }

    public final void l(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : -1;
        if (intValue != -1) {
            m(v17, intValue);
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f191502d, "onSelectorWrapperClicked: v:" + v17);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.View r24, int r25) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.a2.m(android.view.View, int):void");
    }

    public final void n(java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        int i17 = this.f191509n;
        this.f191504f = i17 != 1 ? i17 != 2 ? i17 != 3 ? new java.util.ArrayList() : f(this.f191508m.c(content)) : f(this.f191507i.c(content)) : f(this.f191506h.c(content));
        notifyDataSetChanged();
    }

    public final void o(int i17) {
        if (!(i17 != 1 ? i17 != 2 ? i17 != 3 ? true : this.f191508m.f191887h : this.f191507i.f191887h : this.f191506h.f191887h)) {
            if (i17 == 1) {
                com.tencent.mm.pluginsdk.ui.tools.n1 n1Var = this.f191506h;
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = n1Var.f191783r;
                com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView = fileSelectorUI.f191371h;
                if (loadingTipsView != null) {
                    loadingTipsView.setVisibility(0);
                }
                com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView2 = fileSelectorUI.f191371h;
                if (loadingTipsView2 != null) {
                    loadingTipsView2.c();
                }
                n1Var.f191887h = false;
                n1Var.f191888i = 0;
                n1Var.f191884e = 30;
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.tools.l1(n1Var));
            } else if (i17 == 2) {
                com.tencent.mm.pluginsdk.ui.tools.r1 r1Var = this.f191507i;
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI2 = r1Var.f191859o;
                com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView3 = fileSelectorUI2.f191371h;
                if (loadingTipsView3 != null) {
                    loadingTipsView3.setVisibility(0);
                }
                com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView4 = fileSelectorUI2.f191371h;
                if (loadingTipsView4 != null) {
                    loadingTipsView4.c();
                }
                r1Var.f191887h = false;
                r1Var.f191888i = 0;
                r1Var.f191884e = 100;
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.tools.q1(r1Var));
            } else if (i17 == 3) {
                com.tencent.mm.pluginsdk.ui.tools.n2 n2Var = this.f191508m;
                n2Var.getClass();
                n2Var.f191784o = new com.tencent.mm.vfs.r6(lp0.b.Y());
                n2Var.f191787r = false;
                n2Var.e(new com.tencent.mm.vfs.r6(lp0.b.Y()));
            }
        }
        this.f191509n = i17;
        j();
    }

    public final void p(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (this.f191509n != 3) {
            return;
        }
        this.f191508m.e(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(path)));
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191510o.f191374n;
        if (a2Var != null) {
            a2Var.j();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
