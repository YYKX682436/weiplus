package g53;

/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f268917a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f268918b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f268919c;

    /* renamed from: d, reason: collision with root package name */
    public static int f268920d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f268921e;

    public static final void a(java.lang.String appId, java.lang.String actId, boolean z17, sd.k page, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(actId, "actId");
        kotlin.jvm.internal.o.g(page, "page");
        f268918b = appId;
        f268919c = actId;
        f268920d = i17;
        f268917a = z17;
        android.content.Context context = page.f406610d;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).getSwipeBackLayout().setEnableGesture(!z17);
        }
        f268921e = new java.lang.ref.WeakReference(page);
    }

    public static final boolean b(sd.k kVar) {
        if (kVar instanceof sd.u0) {
            tw4.b bVar = new tw4.b();
            bVar.f422481b = "userAction";
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("action", "back");
            bVar.f422480a = jSONObject;
            ((sd.u0) kVar).f406655i.c(bVar);
        }
        if (f268920d == 0) {
            return f268917a;
        }
        if (!f268917a || com.tencent.mm.sdk.platformtools.t8.K0(f268918b) || com.tencent.mm.sdk.platformtools.t8.K0(f268919c)) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = f268921e;
        return kotlin.jvm.internal.o.b(kVar, weakReference != null ? (sd.k) weakReference.get() : null);
    }
}
