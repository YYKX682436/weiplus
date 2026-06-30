package o26;

/* loaded from: classes15.dex */
public final class b extends o26.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f342599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f342600b;

    public b(yz5.l lVar, boolean[] zArr) {
        this.f342599a = lVar;
        this.f342600b = zArr;
    }

    @Override // o26.e
    public java.lang.Object a() {
        return java.lang.Boolean.valueOf(this.f342600b[0]);
    }

    @Override // o26.e
    public boolean b(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) this.f342599a.invoke(obj)).booleanValue();
        boolean[] zArr = this.f342600b;
        if (booleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }
}
