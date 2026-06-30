package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb5.s0 f199790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199791e;

    public qk(com.tencent.mm.ui.chatting.component.lk lkVar, sb5.s0 s0Var, java.lang.String str) {
        this.f199790d = s0Var;
        this.f199791e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.ui.chatting.component.jb) this.f199790d).f199263e.k1(this.f199791e, -1, false);
    }
}
