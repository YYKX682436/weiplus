package x44;

/* loaded from: classes4.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x44.m2 f451853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451854i;

    public l2(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, x44.m2 m2Var, java.lang.String str4) {
        this.f451849d = activity;
        this.f451850e = str;
        this.f451851f = str2;
        this.f451852g = str3;
        this.f451853h = m2Var;
        this.f451854i = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1");
        eb4.d.f250884a.a((androidx.fragment.app.FragmentActivity) this.f451849d, this.f451850e, this.f451851f, this.f451852g, new x44.k2(this.f451853h, this.f451854i));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1");
    }
}
