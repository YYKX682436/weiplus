package mb2;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mb2.c f325337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mb2.c cVar) {
        super(1);
        this.f325337d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.xb1 it = (r45.xb1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("ConfigItem", "[FinderConfigItem] addFinderInitListener");
        mb2.c cVar = this.f325337d;
        cVar.f325339f = it;
        cVar.a();
        yz5.a aVar = cVar.f325335c;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
