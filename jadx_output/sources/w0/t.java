package w0;

/* loaded from: classes10.dex */
public final class t implements w0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.u f441860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f441862c;

    public t(w0.u uVar, java.lang.String str, yz5.a aVar) {
        this.f441860a = uVar;
        this.f441861b = str;
        this.f441862c = aVar;
    }

    public void a() {
        w0.u uVar = this.f441860a;
        java.util.Map map = uVar.f441865c;
        java.lang.String str = this.f441861b;
        java.util.List list = (java.util.List) map.remove(str);
        if (list != null) {
            list.remove(this.f441862c);
        }
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        uVar.f441865c.put(str, list);
    }
}
