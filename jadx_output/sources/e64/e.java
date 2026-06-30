package e64;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f249821a;

    /* renamed from: b, reason: collision with root package name */
    public e64.h f249822b;

    /* renamed from: c, reason: collision with root package name */
    public h64.a f249823c;

    public e(int i17, e64.h hVar, h64.a aVar, int i18, kotlin.jvm.internal.i iVar) {
        hVar = (i18 & 2) != 0 ? null : hVar;
        aVar = (i18 & 4) != 0 ? null : aVar;
        this.f249821a = i17;
        this.f249822b = hVar;
        this.f249823c = aVar;
    }

    public final h64.a a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMbInfoHelper", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        h64.a aVar = this.f249823c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMbInfoHelper", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return aVar;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return true;
        }
        if (!(obj instanceof e64.e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return false;
        }
        e64.e eVar = (e64.e) obj;
        if (this.f249821a != eVar.f249821a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f249822b, eVar.f249822b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f249823c, eVar.f249823c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        int hashCode = java.lang.Integer.hashCode(this.f249821a) * 31;
        e64.h hVar = this.f249822b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h64.a aVar = this.f249823c;
        int hashCode3 = hashCode2 + (aVar != null ? aVar.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return hashCode3;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        java.lang.String str = "MagicBrushData(activityHash=" + this.f249821a + ", biz=" + this.f249822b + ", mbInfoHelper=" + this.f249823c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return str;
    }
}
