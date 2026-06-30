package mi2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.h f326749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mi2.h hVar, int i17) {
        super(0);
        this.f326749d = hVar;
        this.f326750e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mi2.h hVar = this.f326749d;
        java.lang.String str = hVar.f326756m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set mic setting success micSettingFlag:");
        int i17 = this.f326750e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        zh2.c cVar = hVar.f326753h;
        long j17 = i17;
        if (((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377129d != j17) {
            ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377129d = j17;
            dk2.xa.f234344a.f(cVar.g());
        }
        return jz5.f0.f302826a;
    }
}
