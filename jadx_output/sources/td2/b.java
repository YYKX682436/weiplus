package td2;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public td2.a f417626d;

    /* renamed from: e, reason: collision with root package name */
    public final td2.a[] f417627e;

    /* renamed from: f, reason: collision with root package name */
    public td2.c f417628f;

    public b() {
        td2.a aVar = td2.a.f417624m;
        this.f417626d = aVar;
        this.f417627e = new td2.a[]{td2.a.f417618d, td2.a.f417619e, td2.a.f417620f, aVar};
    }

    public final void D0(final com.tencent.mm.ui.MMFragmentActivity activity, final td2.c cVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Finder.EventObserver", "life " + activity + ' ' + this);
        td2.c cVar2 = new td2.c() { // from class: com.tencent.mm.plugin.finder.life.SupportLifecycle$life$1
            @Override // td2.c
            public void onCreate(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                td2.b.this.f417626d = td2.a.f417618d;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.onCreate(var1);
                }
            }

            @Override // td2.c
            public void onDestroy(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                td2.a aVar = td2.a.f417623i;
                td2.b bVar = td2.b.this;
                bVar.f417626d = aVar;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.onDestroy(var1);
                }
                td2.c cVar4 = bVar.f417628f;
                if (cVar4 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("auto life remove ");
                    com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity;
                    sb6.append(mMFragmentActivity);
                    sb6.append(" this");
                    sb6.append(bVar);
                    com.tencent.mars.xlog.Log.i("Finder.EventObserver", sb6.toString());
                    mMFragmentActivity.mo133getLifecycle().c(cVar4);
                    bVar.f417628f = null;
                }
            }

            @Override // td2.c
            public void onPause(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                td2.a aVar = td2.a.f417621g;
                td2.b bVar = td2.b.this;
                bVar.f417626d = aVar;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.onPause(var1);
                }
                java.util.Objects.toString(activity);
                java.util.Objects.toString(bVar);
            }

            @Override // td2.c
            public void onResume(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                td2.a aVar = td2.a.f417620f;
                td2.b bVar = td2.b.this;
                bVar.f417626d = aVar;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.onResume(var1);
                }
                java.util.Objects.toString(activity);
                java.util.Objects.toString(bVar);
            }

            @Override // td2.c
            public void onStart(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                td2.b.this.f417626d = td2.a.f417619e;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.onStart(var1);
                }
            }

            @Override // td2.c
            public void onStop(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                td2.b.this.f417626d = td2.a.f417622h;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.onStop(var1);
                }
            }
        };
        this.f417628f = cVar2;
        activity.mo133getLifecycle().a(cVar2);
    }
}
