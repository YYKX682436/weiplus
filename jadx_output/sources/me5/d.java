package me5;

/* loaded from: classes4.dex */
public class d extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f325949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f325950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325952h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325953i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325954m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ me5.e f325955n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(me5.e eVar, int i17, r35.m3 m3Var, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.String str, java.lang.String str2) {
        super(i17, m3Var);
        this.f325955n = eVar;
        this.f325949e = map;
        this.f325950f = bundle;
        this.f325951g = weakReference;
        this.f325952h = weakReference2;
        this.f325953i = str;
        this.f325954m = str2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        this.f325955n.getClass();
        ((ih3.e) k1Var).Di("link_profile", this.f325949e, this.f325950f, this.f325951g, this.f325952h);
        java.lang.ref.WeakReference weakReference = this.f325951g;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        android.os.Bundle bundle = this.f325950f;
        long j17 = bundle.getLong("msg_id");
        java.lang.String string = bundle.getString("conv_talker_username", null);
        java.lang.String string2 = bundle.getString("send_msg_username", null);
        if (com.tencent.mm.storage.z3.R4(string)) {
            me5.e.e(this.f325955n, (android.content.Context) weakReference.get(), this.f325953i, string, this.f325954m, j17, string2);
        } else {
            me5.e.e(this.f325955n, (android.content.Context) weakReference.get(), this.f325953i, null, this.f325954m, j17, string2);
        }
    }
}
