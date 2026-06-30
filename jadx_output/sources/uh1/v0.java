package uh1;

/* loaded from: classes7.dex */
public class v0 implements vh1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.d f427911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uh1.x0 f427912c;

    public v0(uh1.x0 x0Var, java.lang.String str, uh1.d dVar) {
        this.f427912c = x0Var;
        this.f427910a = str;
        this.f427911b = dVar;
    }

    @Override // vh1.a
    public void a(org.json.JSONObject jSONObject) {
        this.f427911b.a(jSONObject);
    }

    @Override // vh1.a
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        uh1.x0.a(this.f427912c, this.f427910a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f427912c.f427927h) {
            arrayList.addAll((java.util.Collection) ((java.util.Hashtable) this.f427912c.f427927h).get(str3));
            ((java.util.Hashtable) this.f427912c.f427927h).remove(str3);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((uh1.d) it.next()).c(0, str2, str, i17, j17, map);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "download success! filename %s, url %s", str, str3);
    }

    @Override // vh1.a
    public void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "download start! filename %s, url %s", str, str2);
    }

    @Override // vh1.a
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPreloadNetworkDownload", "download error! filename %s, url %s", str, str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f427912c.f427927h) {
            arrayList.addAll((java.util.Collection) ((java.util.Hashtable) this.f427912c.f427927h).get(str2));
            ((java.util.Hashtable) this.f427912c.f427927h).remove(str2);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((uh1.d) it.next()).d(-1, str3, i17);
        }
        uh1.x0.a(this.f427912c, this.f427910a);
    }

    @Override // vh1.a
    public void e(java.lang.String str) {
        this.f427912c.f427925f.remove(str);
    }

    @Override // vh1.a
    public void f(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f427912c.f427927h).get(str2)).iterator();
        while (it.hasNext()) {
            ((uh1.d) it.next()).b(i17, j17, j18);
        }
    }
}
