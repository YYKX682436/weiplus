package ey2;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f257341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17) {
        super(1);
        this.f257341d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getItemId() == this.f257341d);
    }
}
