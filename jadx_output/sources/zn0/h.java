package zn0;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, int i18) {
        super(1);
        this.f474349d = i17;
        this.f474350e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.trtc.TRTCCloudDef.TRTCMixUser _mixUser = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) obj;
        kotlin.jvm.internal.o.g(_mixUser, "_mixUser");
        _mixUser.f215699x = 0;
        _mixUser.f215700y = 0;
        _mixUser.width = this.f474349d;
        _mixUser.height = this.f474350e;
        _mixUser.zOrder = 0;
        return jz5.f0.f302826a;
    }
}
