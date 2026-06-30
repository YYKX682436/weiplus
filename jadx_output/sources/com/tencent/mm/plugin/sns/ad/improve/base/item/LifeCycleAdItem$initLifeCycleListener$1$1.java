package com.tencent.mm.plugin.sns.ad.improve.base.item;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/sns/ad/improve/base/item/LifeCycleAdItem$initLifeCycleListener$1$1", "Landroidx/lifecycle/f;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LifeCycleAdItem$initLifeCycleListener$1$1 implements androidx.lifecycle.f {
    public LifeCycleAdItem$initLifeCycleListener$1$1(com.tencent.mm.plugin.sns.ad.improve.base.item.b bVar) {
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y owner) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.improve.base.item.LifeCycleAdItem$initLifeCycleListener$1$1");
        kotlin.jvm.internal.o.g(owner, "owner");
        int i17 = com.tencent.mm.plugin.sns.ad.improve.base.item.b.f162726d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$deadCommonEventListener", "com.tencent.mm.plugin.sns.ad.improve.base.item.LifeCycleAdItem");
        throw null;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onPause(androidx.lifecycle.y owner) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.improve.base.item.LifeCycleAdItem$initLifeCycleListener$1$1");
        kotlin.jvm.internal.o.g(owner, "owner");
        throw null;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onResume(androidx.lifecycle.y owner) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.improve.base.item.LifeCycleAdItem$initLifeCycleListener$1$1");
        kotlin.jvm.internal.o.g(owner, "owner");
        throw null;
    }
}
