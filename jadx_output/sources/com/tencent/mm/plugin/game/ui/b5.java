package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class b5 extends com.tencent.mm.ui.z9 {
    public static com.tencent.mm.plugin.game.ui.c7 C;
    public final com.tencent.mm.plugin.game.model.g1 A;
    public final kk.j B;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f141047o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f141048p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.p6 f141049q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.p6 f141050r;

    /* renamed from: s, reason: collision with root package name */
    public int f141051s;

    /* renamed from: t, reason: collision with root package name */
    public final int f141052t;

    /* renamed from: u, reason: collision with root package name */
    public final int f141053u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f141054v;

    /* renamed from: w, reason: collision with root package name */
    public final int f141055w;

    /* renamed from: x, reason: collision with root package name */
    public final int f141056x;

    /* renamed from: y, reason: collision with root package name */
    public int f141057y;

    /* renamed from: z, reason: collision with root package name */
    public long f141058z;

    public b5(android.content.Context context, com.tencent.mm.plugin.game.model.e1 e1Var, int i17, long j17) {
        super(context, e1Var);
        this.f141051s = 15;
        this.f141052t = 0;
        this.f141053u = 0;
        this.f141055w = 0;
        this.f141056x = 0;
        this.f141057y = 0;
        this.f141054v = context;
        this.f141055w = i17;
        this.f141058z = j17;
        com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        Di.getClass();
        android.database.Cursor rawQuery = Di.rawQuery("select count(*) from GameRawMessage where " + Di.J0(2, 5, 6, 10, 11, 100) + " and showInMsgList = 1 and isHidden = 0", new java.lang.String[0]);
        if (rawQuery != null) {
            r5 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
            rawQuery.close();
        }
        this.f141052t = r5;
        this.f141053u = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        C = new com.tencent.mm.plugin.game.ui.c7();
        this.f141047o = new com.tencent.mm.plugin.game.ui.c5(context, i17);
        this.f141048p = new com.tencent.mm.plugin.game.ui.d5(context, i17);
        com.tencent.mm.plugin.game.ui.p6 p6Var = new com.tencent.mm.plugin.game.ui.p6(context, 13);
        this.f141049q = p6Var;
        p6Var.f141719e = i17;
        p6Var.f141720f = com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX;
        p6Var.f141721g = 1;
        com.tencent.mm.plugin.game.ui.p6 p6Var2 = new com.tencent.mm.plugin.game.ui.p6(context, 13);
        this.f141050r = p6Var2;
        p6Var2.f141719e = i17;
        p6Var2.f141720f = com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX;
        p6Var2.f141721g = 2;
        this.A = new com.tencent.mm.plugin.game.model.g1(context, i17);
        this.f141056x = i65.a.c(context, ((r53.f.h(context) - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479573p) * 2)) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479834gj)) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx)) / 34;
        this.B = new jt0.i(30, com.tencent.mm.plugin.game.ui.b5.class);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.plugin.game.model.e1 e1Var = (com.tencent.mm.plugin.game.model.e1) obj;
        if (e1Var == null) {
            e1Var = new com.tencent.mm.plugin.game.model.e1();
        }
        e1Var.convertFrom(cursor);
        return e1Var;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        if (this.f212612i < 0) {
            this.f212612i = j().getCount();
        }
        int i17 = this.f212612i;
        if (i17 <= 0) {
            return 0;
        }
        return i17 + m();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05bb  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.b5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public int m() {
        int i17 = this.f141052t;
        int i18 = this.f141053u;
        return (i17 <= i18 || i18 <= 0) ? 0 : 1;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object n() {
        return (com.tencent.mm.plugin.game.model.e1) this.f212607d;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        j().close();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public boolean p(int i17) {
        int i18 = this.f141052t;
        int i19 = this.f141053u;
        return i18 > i19 && i19 > 0 && i17 == i19;
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        int i17 = this.f141051s;
        Di.getClass();
        int i18 = 0;
        s(Di.rawQuery("select * from GameRawMessage where " + Di.J0(2, 5, 6, 10, 11, 100) + " and showInMsgList = 1 and isHidden = 0 order by isRead, createTime desc limit " + i17, new java.lang.String[0]));
        this.f141051s = getCount();
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        if (this.f141058z > 0) {
            int count = getCount();
            while (true) {
                if (i18 < count) {
                    com.tencent.mm.plugin.game.model.e1 item = getItem(i18);
                    if (item != null && item.field_msgId == this.f141058z) {
                        this.f141057y = i18;
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
            this.f141058z = 0L;
        }
        notifyDataSetChanged();
    }

    public final void t(android.widget.ImageView imageView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
            return;
        }
        kk.j jVar = this.B;
        if (!((lt0.f) jVar).k(str)) {
            android.graphics.Bitmap c17 = r53.y.a().c(imageView, str);
            if (c17 != null) {
                ((jt0.i) jVar).put(str, c17);
                return;
            }
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        android.graphics.Bitmap c18 = r53.y.a().c(imageView, str);
        if (c18 != null) {
            ((jt0.i) jVar).put(str, c18);
        }
    }

    public final void u(android.widget.ImageView imageView, java.lang.String str) {
        kk.j jVar = this.B;
        if (!((lt0.f) jVar).k(str)) {
            w(imageView, str, 0.0f);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            w(imageView, str, 0.0f);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void v(android.widget.ImageView imageView, java.lang.String str, float f17) {
        kk.j jVar = this.B;
        if (!((lt0.f) jVar).k(str)) {
            w(imageView, str, f17);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            w(imageView, str, f17);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void w(android.widget.ImageView imageView, java.lang.String str, float f17) {
        r53.v vVar = new r53.v();
        vVar.f392703a = false;
        vVar.f392709g = f17;
        r53.y.a().e(imageView, str, vVar.a(), new com.tencent.mm.plugin.game.ui.z4(this, str));
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.game.model.e1 getItem(int i17) {
        boolean p17 = p(i17);
        java.lang.Object obj = this.f212607d;
        if (p17) {
            return (com.tencent.mm.plugin.game.model.e1) obj;
        }
        java.util.Map map = this.f212610g;
        if (map != null) {
            com.tencent.mm.plugin.game.model.e1 e1Var = (com.tencent.mm.plugin.game.model.e1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (e1Var != null) {
                return e1Var;
            }
        }
        int i18 = this.f141052t;
        int i19 = this.f141053u;
        int i27 = i18 > i19 && i19 > 0 && i17 > i19 ? i17 - 1 : i17;
        if (i17 < 0 || !j().moveToPosition(i27)) {
            return null;
        }
        if (this.f212610g != null) {
            android.database.Cursor j17 = j();
            com.tencent.mm.plugin.game.model.e1 e1Var2 = new com.tencent.mm.plugin.game.model.e1();
            e1Var2.convertFrom(j17);
            ((java.util.HashMap) this.f212610g).put(java.lang.Integer.valueOf(i17), e1Var2);
            return e1Var2;
        }
        com.tencent.mm.plugin.game.model.e1 e1Var3 = (com.tencent.mm.plugin.game.model.e1) obj;
        android.database.Cursor j18 = j();
        if (e1Var3 == null) {
            e1Var3 = new com.tencent.mm.plugin.game.model.e1();
        }
        e1Var3.convertFrom(j18);
        return e1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int, boolean] */
    public final void y(com.tencent.mm.plugin.game.model.e1 e1Var, com.tencent.mm.plugin.game.ui.a5 a5Var) {
        boolean z17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 1; i17 < e1Var.f140275b2.size(); i17++) {
            linkedList.add((com.tencent.mm.plugin.game.model.v0) e1Var.f140275b2.get(i17));
        }
        com.tencent.mm.plugin.game.ui.GameMessageListContainerView gameMessageListContainerView = a5Var.f141032n;
        kk.j jVar = this.B;
        gameMessageListContainerView.getClass();
        int i18 = 8;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            gameMessageListContainerView.setVisibility(8);
            return;
        }
        boolean z18 = false;
        gameMessageListContainerView.setVisibility(0);
        int size = linkedList.size();
        int i19 = this.f141056x;
        int i27 = i19 > size ? 1 : 2;
        android.content.Context context = gameMessageListContainerView.f140926d;
        android.content.res.Resources resources = context.getResources();
        int i28 = com.tencent.mm.R.dimen.f479563f;
        int dimensionPixelSize = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
        while (gameMessageListContainerView.getChildCount() < i27) {
            com.tencent.mm.plugin.game.ui.GameMessageListUserIconView gameMessageListUserIconView = new com.tencent.mm.plugin.game.ui.GameMessageListUserIconView(context);
            if (gameMessageListContainerView.getChildCount() > 0) {
                gameMessageListUserIconView.setPadding(0, dimensionPixelSize, 0, 0);
            }
            gameMessageListUserIconView.setSourceScene(this.f141055w);
            gameMessageListContainerView.addView(gameMessageListUserIconView);
        }
        int i29 = 0;
        while (i29 < gameMessageListContainerView.getChildCount()) {
            if (i29 < i27) {
                android.view.View childAt = gameMessageListContainerView.getChildAt(i29);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(z18 ? 1 : 0));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(z18 ? 1 : 0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.game.ui.GameMessageListUserIconView gameMessageListUserIconView2 = (com.tencent.mm.plugin.game.ui.GameMessageListUserIconView) gameMessageListContainerView.getChildAt(i29);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i37 = i29 * i19; i37 < (i29 + 1) * i19 && i37 < linkedList.size(); i37++) {
                    linkedList2.add((com.tencent.mm.plugin.game.model.v0) linkedList.get(i37));
                }
                gameMessageListUserIconView2.getClass();
                if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                    gameMessageListUserIconView2.setVisibility(i18);
                } else {
                    gameMessageListUserIconView2.f140929f = jVar;
                    gameMessageListUserIconView2.setVisibility(z18 ? 1 : 0);
                    android.content.Context context2 = gameMessageListUserIconView2.f140927d;
                    int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479849gy);
                    int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(i28);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
                    layoutParams.rightMargin = dimensionPixelSize3;
                    while (gameMessageListUserIconView2.getChildCount() < linkedList2.size()) {
                        android.widget.ImageView imageView = new android.widget.ImageView(context2);
                        imageView.setLayoutParams(layoutParams);
                        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                        imageView.setOnClickListener(gameMessageListUserIconView2.f140928e);
                        gameMessageListUserIconView2.addView(imageView);
                    }
                    int i38 = z18 ? 1 : 0;
                    ?? r66 = z18;
                    while (i38 < gameMessageListUserIconView2.getChildCount()) {
                        android.widget.ImageView imageView2 = (android.widget.ImageView) gameMessageListUserIconView2.getChildAt(i38);
                        if (i38 < linkedList2.size()) {
                            imageView2.setVisibility(r66);
                            com.tencent.mm.plugin.game.model.v0 v0Var = (com.tencent.mm.plugin.game.model.v0) linkedList2.get(i38);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(v0Var.f140491c)) {
                                java.lang.String str = v0Var.f140489a;
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str, null);
                                } else if (gameMessageListUserIconView2.f140929f.k(str)) {
                                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) gameMessageListUserIconView2.f140929f.get(str);
                                    if (bitmap == null || bitmap.isRecycled()) {
                                        android.graphics.Bitmap c17 = r53.y.a().c(imageView2, str);
                                        if (c17 != null) {
                                            gameMessageListUserIconView2.f140929f.put(str, c17);
                                        }
                                    } else {
                                        imageView2.setImageBitmap(bitmap);
                                    }
                                } else {
                                    android.graphics.Bitmap c18 = r53.y.a().c(imageView2, str);
                                    if (c18 != null) {
                                        gameMessageListUserIconView2.f140929f.put(str, c18);
                                    }
                                }
                            } else {
                                java.lang.String str2 = v0Var.f140491c;
                                if (gameMessageListUserIconView2.f140929f.k(str2)) {
                                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) gameMessageListUserIconView2.f140929f.get(str2);
                                    if (bitmap2 == null || bitmap2.isRecycled()) {
                                        r53.v vVar = new r53.v();
                                        vVar.f392703a = r66;
                                        r53.y.a().e(imageView2, str2, vVar.a(), new com.tencent.mm.plugin.game.ui.e5(gameMessageListUserIconView2, str2));
                                    } else {
                                        imageView2.setImageBitmap(bitmap2);
                                    }
                                } else {
                                    r53.v vVar2 = new r53.v();
                                    vVar2.f392703a = false;
                                    r53.y.a().e(imageView2, str2, vVar2.a(), new com.tencent.mm.plugin.game.ui.e5(gameMessageListUserIconView2, str2));
                                }
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(v0Var.f140493e)) {
                                imageView2.setEnabled(false);
                            } else {
                                imageView2.setTag(new com.tencent.mm.plugin.game.model.f1(e1Var, v0Var.f140493e, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 6));
                                imageView2.setEnabled(true);
                            }
                        } else {
                            imageView2.setVisibility(i18);
                        }
                        i38++;
                        r66 = 0;
                        i18 = 8;
                    }
                }
                i18 = 8;
                z17 = false;
            } else {
                android.view.View childAt2 = gameMessageListContainerView.getChildAt(i29);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                i18 = 8;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z17 = false;
                childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i29++;
            z18 = z17;
            i28 = com.tencent.mm.R.dimen.f479563f;
        }
    }
}
