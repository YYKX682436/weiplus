package fk2;

/* loaded from: classes3.dex */
public final class q2 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f263459a;

    public q2(dk2.zf zfVar) {
        this.f263459a = zfVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        int i17;
        java.lang.Object D = this.f263459a.D();
        kotlin.jvm.internal.o.e(D, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgSendRedPacketInfo");
        if (android.text.TextUtils.isEmpty(((r45.ak1) D).getString(3))) {
            ml2.e5 e5Var = ml2.e5.f327389e;
            i17 = 1;
        } else {
            ml2.e5 e5Var2 = ml2.e5.f327389e;
            i17 = 2;
        }
        return kz5.b1.e(new jz5.l("cur_red_packet_source", java.lang.Integer.valueOf(i17)));
    }
}
