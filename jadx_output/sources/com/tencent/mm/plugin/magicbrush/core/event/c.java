package com.tencent.mm.plugin.magicbrush.core.event;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/core/event/c;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/magicbrush/core/event/MagicBrushServerEvent$RequestTypeForAppBrand;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand data = (com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        yz5.p pVar = com.tencent.mm.plugin.magicbrush.core.event.g.f147901b;
        if (pVar != null) {
            pVar.invoke(data.f147893d, data.f147894e);
        }
        callback.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
    }
}
