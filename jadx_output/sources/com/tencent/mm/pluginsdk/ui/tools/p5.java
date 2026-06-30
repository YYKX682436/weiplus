package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/p5;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "feature-attachment_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class p5 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || !kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.y.a())) {
            return new com.tencent.mm.ipcinvoker.type.IPCString("");
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        java.lang.String str = iPCString.f68406d;
        ((ht.a) vVar).getClass();
        return new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.pluginsdk.ui.tools.f.d(str, 0));
    }
}
