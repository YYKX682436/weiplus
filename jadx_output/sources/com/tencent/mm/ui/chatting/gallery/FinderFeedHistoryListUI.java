package com.tencent.mm.ui.chatting.gallery;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/FinderFeedHistoryListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lzb5/e;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FinderFeedHistoryListUI extends com.tencent.mm.ui.MMActivity implements zb5.e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f200561i = 0;

    /* renamed from: d, reason: collision with root package name */
    public zb5.d f200562d;

    /* renamed from: f, reason: collision with root package name */
    public q40.e f200564f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f200563e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f200565g = "";

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f200566h = jz5.h.b(com.tencent.mm.ui.chatting.gallery.w0.f201528d);

    public final a31.v T6() {
        return (a31.v) ((jz5.n) this.f200566h).getValue();
    }

    public void U6(boolean z17, java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        q40.e eVar = this.f200564f;
        if (eVar != null) {
            com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment = (com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment) eVar;
            if (finderConvSearchFeedFragment.f129006w) {
                com.tencent.mm.plugin.finder.ui.conv.l lVar = finderConvSearchFeedFragment.A;
                if (lVar == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                lVar.d();
            }
        }
        q40.e eVar2 = this.f200564f;
        if (eVar2 != null) {
            ((com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment) eVar2).y0(this.f200565g, dataList);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ahl;
    }

    @Override // com.tencent.mm.ui.chatting.view.b
    public void l2(com.tencent.mm.ui.chatting.presenter.z zVar) {
        this.f200562d = (zb5.d) zVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        inflateTransition.excludeTarget(decorView.findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        java.lang.String stringExtra = intent.getStringExtra("kintent_talker");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f200563e = stringExtra;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.presenter.o1 o1Var = new com.tencent.mm.ui.chatting.presenter.o1(context, this.f200563e);
        o1Var.f202393i = this;
        this.f200562d = o1Var;
        setActionbarColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.a07));
        hideActionbarLine();
        getIntent().getBooleanExtra("detail_user_dismiss", false);
        T6().c(false);
        a31.v T6 = T6();
        zb5.d dVar = this.f200562d;
        com.tencent.mm.ui.chatting.presenter.h1 h1Var = dVar != null ? new com.tencent.mm.ui.chatting.presenter.h1((com.tencent.mm.ui.chatting.presenter.o1) dVar) : null;
        T6.f999u = h1Var;
        T6.f210324i = h1Var;
        T6().f996r = false;
        q40.f fVar = (q40.f) i95.n0.c(q40.f.class);
        java.lang.String conversation = this.f200563e;
        ((com.tencent.mm.plugin.finder.service.y2) fVar).getClass();
        kotlin.jvm.internal.o.g(conversation, "conversation");
        com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment = new com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment(conversation);
        this.f200564f = finderConvSearchFeedFragment;
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.k(com.tencent.mm.R.id.eh8, finderConvSearchFeedFragment, null);
        beginTransaction.f();
        q40.e eVar = this.f200564f;
        if (eVar != null) {
            com.tencent.mm.ui.chatting.gallery.v0 v0Var = new com.tencent.mm.ui.chatting.gallery.v0(this);
            com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment2 = (com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment) eVar;
            finderConvSearchFeedFragment2.B = 40;
            finderConvSearchFeedFragment2.C = v0Var;
        }
        zb5.d dVar2 = this.f200562d;
        if (dVar2 != null) {
            str = ((com.tencent.mm.ui.chatting.presenter.o1) dVar2).f202388d.getString(com.tencent.mm.R.string.f489988ho);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        setMMTitle(str);
        o1Var.a(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(menu, "menu");
        T6().j(this, menu);
        a31.v T6 = T6();
        zb5.d dVar = this.f200562d;
        if (dVar != null) {
            str = ((com.tencent.mm.ui.chatting.presenter.o1) dVar).f202388d.getString(com.tencent.mm.R.string.f489988ho);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        } else {
            str = "";
        }
        if (T6.f210323h != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            T6.f210323h.setSelectedTag(str);
        }
        getContentView().postDelayed(new com.tencent.mm.ui.chatting.gallery.u0(this), 200L);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q40.e eVar = this.f200564f;
        if (eVar != null) {
            com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment = (com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment) eVar;
            finderConvSearchFeedFragment.B = 0;
            finderConvSearchFeedFragment.C = null;
        }
        zb5.d dVar = this.f200562d;
        if (dVar != null) {
            ((com.tencent.mm.ui.chatting.presenter.o1) dVar).onDetach();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getAction() != 4) {
            return super.onKeyDown(i17, event);
        }
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        if (keyboardState() == 2) {
            T6().a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        T6().m(this, menu);
        return true;
    }
}
