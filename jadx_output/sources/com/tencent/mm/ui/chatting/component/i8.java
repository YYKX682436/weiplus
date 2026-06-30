package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199215e;

    public i8(com.tencent.mm.ui.chatting.component.y8 y8Var, int i17) {
        this.f199214d = y8Var;
        this.f199215e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion companion = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout B0 = this.f199214d.B0();
        int i17 = this.f199215e;
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(companion, B0, 0, i17, 0, i17, false, 32, null);
    }
}
