package com.tencent.mm.plugin.fts.ui;

@gm0.a2
/* loaded from: classes12.dex */
public class FTSChattingConvUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137957p;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f137959r;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f137961t;

    /* renamed from: u, reason: collision with root package name */
    public int f137962u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.z1 f137963v;

    /* renamed from: q, reason: collision with root package name */
    public boolean f137958q = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f137960s = true;

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f137963v == null) {
            this.f137963v = new com.tencent.mm.plugin.fts.ui.z1(w0Var, this.f137957p);
        }
        return this.f137963v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void V6(java.lang.String str) {
        super.V6(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f137960s = false;
        }
        ?? r112 = com.tencent.mm.storage.z3.R4(this.f137957p);
        if (this.f137958q) {
            r112 = 2;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14569, 0, 1, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(this.f137962u), java.lang.Integer.valueOf((int) r112));
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f137957p = getIntent().getStringExtra("detail_username");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.f137957p);
        this.f137958q = getIntent().getBooleanExtra("detail_user_dismiss", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "initSearchData conversation=%s", this.f137957p);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void Z6() {
        super.Z6();
        android.view.View view = this.f137959r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void a7() {
        super.a7();
        android.view.View view = this.f137959r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void b7() {
        super.b7();
        android.view.View view = this.f137959r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void c7() {
        super.c7();
        android.view.View view = this.f137959r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f7(int i17) {
        if (!com.tencent.mm.storage.z3.R4(this.f137957p)) {
            if (i17 == 0) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[9];
                objArr[0] = 0;
                objArr[1] = 0;
                objArr[2] = 1;
                objArr[3] = 0;
                objArr[4] = 0;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = 0;
                objArr[8] = java.lang.Integer.valueOf(this.f137958q ? 2 : 0);
                g0Var.d(14569, objArr);
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[9];
            objArr2[0] = 0;
            objArr2[1] = 0;
            objArr2[2] = 0;
            objArr2[3] = 1;
            objArr2[4] = 0;
            objArr2[5] = 0;
            objArr2[6] = 0;
            objArr2[7] = 0;
            objArr2[8] = java.lang.Integer.valueOf(this.f137958q ? 2 : 0);
            g0Var2.d(14569, objArr2);
            return;
        }
        com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f137957p);
        if (W0.A0() != null) {
            if (i17 == 0) {
                com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr3 = new java.lang.Object[9];
                objArr3[0] = 0;
                objArr3[1] = 0;
                objArr3[2] = 1;
                objArr3[3] = 0;
                objArr3[4] = 0;
                objArr3[5] = 0;
                objArr3[6] = 0;
                objArr3[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr3[8] = java.lang.Integer.valueOf(this.f137958q ? 2 : 1);
                g0Var3.d(14569, objArr3);
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr4 = new java.lang.Object[9];
            objArr4[0] = 0;
            objArr4[1] = 0;
            objArr4[2] = 0;
            objArr4[3] = 1;
            objArr4[4] = 0;
            objArr4[5] = 0;
            objArr4[6] = 0;
            objArr4[7] = java.lang.Integer.valueOf(W0.A0().size());
            objArr4[8] = java.lang.Integer.valueOf(this.f137958q ? 2 : 1);
            g0Var4.d(14569, objArr4);
        }
    }

    public final void g7(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(13234, java.lang.String.format("%s,%d,%d,%d,%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), 0));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        if (com.tencent.mm.storage.z3.R4(this.f137957p)) {
            com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f137957p);
            this.f137961t = W0;
            if (W0.A0() != null) {
                this.f137962u = this.f137961t.A0().size();
            }
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mfb);
        this.f137959r = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.gs6);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 3));
        recyclerView.N(new com.tencent.mm.plugin.fts.ui.a2(this));
        recyclerView.setAdapter(new com.tencent.mm.plugin.fts.ui.c2(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view instanceof android.widget.TextView)) {
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f137960s = false;
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (!com.tencent.mm.storage.z3.R4(this.f137957p)) {
            intValue++;
        }
        if (intValue == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSearchMemberDetail");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("from_scene", 1);
            intent.putExtra("RoomInfo_Id", this.f137957p);
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, getResources().getString(com.tencent.mm.R.string.ic8));
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SeeMemberRecordUI", intent, null);
        } else if (intValue == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSearchDateDetail");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("detail_username", this.f137957p);
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, null);
            f7(0);
        } else if (intValue == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeImageVideoHistory");
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("kintent_talker", this.f137957p);
            intent3.putExtra("key_media_type", 1);
            intent3.putExtra("key_gallery_enter_scene", 2);
            intent3.addFlags(67108864);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI", intent3, null);
            f7(1);
        } else if (intValue == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeFileHistory");
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("kintent_talker", this.f137957p);
            intent4.putExtra("key_media_type", 2);
            bundle = com.tencent.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent4.putExtra("detail_user_dismiss", this.f137958q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent4, bundle);
        } else if (intValue == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("kintent_talker", this.f137957p);
            intent5.putExtra("key_media_type", 3);
            bundle = com.tencent.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent5.putExtra("detail_user_dismiss", this.f137958q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent5, bundle);
        } else if (intValue == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
            android.content.Intent intent6 = new android.content.Intent();
            intent6.putExtra("kintent_talker", this.f137957p);
            intent6.putExtra("key_media_type", 4);
            bundle = com.tencent.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent6.putExtra("detail_user_dismiss", this.f137958q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent6, bundle);
        } else if (intValue == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeePayHistory");
            android.content.Intent intent7 = new android.content.Intent();
            intent7.putExtra("kintent_talker", this.f137957p);
            intent7.putExtra("key_media_type", 5);
            bundle = com.tencent.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent7.putExtra("detail_user_dismiss", this.f137958q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent7, bundle);
        } else if (intValue == 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeAppBrandHistory");
            android.content.Intent intent8 = new android.content.Intent();
            intent8.putExtra("kintent_talker", this.f137957p);
            intent8.putExtra("key_media_type", 6);
            bundle = com.tencent.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent8.putExtra("detail_user_dismiss", this.f137958q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent8, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        t13.g bj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.tencent.mm.plugin.fts.n) bj6).f137769c = true;
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        int i17;
        super.onDestroy();
        this.f137963v.g();
        t13.g bj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.tencent.mm.plugin.fts.n) bj6).g();
        }
        if (this.f137960s && this.f137958q) {
            if (com.tencent.mm.storage.z3.R4(this.f137957p)) {
                com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f137957p);
                if (W0.A0() != null) {
                    i17 = W0.A0().size();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14569, 1, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(i17), 2, 0, 99);
                }
            }
            i17 = 0;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14569, 1, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(i17), 2, 0, 99);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f137959r.postDelayed(new com.tencent.mm.plugin.fts.ui.b2(this), 128L);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.plugin.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
        if (com.tencent.mm.storage.z3.R4(this.f137957p)) {
            g7(this.f137910n, 10, 5, gVar.f423759b + 1);
        } else {
            g7(this.f137910n, 11, 5, gVar.f423759b + 1);
        }
    }
}
