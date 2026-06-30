package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f140479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f140480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f140481f;

    public t3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.a aVar, android.os.Bundle bundle, boolean z17, com.tencent.mm.ipcinvoker.r rVar) {
        this.f140479d = bundle;
        this.f140480e = z17;
        this.f140481f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.c(this.f140479d, this.f140480e, this.f140481f);
    }
}
