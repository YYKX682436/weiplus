package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusNewLabelUI;", "Lcom/tencent/mm/plugin/sns/ui/visiblerange/BaseSelectVisibleRangeUI;", "Lzd4/p;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/qd", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusNewLabelUI extends com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI implements zd4.p {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f173655J = 0;
    public com.tencent.mm.plugin.textstatus.ui.qd G;
    public final java.lang.String E = "MicroMsg.TextStatusNewLabelUI";
    public final jz5.g F = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.sd(this));
    public final jz5.g H = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.rd(this));
    public final jz5.g I = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.td(this));

    @Override // zd4.p
    public boolean A6() {
        boolean r27;
        boolean z17;
        boolean r28;
        android.content.Intent intent = getIntent();
        b7();
        int intExtra = intent.getIntExtra("KLabel_range_index", 0);
        java.lang.String stringExtra = intent.getStringExtra("Kother_user_name_list");
        java.lang.String str = this.f170673d;
        java.util.List<java.lang.String> O1 = com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, str);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.X6(stringArrayListExtra);
        kotlin.jvm.internal.o.d(O1);
        l7();
        this.f170685s = intExtra;
        this.f170683q.f171544o.clear();
        if (intExtra == 2) {
            this.f170683q.f171543n.clear();
            for (java.lang.String str2 : stringArrayListExtra) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidLabel", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidLabel", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    z17 = false;
                } else {
                    java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(str2));
                    z17 = (j17 != null ? j17.size() : 0) > 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidLabel", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                }
                if (z17) {
                    this.f170683q.f171543n.add(str2);
                }
            }
            java.util.ArrayList mIncludeLabel = this.f170683q.f171543n;
            kotlin.jvm.internal.o.f(mIncludeLabel, "mIncludeLabel");
            if (!mIncludeLabel.isEmpty()) {
                this.f170677h = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171543n, str);
            }
            this.f170683q.e();
            for (java.lang.String str3 : O1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    r27 = false;
                } else {
                    r27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true).r2();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                }
                if (r27) {
                    this.f170683q.f171545p.add(str3);
                }
            }
            this.f170679m = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171545p, str);
        } else if (intExtra == 3) {
            java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                this.f170683q.f171544o.add(it.next().toString());
            }
            java.util.ArrayList mExcludeLabel = this.f170683q.f171544o;
            kotlin.jvm.internal.o.f(mExcludeLabel, "mExcludeLabel");
            if (!mExcludeLabel.isEmpty()) {
                this.f170677h = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171544o, str);
            }
            this.f170683q.d();
            for (java.lang.String str4 : O1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    r28 = false;
                } else {
                    r28 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str4, true).r2();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                }
                if (r28) {
                    this.f170683q.f171546q.add(str4);
                }
            }
            this.f170679m = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171546q, str);
        }
        return true;
    }

    @Override // zd4.p
    public boolean C6() {
        return ((java.lang.Boolean) ((jz5.n) this.F).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    @Override // zd4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean I3() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI.I3():boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public com.tencent.mm.plugin.sns.ui.x6 Y6(android.content.Context context, zd4.o resCollector) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(resCollector, "resCollector");
        return o7();
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public zd4.o Z6() {
        android.content.Intent intent = getIntent();
        b7();
        int intExtra = intent.getIntExtra("KLabel_range_index", 0);
        b7();
        java.lang.CharSequence charSequence = "";
        if (intExtra != 0) {
            return new com.tencent.mm.plugin.textstatus.ui.eg(-1, "");
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.ArrayList<java.lang.String> lastRangeUserList = p7().f174184c;
        java.util.ArrayList<java.lang.String> lastRangeLabelIdList = p7().f174183b;
        kotlin.jvm.internal.o.g(lastRangeUserList, "lastRangeUserList");
        kotlin.jvm.internal.o.g(lastRangeLabelIdList, "lastRangeLabelIdList");
        if (!lastRangeUserList.isEmpty() || !lastRangeLabelIdList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet = new java.util.HashSet();
            int min = java.lang.Math.min(lastRangeLabelIdList.size() + lastRangeUserList.size(), 20);
            for (java.lang.String str : lastRangeLabelIdList) {
                if (arrayList.size() >= min) {
                    break;
                }
                if (!hashSet.contains(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    java.lang.String g17 = ((b93.b) c93.a.a()).g(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(g17) || com.tencent.mm.sdk.platformtools.t8.L0(((b93.b) c93.a.a()).j(str))) {
                        g17 = "";
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                        kotlin.jvm.internal.o.d(g17);
                        arrayList.add(0, g17);
                        hashSet.add(str);
                    }
                }
            }
            for (java.lang.String username : lastRangeUserList) {
                if (arrayList.size() >= min) {
                    break;
                }
                kotlin.jvm.internal.o.g(username, "username");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String a17 = c01.a2.a(username);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
                    a17 = (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.f2())) ? "" : n17.f2();
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    kotlin.jvm.internal.o.d(a17);
                    arrayList.add(a17);
                }
            }
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jbm));
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.jfk);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{c17}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, format);
        }
        return new com.tencent.mm.plugin.textstatus.ui.eg(p7().f174182a, charSequence);
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public void a7(android.content.Intent intent) {
        if (intent != null) {
            intent.putExtra("k_last_range_user_clicked", o7().C);
        }
        super.a7(intent);
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public android.content.Intent c7() {
        android.content.Intent c76 = super.c7();
        c76.putExtra("contact_select_label_from_scene", 2);
        return c76;
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public boolean i7(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        int i18 = this.f170684r.i(this.f170683q.f171540k);
        int n17 = this.f170684r.n(i17);
        boolean i76 = super.i7(expandableListView, view, i17, j17);
        if (n17 == 5) {
            int i19 = p7().f174182a;
            java.util.ArrayList arrayList = p7().f174183b;
            java.util.ArrayList arrayList2 = p7().f174184c;
            boolean o17 = this.f170684r.o(i19, 2);
            java.util.ArrayList arrayList3 = this.f170678i;
            java.lang.String str = this.f170673d;
            if (o17) {
                arrayList3.addAll(arrayList);
                this.f170683q.f171543n.clear();
                this.f170683q.f171543n.addAll(arrayList);
                this.f170677h = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171543n, str);
                this.f170683q.e();
                this.f170683q.f171545p = arrayList2;
            } else if (this.f170684r.o(i19, 3)) {
                arrayList3.addAll(arrayList);
                this.f170683q.f171544o.clear();
                this.f170683q.f171544o.addAll(arrayList);
                this.f170677h = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171544o, str);
                this.f170683q.d();
                this.f170683q.f171546q = arrayList2;
            }
            int i27 = this.f170684r.i(p7().f174182a);
            o7().C = true;
            boolean isGroupExpanded = this.f170674e.isGroupExpanded(i27);
            o7().f171540k = p7().f174182a;
            java.lang.String str2 = "handleOnGroupClick: last group visibleState:" + p7().f174182a + ", pos:" + i27 + ", hadExpand:" + isGroupExpanded;
            java.lang.String str3 = this.E;
            com.tencent.mars.xlog.Log.i(str3, str2);
            int i28 = p7().f174182a;
            com.tencent.mars.xlog.Log.i(str3, "checkEnableOptionMenu: targetState=" + i28);
            if (i28 == 2) {
                enableOptionMenu(k7());
            } else if (i28 != 3) {
                enableOptionMenu(true);
            } else {
                enableOptionMenu(j7());
            }
            if (!isGroupExpanded) {
                if (i18 != i27 && this.f170674e.isGroupExpanded(i18)) {
                    this.f170674e.c(i18);
                }
                this.f170674e.d(i27);
                return true;
            }
            o7().notifyDataSetChanged();
        }
        return i76;
    }

    public final com.tencent.mm.plugin.textstatus.ui.oc o7() {
        return (com.tencent.mm.plugin.textstatus.ui.oc) ((jz5.n) this.H).getValue();
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f170692z = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mars.xlog.Log.i(this.E, "onCreate: isFromFeedEditUI " + ((java.lang.Boolean) ((jz5.n) this.F).getValue()).booleanValue());
        super.onCreate(bundle);
        this.G = new com.tencent.mm.plugin.textstatus.ui.qd(new java.lang.ref.WeakReference(this));
        gm0.j1.n().f273288b.a(5293, this.G);
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(5293, this.G);
    }

    public final com.tencent.mm.plugin.textstatus.ui.q p7() {
        return (com.tencent.mm.plugin.textstatus.ui.q) ((jz5.n) this.I).getValue();
    }
}
