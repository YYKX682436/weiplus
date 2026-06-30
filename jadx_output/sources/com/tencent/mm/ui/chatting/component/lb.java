package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public class lb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f199409e;

    public lb(com.tencent.mm.ui.chatting.component.jb jbVar, java.lang.String str, c01.o8 o8Var) {
        this.f199408d = str;
        this.f199409e = o8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.p8 a17 = c01.n8.a();
        ((c01.k7) a17).b(this.f199408d, 30, this.f199409e);
    }

    public java.lang.String toString() {
        return super.toString() + "|getContactCallBack2";
    }
}
