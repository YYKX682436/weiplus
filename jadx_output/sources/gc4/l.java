package gc4;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f270460a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f270461b;

    public l(java.lang.String templateId, java.lang.String musicId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        this.f270460a = templateId;
        this.f270461b = musicId;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            return true;
        }
        if (!(obj instanceof gc4.l)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            return false;
        }
        gc4.l lVar = (gc4.l) obj;
        if (!kotlin.jvm.internal.o.b(this.f270460a, lVar.f270460a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f270461b, lVar.f270461b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
        int hashCode = (this.f270460a.hashCode() * 31) + this.f270461b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
        java.lang.String str = "MiaoJianCutSameInfo[" + this.f270460a + ", " + this.f270461b + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
        return str;
    }
}
