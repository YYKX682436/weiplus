package ui1;

/* loaded from: classes7.dex */
public class h implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ui1.t f428056c;

    public h(ui1.t tVar, java.lang.String str, java.lang.String str2) {
        this.f428056c = tVar;
        this.f428054a = str;
        this.f428055b = str2;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        ui1.t.f428082d.f(this.f428054a, this.f428055b);
        ui1.r rVar = this.f428056c.f428083a;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = obj == null ? "" : obj.toString();
        rVar.b(java.lang.String.format(locale, "cgi failed %s", objArr));
    }
}
