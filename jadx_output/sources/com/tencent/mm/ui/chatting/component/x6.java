package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class x6 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200220d;

    public x6(com.tencent.mm.ui.chatting.component.f7 f7Var, com.tencent.mm.storage.f9 f9Var) {
        this.f200220d = f9Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "ChattingUI.expExposeReport";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelstat.b.c(this.f200220d, com.tencent.mm.modelstat.a.Expose);
    }
}
