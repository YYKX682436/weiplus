package k55;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f304460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k55.b f304462f;

    public a(k55.b bVar, java.lang.Object[] objArr, java.lang.String str) {
        this.f304462f = bVar;
        this.f304460d = objArr;
        this.f304461e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f304460d;
        k55.b bVar = this.f304462f;
        bVar.f304463d.b(bVar, this.f304461e, bVar.d(objArr));
    }
}
