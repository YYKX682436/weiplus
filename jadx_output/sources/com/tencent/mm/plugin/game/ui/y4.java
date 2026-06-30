package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public abstract class y4 extends com.tencent.mm.plugin.game.ui.d {

    /* renamed from: m, reason: collision with root package name */
    public int f141877m;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f141878n;

    /* renamed from: o, reason: collision with root package name */
    public final int f141879o;

    /* renamed from: p, reason: collision with root package name */
    public int f141880p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f141881q;

    /* renamed from: r, reason: collision with root package name */
    public android.util.SparseArray f141882r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.s f141883s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.w4 f141884t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.z f141885u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f141886v;

    public y4(android.content.Context context) {
        super(context);
        this.f141879o = 14;
        this.f141880p = 0;
        com.tencent.mm.plugin.game.ui.t4 t4Var = new com.tencent.mm.plugin.game.ui.t4(this);
        this.f141885u = t4Var;
        this.f141886v = new com.tencent.mm.plugin.game.ui.u4(this);
        com.tencent.mm.plugin.game.ui.v4 v4Var = new com.tencent.mm.plugin.game.ui.v4(this);
        this.f141878n = context;
        this.f141881q = new java.util.concurrent.ConcurrentHashMap();
        java.util.Set set = com.tencent.mm.plugin.game.model.b0.f140225b;
        synchronized (set) {
            set.add(t4Var);
        }
        this.f141882r = new android.util.SparseArray();
        com.tencent.mm.plugin.game.ui.s sVar = new com.tencent.mm.plugin.game.ui.s(context);
        this.f141883s = sVar;
        sVar.f141745f = v4Var;
    }

    public static void d(com.tencent.mm.plugin.game.ui.y4 y4Var, java.util.LinkedList linkedList) {
        y4Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.game.model.b bVar = (com.tencent.mm.plugin.game.model.b) it.next();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = y4Var.f141881q;
            if (!concurrentHashMap.containsKey(bVar.field_appId) && bVar.f140205h2 != 1) {
                com.tencent.mm.plugin.game.model.c0 c0Var = (com.tencent.mm.plugin.game.model.c0) concurrentHashMap.get(bVar.field_appId);
                if (c0Var == null) {
                    c0Var = new com.tencent.mm.plugin.game.model.c0(bVar);
                    concurrentHashMap.put(bVar.field_appId, c0Var);
                }
                c0Var.a(y4Var.f141878n);
                c0Var.b();
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.game.model.b) getItem(i17)).f140205h2;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.game.ui.x4 x4Var;
        com.tencent.mm.plugin.game.model.b bVar = (com.tencent.mm.plugin.game.model.b) getItem(i17);
        android.graphics.Bitmap bitmap = null;
        if (view == null) {
            int i18 = bVar.f140205h2;
            view = android.view.View.inflate(this.f141878n, i18 != 0 ? i18 != 1 ? 0 : com.tencent.mm.R.layout.bdq : this.f141877m, null);
            x4Var = new com.tencent.mm.plugin.game.ui.x4();
            x4Var.f141847a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gnz);
            x4Var.f141848b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.glm);
            x4Var.f141849c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gnr);
            x4Var.f141850d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.k9i);
            x4Var.f141851e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.glt);
            x4Var.f141852f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gjd);
            x4Var.f141853g = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.gkz);
            x4Var.f141854h = (com.tencent.mm.plugin.game.widget.TextProgressBar) view.findViewById(com.tencent.mm.R.id.f485113gl1);
            x4Var.f141857k = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.gin);
            x4Var.f141855i = (com.tencent.mm.plugin.game.ui.GameListSocialView) view.findViewById(com.tencent.mm.R.id.gov);
            x4Var.f141856j = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cpm);
            view.setTag(x4Var);
        } else {
            x4Var = (com.tencent.mm.plugin.game.ui.x4) view.getTag();
        }
        int i19 = bVar.f140205h2;
        if (i19 == 0) {
            com.tencent.mm.plugin.game.ui.d4 d4Var = (com.tencent.mm.plugin.game.ui.d4) this;
            android.content.Context context = d4Var.f141878n;
            x4Var.f141847a.setText(bVar.f140214q2 + "");
            x4Var.f141847a.setVisibility(8);
            java.lang.String str = bVar.field_appId;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (!((lt0.f) d4Var.f141354f).k(str) || (bitmap = (android.graphics.Bitmap) ((jt0.i) d4Var.f141354f).get(str)) == null || bitmap.isRecycled())) {
                bitmap = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 1, i65.a.g(d4Var.f141352d));
                if (bitmap != null && !bitmap.isRecycled()) {
                    ((jt0.i) d4Var.f141354f).j(str, bitmap);
                }
            }
            if (bitmap == null || bitmap.isRecycled()) {
                x4Var.f141848b.setImageResource(com.tencent.mm.R.drawable.bij);
            } else {
                x4Var.f141848b.setImageBitmap(bitmap);
            }
            x4Var.f141849c.setText(bVar.field_appName);
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f140206i2)) {
                x4Var.f141851e.setVisibility(8);
            } else {
                x4Var.f141851e.setVisibility(0);
                x4Var.f141851e.setText(bVar.f140206i2);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f140207j2)) {
                x4Var.f141852f.setVisibility(8);
            } else {
                x4Var.f141852f.setVisibility(0);
                x4Var.f141852f.setText(bVar.f140207j2);
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(bVar.f140217t2)) {
                java.lang.String str2 = bVar.f140219v2;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    x4Var.f141850d.setVisibility(8);
                } else {
                    x4Var.f141850d.setVisibility(0);
                    x4Var.f141850d.setText(str2);
                    try {
                        x4Var.f141850d.setBackgroundDrawable(com.tencent.mm.plugin.game.model.f.f(context, android.graphics.Color.parseColor(bVar.f140220w2), i65.a.b(context, 10)));
                    } catch (java.lang.IllegalArgumentException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameLibraryListAdapter", e17.getMessage());
                        x4Var.f141850d.setVisibility(8);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameLibraryListAdapter", e18.getMessage());
                        x4Var.f141850d.setVisibility(8);
                    }
                }
            } else {
                x4Var.f141850d.setVisibility(0);
                x4Var.f141850d.setText((java.lang.CharSequence) bVar.f140217t2.get(0));
            }
            x4Var.f141854h.setTextSize(d4Var.f141879o);
            android.widget.Button button = x4Var.f141853g;
            android.view.View.OnClickListener onClickListener = d4Var.f141886v;
            button.setOnClickListener(onClickListener);
            x4Var.f141854h.setOnClickListener(onClickListener);
            x4Var.f141853g.setTag(bVar);
            x4Var.f141854h.setTag(bVar);
            d4Var.f141883s.b(x4Var.f141854h, x4Var.f141853g, bVar, (com.tencent.mm.plugin.game.model.c0) d4Var.f141881q.get(bVar.field_appId));
            x4Var.f141855i.setData(bVar.f140216s2);
            x4Var.f141856j.removeAllViews();
            android.view.View view2 = (android.view.View) d4Var.f141882r.get(i17);
            if (view2 != null) {
                if (view2.getParent() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) view2.getParent()).removeAllViews();
                }
                x4Var.f141856j.addView(view2);
            }
        } else if (i19 == 1) {
            com.tencent.mm.plugin.game.ui.d4 d4Var2 = (com.tencent.mm.plugin.game.ui.d4) this;
            x4Var.f141857k.removeAllViews();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f140209l2)) {
                android.content.Context context2 = d4Var2.f141878n;
                android.view.View inflate = android.view.View.inflate(context2, com.tencent.mm.R.layout.bgd, null);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.gll);
                n11.a b17 = n11.a.b();
                java.lang.String str3 = bVar.f140209l2;
                o11.f fVar = new o11.f();
                fVar.f342079c = true;
                b17.h(str3, imageView, fVar.a());
                x4Var.f141857k.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, i65.a.b(context2, 100)));
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public void h() {
        java.util.LinkedList linkedList = this.f141353e;
        if (linkedList != null) {
            linkedList.clear();
        }
        kk.j jVar = this.f141354f;
        if (jVar != null) {
            ((lt0.f) jVar).c(new com.tencent.mm.plugin.game.ui.a(this));
        }
        this.f141354f = null;
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        zo3.p.Ri().remove(this.f141356h);
        com.tencent.mm.plugin.game.model.z zVar = this.f141885u;
        java.util.Set set = com.tencent.mm.plugin.game.model.b0.f140225b;
        synchronized (set) {
            set.remove(zVar);
            set.size();
        }
    }

    public void j(android.view.View view, int i17) {
        com.tencent.mm.plugin.game.ui.x4 x4Var = (com.tencent.mm.plugin.game.ui.x4) view.getTag();
        com.tencent.mm.plugin.game.model.b bVar = (com.tencent.mm.plugin.game.model.b) this.f141353e.get(i17);
        if (x4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameListAdapter", "holder should not be null, %d", java.lang.Integer.valueOf(i17));
            return;
        }
        this.f141883s.b(x4Var.f141854h, x4Var.f141853g, bVar, (com.tencent.mm.plugin.game.model.c0) this.f141881q.get(bVar.field_appId));
    }
}
