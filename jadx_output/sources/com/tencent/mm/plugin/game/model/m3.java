package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class m3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140369d;

    public m3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, java.lang.String str) {
        this.f140369d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        ((java.util.HashSet) com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.f140184m).remove(this.f140369d);
    }
}
