package com.tencent.mm.plugin.sns.ui.widget;

@db5.a(39)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SnsCommentEmoticonDetailUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f170868m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f170869d = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.z1(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f170870e = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.h2(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f170871f = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.b2(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f170872g = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.a2(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f170873h = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.y1(this));

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f170874i;

    public static final /* synthetic */ android.view.View U6(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getParentView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        android.view.View X6 = snsCommentEmoticonDetailUI.X6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getParentView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        return X6;
    }

    public final com.tencent.mm.ui.tools.s4 V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.ui.tools.s4 s4Var = (com.tencent.mm.ui.tools.s4) ((jz5.n) this.f170873h).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        return s4Var;
    }

    public final android.view.View W6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        java.lang.Object value = ((jz5.n) this.f170869d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        return view;
    }

    public final android.view.View X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        java.lang.Object value = ((jz5.n) this.f170870e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        return view;
    }

    public final void Y6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        V6().d(X6(), W6(), false, new com.tencent.mm.plugin.sns.ui.widget.j2(this), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getKeyCode() == 4 && event.getAction() == 0) {
            Y6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(event);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        return dispatchKeyEvent;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        return com.tencent.mm.R.layout.eov;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupStatusBarTransparent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        getWindow().getDecorView().setSystemUiVisibility(1280);
        vj5.o.e(getWindow());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupStatusBarTransparent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        java.lang.String stringExtra = getIntent().getStringExtra("IntentKeyEmojiMd5");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (getIntent().hasExtra("IntentKeyEmojiBuffer")) {
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("IntentKeyEmojiBuffer");
            this.f170874i = ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Bi(stringExtra, pm0.b0.h(byteArrayExtra));
        } else {
            this.f170874i = (com.tencent.mm.api.IEmojiInfo) getIntent().getParcelableExtra("IntentKeyIEmojiInfo");
        }
        android.graphics.Rect rect = (android.graphics.Rect) getIntent().getParcelableExtra("IntentKeyThumbLocation");
        if (rect != null) {
            V6().e(rect.left, rect.top, rect.width(), rect.height());
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f170874i;
        if (iEmojiInfo != null) {
            this.f170874i = ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).wi(iEmojiInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        java.lang.Object value = ((jz5.n) this.f170871f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = this.f170874i;
        kotlin.jvm.internal.o.d(iEmojiInfo2);
        ((com.tencent.mm.emoji.view.EmojiStatusView) value).setEmojiInfo(iEmojiInfo2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDetailView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        java.lang.Object value2 = ((jz5.n) this.f170872g).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDetailView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        ((android.view.View) value2).setOnClickListener(new com.tencent.mm.plugin.sns.ui.widget.e2(stringExtra, this));
        W6().setOnClickListener(new com.tencent.mm.plugin.sns.ui.widget.f2(this));
        W6().setOnLongClickListener(new com.tencent.mm.plugin.sns.ui.widget.g2(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        android.view.View X6 = X6();
        X6.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.widget.i2(X6, this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
    }
}
