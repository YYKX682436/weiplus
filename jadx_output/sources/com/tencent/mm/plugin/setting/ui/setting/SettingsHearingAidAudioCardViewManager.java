package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidAudioCardViewManager;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/setting/ui/setting/gc;", "d", "Lcom/tencent/mm/plugin/setting/ui/setting/gc;", "getPlayFinishedListener", "()Lcom/tencent/mm/plugin/setting/ui/setting/gc;", "setPlayFinishedListener", "(Lcom/tencent/mm/plugin/setting/ui/setting/gc;)V", "playFinishedListener", "", "e", "Z", "isAutoPlay", "()Z", "setAutoPlay", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class SettingsHearingAidAudioCardViewManager extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.setting.ui.setting.gc playFinishedListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isAutoPlay;

    /* renamed from: f, reason: collision with root package name */
    public boolean f160410f;

    /* renamed from: g, reason: collision with root package name */
    public int f160411g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160412h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f160413i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsHearingAidAudioCardViewManager(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView... audioCardViews) {
        kotlin.jvm.internal.o.g(audioCardViews, "audioCardViews");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        int i17 = 0;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        java.util.ArrayList arrayList = this.f160413i;
        linearLayout.setVisibility(arrayList.size() == 0 ? 0 : 8);
        int length = audioCardViews.length;
        int i18 = 0;
        while (i17 < length) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = audioCardViews[i17];
            int i19 = i18 + 1;
            android.view.ViewGroup.LayoutParams layoutParams = settingsHearingAidAudioCardView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams != null ? new android.widget.LinearLayout.LayoutParams(layoutParams) : new android.widget.LinearLayout.LayoutParams(-2, -1);
            layoutParams2.weight = 1.0f;
            if (i18 != audioCardViews.length - 1) {
                layoutParams2.rightMargin = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9) / 2;
            } else if (i18 != 0) {
                layoutParams2.leftMargin = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9) / 2;
            }
            settingsHearingAidAudioCardView.setLayoutParams(layoutParams2);
            linearLayout.addView(settingsHearingAidAudioCardView);
            settingsHearingAidAudioCardView.setOnStateChangedCallback(new com.tencent.mm.plugin.setting.ui.setting.ic(this));
            settingsHearingAidAudioCardView.setOnHasPlayedCallback(new com.tencent.mm.plugin.setting.ui.setting.kc(this));
            i17++;
            i18 = i19;
        }
        linearLayout.requestLayout();
        arrayList.add(linearLayout);
        addView(linearLayout);
    }

    public final void b(int i17) {
        java.util.ArrayList arrayList = this.f160413i;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.widget.LinearLayout) it.next()).setVisibility(8);
        }
        ((android.widget.LinearLayout) arrayList.get(i17)).setVisibility(0);
        this.f160411g = i17;
        if (this.isAutoPlay) {
            this.f160410f = true;
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            java.lang.Object k17 = q26.h0.k(new n3.r1((android.view.ViewGroup) obj));
            kotlin.jvm.internal.o.e(k17, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView");
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v;
            ((com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) k17).a(false);
        }
    }

    public final void c() {
        java.util.Iterator it = this.f160413i.iterator();
        while (it.hasNext()) {
            n3.t1 t1Var = new n3.t1((android.widget.LinearLayout) it.next());
            while (t1Var.hasNext()) {
                android.view.View view = (android.view.View) t1Var.next();
                kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView");
                int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v;
                ((com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) view).b(false);
            }
        }
    }

    public final void d(boolean z17) {
        if (this.f160412h) {
            return;
        }
        if (!z17 || this.f160411g < getChildCount() - 1) {
            if (z17 || this.f160411g != 0) {
                this.f160412h = true;
                int i17 = z17 ? this.f160411g + 1 : this.f160411g - 1;
                java.util.ArrayList arrayList = this.f160413i;
                java.lang.Object obj = arrayList.get(this.f160411g);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                n3.t1 t1Var = new n3.t1((android.view.ViewGroup) obj);
                while (t1Var.hasNext()) {
                    android.view.View view = (android.view.View) t1Var.next();
                    kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView");
                    int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v;
                    ((com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) view).b(false);
                }
                ((android.widget.LinearLayout) arrayList.get(i17)).setAlpha(0.0f);
                ((android.widget.LinearLayout) arrayList.get(i17)).setVisibility(0);
                java.lang.Object obj2 = arrayList.get(this.f160411g);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                sa5.d.d((android.view.View) obj2, 0, 0L, new com.tencent.mm.plugin.setting.ui.setting.mc(this, i17), 3, null);
            }
        }
    }

    public final com.tencent.mm.plugin.setting.ui.setting.gc getPlayFinishedListener() {
        return this.playFinishedListener;
    }

    public final void setAutoPlay(boolean z17) {
        this.isAutoPlay = z17;
    }

    public final void setPlayFinishedListener(com.tencent.mm.plugin.setting.ui.setting.gc gcVar) {
        this.playFinishedListener = gcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsHearingAidAudioCardViewManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f160413i = new java.util.ArrayList();
    }
}
