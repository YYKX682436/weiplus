package ry5;

/* loaded from: classes13.dex */
public final /* synthetic */ class c$$c implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ry5.c f401718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f401719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f401720c;

    public /* synthetic */ c$$c(ry5.c cVar, android.app.Activity activity, long j17) {
        this.f401718a = cVar;
        this.f401719b = activity;
        this.f401720c = j17;
    }

    public final void a(java.lang.String str) {
        ry5.c cVar = this.f401718a;
        cVar.getClass();
        if (!android.text.TextUtils.isEmpty(str)) {
            wy5.e eVar = new wy5.e();
            eVar.b(str);
            if (cVar.b(eVar, this.f401719b, this.f401720c)) {
                return;
            }
        }
        cVar.c();
    }
}
