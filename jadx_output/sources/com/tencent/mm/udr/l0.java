package com.tencent.mm.udr;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/udr/l0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/wechat/aff/udr/q;", "Landroid/os/Bundle;", "<init>", "()V", "udr-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class l0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.wechat.aff.udr.q data = (com.tencent.wechat.aff.udr.q) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        da5.r rVar = da5.r.f227817a;
        if (rVar.b()) {
            rVar.c();
        }
        com.tencent.wechat.aff.udr.a.f217529b.b(data, java.util.Optional.ofNullable(new com.tencent.mm.udr.r0("CheckNoLoginTask", callback)).map(com.tencent.mm.udr.k0.f196498a));
    }
}
