package cy1;

/* loaded from: classes9.dex */
public final /* synthetic */ class a$$c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy1.a f224706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iy1.a f224707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f224708f;

    public /* synthetic */ a$$c(cy1.a aVar, iy1.a aVar2, int i17) {
        this.f224706d = aVar;
        this.f224707e = aVar2;
        this.f224708f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cy1.a aVar = this.f224706d;
        aVar.getClass();
        int i17 = this.f224707e.f295747d;
        sy1.f fVar = aVar.f224690m;
        java.util.List e17 = fVar.e();
        java.util.Map map = fVar.f413859n;
        if (this.f224708f == 1) {
            java.util.ArrayList arrayList = (java.util.ArrayList) e17;
            if (arrayList.size() - 2 >= 0) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), (java.lang.String) arrayList.get(arrayList.size() - 2));
            }
        } else {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) e17;
            if (arrayList2.size() - 1 >= 0) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), (java.lang.String) arrayList2.get(arrayList2.size() - 1));
            }
        }
        java.util.Map map2 = fVar.f413858m;
        ((java.util.HashMap) map2).put(java.lang.Integer.valueOf(i17), i17 + "-" + java.lang.System.currentTimeMillis());
    }
}
