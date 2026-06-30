package n64;

/* loaded from: classes4.dex */
public final class e extends n64.f {

    /* renamed from: e, reason: collision with root package name */
    public r45.jj4 f335218e;

    @Override // n64.f
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.MediaPreloadItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MediaItem[");
        sb6.append(super.toString());
        sb6.append(", mediaId=");
        r45.jj4 jj4Var = this.f335218e;
        sb6.append(jj4Var != null ? jj4Var.f377855d : null);
        sb6.append(", mediaType=");
        r45.jj4 jj4Var2 = this.f335218e;
        sb6.append(jj4Var2 != null ? java.lang.Integer.valueOf(jj4Var2.S) : null);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.MediaPreloadItem");
        return sb7;
    }
}
