package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class m extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f168938d;

    /* renamed from: e, reason: collision with root package name */
    public long f168939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168938d = new java.util.HashSet();
    }

    public final java.util.HashSet O6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getList", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        java.util.HashSet hashSet = this.f168938d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getList", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        return hashSet;
    }

    public final void P6(tc4.s0 item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        kotlin.jvm.internal.o.g(item, "item");
        java.util.HashSet hashSet = this.f168938d;
        boolean contains = hashSet.contains(item);
        hashSet.add(item);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ImproveAvoidLeakUIC", hashCode() + " onBindViewHolder item:" + item.hashCode() + ", hadExist=" + contains + ", now count=" + hashSet.size());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f168939e < 60000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
            return;
        }
        this.f168939e = currentTimeMillis;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc4.s0) it.next()).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
    }

    public final void Q6(tc4.s0 item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        kotlin.jvm.internal.o.g(item, "item");
        java.util.HashSet hashSet = this.f168938d;
        hashSet.remove(item);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ImproveAvoidLeakUIC", hashCode() + " onViewRecycled item:" + item.hashCode() + ", now count=" + hashSet.size());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ImproveAvoidLeakUIC", hashCode() + " may leak count:" + this.f168938d.size());
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.sns.ui.improve.component.l(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
    }
}
