package xd4;

/* loaded from: classes4.dex */
public final class l0 implements x25.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f453666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f453667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f453668c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f453669d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f453670e;

    /* renamed from: f, reason: collision with root package name */
    public int f453671f;

    /* renamed from: g, reason: collision with root package name */
    public int f453672g;

    /* renamed from: h, reason: collision with root package name */
    public int f453673h;

    /* renamed from: i, reason: collision with root package name */
    public int f453674i;

    /* renamed from: j, reason: collision with root package name */
    public int f453675j;

    /* renamed from: k, reason: collision with root package name */
    public int f453676k;

    /* renamed from: l, reason: collision with root package name */
    public int f453677l;

    /* renamed from: m, reason: collision with root package name */
    public int f453678m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f453679n;

    public l0(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        this.f453666a = str;
        this.f453667b = i17;
        this.f453668c = i18;
        this.f453669d = str2;
        this.f453670e = str3;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkState", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        if (!this.f453679n) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkState", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        } else {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Already reported");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkState", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            throw illegalStateException;
        }
    }

    public final java.util.Map b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toMap", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        jz5.l[] lVarArr = new jz5.l[13];
        java.lang.String str = this.f453666a;
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("snsvideourl", str);
        lVarArr[1] = new jz5.l("sns_player_type", java.lang.Integer.valueOf(this.f453667b));
        lVarArr[2] = new jz5.l("sns_scene", java.lang.Integer.valueOf(this.f453668c));
        java.lang.String str2 = this.f453669d;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[3] = new jz5.l("sns_feed_id", str2);
        java.lang.String str3 = this.f453670e;
        lVarArr[4] = new jz5.l("sessionid_sns", str3 != null ? str3 : "");
        lVarArr[5] = new jz5.l("play_clk_pv", java.lang.Integer.valueOf(this.f453671f));
        lVarArr[6] = new jz5.l("pause_clk_pv", java.lang.Integer.valueOf(this.f453672g));
        lVarArr[7] = new jz5.l("expand_clk_pv", java.lang.Integer.valueOf(this.f453673h));
        lVarArr[8] = new jz5.l("collapse_clk_pv", java.lang.Integer.valueOf(this.f453674i));
        lVarArr[9] = new jz5.l("clk_show_panle_pv", java.lang.Integer.valueOf(this.f453675j));
        lVarArr[10] = new jz5.l("clk_hide_panle_pv", java.lang.Integer.valueOf(this.f453676k));
        lVarArr[11] = new jz5.l("speedup_clk_pv", java.lang.Integer.valueOf(this.f453677l));
        lVarArr[12] = new jz5.l("processbar_drag_pv", java.lang.Integer.valueOf(this.f453678m));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMap", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return k17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return true;
        }
        if (!(obj instanceof xd4.l0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        xd4.l0 l0Var = (xd4.l0) obj;
        if (!kotlin.jvm.internal.o.b(this.f453666a, l0Var.f453666a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        if (this.f453667b != l0Var.f453667b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        if (this.f453668c != l0Var.f453668c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f453669d, l0Var.f453669d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f453670e, l0Var.f453670e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        java.lang.String str = this.f453666a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f453667b)) * 31) + java.lang.Integer.hashCode(this.f453668c)) * 31;
        java.lang.String str2 = this.f453669d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f453670e;
        int hashCode3 = hashCode2 + (str3 != null ? str3.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return hashCode3;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        java.lang.String str = "SnsVideoControlPanelReporter(" + b() + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return str;
    }
}
