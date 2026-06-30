package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f190387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f190388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190389f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f190390g;

    public i2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, android.view.View view, int i17, int i18, int i19) {
        this.f190387d = view;
        this.f190388e = i17;
        this.f190389f = i18;
        this.f190390g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f190389f;
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.expand(this.f190387d, this.f190388e, i17, this.f190390g, i17);
    }
}
