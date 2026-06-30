package i12;

/* loaded from: classes15.dex */
public abstract class c {
    public final android.view.View A;

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f287169a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f287170b;

    /* renamed from: c, reason: collision with root package name */
    public j12.i f287171c;

    /* renamed from: d, reason: collision with root package name */
    public int f287172d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f287173e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f287174f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f287175g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f287176h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f287177i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f287178j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f287179k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.ViewGroup f287180l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f287181m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f287182n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f287183o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f287184p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f287185q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f287186r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f287187s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ProgressBar f287188t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f287189u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f287190v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f287191w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f287192x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f287193y;

    /* renamed from: z, reason: collision with root package name */
    public android.content.Context f287194z;

    public c(android.content.Context context, android.view.View view) {
        android.widget.ImageView imageView;
        int i17;
        int i18;
        this.f287170b = new int[]{-1, -1};
        this.f287194z = context;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        if (view == null) {
            view = null;
            if (from != null) {
                view = from.inflate(com.tencent.mm.R.layout.a6o, (android.view.ViewGroup) null);
            }
        }
        this.A = view;
        if (view != null) {
            this.f287169a = view;
            this.f287173e = view.findViewById(com.tencent.mm.R.id.hhb);
            this.f287175g = (android.widget.ImageView) this.f287169a.findViewById(com.tencent.mm.R.id.hjm);
            this.f287174f = (android.widget.ImageView) this.f287169a.findViewById(com.tencent.mm.R.id.hhr);
            this.f287176h = (android.widget.TextView) this.f287169a.findViewById(com.tencent.mm.R.id.hiq);
            this.f287177i = this.f287169a.findViewById(com.tencent.mm.R.id.his);
            this.f287178j = (android.widget.TextView) this.f287169a.findViewById(com.tencent.mm.R.id.hit);
            this.f287179k = (android.widget.TextView) this.f287169a.findViewById(com.tencent.mm.R.id.hhe);
            this.f287180l = (android.view.ViewGroup) this.f287169a.findViewById(com.tencent.mm.R.id.hhy);
            this.f287181m = (android.widget.TextView) this.f287169a.findViewById(com.tencent.mm.R.id.hhx);
            this.f287182n = (android.widget.ProgressBar) this.f287169a.findViewById(com.tencent.mm.R.id.f486416l53);
            this.f287183o = (com.tencent.mm.ui.widget.button.WeButton) this.f287169a.findViewById(com.tencent.mm.R.id.r9r);
            this.f287184p = (com.tencent.mm.ui.widget.button.WeButton) this.f287169a.findViewById(com.tencent.mm.R.id.r9s);
            this.f287185q = (com.tencent.mm.ui.widget.button.WeButton) this.f287169a.findViewById(com.tencent.mm.R.id.r9t);
            this.f287186r = (android.widget.ImageView) this.f287169a.findViewById(com.tencent.mm.R.id.hjh);
            this.f287187s = this.f287169a.findViewById(com.tencent.mm.R.id.hj_);
            this.f287188t = (android.widget.ProgressBar) this.f287169a.findViewById(com.tencent.mm.R.id.hhl);
            this.f287189u = (android.widget.TextView) this.f287169a.findViewById(com.tencent.mm.R.id.hh_);
            this.f287190v = (android.widget.FrameLayout) this.f287169a.findViewById(com.tencent.mm.R.id.hib);
            this.f287191w = this.f287169a.findViewById(com.tencent.mm.R.id.f484191db3);
            this.f287192x = (android.widget.ImageView) this.f287169a.findViewById(com.tencent.mm.R.id.f484192db4);
            this.f287193y = (android.widget.TextView) this.f287169a.findViewById(com.tencent.mm.R.id.f484193db5);
        }
        b();
        int[] c17 = c();
        if (c17 != null && (imageView = this.f287174f) != null && c17.length == 2 && (i17 = c17[0]) >= 0 && (i18 = c17[1]) >= 0) {
            int[] iArr = this.f287170b;
            if (i17 != iArr[0] || i18 != iArr[1]) {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = c17[0];
                layoutParams.height = c17[1];
                this.f287174f.setLayoutParams(layoutParams);
                this.f287170b = c17;
            }
        }
        int d17 = d();
        android.view.View view2 = this.f287169a;
        if (view2 != null && d17 >= 0 && -1 != d17) {
            view2.setMinimumHeight(d17);
            android.view.View view3 = this.f287173e;
            if (view3 != null) {
                view3.setMinimumHeight(d17);
            }
        }
        view.setTag(this);
    }

    public void a() {
        this.f287182n.setVisibility(8);
        android.view.View view = this.f287187s;
        if (view == null) {
            this.f287188t.setVisibility(4);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f287183o.setText(com.tencent.mm.R.string.byn);
        this.f287183o.setEnabled(true);
        i(true);
    }

    public abstract void b();

    public abstract int[] c();

    public abstract int d();

    public final java.lang.String e() {
        r45.zj0 zj0Var;
        j12.i iVar = this.f287171c;
        if (iVar == null || (zj0Var = iVar.f297167b) == null) {
            return null;
        }
        return zj0Var.f392128d;
    }

    public final int f() {
        j12.i iVar = this.f287171c;
        return (iVar == null ? null : java.lang.Integer.valueOf(iVar.f297171f)).intValue();
    }

    public abstract boolean g();

    public void h() {
        if (this.f287171c != null && g()) {
            k(8);
            int f17 = f();
            if (f17 == -2) {
                this.f287182n.setVisibility(8);
                this.f287183o.setText(com.tencent.mm.R.string.f491110bz1);
                this.f287183o.setEnabled(false);
                i(true);
                android.view.View view = this.f287187s;
                if (view == null) {
                    this.f287188t.setVisibility(4);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealNotAvailableBuyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealNotAvailableBuyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (f17 == 0) {
                a();
            } else if (f17 != 3) {
                if (f17 != 4) {
                    if (f17 == 6) {
                        this.f287182n.setVisibility(8);
                        k(8);
                        this.f287188t.setVisibility(0);
                        android.widget.ProgressBar progressBar = this.f287188t;
                        j12.i iVar = this.f287171c;
                        progressBar.setProgress(iVar == null ? 0 : iVar.f297170e);
                        android.widget.ProgressBar progressBar2 = this.f287188t;
                        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f491097bw2);
                        j12.i iVar2 = this.f287171c;
                        progressBar2.setContentDescription(java.lang.String.format(g17, java.lang.Integer.valueOf(iVar2 == null ? 0 : iVar2.f297170e)));
                        android.view.View view2 = this.f287187s;
                        if (view2 == null) {
                            this.f287188t.setVisibility(0);
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (f17 == 7) {
                        j12.i iVar3 = this.f287171c;
                        if (iVar3.f297175j && j12.g.b(iVar3.f297167b.f392135n, 64)) {
                            i(true);
                            k(8);
                            this.f287185q.setVisibility(0);
                            android.view.View view3 = this.f287187s;
                            if (view3 == null) {
                                this.f287188t.setVisibility(4);
                                return;
                            }
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList3.add(4);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        this.f287182n.setVisibility(8);
                        i(false);
                        android.view.View view4 = this.f287187s;
                        if (view4 == null) {
                            this.f287188t.setVisibility(4);
                        } else {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList4.add(4);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (f17 != 8) {
                        switch (f17) {
                            case 10:
                                this.f287182n.setVisibility(8);
                                i(true);
                                this.f287183o.setText(com.tencent.mm.R.string.f491112bz3);
                                this.f287183o.setEnabled(true);
                                android.view.View view5 = this.f287187s;
                                if (view5 != null) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                                    arrayList5.add(4);
                                    java.util.Collections.reverse(arrayList5);
                                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    break;
                                } else {
                                    this.f287188t.setVisibility(4);
                                    break;
                                }
                            case 11:
                                this.f287182n.setVisibility(0);
                                this.f287183o.setVisibility(8);
                                android.view.View view6 = this.f287187s;
                                if (view6 != null) {
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                                    arrayList6.add(4);
                                    java.util.Collections.reverse(arrayList6);
                                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    break;
                                } else {
                                    this.f287188t.setVisibility(4);
                                    break;
                                }
                            case 12:
                                break;
                            default:
                                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.BaseEmojiItemHolder", "unknow product status:%d", java.lang.Integer.valueOf(f()));
                                break;
                        }
                    } else {
                        this.f287182n.setVisibility(8);
                        this.f287183o.setText(com.tencent.mm.R.string.byq);
                        this.f287183o.setEnabled(false);
                        i(true);
                        android.view.View view7 = this.f287187s;
                        if (view7 == null) {
                            this.f287188t.setVisibility(4);
                        } else {
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                            arrayList7.add(4);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view7, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                this.f287182n.setVisibility(8);
                android.view.View view8 = this.f287187s;
                if (view8 == null) {
                    this.f287188t.setVisibility(4);
                } else {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                    arrayList8.add(4);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                i(true);
                r45.zj0 zj0Var = this.f287171c.f297167b;
                if (zj0Var != null) {
                    if ((zj0Var.f392135n & 512) == 512) {
                        com.tencent.mm.ui.widget.button.WeButton weButton = this.f287183o;
                        android.content.Context context = this.f287194z;
                        weButton.setText(n22.j.f334293a.d(context, zj0Var.A, "", context.getColor(com.tencent.mm.R.color.aaq)));
                        this.f287183o.setContentDescription(java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.c0n), java.lang.Integer.valueOf(this.f287171c.f297167b.A)));
                    } else {
                        this.f287183o.setText(zj0Var.f392133i);
                        this.f287183o.setContentDescription(java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.bxc), this.f287183o.getText()));
                    }
                }
                this.f287183o.setEnabled(true);
            } else {
                a();
            }
            r45.zj0 zj0Var2 = this.f287171c.f297167b;
            if (zj0Var2 == null) {
                return;
            }
            r45.tj0 tj0Var = zj0Var2.D;
            if (!com.tencent.mm.plugin.emoji.model.EmojiLogic.v(tj0Var)) {
                android.view.View view9 = this.f287191w;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view10 = this.f287191w;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str = tj0Var.f386496e;
            if (str != null) {
                wo0.c a17 = vo0.e.f438468b.a(str);
                yo0.f fVar = new yo0.f();
                fVar.f464078b = true;
                a17.f447872c = fVar.a();
                ((wo0.b) a17).c(this.f287192x);
            }
            this.f287193y.setText(tj0Var.f386497f);
            this.f287180l.setVisibility(8);
        }
    }

    public void i(boolean z17) {
        if (this.f287184p.isEnabled()) {
            this.f287184p.setText(com.tencent.mm.R.string.byp);
            this.f287184p.setIcon(com.tencent.mm.R.raw.icons_filled_done);
            this.f287184p.setEnabled(false);
            this.f287184p.setBackgroundColor(0);
        }
        if (z17) {
            this.f287184p.setVisibility(8);
            this.f287183o.setVisibility(0);
        } else {
            this.f287183o.setVisibility(8);
            this.f287184p.setVisibility(0);
        }
        this.f287185q.setVisibility(8);
    }

    public void j(java.lang.String str) {
        r45.zj0 zj0Var;
        j12.i iVar = this.f287171c;
        if (iVar == null || (zj0Var = iVar.f297167b) == null || !com.tencent.mm.plugin.emoji.model.EmojiLogic.v(zj0Var.D)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f287180l.setVisibility(8);
                this.f287181m.setVisibility(8);
            } else {
                this.f287180l.setVisibility(0);
                this.f287181m.setVisibility(0);
                this.f287181m.setText(str);
            }
        }
    }

    public void k(int i17) {
        this.f287183o.setVisibility(i17);
        this.f287184p.setVisibility(i17);
        this.f287185q.setVisibility(i17);
    }
}
