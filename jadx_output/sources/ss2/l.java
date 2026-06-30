package ss2;

/* loaded from: classes10.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.ui.tools.c5, mv2.w0, ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public ry2.o f411955d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f411956e;

    /* renamed from: f, reason: collision with root package name */
    public ya2.b2 f411957f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f411958g;

    /* renamed from: h, reason: collision with root package name */
    public ss2.a0 f411959h;

    /* renamed from: i, reason: collision with root package name */
    public ss2.d f411960i;

    /* renamed from: m, reason: collision with root package name */
    public ss2.d0 f411961m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONObject f411962n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f411963o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f411964p;

    /* renamed from: q, reason: collision with root package name */
    public int f411965q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f411966r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f411967s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411956e = "";
        this.f411966r = "";
        this.f411967s = jz5.h.b(new ss2.k(activity));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O6(ss2.l r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss2.l.O6(ss2.l):void");
    }

    public final ry2.o P6() {
        ry2.o oVar = this.f411955d;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.o.o("postDataManager");
        throw null;
    }

    public final android.widget.TextView Q6() {
        return (android.widget.TextView) ((jz5.n) this.f411967s).getValue();
    }

    public final void R6() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f411958g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f411958g = null;
    }

    public final void S6() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f411958g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getActivity(), "", getString(com.tencent.mm.R.string.f492022ez1), true, false, null);
        this.f411958g = Q;
        if (Q != null) {
            Q.show();
        }
    }

    public final void T6(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str) {
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList2.isEmpty()) {
                P6().f401420e = 1;
                P6().f401416c.putStringArrayList("image_file_list", null);
                P6().f401416c.putStringArrayList("video_file_list", null);
            } else {
                if (P6().f401422f == null) {
                    P6().f401422f = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = P6().f401426j;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                }
                java.util.ArrayList arrayList4 = P6().f401422f;
                if (arrayList4 != null) {
                    arrayList4.addAll(arrayList2);
                }
                P6().f401420e = 2;
            }
        } else {
            P6().f401422f = new java.util.ArrayList();
            java.util.ArrayList arrayList5 = P6().f401422f;
            if (arrayList5 != null) {
                arrayList5.addAll(arrayList);
            }
            P6().f401420e = 4;
            java.util.ArrayList arrayList6 = P6().f401426j;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            if (str != null && P6().f401426j == null) {
                P6().f401426j = new java.util.ArrayList();
                java.util.ArrayList arrayList7 = P6().f401426j;
                if (arrayList7 != null) {
                    arrayList7.add(str);
                }
            }
        }
        P6().q();
        ss2.a0 a0Var = this.f411959h;
        if (a0Var != null) {
            com.tencent.mars.xlog.Log.i("PostMediaWidget", "refresh thumbLocalUrl");
            android.os.Bundle bundle = a0Var.A;
            a0Var.f411911m = bundle != null ? bundle.getStringArrayList("video_file_list") : null;
            android.os.Bundle bundle2 = a0Var.A;
            java.lang.String string = bundle2 != null ? bundle2.getString("VIDEO_COVER_URL") : null;
            if (string == null) {
                string = "";
            }
            a0Var.f411912n = string;
            android.os.Bundle bundle3 = a0Var.A;
            java.lang.String string2 = bundle3 != null ? bundle3.getString("VIDEO_FULL_COVER_URL") : null;
            a0Var.f411913o = string2 != null ? string2 : "";
            android.os.Bundle bundle4 = a0Var.A;
            a0Var.f411914p = bundle4 != null ? bundle4.getInt("VIDEO_COVER_QUALITY", 0) : 0;
            android.os.Bundle bundle5 = a0Var.A;
            a0Var.f411916r = bundle5 != null ? bundle5.getStringArrayList("image_file_list") : null;
            android.os.Bundle bundle6 = a0Var.A;
            a0Var.f411920v = bundle6 != null ? bundle6.getIntegerArrayList("image_quality_list") : null;
            android.os.Bundle bundle7 = a0Var.A;
            a0Var.f411918t = bundle7 != null ? bundle7.getStringArrayList("half_image_file_list") : null;
            android.os.Bundle bundle8 = a0Var.A;
            a0Var.f411921w = bundle8 != null ? bundle8.getParcelableArrayList("HALF_RECT_LIST") : null;
            java.util.ArrayList arrayList8 = a0Var.f411916r;
            if (arrayList8 != null) {
            }
            a0Var.f411924z.clear();
            java.util.ArrayList arrayList9 = a0Var.f411911m;
            if (!(arrayList9 == null || arrayList9.isEmpty())) {
                java.util.ArrayList arrayList10 = a0Var.f411911m;
                kotlin.jvm.internal.o.d(arrayList10);
                java.util.Iterator it = arrayList10.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.util.ArrayList arrayList11 = a0Var.f411924z;
                    ss2.n nVar = new ss2.n();
                    kotlin.jvm.internal.o.d(str2);
                    nVar.f411971g = str2;
                    nVar.f411968d = true;
                    arrayList11.add(nVar);
                }
                a0Var.f411924z.add(new ss2.m());
                com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout = a0Var.f411908g;
                if (finderMultiPhotoLayout == null) {
                    kotlin.jvm.internal.o.o("photoGridView");
                    throw null;
                }
                finderMultiPhotoLayout.setVisibility(8);
                android.view.ViewGroup viewGroup = a0Var.f411909h;
                if (viewGroup == null) {
                    kotlin.jvm.internal.o.o("videoCoverView");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.view.ViewGroup viewGroup2 = a0Var.f411909h;
                if (viewGroup2 == null) {
                    kotlin.jvm.internal.o.o("videoCoverView");
                    throw null;
                }
                viewGroup2.setOnClickListener(new ss2.u(a0Var));
                pm0.v.O("Finder_Post_Create_Video_Thumb", new ss2.w(a0Var));
                return;
            }
            java.util.ArrayList arrayList12 = a0Var.f411916r;
            if (arrayList12 == null || arrayList12.size() <= 0) {
                a0Var.f411924z.add(new ss2.m());
                android.view.ViewGroup viewGroup3 = a0Var.f411909h;
                if (viewGroup3 == null) {
                    kotlin.jvm.internal.o.o("videoCoverView");
                    throw null;
                }
                viewGroup3.setVisibility(8);
                com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout2 = a0Var.f411908g;
                if (finderMultiPhotoLayout2 == null) {
                    kotlin.jvm.internal.o.o("photoGridView");
                    throw null;
                }
                finderMultiPhotoLayout2.setVisibility(0);
                com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout3 = a0Var.f411908g;
                if (finderMultiPhotoLayout3 == null) {
                    kotlin.jvm.internal.o.o("photoGridView");
                    throw null;
                }
                finderMultiPhotoLayout3.b(a0Var.f411924z.size());
                a0Var.e();
                return;
            }
            java.util.ArrayList arrayList13 = a0Var.f411916r;
            kotlin.jvm.internal.o.d(arrayList13);
            java.util.Iterator it6 = arrayList13.iterator();
            while (it6.hasNext()) {
                java.lang.String str3 = (java.lang.String) it6.next();
                java.util.ArrayList arrayList14 = a0Var.f411924z;
                ss2.n nVar2 = new ss2.n();
                kotlin.jvm.internal.o.d(str3);
                nVar2.f411971g = str3;
                nVar2.f411968d = false;
                arrayList14.add(nVar2);
            }
            a0Var.f411924z.add(new ss2.m());
            android.view.ViewGroup viewGroup4 = a0Var.f411909h;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("videoCoverView");
                throw null;
            }
            viewGroup4.setVisibility(8);
            com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout4 = a0Var.f411908g;
            if (finderMultiPhotoLayout4 == null) {
                kotlin.jvm.internal.o.o("photoGridView");
                throw null;
            }
            finderMultiPhotoLayout4.setVisibility(0);
            ((ku5.t0) ku5.t0.f312615d).h(new ss2.r(a0Var), "Finder_Post_Question_Create_Image_Thumb");
            a0Var.e();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dca;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null) {
            return;
        }
        if ((i17 == 4387 || i17 == 4388) && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_image_list");
            if (stringArrayListExtra != null) {
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    com.tencent.mars.xlog.Log.i("Finder.QAPostMainUIC", "video %s", it.next());
                }
            }
            if (stringArrayListExtra2 != null) {
                java.util.Iterator<java.lang.String> it6 = stringArrayListExtra2.iterator();
                while (it6.hasNext()) {
                    com.tencent.mars.xlog.Log.i("Finder.QAPostMainUIC", "image %s", it6.next());
                }
            }
            T6(stringArrayListExtra, stringArrayListExtra2, intent.getStringExtra("video_thumb_path"));
        }
        if (i17 == 8485 && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("sns_gallery_temp_paths");
            ss2.a0 a0Var = this.f411959h;
            if (a0Var != null && a0Var.d() == 4) {
                P6().f401422f = new java.util.ArrayList();
                T6(stringArrayListExtra3, null, null);
            } else {
                ss2.a0 a0Var2 = this.f411959h;
                if (a0Var2 != null && a0Var2.d() == 2) {
                    P6().f401422f = new java.util.ArrayList();
                    T6(null, stringArrayListExtra3, null);
                }
            }
        }
        if (i17 == 8485 && i18 == -1 && intent.getBooleanExtra("key_is_delete", false)) {
            P6().f401422f = new java.util.ArrayList();
            T6(null, null, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String flowId;
        org.json.JSONObject jSONObject;
        this.f411955d = new ry2.o(getIntent());
        P6().f401416c.putInt("KEY_POST_OBJECT_TYPE", 6);
        getIntent().getBooleanExtra("KEY_FINDER_MEMBER_VIDEO", false);
        P6().f401420e = 1;
        this.f411965q = getIntent().getIntExtra("key_member_qa_type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f411966r = stringExtra;
        java.lang.String e17 = xy2.c.e(getActivity());
        this.f411956e = e17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            this.f411957f = ya2.h.f460484a.b(this.f411956e);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.l0s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f411963o = (android.view.ViewGroup) findViewById;
        boolean[] zArr = {false};
        Q6().setOnTouchListener(new ss2.i(zArr));
        Q6().setOnClickListener(new ss2.j(zArr, this));
        ss2.d dVar = new ss2.d(getActivity());
        android.content.Intent intent = getIntent();
        ry2.o P6 = P6();
        kotlin.jvm.internal.o.g(intent, "intent");
        android.os.Bundle postData = P6.f401416c;
        kotlin.jvm.internal.o.g(postData, "postData");
        java.lang.String g17 = intent.getIntExtra("key_member_qa_type", 0) == 3 ? com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.lep) : "";
        android.app.Activity activity = dVar.f411931d;
        android.view.View findViewById2 = activity.findViewById(com.tencent.mm.R.id.l09);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        dVar.f411932e = (com.tencent.mm.ui.widget.MMEditText) findViewById2;
        android.view.View findViewById3 = activity.findViewById(com.tencent.mm.R.id.o5h);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        dVar.f411933f = (android.widget.TextView) findViewById3;
        dVar.b().setHint(g17);
        dVar.c().setText("");
        dVar.c().setVisibility(8);
        ss2.c cVar = new ss2.c(dVar);
        dVar.a();
        dVar.b().addTextChangedListener(cVar);
        this.f411960i = dVar;
        ss2.d0 d0Var = new ss2.d0(getActivity());
        android.content.Intent intent2 = getIntent();
        ry2.o P62 = P6();
        kotlin.jvm.internal.o.g(intent2, "intent");
        android.os.Bundle postData2 = P62.f401416c;
        kotlin.jvm.internal.o.g(postData2, "postData");
        d0Var.f411938e = intent2.getIntExtra("key_member_qa_type", 0);
        android.app.Activity activity2 = d0Var.f411937d;
        boolean z17 = (xy2.c.e(activity2).length() > 0) && kotlin.jvm.internal.o.b(intent2.getStringExtra("key_author_finder_name"), xy2.c.e(activity2));
        d0Var.f411944n = z17;
        if (z17) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            d0Var.f411945o = 1;
        }
        android.view.View findViewById4 = activity2.findViewById(com.tencent.mm.R.id.pwe);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        d0Var.f411939f = findViewById4;
        android.view.View findViewById5 = activity2.findViewById(com.tencent.mm.R.id.pwf);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        d0Var.f411940g = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = activity2.findViewById(com.tencent.mm.R.id.pwh);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        d0Var.f411941h = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = activity2.findViewById(com.tencent.mm.R.id.q1o);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        d0Var.f411942i = findViewById7;
        android.view.View findViewById8 = activity2.findViewById(com.tencent.mm.R.id.pwg);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        d0Var.f411943m = findViewById8;
        if (d0Var.f411938e != 3 || d0Var.f411944n) {
            android.view.View view = d0Var.f411939f;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = d0Var.f411939f;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if ((!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() || d0Var.f411938e == 2 || d0Var.f411944n) ? false : true) {
            android.view.View view3 = d0Var.f411942i;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("switchSceneBtn");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = d0Var.f411942i;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("switchSceneBtn");
                throw null;
            }
            view4.setOnClickListener(new ss2.b0(d0Var));
        } else {
            android.view.View view5 = d0Var.f411942i;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("switchSceneBtn");
                throw null;
            }
            view5.setOnClickListener(ss2.c0.f411930d);
            android.view.View view6 = d0Var.f411942i;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("switchSceneBtn");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        d0Var.a();
        this.f411961m = d0Var;
        android.view.ViewGroup viewGroup = this.f411963o;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        viewGroup.removeAllViews();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ss2.a0 a0Var = new ss2.a0((com.tencent.mm.ui.MMActivity) context, P6());
        this.f411959h = a0Var;
        android.os.Bundle data = P6().f401416c;
        kotlin.jvm.internal.o.g(data, "data");
        a0Var.A = data;
        android.view.View b17 = a0Var.b();
        android.view.ViewGroup viewGroup2 = this.f411963o;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        viewGroup2.addView(b17);
        android.view.ViewGroup viewGroup3 = this.f411963o;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        viewGroup3.setOnClickListener(null);
        java.lang.System.currentTimeMillis();
        this.f411962n = new org.json.JSONObject();
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0L);
        if (longExtra != 0 && (jSONObject = this.f411962n) != null) {
            jSONObject.put("feedid", pm0.v.u(longExtra));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_jump_id");
        if (stringExtra2 != null) {
            r26.i0.t(stringExtra2, ",", ";", false);
        }
        ft2.b bVar = ft2.b.f266519a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null && (flowId = finderFeedReportObject.getFlowId()) != null) {
            str = flowId;
        }
        bVar.b(str, ft2.c.f266524e);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        R6();
    }

    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
    }

    @Override // mv2.w0
    public void onPostFakeOk(long j17) {
    }

    @Override // mv2.w0
    public void onPostNotify(long j17, boolean z17) {
    }

    @Override // mv2.w0
    public void onPostOk(long j17, long j18) {
    }

    @Override // mv2.w0
    public void onPostStart(long j17) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
    }
}
