package vi2;

/* loaded from: classes3.dex */
public final class f implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final ce2.i f437545d;

    public f(ce2.i giftInfo) {
        kotlin.jvm.internal.o.g(giftInfo, "giftInfo");
        this.f437545d = giftInfo;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f437545d.field_rewardProductId.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
