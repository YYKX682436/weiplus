package fh1;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fh1.z zVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f262552d = zVar;
        this.f262553e = str;
        this.f262554f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.x0 a17 = this.f262552d.a();
        java.lang.String str = this.f262554f;
        if (str == null) {
            str = "";
        }
        a17.N0(this.f262553e, str);
        return jz5.f0.f302826a;
    }
}
