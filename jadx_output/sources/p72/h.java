package p72;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p72.k f352488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p72.k kVar) {
        super(0);
        this.f352488d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return ((com.tencent.wcdb.core.Database) ((jz5.n) this.f352488d.f352499a).getValue()).getTable("FavDelInfo", up5.d.f429914b);
    }
}
