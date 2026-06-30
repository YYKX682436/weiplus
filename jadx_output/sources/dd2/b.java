package dd2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f228953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar) {
        super(1);
        this.f228953d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) this.f228953d.invoke(it);
    }
}
