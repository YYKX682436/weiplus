package com.tencent.mm.plugin.magicbrush.demo.bizlogic;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/bizlogic/MagicBrushDemoPublicServiceBizPkgManagement;", "Lcom/tencent/mm/plugin/magicbrush/demo/bizlogic/MagicBrushDemoBizPkgManagement;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MagicBrushDemoPublicServiceBizPkgManagement extends com.tencent.mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoBizPkgManagement {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f147915g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicBrushDemoPublicServiceBizPkgManagement(java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f147915g = "MagicBrushDemoPublicServiceBizPkgManagement";
    }

    @Override // com.tencent.mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoBizPkgManagement, jc3.x
    public java.lang.String d() {
        return "MagicBrushPublicServiceDemo";
    }

    @Override // com.tencent.mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoBizPkgManagement, jc3.x
    public void f(yz5.l cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.mars.xlog.Log.i(this.f147915g, "provideMainScript");
        java.lang.String e17 = ik1.f.e("magicbrush-demo-publicservice-bizstartup.js");
        kotlin.jvm.internal.o.f(e17, "getAssetAsString(...)");
        cb6.invoke(kz5.b0.c(new lc3.j0(e17)));
    }

    @Override // com.tencent.mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoBizPkgManagement, jc3.x
    public java.lang.String g() {
        return "MagicBrushPublicServiceDemo";
    }
}
