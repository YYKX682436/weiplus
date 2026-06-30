package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class v7 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186577e;

    public v7(nw4.k kVar, nw4.y2 y2Var) {
        this.f186576d = kVar;
        this.f186577e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        nw4.k kVar = this.f186576d;
        nw4.y2 y2Var = this.f186577e;
        if (z17) {
            hashMap.put("code", 100);
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "post successful");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
            return;
        }
        hashMap.put("code", 200);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "post cancel");
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", hashMap);
    }
}
