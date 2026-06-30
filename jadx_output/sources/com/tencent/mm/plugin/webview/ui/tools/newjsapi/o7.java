package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class o7 implements zy2.s9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186410a;

    public o7(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186410a = rVar;
    }

    @Override // zy2.s9
    public final void a(int i17, java.lang.String str) {
        com.tencent.mm.ipcinvoker.r rVar = this.f186410a;
        if (i17 == 1) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
            }
        } else if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
        }
    }
}
