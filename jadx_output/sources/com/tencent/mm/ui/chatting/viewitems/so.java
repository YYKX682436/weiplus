package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class so implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205536c;

    public so(int i17, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f205534a = i17;
        this.f205535b = dVar;
        this.f205536c = f9Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mm.ui.chatting.viewitems.mp.o(this.f205534a, this.f205535b, this.f205536c);
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemVoice", "onResultCancel: back play");
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemVoice", "onResultRefuse: back play");
    }
}
