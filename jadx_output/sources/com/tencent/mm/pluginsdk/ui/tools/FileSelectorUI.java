package com.tencent.mm.pluginsdk.ui.tools;

@db5.a(19)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/FileSelectorUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/pluginsdk/ui/tools/n1", "com/tencent/mm/pluginsdk/ui/tools/o1", "com/tencent/mm/pluginsdk/ui/tools/r1", "com/tencent/mm/pluginsdk/ui/tools/s1", "com/tencent/mm/pluginsdk/ui/tools/a2", "com/tencent/mm/pluginsdk/ui/tools/b2", "com/tencent/mm/pluginsdk/ui/tools/c2", "com/tencent/mm/pluginsdk/ui/tools/d2", "com/tencent/mm/pluginsdk/ui/tools/e2", "com/tencent/mm/pluginsdk/ui/tools/f2", "com/tencent/mm/pluginsdk/ui/tools/g2", "com/tencent/mm/pluginsdk/ui/tools/h2", "com/tencent/mm/pluginsdk/ui/tools/n2", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes12.dex */
public final class FileSelectorUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {
    public static final com.tencent.mm.pluginsdk.ui.tools.o1 I = new com.tencent.mm.pluginsdk.ui.tools.o1(null);

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.Map f191366J = kz5.c1.k(new jz5.l(1, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.blu)), new jz5.l(2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491231bx0)), new jz5.l(4, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.blp)), new jz5.l(3, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cqi)));
    public final jz5.g A;
    public final java.lang.String B;
    public java.lang.String C;
    public boolean D;
    public final com.tencent.mm.pluginsdk.ui.tools.n3 E;
    public com.tencent.mm.ui.chatting.pc F;
    public boolean G;
    public final android.widget.AdapterView.OnItemClickListener H;

    /* renamed from: d, reason: collision with root package name */
    public int f191367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f191368e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f191369f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.LoadingTipsView f191371h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f191372i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f191373m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.a2 f191374n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.tools.l8 f191375o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f191376p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f191378r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f191379s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f191380t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.b2 f191381u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f191382v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f191383w;

    /* renamed from: x, reason: collision with root package name */
    public int f191384x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f191385y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f191386z;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f191370g = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.o2(this));

    /* renamed from: q, reason: collision with root package name */
    public int f191377q = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSelectorMaxCount());

    public FileSelectorUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f191379s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent>(a0Var) { // from class: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$exitMultiTalkListener$1
            {
                this.__eventId = -2057571736;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent exitMultiTalkRoomEvent) {
                com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent event = exitMultiTalkRoomEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "exit multi talk room event and remove ");
                androidx.appcompat.app.AppCompatActivity context = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.this.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                context.finish();
                return false;
            }
        };
        this.f191380t = true;
        this.f191381u = new com.tencent.mm.pluginsdk.ui.tools.b2();
        this.f191384x = 1;
        this.f191386z = jz5.h.b(com.tencent.mm.pluginsdk.ui.tools.u2.f191942d);
        this.A = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.f3(this));
        this.B = "MMKV_KEY_LAST_SELECTED_TAB";
        this.E = new com.tencent.mm.pluginsdk.ui.tools.n3(this);
        this.H = new com.tencent.mm.pluginsdk.ui.tools.e3(this);
    }

    public static final void U6(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, int i17) {
        com.google.android.material.tabs.TabLayout tabLayout = fileSelectorUI.f191382v;
        if (tabLayout != null) {
            tabLayout.setVisibility(i17);
            if (i17 == 0) {
                e45.h Y6 = fileSelectorUI.Y6();
                com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView = Y6 != null ? Y6.f249390o : null;
                if (pinnedHeaderRecyclerView != null) {
                    com.tencent.mm.ui.kk.f(pinnedHeaderRecyclerView, a06.d.b(fileSelectorUI.getResources().getDimension(com.tencent.mm.R.dimen.f479716d9)));
                }
                android.widget.ListView listView = fileSelectorUI.f191369f;
                if (listView != null) {
                    com.tencent.mm.ui.kk.f(listView, a06.d.b(fileSelectorUI.getResources().getDimension(com.tencent.mm.R.dimen.f479716d9)));
                    return;
                } else {
                    kotlin.jvm.internal.o.o("listView");
                    throw null;
                }
            }
            e45.h Y62 = fileSelectorUI.Y6();
            com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView2 = Y62 != null ? Y62.f249390o : null;
            if (pinnedHeaderRecyclerView2 != null) {
                com.tencent.mm.ui.kk.f(pinnedHeaderRecyclerView2, 0);
            }
            android.widget.ListView listView2 = fileSelectorUI.f191369f;
            if (listView2 != null) {
                com.tencent.mm.ui.kk.f(listView2, 0);
            } else {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
        }
    }

    public final org.json.JSONObject V6(com.tencent.mm.pluginsdk.ui.tools.d2 d2Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = d2Var.f191569m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str2 = d2Var.f191565i;
            if (str2 == null) {
                str2 = "";
            }
            str = o35.a.f(str2, d2Var.f191564h.toString());
            kotlin.jvm.internal.o.f(str, "getFileExt(...)");
        }
        jSONObject.put("ext", str);
        jSONObject.put("bytes", d2Var.f191566j);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d8 A[LOOP:4: B:131:0x03d2->B:133:0x03d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6() {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.W6():void");
    }

    public final java.lang.String X6() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            java.lang.String str = this.C;
            kotlin.jvm.internal.o.d(str);
            return str;
        }
        int i17 = this.f191367d;
        java.lang.String string = getString((1 == i17 || 5 == i17) ? com.tencent.mm.R.string.f490004i6 : com.tencent.mm.R.string.f490551ya);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final e45.h Y6() {
        return (e45.h) this.f191370g.getValue();
    }

    public final int Z6() {
        int i17;
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191374n;
        if (a2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        int size = a2Var.f191505g.size();
        e45.h Y6 = Y6();
        if (Y6 != null) {
            d45.q qVar = Y6.f249391p;
            java.lang.Integer valueOf = qVar != null ? java.lang.Integer.valueOf(qVar.f226458h.size()) : null;
            if (valueOf != null) {
                i17 = valueOf.intValue();
                return size + i17;
            }
        }
        i17 = 0;
        return size + i17;
    }

    public final long a7() {
        java.lang.Long valueOf = java.lang.Long.valueOf(getIntent().getLongExtra("file_max_size", 0L));
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.longValue() : ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
    }

    public final int b7() {
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191374n;
        if (a2Var != null) {
            return a2Var.f191505g.size();
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    public final void c7(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17 = this.f191367d;
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            setMMTitle(str);
            hideActionBarOperationArea();
            removeSearchMenu();
            getController().t0(true);
            setBackBtn(new com.tencent.mm.pluginsdk.ui.tools.g3(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
            this.G = true;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = getString(com.tencent.mm.R.string.f490604zq);
            e4Var.f211780g = 2;
            e4Var.f211778e = false;
            com.tencent.mm.ui.widget.dialog.f4 c17 = e4Var.c();
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.tools.i3(str2, str, c17, this, str3));
            return;
        }
        if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().z()) {
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = getString(com.tencent.mm.R.string.f490604zq);
            e4Var2.f211780g = 2;
            e4Var2.f211778e = false;
            com.tencent.mm.ui.widget.dialog.f4 c18 = e4Var2.c();
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.tools.l3(str2, str, c18, str3, this));
            return;
        }
        setMMTitle(str);
        hideActionBarOperationArea();
        removeSearchMenu();
        getController().t0(true);
        setBackBtn(new com.tencent.mm.pluginsdk.ui.tools.j3(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        this.G = true;
        java.lang.String i27 = com.tencent.mm.vfs.w6.i(str2, false);
        if (i27 != null) {
            str2 = i27;
        }
        kotlin.jvm.internal.o.d(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "goToScreenProfile, exportExternalPath is null");
        }
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.ui.chatting.pc pcVar = new com.tencent.mm.ui.chatting.pc(context3, str2, str3, 3);
        this.F = pcVar;
        pcVar.d();
        android.view.View contentView = getContentView();
        kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) contentView).addView(this.F);
        setRequestedOrientation(4);
    }

    public final void d7(long j17, java.lang.String str) {
        if (!gm0.j1.u().l()) {
            db5.t7.k(getContext(), null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f191367d);
        intent.setClassName(this, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "gotoAppAttachDownloadUI, msgId:" + j17 + ", talker:" + str);
        intent.putExtra("app_msg_id", j17);
        intent.putExtra("msg_talker", str);
        startActivityForResult(intent, 4);
    }

    public final void e7(long j17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", j17);
        intent.putExtra("key_detail_data_id", str);
        intent.putExtra("show_share", true);
        z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((y30.q) uVar).getClass();
        o72.x1.L0(context, ".ui.detail.FavoriteFileDetailUI", intent, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0071, code lost:
    
        if (r16.f191367d == r4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f7() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.f7():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (((java.lang.Boolean) ((jz5.n) this.A).getValue()).booleanValue()) {
            setVASPopAnimParam(sk5.h.f409013c, sk5.b.f409008c);
            setActivityPopAnimParam(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        }
        super.finish();
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191374n;
        if (a2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        com.tencent.mm.pluginsdk.ui.tools.n1 n1Var = a2Var.f191506h;
        if (n1Var.f191781p != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(n1Var.f191781p);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        com.tencent.mm.pluginsdk.ui.tools.b2 b2Var = this.f191381u;
        java.util.Iterator it = b2Var.f191525b.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            stringBuffer.append((java.lang.String) next);
            if (i17 < r3.size() - 1) {
                stringBuffer.append("|");
            }
            i17 = i18;
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct sendFileInWidgetStruct = b2Var.f191524a;
        sendFileInWidgetStruct.f60201o = sendFileInWidgetStruct.b("searchKeyword", stringBuffer2, true);
        sendFileInWidgetStruct.k();
        sendFileInWidgetStruct.o();
    }

    public final boolean g7(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList;
        boolean z17 = true;
        if (this.f191373m) {
            java.util.ArrayList arrayList2 = this.f191372i;
            if (!(arrayList2 == null || arrayList2.isEmpty())) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    return false;
                }
                java.lang.String n17 = com.tencent.mm.vfs.w6.n(str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(n17) || (arrayList = this.f191372i) == null) {
                    return false;
                }
                if (!arrayList.isEmpty()) {
                    for (java.lang.String str2 : arrayList) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && r26.i0.p(n17, str2, true)) {
                            break;
                        }
                    }
                }
                z17 = false;
                return z17;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return (this.D || this.G) ? 4 : 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488777ad4;
    }

    public final boolean h7() {
        int i17 = this.f191367d;
        return i17 == 1 || i17 == 0 || i17 == 5;
    }

    public final void i7(boolean z17) {
        com.tencent.mm.pluginsdk.ui.tools.n2 n2Var;
        com.tencent.mm.vfs.r6 d17;
        if (!z17) {
            com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191374n;
            if (a2Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            if ((!(3 == a2Var.f191509n) ? null : a2Var.f191508m.d()) != null) {
                com.tencent.mm.pluginsdk.ui.tools.a2 a2Var2 = this.f191374n;
                if (a2Var2 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                if (a2Var2.f191509n == 3 && (d17 = (n2Var = a2Var2.f191508m).d()) != null) {
                    n2Var.e(d17);
                    com.tencent.mm.pluginsdk.ui.tools.a2 a2Var3 = a2Var2.f191510o.f191374n;
                    if (a2Var3 == null) {
                        kotlin.jvm.internal.o.o("adapter");
                        throw null;
                    }
                    a2Var3.j();
                }
                com.tencent.mm.pluginsdk.ui.tools.a2 a2Var4 = this.f191374n;
                if (a2Var4 != null) {
                    a2Var4.notifyDataSetChanged();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
            }
        }
        setResult(-2);
        if (z17) {
            setResult(0);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.j(importUIComponents, e45.x.class);
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean isActionbarCenterLayoutMode() {
        return false;
    }

    public final void j7(int i17) {
        d45.q qVar;
        com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onMenuSelected. type:" + i17);
        p7();
        com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView = this.f191371h;
        if (loadingTipsView != null) {
            loadingTipsView.setVisibility(8);
        }
        android.view.View view = this.f191383w;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "beforeChooseDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "beforeChooseDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ListView listView = this.f191369f;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView.setVisibility(8);
        com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView2 = Y6().f249390o;
        if (pinnedHeaderRecyclerView2 != null) {
            pinnedHeaderRecyclerView2.setVisibility(8);
        }
        com.tencent.mm.ui.tools.l8 l8Var = this.f191375o;
        if (l8Var != null) {
            l8Var.b();
        }
        boolean z17 = true;
        addSearchMenu(true, this.f191375o);
        this.f191381u.a(i17);
        this.f191384x = i17;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        ((e45.r) zVar.a(context).a(e45.r.class)).f249420g = this.f191384x;
        if (i17 == 1) {
            android.widget.ListView listView2 = this.f191369f;
            if (listView2 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            listView2.setVisibility(0);
            com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191374n;
            if (a2Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            a2Var.o(1);
        } else if (i17 == 2) {
            android.widget.ListView listView3 = this.f191369f;
            if (listView3 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            listView3.setVisibility(0);
            com.tencent.mm.pluginsdk.ui.tools.a2 a2Var2 = this.f191374n;
            if (a2Var2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            a2Var2.o(2);
        } else if (i17 == 3) {
            if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSelector()) == 0) {
                removeSearchMenu();
                android.widget.ListView listView4 = this.f191369f;
                if (listView4 == null) {
                    kotlin.jvm.internal.o.o("listView");
                    throw null;
                }
                listView4.setVisibility(8);
                android.view.View view2 = this.f191383w;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "chooseFolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "chooseFolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                ((e45.x) zVar.a(context2).a(e45.x.class)).getClass();
            } else {
                com.tencent.mm.pluginsdk.ui.tools.a2 a2Var3 = this.f191374n;
                if (a2Var3 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                a2Var3.o(3);
            }
        } else if (i17 == 4) {
            removeSearchMenu();
            android.widget.ListView listView5 = this.f191369f;
            if (listView5 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            listView5.setVisibility(8);
            Y6().c();
            e45.h Y6 = Y6();
            if (Y6 != null && (pinnedHeaderRecyclerView = Y6.f249390o) != null) {
                pinnedHeaderRecyclerView.setVisibility(0);
            }
            e45.h Y62 = Y6();
            if (Y62 != null && (qVar = Y62.f249391p) != null) {
                Y62.d(qVar.f226458h.size());
            }
        }
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.pluginsdk.ui.tools.a2 a2Var4 = this.f191374n;
            if (a2Var4 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            if (i17 == 1) {
                z17 = a2Var4.f191506h.f191887h;
            } else if (i17 == 2) {
                z17 = a2Var4.f191507i.f191887h;
            } else if (i17 == 3) {
                z17 = a2Var4.f191508m.f191887h;
            }
            if (z17) {
                if (a2Var4 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                if (a2Var4.getCount() == 0) {
                    com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView2 = this.f191371h;
                    if (loadingTipsView2 != null) {
                        loadingTipsView2.setVisibility(0);
                    }
                    com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView3 = this.f191371h;
                    if (loadingTipsView3 != null) {
                        loadingTipsView3.a();
                        return;
                    }
                    return;
                }
            }
            com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView4 = this.f191371h;
            if (loadingTipsView4 != null) {
                loadingTipsView4.c();
            }
        }
    }

    public final void k7(java.lang.String str, java.lang.String str2) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "openFile() called with: path = " + str + ", name = " + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "open file but file not exist");
            return;
        }
        java.lang.String f17 = o35.a.f(str, str2);
        int i17 = this.f191367d;
        if (3 == i17 || 4 == i17) {
            if (!r26.i0.p(f17, "ppt", true) && !r26.i0.p(f17, "pdf", true) && !r26.i0.p(f17, "doc", true) && !r26.i0.p(f17, "docx", true) && !r26.i0.p(f17, "pptx", true)) {
                db5.t7.g(this, getResources().getString(com.tencent.mm.R.string.ibk));
                return;
            } else {
                if (str != null) {
                    kotlin.jvm.internal.o.d(f17);
                    c7(str2, str, f17);
                    return;
                }
                return;
            }
        }
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(str);
        if (((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(n17)) {
            i95.m c17 = i95.n0.c(qk.h8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            z17 = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ni(((ef0.f2) ((qk.h8) c17)).wi(str, n17, str2, null), new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null));
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(this, str, f17, 1);
    }

    public final com.tencent.mm.pluginsdk.ui.tools.h2 l7(android.net.Uri uri) {
        int columnIndex;
        java.lang.String str = "";
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.o.f(uri2, "toString(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.W0(uri)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "unsafe uri path:".concat(uri2));
            return null;
        }
        long k17 = com.tencent.mm.vfs.w6.k(uri2);
        if (k17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "skip invalid size path:".concat(uri2));
            return null;
        }
        try {
            android.database.Cursor query = getContext().getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_display_name")) != -1) {
                        java.lang.String string = query.getString(columnIndex);
                        if (string != null) {
                            str = string;
                        }
                    }
                    vz5.b.a(query, null);
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileSelectorUI", e17, "resolveSelectedFile query DisplayName", new java.lang.Object[0]);
        }
        java.lang.String f17 = o35.a.f(uri2, str);
        kotlin.jvm.internal.o.f(f17, "getFileExt(...)");
        return new com.tencent.mm.pluginsdk.ui.tools.h2(uri, uri2, k17, str, f17);
    }

    public final void m7() {
        getController().x0(getResources().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.pluginsdk.ui.tools.m3(this));
        getController().t0(false);
    }

    public final void n7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "showUnsupportedFileTypeDialog: showing dialog for unsupported file type");
        db5.e1.s(getContext(), getString(com.tencent.mm.R.string.o5l), getString(com.tencent.mm.R.string.f490573yv));
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0289 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o7() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.o7():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String dataString;
        boolean z17;
        e45.r rVar;
        boolean z18;
        long j17;
        boolean z19;
        java.util.Iterator it;
        java.lang.String str;
        java.lang.String str2;
        long j18;
        android.net.Uri uri;
        d45.q qVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onActivityResult() called with: requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent);
        com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView = Y6().f249390o;
        int i19 = 0;
        java.lang.String str3 = "iterator(...)";
        java.lang.String str4 = "next(...)";
        if ((pinnedHeaderRecyclerView != null && pinnedHeaderRecyclerView.getVisibility() == 0) && i17 != 8) {
            e45.h Y6 = Y6();
            com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = Y6.f249382d;
            if (i18 == -2) {
                com.tencent.mars.xlog.Log.e("FS.AlbumFileUIC", "critical error!!!");
                fileSelectorUI.finish();
                return;
            }
            if (i18 == 0 && intent != null) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("preview_image_list");
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(stringArrayListExtra != null ? stringArrayListExtra.size() : 0);
                com.tencent.mars.xlog.Log.i("FS.AlbumFileUIC", "paths size: %d.", objArr);
                if (stringArrayListExtra == null || Y6.f249391p == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<java.lang.String> it6 = stringArrayListExtra.iterator();
                boolean z27 = false;
                while (it6.hasNext()) {
                    java.lang.String next = it6.next();
                    if (fileSelectorUI.g7(next)) {
                        arrayList.add(next);
                    } else {
                        com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "Preview image extension not allowed: " + next);
                        z27 = true;
                    }
                }
                if (z27) {
                    fileSelectorUI.n7();
                }
                x.d dVar = new x.d(0);
                int i27 = 0;
                while (true) {
                    d45.q qVar2 = Y6.f249391p;
                    kotlin.jvm.internal.o.d(qVar2);
                    if (i27 >= qVar2.f226458h.size()) {
                        break;
                    }
                    d45.q qVar3 = Y6.f249391p;
                    kotlin.jvm.internal.o.d(qVar3);
                    java.lang.Object obj = qVar3.f226458h.get(i27);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    d45.q qVar4 = Y6.f249391p;
                    kotlin.jvm.internal.o.d(qVar4);
                    int indexOf = qVar4.f226457g.indexOf((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj);
                    if (indexOf != -1) {
                        dVar.add(java.lang.Integer.valueOf(indexOf));
                    }
                    i27++;
                }
                d45.q qVar5 = Y6.f249391p;
                if (qVar5 != null) {
                    java.util.ArrayList arrayList2 = qVar5.f226458h;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "before set selected paths, selected[%s].", arrayList2);
                    arrayList2.clear();
                    com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI activity = qVar5.f226454d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    java.util.ArrayList arrayList3 = ((e45.r) pf5.z.f353948a.a(activity).a(e45.r.class)).f249422i;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "removeMediaData: size:" + arrayList3.size());
                    java.util.Iterator it7 = arrayList3.iterator();
                    kotlin.jvm.internal.o.f(it7, "iterator(...)");
                    while (it7.hasNext()) {
                        java.lang.Object next2 = it7.next();
                        kotlin.jvm.internal.o.f(next2, "next(...)");
                        if (((com.tencent.mm.pluginsdk.ui.v0) next2).h() == 2) {
                            it7.remove();
                        }
                    }
                    java.util.Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        java.lang.Object next3 = it8.next();
                        kotlin.jvm.internal.o.f(next3, "next(...)");
                        java.lang.String str5 = (java.lang.String) next3;
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str5, "", "");
                        if (t23.p0.l() != null) {
                            int indexOf2 = t23.p0.l().indexOf(b17);
                            if (indexOf2 >= 0) {
                                java.lang.Object obj2 = t23.p0.l().get(indexOf2);
                                kotlin.jvm.internal.o.f(obj2, "get(...)");
                                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj2;
                                arrayList2.add(galleryItem$MediaItem);
                                ((e45.r) pf5.z.f353948a.a(activity).a(e45.r.class)).f249422i.add(new com.tencent.mm.pluginsdk.ui.v0(null, galleryItem$MediaItem, null, 5, null));
                            } else {
                                java.lang.String lowerCase = str5.toLowerCase();
                                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                                if (r26.i0.n(lowerCase, "mp4", false)) {
                                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b18 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, 0L, str5, "", "");
                                    arrayList2.add(b18);
                                    ((e45.r) pf5.z.f353948a.a(activity).a(e45.r.class)).f249422i.add(new com.tencent.mm.pluginsdk.ui.v0(null, b18, null, 5, null));
                                } else {
                                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b19 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, 0L, str5, "", "");
                                    arrayList2.add(b19);
                                    ((e45.r) pf5.z.f353948a.a(activity).a(e45.r.class)).f249422i.add(new com.tencent.mm.pluginsdk.ui.v0(null, b19, null, 5, null));
                                }
                            }
                        }
                    }
                }
                d45.q qVar6 = Y6.f249391p;
                if (qVar6 != null) {
                    java.util.ArrayList arrayList4 = qVar6.f226458h;
                    int size = arrayList4.size();
                    while (i19 < size) {
                        java.lang.Object obj3 = arrayList4.get(i19);
                        kotlin.jvm.internal.o.f(obj3, "get(...)");
                        int indexOf3 = qVar6.f226457g.indexOf((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj3);
                        if (indexOf3 != -1) {
                            dVar.add(java.lang.Integer.valueOf(indexOf3));
                        }
                        i19++;
                    }
                    java.util.Iterator it9 = dVar.iterator();
                    while (true) {
                        x.h hVar = (x.h) it9;
                        if (!hVar.hasNext()) {
                            break;
                        }
                        java.lang.Object next4 = hVar.next();
                        kotlin.jvm.internal.o.f(next4, "next(...)");
                        qVar6.notifyItemChanged(((java.lang.Number) next4).intValue());
                    }
                }
                Y6.d(arrayList.size());
                return;
            }
            return;
        }
        if (i17 == 4 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            java.lang.String stringExtra2 = intent.getStringExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
            java.lang.String stringExtra3 = intent.getStringExtra("fileExt");
            if (!r26.i0.p(stringExtra3, "ppt", true) && !r26.i0.p(stringExtra3, "pdf", true) && !r26.i0.p(stringExtra3, "doc", true) && !r26.i0.p(stringExtra3, "docx", true) && !r26.i0.p(stringExtra3, "pptx", true)) {
                if (intent.getBooleanExtra("resLoadFailed", false)) {
                    db5.t7.g(this, getResources().getString(com.tencent.mm.R.string.cex));
                    return;
                } else {
                    db5.t7.g(this, getResources().getString(com.tencent.mm.R.string.ibk));
                    return;
                }
            }
            if (stringExtra2 == null || stringExtra == null || stringExtra3 == null) {
                return;
            }
            c7(stringExtra2, stringExtra, stringExtra3);
            return;
        }
        if (i17 == 0 && i18 == -1) {
            return;
        }
        if (i17 == 2) {
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.f(this, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 1);
            db5.t7.makeText(this, com.tencent.mm.R.string.cen, 0).show();
            return;
        }
        if (i17 == 8) {
            java.lang.Object b27 = c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true).b("INTENT_KEY_DATA_LIST");
            jz5.f0 f0Var = null;
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.v0> arrayList5 = b27 instanceof java.util.ArrayList ? (java.util.ArrayList) b27 : null;
            if (arrayList5 == null) {
                arrayList5 = new java.util.ArrayList();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onActivityResult: dataList:" + java.lang.Integer.valueOf(arrayList5.size()));
            com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191374n;
            if (a2Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            java.util.List list = a2Var.f191505g;
            if (list != null) {
                list.clear();
            }
            d45.q qVar7 = Y6().f249391p;
            java.util.ArrayList arrayList6 = qVar7 != null ? qVar7.f226458h : null;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            for (com.tencent.mm.pluginsdk.ui.v0 v0Var : arrayList5) {
                if (v0Var.h() == 1) {
                    com.tencent.mm.pluginsdk.ui.tools.d2 d2Var = v0Var.f192029d;
                    if (d2Var == null) {
                        continue;
                    } else {
                        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var2 = this.f191374n;
                        if (a2Var2 == null) {
                            kotlin.jvm.internal.o.o("adapter");
                            throw null;
                        }
                        java.util.List list2 = a2Var2.f191505g;
                        if (list2 != null) {
                            list2.add(d2Var);
                        }
                    }
                } else if (v0Var.h() == 2) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = v0Var.f192030e;
                    if (galleryItem$MediaItem2 != null) {
                        d45.q qVar8 = Y6().f249391p;
                        java.util.ArrayList arrayList7 = qVar8 != null ? qVar8.f226458h : null;
                        if (arrayList7 != null) {
                            arrayList7.add(galleryItem$MediaItem2);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "onActivityResult: item error:" + v0Var);
                }
            }
            if (!this.f191378r) {
                com.tencent.mm.pluginsdk.ui.tools.a2 a2Var3 = this.f191374n;
                if (a2Var3 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                a2Var3.notifyDataSetChanged();
                e45.h Y62 = Y6();
                if (Y62 != null && (qVar = Y62.f249391p) != null) {
                    qVar.notifyDataSetChanged();
                }
            }
            if (intent != null && intent.hasExtra("RESULT_KEY_IS_NEED_CLEAN")) {
                boolean booleanExtra = intent.getBooleanExtra("RESULT_KEY_IS_NEED_CLEAN", true);
                android.widget.CheckBox checkBox = (android.widget.CheckBox) ((e45.r) pf5.z.f353948a.a(this).a(e45.r.class)).findViewById(com.tencent.mm.R.id.vfh);
                if (checkBox != null) {
                    checkBox.setChecked(booleanExtra);
                }
            }
            if (intent != null) {
                j7(intent.getIntExtra("RESULT_KEY_LAST_SELECTED_TAB", 0));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                j7(this.f191384x);
            }
            p7();
            if (intent != null && intent.getBooleanExtra("RESULT_KEY_ACTION_SEND", false)) {
                i19 = 1;
            }
            if (i19 != 0) {
                W6();
                return;
            }
            return;
        }
        if (i17 == 14 && i18 == -1) {
            if (intent == null) {
                android.widget.Toast.makeText(getContext(), getString(com.tencent.mm.R.string.cen), 0).show();
                return;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            android.content.ClipData clipData = intent.getClipData();
            if (clipData == null || clipData.getItemCount() <= 0) {
                android.net.Uri data = intent.getData();
                if (data != null) {
                    arrayList8.add(data);
                }
                if (arrayList8.isEmpty() && (dataString = intent.getDataString()) != null) {
                    android.net.Uri parse = android.net.Uri.parse(dataString);
                    kotlin.jvm.internal.o.f(parse, "parse(...)");
                    arrayList8.add(parse);
                }
            } else {
                int itemCount = clipData.getItemCount();
                for (int i28 = 0; i28 < itemCount; i28++) {
                    android.content.ClipData.Item itemAt = clipData.getItemAt(i28);
                    if (itemAt != null && (uri = itemAt.getUri()) != null) {
                        arrayList8.add(uri);
                    }
                }
            }
            if (arrayList8.isEmpty()) {
                android.widget.Toast.makeText(getContext(), getString(com.tencent.mm.R.string.cen), 0).show();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onActivityResult OPEN_FILE_MANAGER uriCount=" + arrayList8.size());
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(e45.r.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            e45.r rVar2 = (e45.r) a17;
            java.util.ArrayList arrayList9 = rVar2.f249422i;
            long a76 = a7();
            int i29 = this.f191367d;
            if (3 == i29 || 4 == i29) {
                com.tencent.mm.pluginsdk.ui.tools.h2 h2Var = (com.tencent.mm.pluginsdk.ui.tools.h2) q26.h0.l(q26.h0.p(kz5.n0.J(arrayList8), new com.tencent.mm.pluginsdk.ui.tools.w2(this)));
                if (h2Var == null) {
                    android.widget.Toast.makeText(getContext(), getString(com.tencent.mm.R.string.cen), 0).show();
                    return;
                }
                java.lang.String str6 = h2Var.f191680d;
                if (!g7(str6)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FileSelectorUI", "System file manager file extension not allowed: " + str6);
                    n7();
                    return;
                }
                java.util.Set set = o35.a.f342751a;
                java.lang.String str7 = h2Var.f191681e;
                if (!((java.util.HashSet) set).contains(str7.toLowerCase())) {
                    db5.t7.g(this, getResources().getString(com.tencent.mm.R.string.ibk));
                    return;
                }
                java.lang.String str8 = h2Var.f191678b;
                if (str8.length() > 0) {
                    c7(str6, str8, str7);
                    return;
                }
                return;
            }
            java.util.Iterator it10 = arrayList8.iterator();
            boolean z28 = false;
            int i37 = 0;
            boolean z29 = false;
            while (it10.hasNext()) {
                android.net.Uri uri2 = (android.net.Uri) it10.next();
                if (arrayList9.size() >= this.f191377q) {
                    z17 = z28;
                    rVar = rVar2;
                    z18 = z29;
                    j17 = a76;
                } else {
                    com.tencent.mm.pluginsdk.ui.tools.h2 l76 = l7(uri2);
                    if (l76 == null) {
                        it = it10;
                        rVar = rVar2;
                        str = str3;
                        str2 = str4;
                        j17 = a76;
                    } else {
                        long j19 = l76.f191679c;
                        it = it10;
                        java.lang.String str9 = l76.f191681e;
                        rVar = rVar2;
                        z17 = z28;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult multi ext:");
                        sb6.append(str9);
                        sb6.append(" path:");
                        java.lang.String str10 = l76.f191678b;
                        sb6.append(str10);
                        z18 = z29;
                        sb6.append(" fileTitle:");
                        java.lang.String str11 = l76.f191680d;
                        sb6.append(str11);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", sb6.toString());
                        if (!g7(str11)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FileSelectorUI", "System file manager file extension not allowed: " + str11);
                            str = str3;
                            str2 = str4;
                            j17 = a76;
                            z29 = z18;
                            z28 = true;
                        } else if (j19 >= a76) {
                            ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).wi(str9, j19, 2, 3, this.f191368e);
                            z28 = z17;
                            str = str3;
                            str2 = str4;
                            j17 = a76;
                            z29 = true;
                        } else {
                            java.util.Iterator it11 = arrayList9.iterator();
                            kotlin.jvm.internal.o.f(it11, str3);
                            while (true) {
                                str = str3;
                                if (!it11.hasNext()) {
                                    break;
                                }
                                java.lang.Object next5 = it11.next();
                                kotlin.jvm.internal.o.f(next5, str4);
                                com.tencent.mm.pluginsdk.ui.tools.d2 d2Var2 = ((com.tencent.mm.pluginsdk.ui.v0) next5).f192029d;
                                if (d2Var2 != null) {
                                    java.lang.String str12 = str4;
                                    if (d2Var2.f191624b == 5 && kotlin.jvm.internal.o.b(d2Var2.f191565i, str10)) {
                                        j18 = a76;
                                        if (d2Var2.f191566j == j19 && kotlin.jvm.internal.o.b(d2Var2.f191564h, str11)) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onActivityResult multi remove dup:" + d2Var2.f191565i);
                                            it11.remove();
                                        }
                                    } else {
                                        j18 = a76;
                                    }
                                    str3 = str;
                                    str4 = str12;
                                    a76 = j18;
                                } else {
                                    str3 = str;
                                }
                            }
                            str2 = str4;
                            j17 = a76;
                            if (arrayList9.size() < this.f191377q) {
                                com.tencent.mm.pluginsdk.ui.tools.d2 d2Var3 = new com.tencent.mm.pluginsdk.ui.tools.d2(0L, null, 0L, null, null, null, 0L, 0, false, null, false, false, 4095, null);
                                d2Var3.f191565i = str10;
                                d2Var3.f191566j = j19;
                                kotlin.jvm.internal.o.g(str11, "<set-?>");
                                d2Var3.f191564h = str11;
                                kotlin.jvm.internal.o.g(str9, "<set-?>");
                                d2Var3.f191569m = str9;
                                d2Var3.f191624b = 5;
                                d2Var3.f191570n = true;
                                arrayList9.add(new com.tencent.mm.pluginsdk.ui.v0(d2Var3, null, null, 6, null));
                                i37++;
                                z28 = z17;
                                z29 = z18;
                            }
                        }
                    }
                    it10 = it;
                    rVar2 = rVar;
                    str3 = str;
                    str4 = str2;
                    a76 = j17;
                }
                z19 = true;
            }
            z17 = z28;
            rVar = rVar2;
            z18 = z29;
            j17 = a76;
            z19 = false;
            if (z19) {
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                int i38 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var.f211776c = getString(com.tencent.mm.R.string.cf9, java.lang.Integer.valueOf(this.f191377q));
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.c();
            } else if (z18) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
                u1Var.u(getString(com.tencent.mm.R.string.ngn, com.tencent.mm.sdk.platformtools.t8.f0(j17)));
                u1Var.m(com.tencent.mm.R.string.f490454vi);
                u1Var.l(com.tencent.mm.pluginsdk.ui.tools.v2.f191953a);
                u1Var.q(false);
            } else if (z17) {
                n7();
            }
            if (i37 > 0) {
                p7();
                rVar.R6(true, this.D);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.ui.chatting.pc pcVar;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (!this.G || (pcVar = this.F) == null || pcVar == null) {
            return;
        }
        pcVar.a();
        pcVar.b();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f191368e = getIntent().getStringExtra("TO_USER");
        this.f191367d = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int intExtra = getIntent().getIntExtra("INTENT_MAX_SELECT_COUNT", 0);
        if (intExtra <= 0) {
            intExtra = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSelectorMaxCount());
        }
        this.f191377q = intExtra;
        this.f191372i = getIntent().getStringArrayListExtra("allowedExtensions");
        this.f191373m = getIntent().getBooleanExtra("extensionFilterEnabled", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "FileSelectorUI onCreate: allowedExtensions=" + this.f191372i + ", extensionFilterEnabled=" + this.f191373m);
        this.C = getIntent().getStringExtra("custom_button_text");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FileSelectorUI onCreate: customButtonText=");
        sb6.append(this.C);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", sb6.toString());
        setMMTitle(getString(com.tencent.mm.R.string.dcq));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        m7();
        hideActionbarLine();
        getWindow().setNavigationBarColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        this.D = getIntent().getBooleanExtra("is_support_landscape_mode", false);
        int i17 = this.f191367d;
        if (3 == i17 || 4 == i17) {
            com.tencent.mm.sdk.event.d dVar = com.tencent.mm.sdk.event.d.f192370d;
            com.tencent.mm.sdk.event.IListener iListener = this.f191379s;
            if (!dVar.b(iListener)) {
                iListener.alive();
            }
        } else {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((e45.r) pf5.z.f353948a.a(context).a(e45.r.class)).f249425o = new com.tencent.mm.pluginsdk.ui.tools.x2(this);
        }
        f7();
        this.f191385y = findViewById(com.tencent.mm.R.id.m0v);
        java.lang.String string = getString(com.tencent.mm.R.string.cet);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.pluginsdk.ui.tools.y0 y0Var = new com.tencent.mm.pluginsdk.ui.tools.y0(string, com.tencent.mm.R.raw.icons_outlined_copy, com.tencent.mm.R.color.FG_0, 1);
        java.lang.String string2 = getString(com.tencent.mm.R.string.ceu);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        com.tencent.mm.pluginsdk.ui.tools.y0 y0Var2 = new com.tencent.mm.pluginsdk.ui.tools.y0(string2, com.tencent.mm.R.raw.icons_outlined_favorites, com.tencent.mm.R.color.FG_0, 2);
        java.lang.String string3 = getString(com.tencent.mm.R.string.cev);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.util.ArrayList d17 = kz5.c0.d(y0Var, y0Var2, new com.tencent.mm.pluginsdk.ui.tools.y0(string3, com.tencent.mm.R.raw.icons_outlined_folder, com.tencent.mm.R.color.FG_0, 3));
        int i18 = this.f191367d;
        if (3 != i18 || 1 != i18) {
            java.lang.String string4 = getString(com.tencent.mm.R.string.ces);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            d17.add(new com.tencent.mm.pluginsdk.ui.tools.y0(string4, com.tencent.mm.R.raw.icons_outlined_album, com.tencent.mm.R.color.FG_0, 4));
        }
        this.f191374n = new com.tencent.mm.pluginsdk.ui.tools.a2(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484375e24);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ListView");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f191369f = listView;
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191374n;
        if (a2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        listView.setAdapter((android.widget.ListAdapter) a2Var);
        android.widget.ListView listView2 = this.f191369f;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.tools.y2(this));
        android.widget.ListView listView3 = this.f191369f;
        if (listView3 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView3.setOnItemClickListener(this.H);
        android.widget.ListView listView4 = this.f191369f;
        if (listView4 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView4.setOnScrollListener(new com.tencent.mm.pluginsdk.ui.tools.z2(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qu6);
        this.f191383w = findViewById2;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f191371h = (com.tencent.mm.pluginsdk.ui.LoadingTipsView) findViewById(com.tencent.mm.R.id.imn);
        com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView = Y6().f249390o;
        if (pinnedHeaderRecyclerView != null) {
            pinnedHeaderRecyclerView.setVisibility(8);
        }
        Y6().f249400y = new com.tencent.mm.pluginsdk.ui.tools.a3(this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mew);
        this.f191376p = findViewById3;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f191376p;
        if (view != null) {
            view.setOnClickListener(com.tencent.mm.pluginsdk.ui.tools.b3.f191526d);
        }
        com.tencent.mm.ui.tools.l8 l8Var = new com.tencent.mm.ui.tools.l8(true, true);
        this.f191375o = l8Var;
        l8Var.f210324i = new com.tencent.mm.pluginsdk.ui.tools.d3(this);
        addSearchMenu(true, l8Var);
        p7();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onCreate, cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.ui.f.b((android.widget.TextView) findViewById(com.tencent.mm.R.id.f482821ou), com.tencent.mm.R.dimen.f479559b);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FileSelectorUI);
        aVar.dk(this, "FileSelectorUI");
        aVar.ik(this, 4, 28579);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e45.h Y6 = Y6();
        if (Y6 != null) {
            t23.p0.k().f(Y6);
            t23.p0.b();
        }
        this.f191379s.dead();
        com.tencent.mm.ui.tools.l8 l8Var = this.f191375o;
        if (l8Var != null) {
            l8Var.b();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("time", c01.id.a());
        jSONObject.put("selectedTabType", this.f191384x);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f191367d);
        java.lang.Object value = ((jz5.n) this.f191386z).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).putString(this.B, jSONObject.toString());
        c01.n2.d().e("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4) {
            if (i17 != 82) {
                return super.onKeyDown(i17, event);
            }
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onKeyDown back");
        setMMTitle(getString(com.tencent.mm.R.string.dcq));
        if (this.G) {
            com.tencent.mm.ui.chatting.pc pcVar = this.F;
            if (pcVar != null) {
                pcVar.c();
            }
            com.tencent.mm.ui.chatting.pc pcVar2 = this.F;
            if (pcVar2 != null) {
                pcVar2.removeAllViews();
            }
            android.view.View contentView = getContentView();
            kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) contentView).removeView(this.F);
            m7();
            setRequestedOrientation(1);
            addSearchMenu(true, this.f191375o);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markExitDuringProfileUI");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 2L, 1L);
            this.G = false;
        } else {
            i7(false);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            return;
        }
        isDestroyed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e45.r rVar = (e45.r) pf5.z.f353948a.a(context).a(e45.r.class);
        java.lang.String X6 = X6();
        rVar.getClass();
        com.tencent.mm.ui.widget.button.WeButton weButton = rVar.f249418e;
        if (weButton != null) {
            weButton.setText(X6);
        }
        if (h7()) {
            android.view.View view = this.f191385y;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView = Y6().f249390o;
            if (pinnedHeaderRecyclerView != null) {
                com.tencent.mm.ui.kk.d(pinnedHeaderRecyclerView, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn));
            }
            android.widget.ListView listView = this.f191369f;
            if (listView != null) {
                com.tencent.mm.ui.kk.d(listView, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn));
                return;
            } else {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
        }
        android.view.View view2 = this.f191385y;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView2 = Y6().f249390o;
        if (pinnedHeaderRecyclerView2 != null) {
            com.tencent.mm.ui.kk.d(pinnedHeaderRecyclerView2, 0);
        }
        android.widget.ListView listView2 = this.f191369f;
        if (listView2 != null) {
            com.tencent.mm.ui.kk.d(listView2, 0);
        } else {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
    }

    public final void p7() {
        int Z6 = Z6();
        o7();
        if (3 != this.f191367d) {
            if (Z6 <= 0) {
                updateOptionMenuText(1, X6());
                enableOptionMenu(1, false);
                return;
            }
            updateOptionMenuText(1, X6() + '(' + Z6 + '/' + this.f191377q + ')');
            enableOptionMenu(1, true);
        }
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(c45.b.class);
        set.add(e45.r.class);
    }
}
