package yw2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.f f466629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yw2.f fVar) {
        super(0);
        this.f466629d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObj = this.f466629d.h().getFeedObj();
        return java.lang.Long.valueOf(feedObj != null ? feedObj.getId() : 0L);
    }
}
