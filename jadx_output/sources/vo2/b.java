package vo2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo2.c f438557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vo2.c cVar) {
        super(1);
        this.f438557d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        vo2.c cVar = it instanceof vo2.c ? (vo2.c) it : null;
        vo2.c cVar2 = this.f438557d;
        boolean b17 = kotlin.jvm.internal.o.b(cVar, cVar2);
        com.tencent.mars.xlog.Log.i("FinderMusicTPPlayer", "release " + cVar2.hashCode() + ' ' + b17);
        return java.lang.Boolean.valueOf(b17);
    }
}
