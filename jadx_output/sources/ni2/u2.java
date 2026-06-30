package ni2;

/* loaded from: classes3.dex */
public final class u2 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f337478h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.g1 f337479i;

    /* renamed from: m, reason: collision with root package name */
    public int f337480m;

    /* renamed from: n, reason: collision with root package name */
    public int f337481n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f337482o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, false, null, false, 14, null);
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f337478h = basePlugin;
        this.f337482o = jz5.h.b(new ni2.t2(context, this));
        this.f118384g.c(context.getResources().getDrawable(com.tencent.mm.R.drawable.aja));
        java.util.LinkedList linkedList = ((mm2.e1) basePlugin.P0(mm2.e1.class)).G;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.p12) obj).getInteger(0) == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.p12 p12Var = (r45.p12) obj;
            if (p12Var != null) {
                android.widget.RelativeLayout[] relativeLayoutArr = new android.widget.RelativeLayout[3];
                fg2.g1 g1Var = this.f337479i;
                if (g1Var == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                relativeLayoutArr[0] = g1Var.f262057g;
                if (g1Var == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                relativeLayoutArr[1] = g1Var.f262055e;
                if (g1Var == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                relativeLayoutArr[2] = g1Var.f262053c;
                for (android.widget.RelativeLayout relativeLayout : kz5.c0.i(relativeLayoutArr)) {
                    int A = A(relativeLayout);
                    relativeLayout.setVisibility(pm0.v.z(p12Var.getInteger(3), A) ? 0 : 8);
                    com.tencent.mars.xlog.Log.i("FinderLiveVoiceRoomModePanel", "liveSubMode: " + A + ",visibility: " + relativeLayout.getVisibility());
                }
            }
        }
    }

    public final int A(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.g1 g1Var = this.f337479i;
        if (g1Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        int id6 = g1Var.f262057g.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            return 2;
        }
        fg2.g1 g1Var2 = this.f337479i;
        if (g1Var2 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        int id7 = g1Var2.f262055e.getId();
        if (valueOf != null && valueOf.intValue() == id7) {
            return 8;
        }
        fg2.g1 g1Var3 = this.f337479i;
        if (g1Var3 != null) {
            return (valueOf != null && valueOf.intValue() == g1Var3.f262053c.getId()) ? 16 : 2;
        }
        kotlin.jvm.internal.o.o("viewBinding");
        throw null;
    }

    public final void B(int i17) {
        if (i17 == 8) {
            fg2.g1 g1Var = this.f337479i;
            if (g1Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            g1Var.f262054d.setVisibility(0);
            fg2.g1 g1Var2 = this.f337479i;
            if (g1Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            g1Var2.f262056f.setVisibility(8);
            fg2.g1 g1Var3 = this.f337479i;
            if (g1Var3 != null) {
                g1Var3.f262052b.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
        if (i17 != 16) {
            fg2.g1 g1Var4 = this.f337479i;
            if (g1Var4 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            g1Var4.f262054d.setVisibility(8);
            fg2.g1 g1Var5 = this.f337479i;
            if (g1Var5 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            g1Var5.f262056f.setVisibility(0);
            fg2.g1 g1Var6 = this.f337479i;
            if (g1Var6 != null) {
                g1Var6.f262052b.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
        fg2.g1 g1Var7 = this.f337479i;
        if (g1Var7 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        g1Var7.f262054d.setVisibility(8);
        fg2.g1 g1Var8 = this.f337479i;
        if (g1Var8 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        g1Var8.f262056f.setVisibility(8);
        fg2.g1 g1Var9 = this.f337479i;
        if (g1Var9 != null) {
            g1Var9.f262052b.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        return f();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488937dl1;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.m0x);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int A = A(view);
        this.f337481n = A;
        B(A);
        z(this.f337481n != this.f337480m);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.sp_;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.sp_);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.spa;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.spa);
            if (relativeLayout != null) {
                i17 = com.tencent.mm.R.id.spb;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.spb);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.spc;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.spc);
                    if (textView2 != null) {
                        i17 = com.tencent.mm.R.id.r7p;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.r7p);
                        if (weImageView2 != null) {
                            i17 = com.tencent.mm.R.id.r7q;
                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.r7q);
                            if (relativeLayout2 != null) {
                                i17 = com.tencent.mm.R.id.r7r;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.r7r);
                                if (textView3 != null) {
                                    i17 = com.tencent.mm.R.id.r8t;
                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.r8t);
                                    if (textView4 != null) {
                                        i17 = com.tencent.mm.R.id.jux;
                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.jux);
                                        if (weImageView3 != null) {
                                            i17 = com.tencent.mm.R.id.f486008qv0;
                                            android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.f486008qv0);
                                            if (relativeLayout3 != null) {
                                                i17 = com.tencent.mm.R.id.f486009qv1;
                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f486009qv1);
                                                if (textView5 != null) {
                                                    i17 = com.tencent.mm.R.id.f486010qv2;
                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f486010qv2);
                                                    if (textView6 != null) {
                                                        this.f337479i = new fg2.g1((android.widget.LinearLayout) rootView, weImageView, relativeLayout, textView, textView2, weImageView2, relativeLayout2, textView3, textView4, weImageView3, relativeLayout3, textView5, textView6);
                                                        relativeLayout3.setOnClickListener(this);
                                                        fg2.g1 g1Var = this.f337479i;
                                                        if (g1Var == null) {
                                                            kotlin.jvm.internal.o.o("viewBinding");
                                                            throw null;
                                                        }
                                                        g1Var.f262055e.setOnClickListener(this);
                                                        fg2.g1 g1Var2 = this.f337479i;
                                                        if (g1Var2 != null) {
                                                            g1Var2.f262053c.setOnClickListener(this);
                                                            return;
                                                        } else {
                                                            kotlin.jvm.internal.o.o("viewBinding");
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        a();
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337478h;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        android.content.Context context = this.f118381d;
        if (u4Var != null && ((mm2.e1) lVar.P0(mm2.e1.class)).c7()) {
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.m3y), 0).show();
            return;
        }
        int i17 = this.f337481n;
        java.lang.String str = "";
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            if (!((om2.g) lVar.P0(om2.g.class)).f346311r.isEmpty()) {
                str = context.getResources().getString(com.tencent.mm.R.string.e0d);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
        } else if (((mm2.o4) lVar.P0(mm2.o4.class)).f329327v.size() > 0) {
            if (i17 == 2) {
                str = context.getResources().getString(com.tencent.mm.R.string.m0w, context.getResources().getString(com.tencent.mm.R.string.m0f));
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else if (i17 == 8) {
                str = context.getResources().getString(com.tencent.mm.R.string.m0w, context.getResources().getString(com.tencent.mm.R.string.epw));
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else if (i17 != 16) {
                str = context.getResources().getString(com.tencent.mm.R.string.m0w, context.getResources().getString(com.tencent.mm.R.string.m0n));
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else {
                str = context.getResources().getString(com.tencent.mm.R.string.m0w, context.getResources().getString(com.tencent.mm.R.string.olu));
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
        }
        if (!(str.length() > 0)) {
            y();
            return;
        }
        ni2.q2 q2Var = (ni2.q2) ((jz5.n) this.f337482o).getValue();
        int i18 = this.f337481n;
        q2Var.getClass();
        q2Var.w();
        android.widget.TextView textView = q2Var.f337442m;
        if (textView == null) {
            kotlin.jvm.internal.o.o("headerTextView");
            throw null;
        }
        textView.setText(str);
        android.widget.TextView textView2 = q2Var.f337445p;
        if (textView2 != null) {
            textView2.setVisibility(i18 != 8 ? 8 : 0);
        } else {
            kotlin.jvm.internal.o.o("secondText");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337478h;
        this.f337480m = ((mm2.e1) lVar.P0(mm2.e1.class)).U6();
        B(((mm2.e1) lVar.P0(mm2.e1.class)).U6());
        z(false);
    }

    public final void y() {
        km2.m V0;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        ch2.o2 o2Var;
        te2.j0 j0Var;
        java.lang.Object obj;
        boolean z17;
        zi2.w wVar = (zi2.w) this.f337478h.X0(zi2.w.class);
        if (wVar != null) {
            if (this.f337481n == 2) {
                wVar.t1();
            }
            int i17 = this.f337481n;
            if (i17 == 1 || i17 == 8 || i17 == 16) {
                zn0.y yVar = zn0.x.f474414a;
                java.util.ArrayList arrayList = yVar.f474415a;
                if (arrayList == null) {
                    com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "micFocusGrabModeFillConfig remoteUserConfigList = null");
                } else {
                    if (arrayList.size() > 1) {
                        kz5.g0.t(arrayList, new zi2.q());
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "resetToNormalPosition before audienceList: " + ((mm2.o4) wVar.P0(mm2.o4.class)).f329327v);
                    java.util.ArrayList arrayList2 = yVar.f474415a;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    yVar.f474416b = 1;
                    yVar.f474417c = size;
                    ((mm2.o4) wVar.P0(mm2.o4.class)).a7().f309192w = 1;
                    synchronized (arrayList) {
                        java.util.Iterator it = arrayList.iterator();
                        int i18 = 0;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            zn0.v vVar = (zn0.v) next;
                            int i27 = i18 + 2;
                            vVar.f474413n = i27;
                            java.util.List list = ((mm2.o4) wVar.P0(mm2.o4.class)).f329327v;
                            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
                            synchronized (list) {
                                java.util.Iterator it6 = list.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it6.next();
                                        if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, vVar.f474406d)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            km2.q qVar = (km2.q) obj;
                            if (qVar != null) {
                                qVar.f309192w = i27;
                            }
                            i18 = i19;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "resetToNormalPosition after audienceList: " + ((mm2.o4) wVar.P0(mm2.o4.class)).f329327v);
                }
            }
            wVar.E1("opChangeLiveMode");
            if (((mm2.e1) wVar.P0(mm2.e1.class)).b7()) {
                if (!(i17 == 8)) {
                    z17 = true;
                    com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "opChangeLiveMode mainMode: 2 subMode: " + i17 + " isNeedClearSong: " + z17);
                    com.tencent.mm.plugin.finder.live.util.y.e(wVar, null, null, new zi2.m(wVar, 2, i17, null, null), 3, null);
                }
            }
            z17 = false;
            com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "opChangeLiveMode mainMode: 2 subMode: " + i17 + " isNeedClearSong: " + z17);
            com.tencent.mm.plugin.finder.live.util.y.e(wVar, null, null, new zi2.m(wVar, 2, i17, null, null), 3, null);
        }
        df2.y1 y1Var = (df2.y1) this.f337478h.U0(df2.y1.class);
        if (y1Var != null) {
            int i28 = this.f337481n;
            r45.q12 q12Var = ((mm2.e1) y1Var.business(mm2.e1.class)).f328989s;
            if (q12Var != null) {
                q12Var.set(1, java.lang.Integer.valueOf(i28));
            }
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) y1Var.business(mm2.g1.class)).f329068f;
            r45.q12 q12Var2 = j2Var != null ? (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null;
            if (q12Var2 != null) {
                q12Var2.set(1, java.lang.Integer.valueOf(i28));
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).ek(y1Var.a7());
        }
        qo0.c.a(this.f337478h.f113325g, qo0.b.R4, null, 2, null);
        qo0.c cVar = this.f337478h.f113325g;
        qo0.b bVar = qo0.b.T2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.q12 q12Var3 = ((mm2.e1) this.f337478h.P0(mm2.e1.class)).f328989s;
        bundle.putInt("PARAM_FINDER_LIVE_MAIN_MODE", q12Var3 != null ? q12Var3.getInteger(0) : 0);
        bundle.putInt("PARAM_FINDER_LIVE_SUB_MODE", this.f337481n);
        cVar.statusChange(bVar, bundle);
        ch2.q qVar2 = (ch2.q) this.f337478h.U0(ch2.q.class);
        if (qVar2 != null) {
            int i29 = this.f337481n;
            com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "onVoiceModeChange curSelectLiveSubMode: " + i29);
            if (i29 == 8) {
                com.tencent.mm.plugin.finder.live.plugin.h8 h8Var = (com.tencent.mm.plugin.finder.live.plugin.h8) qVar2.R6(com.tencent.mm.plugin.finder.live.plugin.h8.class);
                if (h8Var != null && (j0Var = h8Var.f112785q) != null) {
                    ((te2.p1) j0Var).y();
                }
                qVar2.c7();
            } else {
                qVar2.f7("onVoiceModeChange");
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337478h;
        r45.yx1 Q6 = ((om2.g) lVar.P0(om2.g.class)).Q6();
        if (Q6 == null || (V0 = lVar.V0()) == null || (liveRoomControllerStore = V0.f309131f) == null || (o2Var = (ch2.o2) liveRoomControllerStore.controller(ch2.o2.class)) == null) {
            return;
        }
        zh2.a.b3(o2Var, Q6, null, 2, null);
    }

    public final void z(boolean z17) {
        android.widget.TextView textView;
        android.view.View view = this.f118383f;
        if (z17) {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.aaz));
                textView.setEnabled(true);
                return;
            }
            return;
        }
        textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
            textView.setEnabled(false);
        }
    }
}
