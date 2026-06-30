package zn0;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f474341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f474342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f474343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f474344i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f474345m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        super(2);
        this.f474339d = i17;
        this.f474340e = i18;
        this.f474341f = i19;
        this.f474342g = i27;
        this.f474343h = i28;
        this.f474344i = i29;
        this.f474345m = i37;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.trtc.TRTCCloudDef.TRTCMixUser _mixUser = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(_mixUser, "_mixUser");
        _mixUser.zOrder = intValue + 1;
        int i17 = this.f474339d;
        int i18 = this.f474340e;
        _mixUser.f215699x = ((i17 - i18) - this.f474341f) - this.f474342g;
        int i19 = this.f474344i;
        int i27 = this.f474345m;
        _mixUser.f215700y = this.f474343h + ((i19 + i27) * intValue);
        _mixUser.width = i18;
        _mixUser.height = i27;
        return jz5.f0.f302826a;
    }
}
