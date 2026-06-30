package vd0;

/* loaded from: classes8.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f435418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f435420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f435421g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(vd0.l3 l3Var, java.lang.String str, androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435418d = l3Var;
        this.f435419e = str;
        this.f435420f = appCompatActivity;
        this.f435421g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.g3(this.f435418d, this.f435419e, this.f435420f, this.f435421g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vd0.g3 g3Var = (vd0.g3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vd0.l3 l3Var = this.f435418d;
        java.lang.Object obj2 = l3Var.f435460d;
        java.lang.String str = this.f435419e;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f435420f;
        int i17 = this.f435421g;
        synchronized (obj2) {
            l3Var.Zi();
            vd0.y2 y2Var = (vd0.y2) l3Var.f435461e.get(str);
            if (y2Var != null && y2Var.f435541a.get() == appCompatActivity) {
                vd0.l3.Ai(l3Var, y2Var.f435542b, appCompatActivity);
                java.util.HashMap hashMap = l3Var.f435461e;
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(appCompatActivity);
                vd0.c3 searchIndex = y2Var.f435542b;
                int i18 = y2Var.f435543c;
                kotlin.jvm.internal.o.g(searchIndex, "searchIndex");
                hashMap.put(str, new vd0.y2(weakReference, searchIndex, i18));
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingSearchFeatureService", "buildSettingIndex refresh visible only, activityTag=" + str + ", size=" + y2Var.f435542b.f435381a.size());
                l3Var.f435462f = str;
            }
            java.util.HashMap b17 = u24.m.f424129a.b(appCompatActivity);
            u24.j jVar = u24.j.f424125a;
            java.util.Collection values = b17.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            a24.t a17 = jVar.a(kz5.n0.S0(values));
            if (a17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SettingSearchFeatureService", "buildSettingIndex fail: rootNode is null, activityTag=" + str);
            } else {
                l3Var.f435461e.put(str, new vd0.y2(new java.lang.ref.WeakReference(appCompatActivity), vd0.l3.wi(l3Var, a17), i17));
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingSearchFeatureService", "buildSettingIndex create index, activityTag=" + str + ", size=" + b17.size());
                l3Var.f435462f = str;
            }
        }
        return jz5.f0.f302826a;
    }
}
