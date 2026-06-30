package i0;

/* loaded from: classes16.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.spring.SnsSpringAActivity f286494d;

    public i(com.tencent.mm.plugin.sns.spring.SnsSpringAActivity snsSpringAActivity) {
        this.f286494d = snsSpringAActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.spring.SnsSpringAActivity snsSpringAActivity = this.f286494d;
        snsSpringAActivity.setResult(0);
        snsSpringAActivity.finish();
    }
}
