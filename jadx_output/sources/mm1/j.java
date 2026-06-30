package mm1;

/* loaded from: classes11.dex */
public final class j implements um1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.BizAudioFlutterActivity f328669a;

    public j(com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity) {
        this.f328669a = bizAudioFlutterActivity;
    }

    @Override // um1.b
    public void a() {
        int i17 = com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x;
        this.f328669a.finish();
    }

    @Override // um1.b
    public void onAnimationEnd() {
        int i17 = com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x;
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity = this.f328669a;
        bizAudioFlutterActivity.finish();
        bizAudioFlutterActivity.overridePendingTransition(-1, -1);
    }

    @Override // um1.b
    public void onAnimationStart() {
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity = this.f328669a;
        java.lang.String str = bizAudioFlutterActivity.f92466u;
        bizAudioFlutterActivity.Z6();
    }
}
