package i55;

/* loaded from: classes8.dex */
public final class n extends vp1.d implements up1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i55.n f288865a = new i55.n();

    @Override // up1.a
    public void A(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        kotlin.jvm.internal.o.g(fragmentRecord, "fragmentRecord");
    }

    @Override // up1.a
    public void C(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void D(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        kotlin.jvm.internal.o.g(fragmentRecord, "fragmentRecord");
    }

    @Override // up1.a
    public void E(java.util.List activityRecordList, boolean z17) {
        kotlin.jvm.internal.o.g(activityRecordList, "activityRecordList");
    }

    @Override // up1.a
    public void F(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        e55.m mVar = e55.m.f249681a;
        java.lang.String str = activityRecord.f374086e;
        int i17 = activityRecord.f374089h;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.n3 g17 = mVar.g();
            android.os.Message obtainMessage = mVar.g().obtainMessage();
            obtainMessage.what = 1008;
            obtainMessage.obj = nm5.j.d(str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            g17.sendMessage(obtainMessage);
            return;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("page_name", str);
        bundle.putInt("page_hash_code", i17);
        bundle.putLong("event_time", j17);
        bundle.putString("page_event", "app_out");
        com.tencent.mm.ipcinvoker.d0.d(str2, bundle, e55.i.class, null);
    }

    @Override // up1.b
    public void a(androidx.fragment.app.Fragment fragment, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        e55.m.f249681a.j(fragment);
    }

    @Override // up1.b
    public void b(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        e55.m mVar = e55.m.f249681a;
        if (e55.e.f249667a.m(activity.getClass().getSimpleName())) {
            mVar.m();
        }
    }

    @Override // up1.a
    public void c(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void d(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void e(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void f(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        kotlin.jvm.internal.o.g(fragmentRecord, "fragmentRecord");
    }

    @Override // up1.a
    public void g(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void h(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        e55.m mVar = e55.m.f249681a;
        java.lang.String str = activityRecord.f374086e;
        int i17 = activityRecord.f374089h;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.n3 g17 = mVar.g();
            android.os.Message obtainMessage = mVar.g().obtainMessage();
            obtainMessage.what = 1007;
            obtainMessage.obj = nm5.j.d(str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            g17.sendMessage(obtainMessage);
            return;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("page_name", str);
        bundle.putInt("page_hash_code", i17);
        bundle.putLong("event_time", j17);
        bundle.putString("page_event", "app_in");
        com.tencent.mm.ipcinvoker.d0.d(str2, bundle, e55.i.class, null);
    }

    @Override // up1.a
    public void j(r45.f83 f83Var, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(intent, "intent");
    }

    @Override // up1.a
    public void m(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.b
    public void n(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        e55.m.f249681a.k(activity);
    }

    @Override // up1.a
    public void o(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void q(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.b
    public void r(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        e55.m.f249681a.j(activity);
    }

    @Override // up1.a
    public void s(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.b
    public void v(androidx.fragment.app.Fragment fragment, java.lang.String vasName, java.lang.String vasSimpleName, boolean z17, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(vasName, "vasName");
        kotlin.jvm.internal.o.g(vasSimpleName, "vasSimpleName");
        e55.m.f249681a.k(fragment);
    }

    @Override // up1.b
    public void w(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        e55.m mVar = e55.m.f249681a;
        com.tencent.mm.sdk.platformtools.n3 g17 = mVar.g();
        android.os.Message obtainMessage = mVar.g().obtainMessage();
        obtainMessage.what = 1002;
        obtainMessage.obj = nm5.j.c(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), activity);
        g17.sendMessage(obtainMessage);
        if (e55.e.f249667a.m(activity.getClass().getSimpleName())) {
            mVar.n();
        }
    }

    @Override // up1.a
    public void x(r45.f83 fromActivityRecord, r45.f83 toActivityRecord, boolean z17, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fromActivityRecord, "fromActivityRecord");
        kotlin.jvm.internal.o.g(toActivityRecord, "toActivityRecord");
    }
}
