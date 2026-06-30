package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class tq extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public xj.m f161587d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f161588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f161589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161589f = "";
    }

    public final void O6() {
        byte[] bytes = ("" + java.lang.System.currentTimeMillis()).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        this.f161589f = g17;
    }

    public final void P6(com.tencent.mm.plugin.setting.ui.setting.qq event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("crt_pic_sessionid", this.f161589f);
        event.a(hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event.f161488a, hashMap, 35480);
    }

    public final void Q6() {
        xj.m mVar;
        if (this.f161588e && (mVar = this.f161587d) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "reportAdExposeEnd: aid=" + mVar.f454753a);
            i95.m c17 = i95.n0.c(xj.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xj.i.gg((xj.i) c17, mVar.f454753a, wj.w0.f446542e, null, 4, null);
            this.f161588e = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoMakingAvatarEnable()) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "prefetchAdInfo: RepairerConfig disabled, skip");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "prefetchAdInfo: start async fetch");
            ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Vi(wj.t0.M, 0L, new com.tencent.mm.plugin.setting.ui.setting.lq(new java.lang.ref.WeakReference(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNewIntent(android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.tq.onNewIntent(android.content.Intent):void");
    }
}
