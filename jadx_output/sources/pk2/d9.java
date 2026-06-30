package pk2;

/* loaded from: classes3.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final pk2.g8 f355658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f355659b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f355660c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f355661d;

    /* renamed from: e, reason: collision with root package name */
    public pk2.c7 f355662e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.e3 f355663f;

    /* renamed from: g, reason: collision with root package name */
    public kl2.e0 f355664g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.e9 f355665h;

    /* renamed from: i, reason: collision with root package name */
    public o25.y1 f355666i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.yx f355667j;

    /* renamed from: k, reason: collision with root package name */
    public kotlinx.coroutines.f1 f355668k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.q1 f355669l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f355670m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f355671n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f355672o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f355673p;

    /* renamed from: q, reason: collision with root package name */
    public pk2.p7 f355674q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f355675r;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f355676s;

    /* renamed from: t, reason: collision with root package name */
    public final db5.t4 f355677t;

    /* renamed from: u, reason: collision with root package name */
    public final db5.t4 f355678u;

    /* renamed from: v, reason: collision with root package name */
    public final db5.s4 f355679v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355680w;

    public d9(pk2.o9 o9Var, pk2.g8 livingDep) {
        kotlin.jvm.internal.o.g(livingDep, "livingDep");
        this.f355680w = o9Var;
        this.f355658a = livingDep;
        this.f355659b = true;
        this.f355670m = new java.util.ArrayList();
        this.f355671n = new java.util.ArrayList();
        this.f355672o = new java.util.ArrayList();
        this.f355673p = new java.util.ArrayList();
        boolean g17 = zl2.q4.f473933a.g();
        this.f355659b = g17;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "enableVisitorRoleEntrance:" + g17);
        this.f355676s = new pk2.o8(o9Var, this);
        this.f355677t = new pk2.i8(o9Var, this);
        this.f355678u = new pk2.b9(o9Var, this);
        this.f355679v = new pk2.c9(o9Var);
    }

    public static final void a(pk2.d9 d9Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, android.view.View view) {
        r45.c03 tips_info;
        java.lang.String string;
        pk2.o9 o9Var = d9Var.f355680w;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        if (finderObject == null || (tips_info = finderObject.getTips_info()) == null || (string = tips_info.getString(0)) == null) {
            return;
        }
        if (!(string.length() > 0)) {
            string = null;
        }
        if (string != null) {
            com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
            android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.f489096b95, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g2u);
            if (textView != null) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                textView.setText(string);
            }
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.d1o);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper$LivingMoreActionHelper", "updateReviewWording", "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper$LivingMoreActionHelper", "updateReviewWording", "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (view == null) {
                if (k0Var != null) {
                    k0Var.s(inflate, true);
                    return;
                }
                return;
            }
            pm0.v.B(view);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(mMActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(inflate, -1, -2);
            linearLayout.addView(view, -1, -2);
            if (k0Var != null) {
                k0Var.s(linearLayout, true);
            }
        }
    }

    public final void b(qk2.h hVar) {
        ((java.util.ArrayList) this.f355671n).add(hVar);
        qk2.f fVar = this.f355680w.f356086h;
        if (fVar != null) {
            fVar.a(hVar);
        }
    }

    public final void c(qk2.h hVar) {
        ((java.util.ArrayList) this.f355672o).add(hVar);
        qk2.f fVar = this.f355680w.f356086h;
        if (fVar != null) {
            fVar.a(hVar);
        }
    }

    public final void d(qk2.h hVar) {
        ((java.util.ArrayList) this.f355670m).add(hVar);
        qk2.f fVar = this.f355680w.f356086h;
        if (fVar != null) {
            fVar.a(hVar);
        }
    }

    public final void e() {
        android.app.Dialog dialog;
        r45.c03 tips_info;
        kn0.g gVar;
        r45.ka4 ka4Var;
        com.tencent.mm.ui.MMActivity mMActivity = this.f355680w.f356078d;
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.x1()) {
            f(mMActivity);
            return;
        }
        if (r4Var.w1()) {
            f(mMActivity);
            return;
        }
        boolean z17 = true;
        if (!((mm2.c1) this.f355680w.c(mm2.c1.class)).T) {
            if (!(((mm2.n0) this.f355680w.c(mm2.n0.class)).f329273r)) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f355660c;
                pk2.o9 scene = this.f355680w;
                if (k0Var == null) {
                    pk2.f7 f7Var = new pk2.f7(mMActivity, 0, true);
                    kotlin.jvm.internal.o.g(scene, "scene");
                    f7Var.f355746r2 = scene;
                    this.f355660c = f7Var;
                    f7Var.X1 = scene.h();
                    com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f355660c;
                    if (k0Var2 != null) {
                        k0Var2.U1 = true;
                    }
                    if (k0Var2 != null) {
                        k0Var2.V1 = true;
                    }
                }
                if (this.f355666i == null) {
                    ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                    this.f355666i = new com.tencent.mm.pluginsdk.forward.m();
                    r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(mMActivity, 14, r45.pk5.class);
                    if (pk5Var != null) {
                        pk5Var.f383137i = 8;
                    }
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f355660c;
                if (k0Var3 != null) {
                    k0Var3.f211855d2 = false;
                }
                if (k0Var3 != null) {
                    k0Var3.f211872n = new pk2.t8(this);
                }
                if (k0Var3 != null) {
                    k0Var3.f211874o = new pk2.u8(this, mMActivity);
                }
                if (k0Var3 != null) {
                    k0Var3.f211876p = new pk2.v8(this, scene);
                }
                if (k0Var3 != null) {
                    k0Var3.f211892z = new pk2.w8(scene);
                }
                db5.t4 t4Var = this.f355676s;
                if (k0Var3 != null) {
                    k0Var3.f211881s = t4Var;
                }
                if (k0Var3 != null) {
                    k0Var3.f211884v = t4Var;
                }
                if (k0Var3 != null) {
                    k0Var3.f211885w = this.f355678u;
                }
                if (k0Var3 != null) {
                    k0Var3.f211886x = this.f355679v;
                }
                if (k0Var3 != null) {
                    k0Var3.p(new pk2.n8(this, scene, mMActivity));
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var4 = this.f355660c;
                if (k0Var4 != null) {
                    k0Var4.v();
                    return;
                }
                return;
            }
        }
        pk2.c7 c7Var = this.f355662e;
        pk2.o9 o9Var = this.f355680w;
        if (c7Var == null) {
            this.f355662e = new pk2.c7(mMActivity, o9Var.h());
        }
        pk2.c7 c7Var2 = this.f355662e;
        if (c7Var2 != null) {
            int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Link_100);
            android.widget.TextView textView = c7Var2.a().f131971u;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        java.lang.String str = o9Var.f356072a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildAssistantBottomSheet: business(LiveCommonSlice::class.java).liveFinderObject.id:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        java.lang.String str2 = null;
        sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null);
        sb6.append(" hlsUrl:");
        kn0.i iVar = ((mm2.e1) o9Var.c(mm2.e1.class)).f328990t;
        sb6.append((iVar == null || (gVar = iVar.f309558b) == null || (ka4Var = gVar.f309548o) == null) ? null : ka4Var.f378559z);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.rj((ml2.r0) c17, 11, null, 2, null);
        pk2.c7 c7Var3 = this.f355662e;
        if (c7Var3 != null) {
            c7Var3.f355630m = new pk2.q8(this);
        }
        if (c7Var3 != null) {
            c7Var3.f355631n = new pk2.r8(this);
        }
        if (c7Var3 != null) {
            c7Var3.f355632o = new pk2.s8(this);
        }
        if (c7Var3 != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            if (finderObject2 != null && (tips_info = finderObject2.getTips_info()) != null) {
                str2 = tips_info.getString(0);
            }
            android.view.View findViewById = c7Var3.f355624g.findViewById(com.tencent.mm.R.id.tg6);
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            int i17 = z17 ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.g2u);
            if (textView2 != null) {
                com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                textView2.setText(str2);
            }
            android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.d1o);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        pk2.c7 c7Var4 = this.f355662e;
        db5.t4 t4Var2 = this.f355676s;
        if (c7Var4 != null) {
            c7Var4.f355626i.f356330e = t4Var2;
        }
        if (c7Var4 != null) {
            c7Var4.f355627j.f356330e = t4Var2;
        }
        if (c7Var4 != null) {
            c7Var4.f355628k.f356330e = t4Var2;
        }
        if (c7Var4 != null) {
            c7Var4.a().f131968r = new pk2.l8(this, o9Var);
        }
        pk2.c7 c7Var5 = this.f355662e;
        if (c7Var5 != null) {
            db5.o4 o4Var = c7Var5.f355630m;
            if (o4Var != null) {
                o4Var.onCreateMMMenu((db5.g4) ((jz5.n) c7Var5.f355621d).getValue());
            }
            db5.g4 g4Var = (db5.g4) ((jz5.n) c7Var5.f355621d).getValue();
            pk2.w6 w6Var = c7Var5.f355626i;
            w6Var.f356329d = g4Var;
            w6Var.notifyDataSetChanged();
            db5.o4 o4Var2 = c7Var5.f355631n;
            if (o4Var2 != null) {
                o4Var2.onCreateMMMenu((db5.g4) ((jz5.n) c7Var5.f355622e).getValue());
            }
            db5.g4 g4Var2 = (db5.g4) ((jz5.n) c7Var5.f355622e).getValue();
            pk2.w6 w6Var2 = c7Var5.f355627j;
            w6Var2.f356329d = g4Var2;
            w6Var2.notifyDataSetChanged();
            db5.o4 o4Var3 = c7Var5.f355632o;
            if (o4Var3 != null) {
                o4Var3.onCreateMMMenu((db5.g4) ((jz5.n) c7Var5.f355623f).getValue());
            }
            db5.g4 g4Var3 = (db5.g4) ((jz5.n) c7Var5.f355623f).getValue();
            pk2.w6 w6Var3 = c7Var5.f355628k;
            w6Var3.f356329d = g4Var3;
            w6Var3.notifyDataSetChanged();
            c7Var5.a().i();
            android.content.Context context = c7Var5.f355618a;
            if (!r4Var.Y1(context) || (dialog = c7Var5.a().f131957d) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.view.x7.a(dialog, context);
        }
    }

    public final void f(android.app.Activity activity) {
        pk2.p7 p7Var = this.f355674q;
        pk2.o9 o9Var = this.f355680w;
        if (p7Var == null) {
            pk2.p7 p7Var2 = new pk2.p7(activity, o9Var.h());
            this.f355674q = p7Var2;
            p7Var2.c().f131968r = new pk2.m8(this, o9Var);
        }
        this.f355675r = null;
        pk2.p7 p7Var3 = this.f355674q;
        if (p7Var3 != null) {
            int color = o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.Link_100);
            android.widget.TextView textView = p7Var3.c().f131971u;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        pk2.p7 p7Var4 = this.f355674q;
        java.util.List menuConfigs = this.f355673p;
        pk2.y8 y8Var = new pk2.y8(this);
        pk2.z8 z8Var = new pk2.z8(o9Var);
        kotlin.jvm.internal.o.g(menuConfigs, "menuConfigs");
        java.util.ArrayList arrayList = (java.util.ArrayList) menuConfigs;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            pk2.e9 e9Var = (pk2.e9) arrayList.get(i17);
            java.lang.String str = "level_" + i17;
            if (p7Var4 != null) {
                p7Var4.a(str, e9Var.f355713b, new pk2.r9(e9Var));
            }
            if (p7Var4 != null) {
                p7Var4.d(str, new pk2.s9(e9Var, z8Var, y8Var, p7Var4));
            }
            if (p7Var4 != null) {
                p7Var4.e(str, !e9Var.f355712a.isEmpty());
            }
            android.view.View view = e9Var.f355714c;
            if (view != null && p7Var4 != null) {
                p7Var4.b(str, view);
            }
        }
        pk2.p7 p7Var5 = this.f355674q;
        if (p7Var5 != null) {
            p7Var5.f();
        }
    }

    public final com.tencent.mm.plugin.webview.ui.tools.widget.q1 g() {
        com.tencent.mm.plugin.webview.ui.tools.widget.q1 q1Var = this.f355669l;
        if (q1Var != null) {
            return q1Var;
        }
        kotlin.jvm.internal.o.o("magicLiveCardDebugHalfWebViewDialog");
        throw null;
    }

    public final void h() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f355660c;
        if (k0Var != null) {
            k0Var.u();
        }
        pk2.c7 c7Var = this.f355662e;
        if (c7Var != null) {
            c7Var.a().h();
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f355661d;
        if (k0Var2 != null) {
            k0Var2.u();
        }
        pk2.p7 p7Var = this.f355674q;
        if (p7Var != null) {
            p7Var.c().h();
        }
    }

    public final void i() {
        kl2.v vVar;
        com.tencent.mm.plugin.finder.live.widget.yx yxVar = this.f355667j;
        if (yxVar != null) {
            yxVar.f120483e = false;
            yxVar.f120482d = null;
            yxVar.f120481c = null;
        }
        kl2.e0 e0Var = this.f355664g;
        if (e0Var != null && (vVar = (kl2.v) ((jz5.n) e0Var.f308768k).getValue()) != null) {
            vVar.a();
        }
        pk2.p7 p7Var = this.f355674q;
        if (p7Var != null) {
            p7Var.c().h();
        }
        if (zl2.q4.f473933a.E() && this.f355669l != null && g().isShowing()) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) g()).dismiss();
            java.lang.String str = this.f355680w.f356072a;
        }
    }
}
