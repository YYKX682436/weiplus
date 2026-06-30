package gd4;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n74.z f270687a;

    /* renamed from: b, reason: collision with root package name */
    public final n74.a0 f270688b;

    /* renamed from: c, reason: collision with root package name */
    public final n74.a0 f270689c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f270690d;

    /* renamed from: e, reason: collision with root package name */
    public final gd4.e f270691e;

    public f(n74.z thumb, n74.a0 sight, n74.a0 breakSight, android.view.ViewGroup.LayoutParams layoutParams, gd4.e playState) {
        kotlin.jvm.internal.o.g(thumb, "thumb");
        kotlin.jvm.internal.o.g(sight, "sight");
        kotlin.jvm.internal.o.g(breakSight, "breakSight");
        kotlin.jvm.internal.o.g(playState, "playState");
        this.f270687a = thumb;
        this.f270688b = sight;
        this.f270689c = breakSight;
        this.f270690d = layoutParams;
        this.f270691e = playState;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return true;
        }
        if (!(obj instanceof gd4.f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        gd4.f fVar = (gd4.f) obj;
        if (!kotlin.jvm.internal.o.b(this.f270687a, fVar.f270687a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f270688b, fVar.f270688b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f270689c, fVar.f270689c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f270690d, fVar.f270690d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        gd4.e eVar = this.f270691e;
        gd4.e eVar2 = fVar.f270691e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        return eVar == eVar2;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        int hashCode = ((((this.f270687a.hashCode() * 31) + this.f270688b.hashCode()) * 31) + this.f270689c.hashCode()) * 31;
        android.view.ViewGroup.LayoutParams layoutParams = this.f270690d;
        int hashCode2 = ((hashCode + (layoutParams == null ? 0 : layoutParams.hashCode())) * 31) + this.f270691e.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        java.lang.String str = "UIModel(thumb=" + this.f270687a + ", sight=" + this.f270688b + ", breakSight=" + this.f270689c + ", uiLayoutParams=" + this.f270690d + ", playState=" + this.f270691e + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        return str;
    }
}
