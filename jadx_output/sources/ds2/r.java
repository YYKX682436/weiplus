package ds2;

/* loaded from: classes2.dex */
public final class r implements ek4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f242891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242893c;

    public r(ds2.b0 b0Var, java.lang.String str, java.lang.String str2) {
        this.f242891a = b0Var;
        this.f242892b = str;
        this.f242893c = str2;
    }

    @Override // ek4.y
    public void a(int i17, dn.h hVar) {
        com.tencent.mars.xlog.Log.i(this.f242891a.f242859g, "cancel " + this.f242892b + " preload task on Stop " + this.f242893c + ' ' + i17);
    }
}
