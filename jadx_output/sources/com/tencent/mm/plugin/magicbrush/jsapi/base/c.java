package com.tencent.mm.plugin.magicbrush.jsapi.base;

/* loaded from: classes.dex */
public final class c implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fd3.b f148046d;

    public c(fd3.b bVar) {
        this.f148046d = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType callbackType = (com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType) obj;
        boolean z17 = callbackType instanceof com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.Event;
        fd3.b bVar = this.f148046d;
        if (z17) {
            lc3.h0 h0Var = (lc3.h0) bVar.f317890a;
            if (h0Var != null) {
                h0Var.C0(((com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.Event) callbackType).f148042d);
                return;
            }
            return;
        }
        if (callbackType instanceof com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.FinalCallback) {
            yz5.l s17 = bVar.s();
            java.lang.String value = ((com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.FinalCallback) callbackType).f148043d.f68406d;
            kotlin.jvm.internal.o.f(value, "value");
            s17.invoke(new lc3.a0(value));
        }
    }
}
