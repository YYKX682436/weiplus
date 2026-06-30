package k41;

/* loaded from: classes11.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f303977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j41.w f303978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f303979g;

    public c1(java.lang.String str, boolean z17, j41.w wVar, yz5.a aVar) {
        this.f303976d = str;
        this.f303977e = z17;
        this.f303978f = wVar;
        this.f303979g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        kk.j jVar = k41.h1.f304008e;
        java.lang.Integer num = (java.lang.Integer) ((lt0.f) jVar).i(this.f303976d);
        int intValue = num == null ? 0 : num.intValue();
        if (this.f303977e && intValue >= 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuGetContactService", "checkAddTask getContact exceed limit: %s", this.f303976d);
            j41.w wVar = this.f303978f;
            if (wVar != null) {
                wVar.a(null);
                return;
            }
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new k41.b1(this.f303978f, this.f303976d));
        k41.h1 h1Var = k41.h1.f304007d;
        java.lang.String str = this.f303976d;
        j41.w wVar2 = this.f303978f;
        java.util.HashMap hashMap = k41.h1.f304010g;
        if (((java.util.ArrayList) hashMap.get(str)) == null) {
            hashMap.put(str, new java.util.ArrayList());
        }
        if (wVar2 != null && (arrayList = (java.util.ArrayList) hashMap.get(str)) != null) {
            arrayList.add(wVar2);
        }
        if (k41.h1.f304009f.contains(this.f303976d)) {
            return;
        }
        ((lt0.f) jVar).j(this.f303976d, java.lang.Integer.valueOf(intValue + 1));
        this.f303979g.invoke();
    }
}
