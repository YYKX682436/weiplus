package id3;

/* loaded from: classes.dex */
public final class h implements vz.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.i f290918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f290919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290920c;

    public h(id3.i iVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f290918a = iVar;
        this.f290919b = f0Var;
        this.f290920c = h0Var;
    }

    @Override // vz.o1
    public final void d(int i17, java.lang.String str) {
        id3.i iVar = this.f290918a;
        if (i17 == 0) {
            iVar.a(iVar.e());
            return;
        }
        this.f290919b.f310116d = i17;
        if (str == null) {
            str = "";
        }
        this.f290920c.f310123d = str;
        iVar.a(iVar.d(i17, str));
    }
}
