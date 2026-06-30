package mb2;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mb2.k f325348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mb2.k kVar) {
        super(1);
        this.f325348d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.xb1 it = (r45.xb1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("ConfigItem", "[ServerExptConfig] addFinderInitListener");
        mb2.k kVar = this.f325348d;
        kVar.a();
        yz5.a aVar = kVar.f325335c;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
