package td4;

/* loaded from: classes4.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f417655a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.jj4 f417656b;

    public f2(com.tencent.mm.plugin.sns.storage.SnsInfo info, r45.jj4 mediaObj) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        this.f417655a = info;
        this.f417656b = mediaObj;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return this.f417655a;
    }

    public final r45.jj4 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return this.f417656b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return true;
        }
        if (!(obj instanceof td4.f2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return false;
        }
        td4.f2 f2Var = (td4.f2) obj;
        if (!kotlin.jvm.internal.o.b(this.f417655a, f2Var.f417655a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f417656b, f2Var.f417656b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        int hashCode = (this.f417655a.hashCode() * 31) + this.f417656b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        java.lang.String str = "SnsPickerMediaInfo(info=" + this.f417655a + ", mediaObj=" + this.f417656b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return str;
    }
}
