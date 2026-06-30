package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class k2 implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.n2 f191743a;

    public k2(com.tencent.mm.pluginsdk.ui.tools.n2 n2Var) {
        this.f191743a = n2Var;
    }

    @Override // com.tencent.mm.vfs.t6
    public final boolean accept(com.tencent.mm.vfs.r6 pathname) {
        kotlin.jvm.internal.o.g(pathname, "pathname");
        if (pathname.f213166d.f213279f.isEmpty() ? false : pathname.getName().startsWith(".")) {
            return false;
        }
        return (this.f191743a.f191787r && pathname.y()) ? false : true;
    }
}
