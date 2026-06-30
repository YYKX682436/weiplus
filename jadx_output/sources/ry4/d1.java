package ry4;

/* loaded from: classes.dex */
public final class d1 extends wm3.a {

    /* renamed from: o, reason: collision with root package name */
    public static int f401607o = 100;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f401608d;

    /* renamed from: e, reason: collision with root package name */
    public ry4.g f401609e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f401610f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f401611g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.g1 f401612h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f401613i;

    /* renamed from: m, reason: collision with root package name */
    public rl5.r f401614m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f401615n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401608d = "";
        this.f401610f = new java.util.ArrayList();
        this.f401611g = kz5.p0.f313996d;
    }

    public final void T6() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f401613i;
        if (wxRecyclerView == null) {
            return;
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle(com.tencent.mm.R.string.f493898pk1);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ry4.p0(this));
        }
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.v4v);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.v4u);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.List list = this.f401610f;
        boolean z17 = !kotlin.jvm.internal.o.b(list, this.f401611g);
        ry4.g gVar = this.f401609e;
        if (gVar != null) {
            gVar.f401629m = false;
            gVar.f401630n.clear();
            int childCount = wxRecyclerView.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = wxRecyclerView.getChildAt(i17);
                if (childAt != null) {
                    childAt.setTag(com.tencent.mm.R.id.v59, "PAYLOAD_EXIT_EDIT");
                }
            }
            int size = gVar.f401623d.size();
            for (int i18 = 0; i18 < size; i18++) {
                gVar.notifyItemChanged(i18, "PAYLOAD_EXIT_EDIT");
            }
        }
        if (z17) {
            try {
                java.util.Map k17 = kz5.c1.k(new jz5.l("weclawbot_username", this.f401608d), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("clawbot_shortcut_sort_succ", k17, 37790);
                com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandListUIC", "reportSortSucc: params=%s", k17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandListUIC", e17, "reportSortSucc failed", new java.lang.Object[0]);
            }
            X6(kz5.n0.S0(list));
        }
    }

    public final void U6() {
        java.lang.String fj6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).fj(this.f401608d);
        java.util.List list = this.f401610f;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(V6(fj6));
        Z6();
        ry4.g gVar = this.f401609e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandListUIC", "loadData: loaded %d commands for %s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), this.f401608d);
    }

    public final java.util.List V6(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (K0) {
            return p0Var;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("content", "");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        int optInt = optJSONObject.optInt(dm.i4.COL_ID, 0);
                        java.lang.String optString2 = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                        kotlin.jvm.internal.o.f(optString2, "optString(...)");
                        kotlin.jvm.internal.o.d(optString);
                        arrayList.add(new com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem(optInt, optString2, optString));
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandListUIC", e17, "parse shortcut list failed", new java.lang.Object[0]);
            return p0Var;
        }
    }

    public final void W6(int i17, java.util.List list) {
        try {
            java.util.Map k17 = kz5.c1.k(new jz5.l("weclawbot_username", this.f401608d), new jz5.l("clawbot_delete_shortcut_count", java.lang.Integer.valueOf(i17)), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(((java.util.ArrayList) this.f401610f).size())), new jz5.l("clawbot_shortcut_index_list", kz5.n0.g0(list, "#", null, null, 0, null, null, 62, null)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("clawbot_shortcut_delete_end", k17, 37790);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandListUIC", "reportDeleteEnd: params=%s", k17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandListUIC", e17, "reportDeleteEnd failed", new java.lang.Object[0]);
        }
    }

    public final void X6(java.util.List list) {
        vh0.f1 ij6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).ij(this.f401608d);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.COL_ID, shortcutCommandItem.f188079d);
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, shortcutCommandItem.f188080e);
            jSONObject.put("content", shortcutCommandItem.f188081f);
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        xh0.e eVar = (xh0.e) ij6;
        eVar.b(jSONArray2);
        eVar.a();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new ry4.b1(list, this, null), 1, null);
        }
    }

    public final void Y6(int i17) {
        android.widget.TextView textView = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.f486916v53);
        android.widget.TextView textView2 = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.v4w);
        if (i17 > 0) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(getActivity().getString(com.tencent.mm.R.string.pjw, java.lang.Integer.valueOf(i17)));
            }
        } else if (textView != null) {
            textView.setVisibility(4);
        }
        if (textView2 != null) {
            textView2.setEnabled(i17 > 0);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setAlpha(i17 > 0 ? 1.0f : 0.3f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v20 */
    public final void Z6() {
        java.util.List list;
        android.widget.TextView textView;
        ?? r132;
        java.lang.Integer num;
        java.lang.Integer num2;
        boolean z17;
        java.util.List list2;
        android.widget.TextView textView2;
        java.lang.Integer num3;
        java.lang.Integer num4;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486914v51);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f401613i;
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.v4x);
        android.widget.TextView textView3 = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.v4y);
        android.view.View findViewById3 = getActivity().findViewById(com.tencent.mm.R.id.v4t);
        android.view.View findViewById4 = getActivity().findViewById(com.tencent.mm.R.id.v4s);
        java.util.List list3 = this.f401610f;
        if (((java.util.ArrayList) list3).isEmpty()) {
            if (findViewById == null) {
                num3 = 8;
                list = list3;
                textView = textView3;
                r132 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                textView = textView3;
                list = list3;
                r132 = 0;
                num3 = 8;
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (wxRecyclerView != null) {
                wxRecyclerView.setVisibility(8);
            }
            if (findViewById3 == null) {
                num4 = num3;
            } else {
                ?? arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                num4 = num3;
                arrayList2.add(num4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(r132)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById4 != null) {
                ?? arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(num4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(r132)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ?? r47 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.v4z) : null;
            android.widget.TextView textView4 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.v50) : null;
            if (this.f401615n) {
                if (r47 != null) {
                    r47.setVisibility(8);
                }
                if (textView4 != null) {
                    textView4.setText(com.tencent.mm.R.string.pjz);
                }
            } else {
                if (r47 != null) {
                    r47.setVisibility(r132);
                }
                if (textView4 != null) {
                    textView4.setText(com.tencent.mm.R.string.pjy);
                }
                if (r47 != null) {
                    r47.setOnClickListener(new ry4.c1(this));
                }
            }
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.hideActionbarLine();
            }
        } else {
            list = list3;
            textView = textView3;
            r132 = 0;
            if (findViewById == null) {
                num = 0;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                num = 0;
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (wxRecyclerView != null) {
                wxRecyclerView.setVisibility(0);
            }
            if (!this.f401615n) {
                if (findViewById3 == null) {
                    num2 = num;
                } else {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    num2 = num;
                    arrayList5.add(num2);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(num2);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        if (findViewById2 != null) {
            findViewById2.setEnabled(!list.isEmpty());
        }
        if (findViewById2 == null) {
            z17 = r132;
            textView2 = textView;
            list2 = list;
        } else {
            float f17 = list.isEmpty() ^ true ? 1.0f : 0.3f;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList7);
            z17 = r132;
            list2 = list;
            textView2 = textView;
            yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((java.lang.Float) arrayList7.get(z17 ? 1 : 0)).floatValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        boolean z18 = ((java.util.ArrayList) list2).size() < f401607o ? z17 : true;
        if (textView2 != null) {
            textView2.setEnabled(!z18);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setAlpha(z18 ? 0.3f : 1.0f);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqb;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        ry4.g gVar = this.f401609e;
        if (!(gVar != null && gVar.f401629m)) {
            return false;
        }
        T6();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        android.widget.TextView textView;
        ry4.g gVar;
        super.onCreateAfter(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("extra_username");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f401608d = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            getActivity().finish();
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f401608d, true);
        this.f401615n = n17 == null || !n17.r2();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle(com.tencent.mm.R.string.f493898pk1);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ry4.q0(this));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.f486915v52);
        if (wxRecyclerView != null) {
            this.f401613i = wxRecyclerView;
            this.f401609e = new ry4.g(this.f401610f, this.f401615n, new ry4.v0(this), new ry4.w0(this), new ry4.x0(this));
            androidx.recyclerview.widget.g1 g1Var = new androidx.recyclerview.widget.g1(new ry4.y0(this));
            this.f401612h = g1Var;
            g1Var.d(this.f401613i);
            ry4.g gVar2 = this.f401609e;
            if (gVar2 != null) {
                gVar2.f401628i = this.f401612h;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f401613i;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f401613i;
            if (wxRecyclerView3 != null) {
                wxRecyclerView3.setAdapter(this.f401609e);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f401613i;
            if (wxRecyclerView4 != null) {
                wxRecyclerView4.setNestedScrollingEnabled(false);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView5 = this.f401613i;
            if (wxRecyclerView5 != null && (gVar = this.f401609e) != null) {
                if (gVar.f401631o == 0) {
                    gVar.f401631o = wxRecyclerView5.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
                }
                wxRecyclerView5.setItemAnimator(new ry4.j0(gVar.f401631o));
            }
            this.f401614m = new rl5.r(getActivity());
        }
        if (this.f401615n) {
            android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.v4s);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.v4t);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.TextView textView2 = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.v4y);
            if (textView2 != null && (textView = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.v4x)) != null) {
                textView2.setOnClickListener(new ry4.r0(this));
                textView.setOnClickListener(new ry4.s0(this));
                android.widget.TextView textView3 = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.v4w);
                if (textView3 != null) {
                    textView3.setOnClickListener(new ry4.t0(this));
                }
            }
        }
        android.view.View findViewById3 = getActivity().findViewById(com.tencent.mm.R.id.v4s);
        if (findViewById3 != null) {
            android.view.View findViewById4 = getActivity().findViewById(com.tencent.mm.R.id.v4t);
            com.tencent.mm.ui.a4.e(findViewById3, true, false, 2, null);
            if (findViewById4 != null) {
                com.tencent.mm.ui.a4.e(findViewById4, true, false, 2, null);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView6 = this.f401613i;
            if (wxRecyclerView6 != null) {
                com.tencent.mm.ui.a4.e(wxRecyclerView6, true, false, 2, null);
            }
        }
        f401607o = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).cj().optInt("maxCommandCount", 100);
        U6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.ak(getActivity(), iy1.c.ClawBotShortcutListPage);
        aVar.Ai(getActivity(), new ry4.u0(this));
        aVar.ik(getActivity(), 4, 37790);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ry4.g gVar = this.f401609e;
        boolean z17 = false;
        if (gVar != null && gVar.f401629m) {
            z17 = true;
        }
        if (!z17) {
            U6();
            return;
        }
        java.util.List V6 = V6(((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).fj(this.f401608d));
        java.util.List list = this.f401610f;
        if (kotlin.jvm.internal.o.b(V6, list)) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        arrayList.addAll(V6);
        ry4.g gVar2 = this.f401609e;
        if (gVar2 != null) {
            gVar2.notifyDataSetChanged();
        }
        Z6();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandListUIC", "refreshDataQuietly: refreshed %d commands for %s", java.lang.Integer.valueOf(arrayList.size()), this.f401608d);
    }
}
