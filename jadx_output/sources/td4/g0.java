package td4;

/* loaded from: classes4.dex */
public final class g0 extends td4.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f417666e;

    /* renamed from: f, reason: collision with root package name */
    public final int f417667f;

    /* renamed from: g, reason: collision with root package name */
    public final int f417668g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f417669h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f417670i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f417671m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f417672n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f417673o;

    /* renamed from: p, reason: collision with root package name */
    public td4.k f417674p;

    /* renamed from: q, reason: collision with root package name */
    public td4.j f417675q;

    /* renamed from: r, reason: collision with root package name */
    public td4.i f417676r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f417677s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f417678t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f417679u;

    /* renamed from: v, reason: collision with root package name */
    public int f417680v;

    /* renamed from: w, reason: collision with root package name */
    public int f417681w;

    public g0(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f417666e = context;
        this.f417667f = i17;
        this.f417668g = i18;
        this.f417669h = jz5.h.b(new td4.a0(this));
        this.f417670i = jz5.h.b(td4.f0.f417653d);
        this.f417671m = jz5.h.b(td4.d0.f417645d);
        this.f417672n = jz5.h.b(td4.b0.f417634d);
        this.f417673o = jz5.h.b(td4.c0.f417638d);
    }

    public static final /* synthetic */ java.util.List L(td4.g0 g0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        java.util.List N = g0Var.N();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return N;
    }

    public final android.content.Context M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return this.f417666e;
    }

    public final java.util.List N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVisibleSnsMediaInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        java.util.List list = (java.util.List) ((jz5.n) this.f417671m).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVisibleSnsMediaInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return list;
    }

    public final int O(td4.f2 f2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemPos", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        int indexOf = N().indexOf(f2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemPos", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return indexOf;
    }

    public final td4.l0 P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.l0 l0Var = (td4.l0) ((jz5.n) this.f417669h).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return l0Var;
    }

    public final java.util.List Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        java.util.List list = (java.util.List) ((jz5.n) this.f417670i).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return list;
    }

    public final void R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if ((!N().isEmpty()) && P().d((td4.f2) kz5.n0.i0(N()))) {
            notifyItemRemoved(N().size() - 1);
            N().remove(N().size() - 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    public final void S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pullDataFromSnsStorage", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.l0 P = P();
        td4.h0 y17 = y();
        y17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        java.lang.String limitSeq = y17.f417686a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        y().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        P.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        kotlin.jvm.internal.o.g(limitSeq, "limitSeq");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerListAdapterHelper", "resetCursor limitSeq = " + limitSeq + " , isPrivate = false ,isWork = true ");
        P.f417704i = limitSeq;
        P.a(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullDataFromSnsStorage", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    public void T(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        td4.h0 y17 = y();
        y17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        y17.f417690e = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        if (z17) {
            R();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        int size = N().size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (i17 >= N().size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            return -1;
        }
        td4.f2 f2Var = (td4.f2) N().get(i17);
        if (P().e(f2Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTimeHeaderPosSet", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            java.util.Set set = (java.util.Set) ((jz5.n) this.f417673o).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTimeHeaderPosSet", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            set.add(java.lang.Integer.valueOf(i17));
            i18 = 2;
        } else {
            i18 = P().d(f2Var) ? 4 : 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        recyclerView.i(new td4.e0(this));
        super.onAttachedToRecyclerView(recyclerView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        yz5.a aVar = this.f417677s;
        if (aVar != null && i17 == java.lang.Math.max((getItemCount() - 1) - this.f417680v, 0) && this.f417681w != 0) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (holder instanceof td4.x) {
            td4.x xVar = (td4.x) holder;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            td4.g0 g0Var = xVar.f417749n;
            if (L(g0Var).size() <= i17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                str2 = "onBindViewHolder";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
            td4.f2 f2Var = (td4.f2) L(g0Var).get(i17);
            r45.jj4 b17 = f2Var.b();
            xVar.itemView.setTag(com.tencent.mm.R.id.n6f, java.lang.Integer.valueOf(i17));
            xVar.itemView.setTag(com.tencent.mm.R.id.n6g, 1);
            xVar.itemView.setOnClickListener(new td4.s(g0Var, f2Var, xVar));
            xVar.l().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            xVar.l().setBackgroundColor(g0Var.M().getResources().getColor(com.tencent.mm.R.color.a5j));
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            android.widget.ImageView l17 = xVar.l();
            int hashCode = xVar.l().getContext().hashCode();
            com.tencent.mm.plugin.sns.model.z1 z1Var = com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER;
            com.tencent.mm.storage.s7 a17 = com.tencent.mm.storage.s7.a();
            hj6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            hj6.a0(b17, l17, com.tencent.mm.R.drawable.auf, hashCode, z1Var, a17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            int i18 = b17.f377856e;
            jz5.g gVar = xVar.f417748m;
            if (i18 == 6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                java.lang.Object value = ((jz5.n) gVar).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                android.view.View view = (android.view.View) value;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                xVar.j().setVisibility(0);
                xVar.j().setImageResource(com.tencent.mm.R.raw.video_icon_in_gird);
                xVar.n().setVisibility(0);
                android.widget.TextView n17 = xVar.n();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                td4.l0 P = g0Var.P();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                float f17 = b17.R;
                P.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("secondFloatTime2String", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                if (f17 <= 0.0f) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("secondFloatTime2String", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                    str3 = "--:--";
                    str = "onBindViewHolder";
                } else {
                    int b18 = a06.d.b(f17);
                    java.lang.String valueOf = java.lang.String.valueOf(b18 % 60);
                    str = "onBindViewHolder";
                    if (valueOf.length() < 2) {
                        valueOf = "0".concat(valueOf);
                    }
                    str3 = (b18 / 60) + ':' + valueOf;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("secondFloatTime2String", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                }
                n17.setText(str3);
            } else {
                str = "onBindViewHolder";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                java.lang.Object value2 = ((jz5.n) gVar).getValue();
                kotlin.jvm.internal.o.f(value2, "getValue(...)");
                android.view.View view2 = (android.view.View) value2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                xVar.j().setVisibility(4);
                xVar.n().setVisibility(4);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            td4.l0 P2 = g0Var.P();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = f2Var.a();
            g0Var.y().getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsSelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsSelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
            P2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsInfoPrivate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
            kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
            boolean i19 = com.tencent.mm.plugin.sns.model.s5.i(snsInfo.getLocalPrivate(), true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoPrivate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
            if (i19) {
                xVar.k().setVisibility(0);
                xVar.k().setImageDrawable(com.tencent.mm.ui.uk.e(g0Var.M(), com.tencent.mm.R.raw.icons_filled_lock, g0Var.M().getResources().getColor(com.tencent.mm.R.color.f478553an)));
            } else {
                xVar.k().setVisibility(4);
            }
            xVar.i().setTag(com.tencent.mm.R.id.n6f, java.lang.Integer.valueOf(i17));
            xVar.i().setVisibility(0);
            xVar.i().setOnClickListener(new td4.t(g0Var));
            int b19 = i65.a.b(g0Var.M(), 20);
            java.lang.Object parent = xVar.i().getParent();
            android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view3 != null) {
                view3.post(new td4.u(xVar, b19));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            java.util.List Q = g0Var.Q();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            boolean contains = Q.contains(f2Var);
            jz5.g gVar2 = xVar.f417747i;
            if (contains) {
                com.tencent.mm.ui.widget.MMNumberCheckbox i27 = xVar.i();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                java.util.List Q2 = g0Var.Q();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                i27.setCheckedNumber(Q2.indexOf(f2Var) + 1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                java.lang.Object value3 = ((jz5.n) gVar2).getValue();
                kotlin.jvm.internal.o.f(value3, "getValue(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) value3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                imageView.setVisibility(0);
                imageView.setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
            } else {
                xVar.i().setChecked(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                java.lang.Object value4 = ((jz5.n) gVar2).getValue();
                kotlin.jvm.internal.o.f(value4, "getValue(...)");
                android.widget.ImageView imageView2 = (android.widget.ImageView) value4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                imageView2.setBackground(null);
                imageView2.setVisibility(4);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        } else {
            str = "onBindViewHolder";
            if (holder instanceof td4.y) {
                td4.y yVar = (td4.y) holder;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$TimeHeaderViewHolder");
                yVar.itemView.setTag(com.tencent.mm.R.id.n6f, java.lang.Integer.valueOf(i17));
                yVar.itemView.setTag(com.tencent.mm.R.id.n6g, 2);
                ((android.widget.TextView) yVar.itemView.findViewById(com.tencent.mm.R.id.kvs)).setText(((td4.f2) L(yVar.f417752d).get(i17)).b().f377864o);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$TimeHeaderViewHolder");
            } else if (holder instanceof td4.m) {
                td4.m mVar = (td4.m) holder;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
                java.lang.Object value5 = ((jz5.n) mVar.f417706d).getValue();
                kotlin.jvm.internal.o.f(value5, "getValue(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
                ((android.widget.TextView) value5).setVisibility(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
                java.lang.Object value6 = ((jz5.n) mVar.f417706d).getValue();
                kotlin.jvm.internal.o.f(value6, "getValue(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
                ((android.widget.TextView) value6).setText(mVar.f417707e.M().getResources().getString(com.tencent.mm.R.string.f490468vx));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            }
        }
        str2 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        androidx.recyclerview.widget.k3 xVar;
        androidx.recyclerview.widget.k3 k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = this.f417666e;
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c9v, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            xVar = new td4.x(this, inflate);
        } else if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c9u, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            xVar = new td4.y(this, inflate2);
        } else {
            if (i17 != 4) {
                k3Var = super.createViewHolder(parent, i17);
                kotlin.jvm.internal.o.f(k3Var, "createViewHolder(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                return k3Var;
            }
            android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c9t, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            xVar = new td4.m(this, inflate3);
        }
        k3Var = xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return k3Var;
    }
}
