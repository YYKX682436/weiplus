package d00;

/* loaded from: classes7.dex */
public final class a implements d00.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f225251a;

    public a(java.util.LinkedList featureList) {
        kotlin.jvm.internal.o.g(featureList, "featureList");
        this.f225251a = featureList;
    }

    @Override // d00.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean a(java.util.Map input) {
        kotlin.jvm.internal.o.g(input, "input");
        boolean z17 = false;
        if (!input.isEmpty()) {
            java.util.Iterator it = this.f225251a.iterator();
            while (it.hasNext()) {
                bw5.w7 w7Var = (bw5.w7) it.next();
                int i17 = w7Var.f34597d;
                java.lang.String valueOf = java.lang.String.valueOf(w7Var.f34598e);
                com.tencent.mars.xlog.Log.i("CheckFeatureVersionTask", "feature list -> " + w7Var);
                if (input.containsKey(java.lang.Integer.valueOf(i17))) {
                    java.lang.Object obj = input.get(java.lang.Integer.valueOf(i17));
                    kotlin.jvm.internal.o.d(obj);
                    java.lang.String str = (java.lang.String) obj;
                    com.tencent.mars.xlog.Log.i("CheckFeatureVersionTask", "hy: got record version " + str + ", minVersion " + valueOf);
                    if (com.tencent.mm.sdk.platformtools.b8.a(str) < com.tencent.mm.sdk.platformtools.b8.a(valueOf)) {
                        com.tencent.mars.xlog.Log.i("CheckFeatureVersionTask", "The minimum running version of the mini program is smaller than the required minimum version, force pull");
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("CheckFeatureVersionTask", "The local feature does not contain the features required by the server, force pull");
                }
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("CheckFeatureVersionTask", "server feature list is null, don't force pull");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
