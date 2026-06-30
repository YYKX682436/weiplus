package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public class k5 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder f173053d;

    public k5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder settingsTeenModeMainFinder) {
        this.f173053d = settingsTeenModeMainFinder;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$7", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.teenmode.ui.w2 w2Var = (com.tencent.mm.plugin.teenmode.ui.w2) uVar.c(this.f173053d.getContext()).a(com.tencent.mm.plugin.teenmode.ui.w2.class);
        w2Var.getClass();
        androidx.appcompat.app.AppCompatActivity activity = w2Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        new ay2.q(activity).show();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$7", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f173053d.getResources().getColor(com.tencent.mm.R.color.Link_100));
        textPaint.setUnderlineText(false);
    }
}
