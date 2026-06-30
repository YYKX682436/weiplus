package iy4;

@j95.b
/* loaded from: classes11.dex */
public class e1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public iy4.r0 f295958d;

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(38);
        iy4.r0 r0Var = this.f295958d;
        if (r0Var != null) {
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(r0Var);
            gm0.j1.d().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, r0Var);
        }
    }
}
