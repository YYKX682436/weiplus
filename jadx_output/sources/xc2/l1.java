package xc2;

/* loaded from: classes2.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f453199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f453198d = context;
        this.f453199e = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xc2.y2.f453343a.t0(this.f453198d, this.f453199e.getFeedObject());
        return jz5.f0.f302826a;
    }
}
