package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f190334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f190335f;

    public g9(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var, float f17, float f18) {
        this.f190333d = h9Var;
        this.f190334e = f17;
        this.f190335f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f190333d.g(this.f190334e, this.f190335f);
    }
}
