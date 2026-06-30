package mm2;

/* loaded from: classes3.dex */
public final class g5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public double f329089f;

    /* renamed from: g, reason: collision with root package name */
    public r45.p52 f329090g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f329091h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f329092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    public final void N6() {
        r45.kf5 kf5Var = ((mm2.o4) business(mm2.o4.class)).U.f377132g;
        if (kf5Var == null) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
        } else if (kf5Var.f378658f == 0 || kf5Var.f378656d == 0) {
            ((mm2.o4) business(mm2.o4.class)).U.f377132g = null;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            com.tencent.mars.xlog.Log.i("LivePayMicSlice", "checkPaySettingValid reset");
        }
    }

    public final void O6(r45.wz1 micInfo) {
        kotlin.jvm.internal.o.g(micInfo, "micInfo");
        r45.p52 p52Var = (r45.p52) micInfo.getCustom(17);
        if (p52Var != null) {
            this.f329090g = p52Var;
        }
        if (!(micInfo.getDouble(18) == 0.0d)) {
            this.f329089f = micInfo.getDouble(18);
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) micInfo.getCustom(19);
        if (finderJumpInfo != null) {
            this.f329091h = finderJumpInfo;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) micInfo.getCustom(21);
        if (finderJumpInfo2 != null) {
            this.f329092i = finderJumpInfo2;
        }
    }
}
