package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameInstalledView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: t, reason: collision with root package name */
    public static java.util.Map f140877t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public static int f140878u = 6;

    /* renamed from: v, reason: collision with root package name */
    public static int f140879v = 7;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f140880d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f140881e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f140882f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f140883g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f140884h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f140885i;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.DisplayMetrics f140886m;

    /* renamed from: n, reason: collision with root package name */
    public int f140887n;

    /* renamed from: o, reason: collision with root package name */
    public int f140888o;

    /* renamed from: p, reason: collision with root package name */
    public final int f140889p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f140890q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.LinearLayout.LayoutParams f140891r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.z f140892s;

    public GameInstalledView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140885i = new java.util.LinkedList();
        this.f140886m = new android.util.DisplayMetrics();
        this.f140887n = 4;
        this.f140888o = 0;
        this.f140889p = 1;
        this.f140891r = new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.f140892s = new com.tencent.mm.plugin.game.ui.z3(this);
        this.f140884h = context;
    }

    public final void a(com.tencent.mm.pluginsdk.model.app.m mVar) {
        java.lang.String str = mVar.f238368J;
        java.lang.String str2 = mVar.P;
        java.lang.String str3 = mVar.field_appId;
        com.tencent.mm.plugin.game.model.b0 b0Var = com.tencent.mm.plugin.game.model.b0.f140224a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.game.model.b0.f140226c.put(str, new com.tencent.mm.plugin.game.model.a0(str2, 1002, str3, "", ""));
        }
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97150a = mVar.f238368J;
        t0Var.f97153d = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this.f140884h, mVar);
        t0Var.f97156g = mVar.field_appId;
        t0Var.f97154e = mVar.P;
        t0Var.f97158i = true;
        t0Var.f97155f = 1;
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
    }

    public void b(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f140890q)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.content.Context context = this.f140884h;
        if (z17) {
            this.f140885i = com.tencent.mm.plugin.game.model.f.h(context);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(this.f140890q) && !com.tencent.mm.sdk.platformtools.t8.L0(this.f140885i)) {
                java.util.Iterator it = this.f140890q.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.game.model.b bVar = (com.tencent.mm.plugin.game.model.b) it.next();
                    if (this.f140885i.contains(bVar)) {
                        this.f140885i.remove(bVar);
                        this.f140885i.addFirst(bVar);
                    }
                }
            }
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f140885i);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(com.tencent.mm.plugin.game.model.f.h(context));
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.pluginsdk.model.app.m mVar = (com.tencent.mm.pluginsdk.model.app.m) it6.next();
                if (!linkedList2.contains(mVar) && !linkedList3.contains(mVar)) {
                    linkedList3.add(mVar);
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.pluginsdk.model.app.m mVar2 = (com.tencent.mm.pluginsdk.model.app.m) it7.next();
                if (linkedList2.contains(mVar2)) {
                    linkedList2.remove(mVar2);
                } else {
                    ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                    if (!com.tencent.mm.pluginsdk.model.app.w.q(context, mVar2)) {
                        linkedList3.add(mVar2);
                    }
                }
            }
            if (linkedList2.size() > 0) {
                java.util.Iterator it8 = linkedList2.iterator();
                while (it8.hasNext()) {
                    com.tencent.mm.pluginsdk.model.app.m mVar3 = (com.tencent.mm.pluginsdk.model.app.m) it8.next();
                    if (!linkedList.contains(mVar3)) {
                        linkedList.addFirst(mVar3);
                    }
                }
            }
            if (linkedList3.size() > 0) {
                linkedList.removeAll(linkedList3);
            }
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.Iterator it9 = linkedList.iterator();
            while (it9.hasNext()) {
                com.tencent.mm.pluginsdk.model.app.m mVar4 = (com.tencent.mm.pluginsdk.model.app.m) it9.next();
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = mVar4.field_appId;
                ((kt.c) i0Var).getClass();
                linkedList4.add(com.tencent.mm.pluginsdk.model.app.w.h(str));
            }
            this.f140885i = linkedList4;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f140885i)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f140880d.removeAllViews();
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        if (this.f140885i.size() >= this.f140887n - 1) {
            f140879v = 7;
            f140878u = 6;
            int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 96);
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.util.DisplayMetrics displayMetrics = this.f140886m;
            defaultDisplay.getMetrics(displayMetrics);
            int i17 = displayMetrics.widthPixels;
            int i18 = (int) ((i17 * 160) / displayMetrics.densityDpi);
            int i19 = ((i17 - 1) / d17) + 1;
            this.f140887n = i19;
            if (i19 == 3) {
                f140879v = 3;
            }
            int i27 = f140878u;
            int i28 = (i27 << 1) + 84;
            int i29 = i27 + 6 + f140879v;
            int i37 = (i18 - 16) % i28;
            if (i37 < i29) {
                f140878u = i27 - 2;
                com.tencent.mm.sdk.platformtools.j.d(context, (r1 << 1) + 84);
            } else if (i37 > i28 - i29) {
                f140878u = i27 + ((i37 - (i28 >> 1)) / i19);
                com.tencent.mm.sdk.platformtools.j.d(context, (r1 << 1) + 84);
            }
        }
        android.widget.LinearLayout.LayoutParams layoutParams = this.f140891r;
        layoutParams.setMargins(com.tencent.mm.sdk.platformtools.j.d(context, f140878u), 0, com.tencent.mm.sdk.platformtools.j.d(context, f140878u), 0);
        java.util.Iterator it10 = this.f140885i.iterator();
        while (it10.hasNext()) {
            com.tencent.mm.pluginsdk.model.app.m mVar5 = (com.tencent.mm.pluginsdk.model.app.m) it10.next();
            android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.bla, (android.view.ViewGroup) null);
            this.f140881e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.glm);
            this.f140882f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gnr);
            this.f140883g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gou);
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(mVar5.field_appId, 1, i65.a.g(context));
            if (Di != null) {
                this.f140881e.setImageBitmap(Di);
            } else {
                this.f140881e.setImageResource(com.tencent.mm.R.drawable.f480849bg4);
            }
            this.f140882f.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, mVar5));
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.q(context, mVar5)) {
                int j17 = r53.f.j(mVar5.field_packageName);
                if (f140877t.containsKey(mVar5.field_appId) && ((java.lang.Integer) f140877t.get(mVar5.field_appId)).intValue() > j17) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(mVar5.field_appId);
                    this.f140883g.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479195sj));
                    if (q17.f96963f == 1) {
                        this.f140883g.setText(com.tencent.mm.R.string.fkc);
                    } else {
                        this.f140883g.setText(com.tencent.mm.R.string.fkb);
                    }
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(mVar5.N)) {
                    this.f140883g.setText("");
                } else {
                    this.f140883g.setText(mVar5.N);
                    this.f140883g.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479203sr));
                }
            } else {
                this.f140883g.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479195sj));
                this.f140883g.setText(com.tencent.mm.R.string.f492218fn5);
            }
            inflate.setTag(mVar5);
            inflate.setOnClickListener(this);
            this.f140880d.addView(inflate, layoutParams);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof com.tencent.mm.pluginsdk.model.app.m) {
            com.tencent.mm.pluginsdk.model.app.m mVar = (com.tencent.mm.pluginsdk.model.app.m) view.getTag();
            if (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameInstalledView", "appinfo is null or appid is null");
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            android.content.Context context = this.f140884h;
            if (com.tencent.mm.pluginsdk.model.app.w.q(context, mVar)) {
                int j17 = r53.f.j(mVar.field_packageName);
                if (!f140877t.containsKey(mVar.field_appId) || ((java.lang.Integer) f140877t.get(mVar.field_appId)).intValue() <= j17) {
                    com.tencent.mm.plugin.game.model.f.j(context, mVar.field_appId);
                    com.tencent.mm.game.report.l.d(this.f140884h, 10, 1002, this.f140889p, 3, 0, mVar.field_appId, this.f140888o, 0, null, null, null);
                    this.f140885i.remove(mVar);
                    this.f140885i.addFirst(mVar);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(mVar.field_appId);
                    int i17 = q17.f96963f;
                    if (i17 == 1) {
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.tencent.mm.plugin.downloader.model.r0.i().t(q17.f96961d);
                    } else if (i17 != 3) {
                        a(mVar);
                    } else if (!com.tencent.mm.vfs.w6.j(q17.f96964g) || r53.f.i(q17.f96964g) <= j17) {
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.tencent.mm.plugin.downloader.model.r0.i().t(q17.f96961d);
                        a(mVar);
                    } else {
                        zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
                        java.lang.String str = q17.f96964g;
                        ((yb0.c) yVar).getClass();
                        com.tencent.mm.pluginsdk.model.app.n1.d(context, str, null, false);
                    }
                }
                b(false);
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q18 = com.tencent.mm.plugin.downloader.model.r0.i().q(mVar.field_appId);
            if (q18 != null && q18.f96963f == 3) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(q18.f96964g) || !com.tencent.mm.vfs.w6.j(q18.f96964g)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameInstalledView", "file status is success, while the download file not exsit:[%s]", q18.f96964g);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.r0.i().t(q18.f96961d);
                    b(false);
                } else {
                    zb0.y yVar2 = (zb0.y) i95.n0.c(zb0.y.class);
                    java.lang.String str2 = q18.f96964g;
                    ((yb0.c) yVar2).getClass();
                    com.tencent.mm.pluginsdk.model.app.n1.d(context, str2, null, false);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameInstalledView", "app not installed or download sucess : [%s]", mVar.field_appName);
            b(false);
        } else {
            view.getTag();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140880d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485123gm5);
        com.tencent.mm.plugin.game.model.z zVar = this.f140892s;
        java.util.Set set = com.tencent.mm.plugin.game.model.b0.f140225b;
        synchronized (set) {
            set.add(zVar);
        }
    }

    public void setInstalledGameInfo(java.util.LinkedList<com.tencent.mm.plugin.game.model.b> linkedList) {
        this.f140890q = linkedList;
    }

    public void setMoreGameInfo(com.tencent.mm.plugin.game.ui.a4 a4Var) {
    }

    public void setSourceScene(int i17) {
        this.f140888o = i17;
    }

    public void setVersionCodes(java.util.Map<java.lang.String, java.lang.Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        f140877t = map;
    }
}
