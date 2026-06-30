package vm1;

/* loaded from: classes.dex */
public final class h implements sm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm1.i f438012a;

    public h(vm1.i iVar) {
        this.f438012a = iVar;
    }

    @Override // sm1.a
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizAudioCommentPlugin", "onFooterShowEnd footerHeight: " + i17);
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f438012a.f438014d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(2L, i17, vm1.f.f438006d);
        }
    }

    @Override // sm1.a
    public void b() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f438012a.f438014d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(3L, 0L, vm1.e.f438002d);
        }
    }

    @Override // sm1.a
    public void c() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f438012a.f438014d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(6L, 0L, vm1.b.f437983d);
        }
    }

    @Override // sm1.a
    public void d() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f438012a.f438014d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(5L, 0L, vm1.c.f437989d);
        }
    }

    @Override // sm1.a
    public void e(int i17) {
    }

    @Override // sm1.a
    public void f() {
    }

    @Override // sm1.a
    public void g() {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f438012a.f438014d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(4L, 0L, vm1.d.f437997d);
        }
    }

    @Override // sm1.a
    public void h(int i17) {
        com.tencent.pigeon.ting.TingMusicCommentCallBack tingMusicCommentCallBack = this.f438012a.f438014d;
        if (tingMusicCommentCallBack != null) {
            tingMusicCommentCallBack.onCommentInputViewShow(1L, i17, vm1.g.f438007d);
        }
    }
}
