package m05;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f322583d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f322584e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f322585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f322583d = new java.util.HashMap();
        this.f322584e = new java.util.HashMap();
        this.f322585f = new java.util.HashMap();
    }

    public static /* synthetic */ void S6(m05.p pVar, m05.n nVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerReport");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        pVar.R6(nVar, str);
    }

    public final void O6(java.lang.String key, n05.a options) {
        wu5.b bVar;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(options, "options");
        java.util.HashMap hashMap = this.f322584e;
        n05.a aVar = (n05.a) hashMap.get(key);
        if (aVar != null) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f322585f.get(aVar.f333927e.toString());
            if (weakReference != null && (bVar = (wu5.b) weakReference.get()) != null) {
                bVar.c(false);
            }
        }
        hashMap.put(key, options);
    }

    public final void P6(m05.n reportEvent, n05.a options) {
        kotlin.jvm.internal.o.g(reportEvent, "reportEvent");
        kotlin.jvm.internal.o.g(options, "options");
        java.util.HashMap hashMap = this.f322583d;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(reportEvent);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            hashMap.put(reportEvent, arrayList);
        }
        arrayList.add(options);
    }

    public final void Q6(java.lang.String key) {
        wu5.b bVar;
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f322585f.remove(key);
        if (weakReference == null || (bVar = (wu5.b) weakReference.get()) == null) {
            return;
        }
        bVar.c(false);
    }

    public final void R6(m05.n event, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        switch (event.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f322583d.get(event);
                if (arrayList == null) {
                    return;
                }
                pm0.v.b0(arrayList, new m05.o(event, this));
                return;
            case 6:
                if (str != null) {
                    java.util.HashMap hashMap = this.f322584e;
                    n05.a aVar = (n05.a) hashMap.get(str);
                    if (aVar == null) {
                        return;
                    }
                    ((nh0.i) ((ph0.i) i95.n0.c(ph0.i.class))).wi(aVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        S6(this, m05.n.f322577d, null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        java.util.HashMap hashMap = this.f322585f;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            wu5.b bVar = (wu5.b) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
            if (bVar != null) {
                bVar.c(false);
            }
        }
        hashMap.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        java.util.HashMap hashMap = this.f322585f;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.util.Objects.toString(((java.lang.ref.WeakReference) entry.getValue()).get());
            wu5.b bVar = (wu5.b) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (bVar != null) {
                bVar.c(false);
            }
        }
        hashMap.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        S6(this, m05.n.f322579f, null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        S6(this, m05.n.f322578e, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f322583d = new java.util.HashMap();
        this.f322584e = new java.util.HashMap();
        this.f322585f = new java.util.HashMap();
    }
}
