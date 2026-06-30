package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class v implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186565a;

    public v(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186565a = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.ipcinvoker.r rVar = this.f186565a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(num != null ? num.intValue() : 0));
        }
    }
}
