package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class rb extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f209606d;

    public rb(android.app.Activity activity) {
        this.f209606d = activity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMAppMgr$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.sdk.platformtools.t8.b1(this.f209606d, com.tencent.mm.sdk.platformtools.p9.e(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.f(this.f209606d), com.tencent.mm.sdk.platformtools.m2.e(), "setting", 0, 0)));
        yj0.a.h(this, "com/tencent/mm/ui/MMAppMgr$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f209606d.getResources().getColor(com.tencent.mm.R.color.f479308vo));
    }
}
