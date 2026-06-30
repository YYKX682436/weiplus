package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ay {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.animation.Animation f167794a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.Animation f167795b;

    public ay(android.content.Context context, com.tencent.mm.plugin.sns.ui.listener.i iVar, android.widget.FrameLayout frameLayout, android.view.View view) {
        new android.view.animation.ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f167794a = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477758an);
        this.f167795b = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f167795b = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477759ao);
    }

    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        return false;
    }
}
