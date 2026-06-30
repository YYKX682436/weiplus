package xe2;

/* loaded from: classes3.dex */
public final class h0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453866c = "LiveGiftMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        q26.n i17 = q26.h0.i(kz5.n0.J(msgList), new xe2.g0(this));
        com.tencent.mars.xlog.Log.i(this.f453866c, "#dealWithMsgList after filter self giftMsgList.size=" + q26.h0.f(i17));
        ((ku5.t0) ku5.t0.f312615d).h(new xe2.f0(this.f445267a.f272475i, i17, this), "LiveGiftMsgInterceptor");
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20009};
    }
}
