package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class u1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186555a;

    public u1(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186555a = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.ipcinvoker.r rVar = this.f186555a;
        if (rVar != null) {
            if (str == null) {
                str = "";
            }
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(str));
        }
    }
}
