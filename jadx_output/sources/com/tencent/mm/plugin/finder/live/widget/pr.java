package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class pr implements android.view.View.OnClickListener {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public long E;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f119406d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f119407e;

    /* renamed from: f, reason: collision with root package name */
    public int f119408f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f119409g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f119410h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f119411i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f119412m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f119413n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f119414o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f119415p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f119416q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f119417r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f119418s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f119419t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f119420u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f119421v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f119422w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f119423x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f119424y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f119425z;

    public pr(android.view.ViewGroup root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f119406d = root;
        this.f119407e = "FinderLivePrecheckWidget";
        this.f119409g = "";
        this.f119410h = "";
        this.f119411i = "";
        this.f119424y = true;
        this.B = true;
        this.C = true;
    }

    public final void a(java.lang.String str, int i17) {
        if (i17 != 4) {
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.e(this.f119407e, "gotoFaceVerify error url is empty!");
                zl2.r4 r4Var = zl2.r4.f473950a;
                android.content.Context context = this.f119406d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r4Var.f3(context, "检测地址为空");
                return;
            }
        }
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).ij(7, this.D, this.E, kz5.b1.e(new jz5.l("certification_type", java.lang.Integer.valueOf(i17))));
        yz5.p pVar = this.f119412m;
        if (pVar != null) {
            pVar.invoke(str, java.lang.Integer.valueOf(i17));
        }
    }

    public final void b() {
        g();
        d();
        f(this.f119411i);
        e();
    }

    public final void c() {
        this.f119424y = pm0.v.z(this.f119408f, 4);
        this.f119425z = pm0.v.z(this.f119408f, 32);
        boolean z17 = pm0.v.z(this.f119408f, 64);
        this.A = z17;
        this.B = z17 | this.f119424y | this.f119425z | pm0.v.z(this.f119408f, 8);
        this.C = pm0.v.z(this.f119408f, 16);
    }

    public final void d() {
        if (this.B) {
            android.widget.TextView textView = this.f119417r;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.e5w);
            }
            android.widget.TextView textView2 = this.f119417r;
            if (textView2 != null) {
                textView2.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f119418s;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
            android.widget.TextView textView3 = this.f119417r;
            if (textView3 == null) {
                return;
            }
            textView3.setEnabled(true);
            return;
        }
        android.widget.TextView textView4 = this.f119417r;
        if (textView4 != null) {
            textView4.setText(com.tencent.mm.R.string.e5x);
        }
        android.widget.TextView textView5 = this.f119417r;
        if (textView5 != null) {
            textView5.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Brand_100));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f119418s;
        if (weImageView2 != null) {
            weImageView2.setVisibility(4);
        }
        android.widget.TextView textView6 = this.f119417r;
        if (textView6 == null) {
            return;
        }
        textView6.setEnabled(false);
    }

    public final void e() {
        if (this.f119423x) {
            android.widget.Button button = this.f119414o;
            if (button != null) {
                button.setText(com.tencent.mm.R.string.e5s);
            }
        } else {
            android.widget.Button button2 = this.f119414o;
            if (button2 != null) {
                button2.setText(com.tencent.mm.R.string.e5r);
            }
        }
        boolean z17 = (this.f119424y || this.B || this.C || this.f119425z || this.A) ? false : true;
        android.widget.Button button3 = this.f119414o;
        if (button3 == null) {
            return;
        }
        button3.setEnabled(z17);
    }

    public final void f(java.lang.String str) {
        boolean z17 = true;
        if (this.C) {
            android.view.View view = this.f119419t;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.f119421v;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.e5w);
            }
            android.widget.TextView textView2 = this.f119421v;
            if (textView2 != null) {
                textView2.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
            android.widget.TextView textView3 = this.f119420u;
            if (textView3 != null) {
                textView3.setText(str);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f119422w;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            android.widget.TextView textView4 = this.f119421v;
            if (textView4 == null) {
                return;
            }
            textView4.setEnabled(true);
            return;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.view.View view2 = this.f119419t;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f119419t;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView5 = this.f119421v;
        if (textView5 != null) {
            textView5.setText(com.tencent.mm.R.string.e5x);
        }
        android.widget.TextView textView6 = this.f119421v;
        if (textView6 != null) {
            textView6.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Brand_100));
        }
        android.widget.TextView textView7 = this.f119420u;
        if (textView7 != null) {
            textView7.setText(str);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f119422w;
        if (weImageView2 != null) {
            weImageView2.setVisibility(4);
        }
        android.widget.TextView textView8 = this.f119421v;
        if (textView8 == null) {
            return;
        }
        textView8.setEnabled(false);
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i(this.f119407e, "setRealname realnameCheckFail" + this.f119424y + ", finderRealNameCheckFail:" + this.f119425z + ", finderRealNameNewCheckFail:" + this.A);
        boolean z17 = this.f119424y;
        if (!z17 && !this.f119425z && !this.A) {
            android.widget.TextView textView = this.f119415p;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.e5x);
            }
            android.widget.TextView textView2 = this.f119415p;
            if (textView2 != null) {
                textView2.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Brand_100));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f119416q;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
            android.widget.TextView textView3 = this.f119415p;
            if (textView3 == null) {
                return;
            }
            textView3.setEnabled(false);
            return;
        }
        if (z17) {
            android.widget.TextView textView4 = this.f119415p;
            if (textView4 != null) {
                textView4.setText(com.tencent.mm.R.string.e5w);
            }
        } else {
            android.widget.TextView textView5 = this.f119415p;
            if (textView5 != null) {
                textView5.setText(com.tencent.mm.R.string.e6b);
            }
        }
        android.widget.TextView textView6 = this.f119415p;
        if (textView6 != null) {
            textView6.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478532ac));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f119416q;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        android.widget.TextView textView7 = this.f119415p;
        if (textView7 == null) {
            return;
        }
        textView7.setEnabled(true);
    }

    public final void h(boolean z17, int i17) {
        java.lang.String str = this.f119407e;
        com.tencent.mars.xlog.Log.i(str, "updatePrecheck precheckType:" + i17 + ", " + z17);
        if (i17 == 1) {
            if (z17) {
                this.f119424y = false;
            }
            g();
        } else if (i17 == 2) {
            if (z17) {
                this.B = false;
            }
            d();
        } else if (i17 == 3) {
            if (z17) {
                this.C = false;
            }
            f(this.f119411i);
        } else if (i17 == 4) {
            if (z17) {
                this.f119425z = false;
            }
            g();
        } else if (i17 == 5) {
            if (z17) {
                this.A = false;
            }
            g();
        }
        e();
        com.tencent.mars.xlog.Log.i(str, "updatePrecheck realnameCheckFail:" + this.f119424y + ", finderRealNameCheckFail:" + this.f119425z + ", finderRealNameNewCheckFail:" + this.A + ", ageCheckFail:" + this.B + ", othersCheckFail:" + this.C);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = false;
        if (!((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l2m) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l2k))) {
            if (!((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l2b) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l2_))) {
                if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l2h) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l2f)) {
                    a(this.f119409g, 3);
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l2d) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - qd2.h.f361767a < 500) {
                        com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                        z17 = true;
                    }
                    qd2.h.f361767a = currentTimeMillis;
                    if (z17) {
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    if (this.f119423x) {
                        yz5.l lVar2 = this.f119413n;
                        if (lVar2 != null) {
                            lVar2.invoke(java.lang.Boolean.TRUE);
                        }
                    } else {
                        android.content.Context context = this.f119406d.getContext();
                        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("KEY_PATH", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
                        intent.putExtra("KEY_TYPE", "TYPE_LICENSE");
                        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", this.D);
                        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", this.E);
                        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Jj((android.app.Activity) context, intent, 10123);
                    }
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.ofa && (lVar = this.f119413n) != null) {
                    lVar.invoke(java.lang.Boolean.FALSE);
                }
            }
        } else if (this.f119424y) {
            a(this.f119409g, 1);
        } else if (this.A) {
            a(this.f119410h, 5);
        } else {
            a("", 4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
