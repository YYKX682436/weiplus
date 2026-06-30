package s74;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f404627a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f404628b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f404629c;

    public z2(int i17, java.lang.String eventName, java.util.Map map, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(eventName, "eventName");
        this.f404627a = i17;
        this.f404628b = eventName;
        this.f404629c = map;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return true;
        }
        if (!(obj instanceof s74.z2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return false;
        }
        s74.z2 z2Var = (s74.z2) obj;
        if (this.f404627a != z2Var.f404627a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f404628b, z2Var.f404628b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f404629c, z2Var.f404629c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        int hashCode = ((java.lang.Integer.hashCode(this.f404627a) * 31) + this.f404628b.hashCode()) * 31;
        java.util.Map map = this.f404629c;
        int hashCode2 = hashCode + (map == null ? 0 : map.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        java.lang.String str = "DynamicTemplateEvent(eventType=" + this.f404627a + ", eventName=" + this.f404628b + ", eventData=" + this.f404629c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        return str;
    }
}
