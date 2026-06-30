package com.tencent.mm.vfs;

/* loaded from: classes8.dex */
public final class k3 implements com.tencent.mm.vfs.w5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f213027a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f213028b;

    public k3(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f213027a = id6;
        this.f213028b = true;
    }

    @Override // com.tencent.mm.vfs.w5
    public void a(com.tencent.mm.vfs.q2 fs6, int i17, java.util.Map p17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(fs6, "fs");
        kotlin.jvm.internal.o.g(p17, "p");
        if (this.f213028b) {
            java.lang.Object obj = p17.get("op");
            java.lang.String str2 = (java.lang.String) com.tencent.mm.vfs.f7.f212941b.get(obj);
            if (str2 == null) {
                str2 = java.lang.String.valueOf(obj);
            }
            java.lang.String str3 = kotlin.jvm.internal.o.b(p17.get("ok"), java.lang.Boolean.TRUE) ? "ok" : com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED;
            java.lang.Object obj2 = p17.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            java.lang.Object obj3 = p17.get("targetFS");
            java.lang.Object obj4 = p17.get("targetPath");
            java.lang.String str4 = this.f213027a;
            if (obj3 == null) {
                str = "[" + str4 + "] (" + str2 + ") " + obj2 + " : " + str3;
            } else {
                str = "[" + str4 + "] (" + str2 + ") " + obj2 + " -> " + obj4 + '(' + obj3 + ") : " + str3;
            }
            com.tencent.stubs.logger.Log.i("VFS.AccessLog", str);
        }
    }
}
