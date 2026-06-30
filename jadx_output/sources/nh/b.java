package nh;

/* loaded from: classes12.dex */
public final class b extends gi.d1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nh.c f337066b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nh.c cVar, qh.f0 f0Var) {
        super(f0Var, "finderFeed");
        this.f337066b = cVar;
    }

    @Override // gi.d1
    public void a() {
        f(this.f337066b.f337068a);
        b(true, false);
        c();
        e();
        g(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        rh.c1 c1Var = this.f272021a;
        c1Var.H(rh.w1.class, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        c1Var.H(rh.l3.class, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        c1Var.F(oh.b.class);
        c1Var.H(rh.r1.class, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        c1Var.H(oh.c.class, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        c1Var.H(rh.t1.class, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        c1Var.H(oh.f.class, 5000L);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            c1Var.H(rh.c2.class, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        if (pj.h.f354909a) {
            c1Var.H(gi.l.class, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
    }
}
