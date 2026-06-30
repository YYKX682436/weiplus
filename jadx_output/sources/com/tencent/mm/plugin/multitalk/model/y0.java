package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modeltalkroom.MultiTalkGroup f150206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f150207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.v0 f150209g;

    public y0(com.tencent.mm.plugin.multitalk.model.v0 v0Var, com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup, android.content.Intent intent, java.lang.String str) {
        this.f150209g = v0Var;
        this.f150206d = multiTalkGroup;
        this.f150207e = intent;
        this.f150208f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f150209g;
        com.tencent.mm.plugin.multitalk.ui.h hVar = v0Var.S;
        hVar.f150286x = this.f150206d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = this.f150207e;
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String toUser = this.f150208f;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        hVar.v(context, intent, 0L, 0, toUser, false);
        boolean z17 = com.tencent.mm.ui.tools.ld.f210556a;
        com.tencent.mm.ui.tools.ld.f210556a = true;
        com.tencent.mm.ui.tools.kd observer = v0Var.Z;
        kotlin.jvm.internal.o.g(observer, "observer");
        java.util.ArrayList arrayList = (java.util.ArrayList) com.tencent.mm.ui.tools.ld.f210557b;
        if (!arrayList.contains(observer)) {
            arrayList.add(observer);
        }
        v0Var.U(false);
    }
}
