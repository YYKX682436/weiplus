package id3;

/* loaded from: classes.dex */
public final class d implements vz.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.e f290914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f290915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290916c;

    public d(id3.e eVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f290914a = eVar;
        this.f290915b = f0Var;
        this.f290916c = h0Var;
    }

    @Override // vz.o1
    public final void d(int i17, java.lang.String str) {
        id3.e eVar = this.f290914a;
        if (i17 == 0) {
            eVar.a(eVar.e());
            return;
        }
        this.f290915b.f310116d = i17;
        if (str == null) {
            str = "";
        }
        this.f290916c.f310123d = str;
        eVar.a(eVar.d(i17, str));
    }
}
