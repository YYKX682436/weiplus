package r82;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f393306d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.ra f393307e;

    public e() {
        super(0);
        this.f393306d = new com.tencent.mm.sdk.platformtools.r2(10);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        final o72.r2 r2Var;
        com.tencent.mm.plugin.fav.ui.ra raVar;
        o72.r2 r2Var2;
        com.tencent.mm.autogen.events.FavImageServiceEvent favImageServiceEvent = (com.tencent.mm.autogen.events.FavImageServiceEvent) iEvent;
        am.s9 s9Var = favImageServiceEvent.f54236g;
        long j17 = s9Var.f7880c;
        android.graphics.Bitmap bitmap = null;
        if (j17 != 0) {
            if (s9Var.f7888k) {
                r2Var2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(favImageServiceEvent.f54236g.f7880c);
                if (r2Var2 != null) {
                    this.f393306d.put(java.lang.Long.valueOf(favImageServiceEvent.f54236g.f7880c), r2Var2);
                }
            } else {
                r2Var2 = (o72.r2) this.f393306d.get(java.lang.Long.valueOf(j17));
                if (r2Var2 == null && (r2Var2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(favImageServiceEvent.f54236g.f7880c)) != null) {
                    this.f393306d.put(java.lang.Long.valueOf(favImageServiceEvent.f54236g.f7880c), r2Var2);
                }
            }
            r2Var = r2Var2;
        } else {
            r2Var = null;
        }
        am.s9 s9Var2 = favImageServiceEvent.f54236g;
        int i17 = s9Var2.f7878a;
        long j18 = s9Var2.f7880c;
        final boolean z17 = false;
        if (r2Var != null || i17 == 3 || i17 == 4) {
            if (i17 == 0) {
                favImageServiceEvent.f54237h.f7992a = com.tencent.mm.plugin.fav.ui.ra.i(s9Var2.f7879b, r2Var);
            } else if (i17 == 1) {
                com.tencent.mm.plugin.fav.ui.ra raVar2 = this.f393307e;
                if (raVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavImageServiceListener", "imageServer is null");
                } else {
                    raVar2.a(s9Var2.f7882e, s9Var2.f7879b, r2Var, s9Var2.f7883f, s9Var2.f7884g, s9Var2.f7885h);
                }
            } else if (i17 != 2) {
                if (i17 == 3) {
                    com.tencent.mm.plugin.fav.ui.ra raVar3 = this.f393307e;
                    if (raVar3 != null) {
                        raVar3.f();
                    }
                    this.f393307e = new com.tencent.mm.plugin.fav.ui.ra(favImageServiceEvent.f54236g.f7886i, 16);
                } else if (i17 == 4 && (raVar = this.f393307e) != null) {
                    raVar.f();
                    this.f393307e = null;
                }
            } else if (s9Var2.f7887j) {
                am.t9 t9Var = favImageServiceEvent.f54237h;
                r45.gp0 gp0Var = s9Var2.f7879b;
                java.util.Map map = com.tencent.mm.plugin.fav.ui.ra.f101381e;
                if (!fp.i.b()) {
                    android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bkr));
                    arrayList.add(resources);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getBigImgFromCache", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getBigImgFromCache", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                } else if (gp0Var.T != null) {
                    bitmap = com.tencent.mm.plugin.fav.ui.ra.h(gp0Var, false, true);
                }
                t9Var.f7992a = bitmap;
            } else {
                am.t9 t9Var2 = favImageServiceEvent.f54237h;
                final r45.gp0 gp0Var2 = s9Var2.f7879b;
                int i18 = s9Var2.f7881d;
                java.util.Map map2 = com.tencent.mm.plugin.fav.ui.ra.f101381e;
                if (!fp.i.b()) {
                    android.content.res.Resources resources2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bkr));
                    arrayList2.add(resources2);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getSuitableImg", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;ZI)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                    yj0.a.e(obj2, bitmap, "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getSuitableImg", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;ZI)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                } else if (gp0Var2.T != null) {
                    java.lang.String x17 = o72.x1.x(gp0Var2);
                    if (com.tencent.mm.vfs.w6.j(x17)) {
                        jt0.i iVar = (jt0.i) com.tencent.mm.plugin.fav.ui.ra.f101382f;
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iVar.get(x17);
                        if (bitmap2 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "get bm from cache %s", x17);
                            bitmap = bitmap2;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "get from cache fail, try to decode from file");
                            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(x17, options);
                            if (d17 != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "bitmap recycle %s", d17);
                                d17.recycle();
                            }
                            int i19 = options.outWidth;
                            int i27 = options.outHeight;
                            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "width: %s, height: %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                            if (i19 > i18) {
                                i27 = (options.outHeight * i18) / options.outWidth;
                            } else {
                                i18 = i19;
                            }
                            int max = java.lang.Math.max(1, i18);
                            int max2 = java.lang.Math.max(1, i27);
                            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "fit long picture, beg %d*%d, after %d*%d", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
                            int a17 = com.tencent.mm.sdk.platformtools.l.a(x17);
                            if (a17 != 90 && a17 != 270) {
                                max2 = max;
                                max = max2;
                            }
                            android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(x17, max, max2, false);
                            if (T == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteImageServer", "getSuitableBmp fail, temBmp is null, filePath = " + x17);
                            } else {
                                android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, a17);
                                iVar.put(x17, w07);
                                bitmap = w07;
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "getBitmap file not exist %s", gp0Var2.T);
                    }
                    if (bitmap == null) {
                        final java.lang.String x18 = o72.x1.x(gp0Var2);
                        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z18 = z17;
                                if (z18 || com.tencent.mm.plugin.fav.ui.ra.k(x18)) {
                                    o72.x1.y0(r2Var, gp0Var2, z18);
                                }
                            }
                        }, "FavImageServer");
                    }
                }
                t9Var2.f7992a = bitmap;
            }
        }
        return false;
    }
}
