package com.tencent.mm.ui.chatting.gallery;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/EmojiHistoryListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lzb5/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EmojiHistoryListUI extends com.tencent.mm.ui.MMActivity implements zb5.b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f200556h = 0;

    /* renamed from: d, reason: collision with root package name */
    public zb5.a f200557d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment f200559f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f200558e = "";

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f200560g = jz5.h.b(com.tencent.mm.ui.chatting.gallery.n0.f201208d);

    public final a31.v T6() {
        return (a31.v) ((jz5.n) this.f200560g).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e4w;
    }

    @Override // com.tencent.mm.ui.chatting.view.b
    public void l2(com.tencent.mm.ui.chatting.presenter.z zVar) {
        this.f200557d = (zb5.a) zVar;
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
        this.f200558e = stringExtra;
        this.f200559f = new com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment(this.f200558e, true);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.presenter.h0 h0Var = new com.tencent.mm.ui.chatting.presenter.h0(context, this.f200558e);
        this.f200557d = h0Var;
        h0Var.f202237f = this;
        this.f200557d = h0Var;
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = this.f200559f;
        kotlin.jvm.internal.o.d(emojiHistoryListFragment);
        h0Var.f202238g = emojiHistoryListFragment;
        emojiHistoryListFragment.f200550s = h0Var;
        setActionbarColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.a07));
        hideActionbarLine();
        T6().c(false);
        a31.v T6 = T6();
        zb5.a aVar = this.f200557d;
        com.tencent.mm.ui.chatting.presenter.d0 d0Var = aVar != null ? new com.tencent.mm.ui.chatting.presenter.d0((com.tencent.mm.ui.chatting.presenter.h0) aVar) : null;
        T6.f999u = d0Var;
        T6.f210324i = d0Var;
        T6().f996r = false;
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment2 = this.f200559f;
        if (emojiHistoryListFragment2 != null) {
            androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.k(com.tencent.mm.R.id.t7m, emojiHistoryListFragment2, null);
            beginTransaction.f();
        }
        zb5.a aVar2 = this.f200557d;
        if (aVar2 != null) {
            str = ((com.tencent.mm.ui.chatting.presenter.h0) aVar2).f202235d.getString(com.tencent.mm.R.string.n7a);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        setMMTitle(str);
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(menu, "menu");
        T6().j(this, menu);
        a31.v T6 = T6();
        zb5.a aVar = this.f200557d;
        if (aVar != null) {
            str = ((com.tencent.mm.ui.chatting.presenter.h0) aVar).f202235d.getString(com.tencent.mm.R.string.n7a);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        } else {
            str = "";
        }
        if (T6.f210323h != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            T6.f210323h.setSelectedTag(str);
        }
        getContentView().postDelayed(new com.tencent.mm.ui.chatting.gallery.o0(this), 200L);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb5.a aVar = this.f200557d;
        if (aVar != null) {
            ((com.tencent.mm.ui.chatting.presenter.h0) aVar).onDetach();
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
