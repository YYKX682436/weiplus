package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class u0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f145916e;

    public u0(java.lang.String str, long j17) {
        this.f145915d = str;
        this.f145916e = j17;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "preload complete: %s %s", str, java.lang.Integer.valueOf(hVar.field_retCode));
        ((java.util.HashSet) com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.f145801o).remove(str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19228, this.f145915d, 0, 4, 0, 0, 0, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() - this.f145916e) / 1000), 0);
    }
}
