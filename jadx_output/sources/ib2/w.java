package ib2;

/* loaded from: classes2.dex */
public final class w extends com.tencent.mm.ui.component.UIComponent {
    public java.lang.String A;
    public int B;
    public long C;
    public final android.view.ViewOutlineProvider D;
    public final o25.y1 E;
    public final ib2.u F;

    /* renamed from: d, reason: collision with root package name */
    public r45.vx0 f290156d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f290157e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f290158f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f290159g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f290160h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f290161i;

    /* renamed from: m, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f290162m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f290163n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f290164o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f290165p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f290166q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f290167r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f290168s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f290169t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f290170u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f290171v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f290172w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f290173x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f290174y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f290175z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.D = new ib2.b();
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.E = new com.tencent.mm.pluginsdk.forward.m();
        this.F = new ib2.u(this, getActivity());
    }

    public static final r45.ev2 O6(ib2.w wVar) {
        r45.vx0 vx0Var = wVar.f290156d;
        if (vx0Var == null) {
            return null;
        }
        int i17 = 0;
        int intExtra = wVar.getIntent().getIntExtra("collection_ref_comment_scene", 0);
        r45.ev2 ev2Var = new r45.ev2();
        ev2Var.set(0, java.lang.Long.valueOf(vx0Var.getLong(0)));
        ev2Var.set(1, vx0Var.getString(1));
        ev2Var.set(2, vx0Var.getString(2));
        ev2Var.set(3, vx0Var.getString(3));
        ev2Var.set(4, java.lang.Integer.valueOf(vx0Var.getInteger(4)));
        ev2Var.set(5, java.lang.Integer.valueOf(vx0Var.getInteger(21)));
        java.lang.String str = wVar.f290172w;
        if (str == null) {
            kotlin.jvm.internal.o.o("authorUsername");
            throw null;
        }
        ev2Var.set(8, str);
        java.lang.String str2 = wVar.f290174y;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("nickname");
            throw null;
        }
        ev2Var.set(9, str2);
        java.lang.String str3 = wVar.f290175z;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("avatarUrl");
            throw null;
        }
        ev2Var.set(10, str3);
        java.lang.String str4 = wVar.A;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("authIconUrl");
            throw null;
        }
        ev2Var.set(11, str4);
        ev2Var.set(12, java.lang.Integer.valueOf(wVar.B));
        if (intExtra >= 0) {
            i17 = intExtra;
        } else {
            android.app.Activity context = wVar.getContext();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
            if (mMFinderUI != null) {
                i17 = mMFinderUI.getD();
            }
        }
        ev2Var.set(13, java.lang.Integer.valueOf(i17));
        return ev2Var;
    }

    public static /* synthetic */ java.util.Map Q6(ib2.w wVar, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = null;
        }
        return wVar.P6(str);
    }

    public final java.util.Map P6(java.lang.String str) {
        int intExtra = getIntent().getIntExtra("collection_ref_comment_scene", 0);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null) {
            return null;
        }
        r45.qt2 V6 = nyVar.V6();
        lz5.m mVar = new lz5.m();
        mVar.put("finder_tab_context_id", V6.getString(2));
        mVar.put("finder_context_id", V6.getString(1));
        mVar.put("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
        r45.vx0 vx0Var = this.f290156d;
        mVar.put("collection_id", pm0.v.u(vx0Var != null ? vx0Var.getLong(0) : 0L));
        r45.vx0 vx0Var2 = this.f290156d;
        mVar.put("collection_feed_num", vx0Var2 != null ? java.lang.Integer.valueOf(vx0Var2.getInteger(4)) : null);
        java.lang.String str2 = this.f290172w;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("authorUsername");
            throw null;
        }
        mVar.put("author_finder_username", str2);
        mVar.put("is_intelligent_collection", java.lang.Integer.valueOf(hc2.q.b(this.f290156d) ? 1 : 0));
        mVar.put("stay_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.C));
        mVar.put("ref_commentscene", java.lang.Integer.valueOf(intExtra));
        if (str != null) {
            mVar.put("avatar_finder_username", str);
        }
        return kz5.b1.b(mVar);
    }

    public final void R6() {
        r45.vx0 vx0Var = this.f290156d;
        if (vx0Var != null) {
            android.widget.ImageView imageView = this.f290157e;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("coverIv");
                throw null;
            }
            imageView.setOutlineProvider(this.D);
            android.widget.ImageView imageView2 = this.f290157e;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("coverIv");
                throw null;
            }
            imageView2.setClipToOutline(true);
            java.lang.String string = vx0Var.getString(3);
            if (string == null || string.length() == 0) {
                android.widget.ImageView imageView3 = this.f290157e;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("coverIv");
                    throw null;
                }
                imageView3.setImageResource(com.tencent.mm.R.color.BW_0_Alpha_0_1);
            } else {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(vx0Var.getString(3), com.tencent.mm.plugin.finder.storage.y90.f128356f);
                android.widget.ImageView imageView4 = this.f290157e;
                if (imageView4 == null) {
                    kotlin.jvm.internal.o.o("coverIv");
                    throw null;
                }
                e17.c(q3Var, imageView4, g1Var.h(mn2.f1.f329963q));
            }
            android.widget.TextView textView = this.f290161i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("collectionBarTitle");
                throw null;
            }
            textView.setText(vx0Var.getString(1));
            android.widget.TextView textView2 = this.f290158f;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView2.setText(vx0Var.getString(1));
            long f17 = c01.id.f(vx0Var.getInteger(7));
            java.lang.String m17 = com.tencent.mm.plugin.finder.assist.w2.m(getContext(), vx0Var.getInteger(7) * 1000, java.lang.Boolean.TRUE);
            java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.ets);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (f17 < 31536000) {
                m17 = m17 + string2;
            }
            java.lang.String string3 = getContext().getString(com.tencent.mm.R.string.etl, java.lang.Integer.valueOf(vx0Var.getInteger(4)));
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = getContext().getString(com.tencent.mm.R.string.etm, m17);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            kotlin.jvm.internal.o.d(m17);
            if (m17.length() > 0) {
                java.lang.String str = string3 + ' ' + string4;
                int dimension = com.tencent.mm.ui.bl.b(getContext()).x - ((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.aml));
                int length = str.length();
                android.widget.TextView textView3 = this.f290159g;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("feedCountTv");
                    throw null;
                }
                android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(str, 0, length, textView3.getPaint(), dimension).setIncludePad(false).build();
                kotlin.jvm.internal.o.f(build, "build(...)");
                if (build.getLineCount() <= 1) {
                    android.widget.TextView textView4 = this.f290159g;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("feedCountTv");
                        throw null;
                    }
                    textView4.setText(str);
                } else {
                    android.widget.TextView textView5 = this.f290159g;
                    if (textView5 == null) {
                        kotlin.jvm.internal.o.o("feedCountTv");
                        throw null;
                    }
                    java.lang.String k17 = hc2.f1.k(textView5, getContext(), dimension, string3, 1);
                    android.widget.TextView textView6 = this.f290159g;
                    if (textView6 == null) {
                        kotlin.jvm.internal.o.o("feedCountTv");
                        throw null;
                    }
                    java.lang.String str2 = k17 + '\n' + hc2.f1.k(textView6, getContext(), dimension, m17, 1);
                    android.widget.TextView textView7 = this.f290159g;
                    if (textView7 == null) {
                        kotlin.jvm.internal.o.o("feedCountTv");
                        throw null;
                    }
                    textView7.setText(str2);
                }
            } else {
                android.widget.TextView textView8 = this.f290159g;
                if (textView8 == null) {
                    kotlin.jvm.internal.o.o("feedCountTv");
                    throw null;
                }
                textView8.setText(string3);
            }
            if (vx0Var.getInteger(21) == 23 || vx0Var.getInteger(21) == 24) {
                android.view.View view = this.f290169t;
                if (view == null) {
                    kotlin.jvm.internal.o.o("smartDescContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = this.f290169t;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("smartDescContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        java.lang.String stringExtra3;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        this.C = java.lang.System.currentTimeMillis();
        try {
            com.tencent.mm.protobuf.f parseFrom = new r45.vx0().parseFrom(getContext().getIntent().getByteArrayExtra("collection_info"));
            this.f290156d = parseFrom instanceof r45.vx0 ? (r45.vx0) parseFrom : null;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderCollectionHeaderUIC", "parse error with exception:" + e17);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.vx0 vx0Var = this.f290156d;
        objArr[0] = pm0.v.u(vx0Var != null ? vx0Var.getLong(0) : 0L);
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionHeaderUIC", "collectionTopicId %s", objArr);
        java.lang.String stringExtra4 = getContext().getIntent().getStringExtra("collection_author_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f290172w = stringExtra4;
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 b17 = gVar.b(stringExtra4);
        if (b17 != null) {
            stringExtra = b17.w0();
        } else {
            stringExtra = getIntent().getStringExtra("collection_nickname");
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        this.f290174y = stringExtra;
        if (b17 != null) {
            stringExtra2 = b17.getAvatarUrl();
        } else {
            stringExtra2 = getIntent().getStringExtra("collection_avatar_url");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
        }
        this.f290175z = stringExtra2;
        if (b17 == null || (finderAuthInfo2 = b17.field_authInfo) == null || (stringExtra3 = finderAuthInfo2.getAuthIconUrl()) == null) {
            stringExtra3 = getIntent().getStringExtra("collection_authicon_url");
        }
        this.A = stringExtra3 != null ? stringExtra3 : "";
        this.B = (b17 == null || (finderAuthInfo = b17.field_authInfo) == null) ? getIntent().getIntExtra("collection_authicon_type", 0) : finderAuthInfo.getAuthIconType();
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.f482547hd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f290161i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.f483829sw4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f290160h = findViewById2;
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.f483236a25);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f290162m = (com.google.android.material.appbar.AppBarLayout) findViewById3;
        android.view.View findViewById4 = getActivity().findViewById(com.tencent.mm.R.id.svn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f290163n = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = getActivity().findViewById(com.tencent.mm.R.id.f483828sw3);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f290164o = findViewById5;
        android.view.View findViewById6 = getActivity().findViewById(com.tencent.mm.R.id.svv);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f290165p = findViewById6;
        android.view.View findViewById7 = getActivity().findViewById(com.tencent.mm.R.id.svf);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f290166q = findViewById7;
        android.view.View findViewById8 = getRootView().findViewById(com.tencent.mm.R.id.svy);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f290167r = findViewById8;
        android.view.View findViewById9 = getRootView().findViewById(com.tencent.mm.R.id.svj);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f290168s = findViewById9;
        android.view.View view = this.f290166q;
        if (view == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        view.setOnClickListener(new ib2.e(this));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            hc2.i.e(mMActivity, false);
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) activity2;
        android.view.View view2 = this.f290164o;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("titleContainer");
            throw null;
        }
        android.widget.FrameLayout frameLayout = this.f290163n;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("headerBgLayout");
            throw null;
        }
        hc2.i.a(mMActivity2, view2, frameLayout);
        android.view.View findViewById10 = getRootView().findViewById(com.tencent.mm.R.id.svi);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f290157e = (android.widget.ImageView) findViewById10;
        android.view.View findViewById11 = getRootView().findViewById(com.tencent.mm.R.id.f483827sw2);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f290158f = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = getRootView().findViewById(com.tencent.mm.R.id.svd);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f290170u = findViewById12;
        android.view.View findViewById13 = getRootView().findViewById(com.tencent.mm.R.id.sve);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f290171v = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = getRootView().findViewById(com.tencent.mm.R.id.svk);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f290159g = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = getRootView().findViewById(com.tencent.mm.R.id.f483826sw1);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f290169t = findViewById15;
        android.view.View findViewById16 = getRootView().findViewById(com.tencent.mm.R.id.svc);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.f290173x = (android.widget.ImageView) findViewById16;
        android.view.View view3 = this.f290164o;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("titleContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.FrameLayout frameLayout2 = this.f290163n;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("headerBgLayout");
            throw null;
        }
        frameLayout2.setVisibility(0);
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.f290162m;
        if (appBarLayout == null) {
            kotlin.jvm.internal.o.o("appBarLayout");
            throw null;
        }
        ib2.a aVar = new ib2.a(this);
        com.google.android.material.appbar.AppBarLayout appBarLayout2 = this.f290162m;
        if (appBarLayout2 == null) {
            kotlin.jvm.internal.o.o("appBarLayout");
            throw null;
        }
        aVar.a(appBarLayout2, 0);
        appBarLayout.a(aVar);
        if (this.f290156d != null) {
            R6();
        }
        android.view.View view4 = this.f290165p;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("moreBtn");
            throw null;
        }
        view4.setOnClickListener(new ib2.f(this));
        d92.f fVar = d92.f.f227470a;
        android.view.View view5 = this.f290167r;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("shareBtn");
            throw null;
        }
        d92.f.j(fVar, view5, true, false, 2, null);
        android.view.View view6 = this.f290167r;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("shareBtn");
            throw null;
        }
        view6.setOnClickListener(new ib2.g(this));
        android.view.View view7 = this.f290168s;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("favBtn");
            throw null;
        }
        d92.f.j(fVar, view7, true, false, 2, null);
        android.view.View view8 = this.f290168s;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("favBtn");
            throw null;
        }
        view8.setOnClickListener(new ib2.h(this));
        android.view.View view9 = this.f290165p;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("moreBtn");
            throw null;
        }
        hc2.v0.e(view9, "collection_list_menu_button", 0, 0, false, false, null, new ib2.i(this), 62, null);
        android.view.View view10 = this.f290167r;
        if (view10 == null) {
            kotlin.jvm.internal.o.o("shareBtn");
            throw null;
        }
        hc2.v0.e(view10, "collection_list_share", 0, 0, false, false, null, new ib2.j(this), 62, null);
        android.view.View view11 = this.f290168s;
        if (view11 == null) {
            kotlin.jvm.internal.o.o("favBtn");
            throw null;
        }
        hc2.v0.e(view11, "collection_list_fav", 0, 0, false, false, null, new ib2.k(this), 62, null);
        android.view.View view12 = this.f290169t;
        if (view12 == null) {
            kotlin.jvm.internal.o.o("smartDescContainer");
            throw null;
        }
        view12.setOnClickListener(new ib2.c(this));
        java.lang.String str = this.f290172w;
        if (str == null) {
            kotlin.jvm.internal.o.o("authorUsername");
            throw null;
        }
        if (str.length() > 0) {
            android.view.View view13 = this.f290170u;
            if (view13 == null) {
                kotlin.jvm.internal.o.o("authorContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view13, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str2 = this.f290172w;
            if (str2 == null) {
                kotlin.jvm.internal.o.o("authorUsername");
                throw null;
            }
            ya2.b2 b18 = gVar.b(str2);
            java.lang.String str3 = this.f290174y;
            if (str3 == null) {
                kotlin.jvm.internal.o.o("nickname");
                throw null;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(str3);
            java.lang.String str4 = this.f290174y;
            if (str4 == null) {
                kotlin.jvm.internal.o.o("nickname");
                throw null;
            }
            com.tencent.mm.plugin.finder.view.yl ylVar = new com.tencent.mm.plugin.finder.view.yl(str4, getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5), getContext().getResources().getColor(com.tencent.mm.R.color.Link_Alpha_0_6), false, false, new ib2.d(this), 16, null);
            java.lang.String str5 = this.f290174y;
            if (str5 == null) {
                kotlin.jvm.internal.o.o("nickname");
                throw null;
            }
            spannableString.setSpan(ylVar, 0, str5.length(), 17);
            android.widget.TextView textView = this.f290171v;
            if (textView == null) {
                kotlin.jvm.internal.o.o("authorTv");
                throw null;
            }
            textView.setText(spannableString);
            android.widget.TextView textView2 = this.f290171v;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("authorTv");
                throw null;
            }
            textView2.setOnTouchListener(new com.tencent.mm.plugin.finder.assist.c8(spannableString, textView2));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f460511a;
            android.widget.ImageView imageView = this.f290173x;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("authIcon");
                throw null;
            }
            zy2.tb.a(m1Var, imageView, b18 != null ? b18.field_authInfo : null, 0, 4, null);
        } else {
            android.view.View view14 = this.f290170u;
            if (view14 == null) {
                kotlin.jvm.internal.o.o("authorContainer");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view14, arrayList3.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.E.getClass();
        this.F.q();
        cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getActivity(), iy1.c.FinderCollectionUI);
        aVar2.Rj(getActivity(), iy1.a.Finder);
        aVar2.Tj(getActivity(), 44, 1, false);
        aVar2.gk(getActivity(), P6(null));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.F.getClass();
        this.E.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.D = new ib2.b();
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.E = new com.tencent.mm.pluginsdk.forward.m();
        this.F = new ib2.u(this, getActivity());
    }
}
