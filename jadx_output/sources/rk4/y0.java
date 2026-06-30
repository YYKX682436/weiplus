package rk4;

/* loaded from: classes.dex */
public final class y0 implements yk4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.a1 f397091a;

    public y0(rk4.a1 a1Var) {
        this.f397091a = a1Var;
    }

    @Override // yk4.a
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterTingCommentPlugin", "onFooterShowEnd footerHeight: " + i17);
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f397091a.f396529d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(2L, i17, rk4.w0.f397034d);
        }
    }

    @Override // yk4.a
    public void b() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f397091a.f396529d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(3L, 0L, rk4.v0.f397014d);
        }
    }

    @Override // yk4.a
    public void c() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f397091a.f396529d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(6L, 0L, rk4.s0.f396961d);
        }
    }

    @Override // yk4.a
    public void d() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f397091a.f396529d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(5L, 0L, rk4.t0.f396973d);
        }
    }

    @Override // yk4.a
    public void e(int i17) {
    }

    @Override // yk4.a
    public void f() {
    }

    @Override // yk4.a
    public void g() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f397091a.f396529d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(4L, 0L, rk4.u0.f396999d);
        }
    }

    @Override // yk4.a
    public void h(int i17) {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f397091a.f396529d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(1L, i17, rk4.x0.f397066d);
        }
    }
}
