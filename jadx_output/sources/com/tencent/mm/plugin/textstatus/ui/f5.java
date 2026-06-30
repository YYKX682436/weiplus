package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f173862d;

    public f5(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f173862d = textStatusCardFeedsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f173862d;
        if (textStatusCardFeedsActivity.f173483e) {
            return;
        }
        textStatusCardFeedsActivity.f173483e = true;
        int intExtra = textStatusCardFeedsActivity.getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
        int intExtra2 = textStatusCardFeedsActivity.getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            textStatusCardFeedsActivity.getContentView().postDelayed(new com.tencent.mm.plugin.textstatus.ui.l4(textStatusCardFeedsActivity), 300L);
            return;
        }
        android.view.View contentView = textStatusCardFeedsActivity.getContentView();
        if (contentView != null) {
            contentView.setClipToOutline(true);
        }
        contentView.setTranslationX(intExtra);
        contentView.setTranslationY(intExtra2);
        int h17 = i65.a.h(textStatusCardFeedsActivity, com.tencent.mm.R.dimen.f479718db);
        int h18 = i65.a.h(textStatusCardFeedsActivity, com.tencent.mm.R.dimen.f479718db);
        contentView.setPivotX(0.0f);
        contentView.setPivotY(0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "handleEnterAnimInner", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "handleEnterAnimInner", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator alpha = contentView.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f);
        alpha.setInterpolator(ta5.h.f416879a.a());
        alpha.setDuration(200L);
        alpha.start();
        alpha.setUpdateListener(new com.tencent.mm.plugin.textstatus.ui.n4(contentView, h18, h18, h17));
        alpha.setListener(new com.tencent.mm.plugin.textstatus.ui.o4(textStatusCardFeedsActivity));
    }
}
