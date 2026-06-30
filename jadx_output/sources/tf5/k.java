package tf5;

/* loaded from: classes3.dex */
public final class k implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f418998a;

    public k(android.content.Context context) {
        this.f418998a = context;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        tf5.m mVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = this.f418998a;
        if (context == null) {
            mVar = null;
        } else {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            mVar = (tf5.m) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(tf5.m.class);
        }
        if (mVar != null) {
            hashMap.put("page_sessionid", java.lang.Long.valueOf(mVar.f419003d));
        }
        return hashMap;
    }
}
