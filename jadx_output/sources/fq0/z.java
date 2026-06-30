package fq0;

@j95.b
/* loaded from: classes7.dex */
public final class z extends i95.w implements gq0.r {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f265494d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f265495e = new java.util.HashMap();

    public fq0.x Ai(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f265495e.get(id6);
        if (weakReference != null) {
            return (fq0.x) weakReference.get();
        }
        return null;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        ((ku5.t0) ku5.t0.f312615d).q(new fq0.y(this));
    }

    public fq0.x wi(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        java.util.HashMap hashMap = this.f265495e;
        java.lang.String str = frameSet.f265478b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new java.lang.ref.WeakReference(frameSet));
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(str);
        fq0.x xVar = weakReference != null ? (fq0.x) weakReference.get() : null;
        return xVar == null ? frameSet : xVar;
    }
}
