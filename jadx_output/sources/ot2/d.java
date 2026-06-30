package ot2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader f348857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f348858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader, int i17) {
        super(0);
        this.f348857d = finderActivitySearchLoader;
        this.f348858e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f348857d.f125678f;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(this.f348858e));
        }
        return jz5.f0.f302826a;
    }
}
