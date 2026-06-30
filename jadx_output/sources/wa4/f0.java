package wa4;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final wa4.d0 f444225a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f444226b;

    /* renamed from: c, reason: collision with root package name */
    public final wa4.e0 f444227c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.ed4 f444228d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444229e;

    public f0(wa4.d0 d0Var, java.util.List list, wa4.e0 e0Var, r45.ed4 ed4Var, boolean z17) {
        this.f444225a = d0Var;
        this.f444226b = list;
        this.f444227c = e0Var;
        this.f444228d = ed4Var;
        this.f444229e = z17;
    }

    public final r45.ed4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return this.f444228d;
    }

    public final java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotos", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotos", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return this.f444226b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return true;
        }
        if (!(obj instanceof wa4.f0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        wa4.f0 f0Var = (wa4.f0) obj;
        if (this.f444225a != f0Var.f444225a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f444226b, f0Var.f444226b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f444227c, f0Var.f444227c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f444228d, f0Var.f444228d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        boolean z17 = this.f444229e;
        boolean z18 = f0Var.f444229e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        wa4.d0 d0Var = this.f444225a;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        java.util.List list = this.f444226b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        wa4.e0 e0Var = this.f444227c;
        int hashCode3 = (hashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        r45.ed4 ed4Var = this.f444228d;
        int hashCode4 = ((hashCode3 + (ed4Var != null ? ed4Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f444229e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return hashCode4;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        java.lang.String str = "TimelineSessionPostInfo(infoType=" + this.f444225a + ", photos=" + this.f444226b + ", video=" + this.f444227c + ", location=" + this.f444228d + ", shouldShowShare=" + this.f444229e + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return str;
    }

    public /* synthetic */ f0(wa4.d0 d0Var, java.util.List list, wa4.e0 e0Var, r45.ed4 ed4Var, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : d0Var, (i17 & 2) != 0 ? null : list, (i17 & 4) != 0 ? null : e0Var, (i17 & 8) == 0 ? ed4Var : null, (i17 & 16) != 0 ? true : z17);
    }
}
