package com.tencent.mm.udr;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/udr/p0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/wechat/aff/udr/w;", "<init>", "()V", "udr-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class p0 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString data = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(data, "data");
        da5.r rVar = da5.r.f227817a;
        if (rVar.b()) {
            rVar.c();
        }
        return (com.tencent.wechat.aff.udr.w) com.tencent.wechat.aff.udr.a.f217529b.j(data.f68406d).orElse(null);
    }
}
