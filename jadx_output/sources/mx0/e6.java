package mx0;

/* loaded from: classes5.dex */
public final class e6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f331953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.u f331955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f331956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f331957i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.q23 f331958m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f331959n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331960o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ byte[] f331961p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ byte[] f331962q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, java.lang.String str, yx0.u uVar, com.tencent.maas.model.time.MJTime mJTime, int i17, r45.q23 q23Var, boolean z17, java.lang.String str2, byte[] bArr, byte[] bArr2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331952d = shootComposingPluginLayout;
        this.f331953e = recordConfigProvider;
        this.f331954f = str;
        this.f331955g = uVar;
        this.f331956h = mJTime;
        this.f331957i = i17;
        this.f331958m = q23Var;
        this.f331959n = z17;
        this.f331960o = str2;
        this.f331961p = bArr;
        this.f331962q = bArr2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.e6(this.f331952d, this.f331953e, this.f331954f, this.f331955g, this.f331956h, this.f331957i, this.f331958m, this.f331959n, this.f331960o, this.f331961p, this.f331962q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.e6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        hu3.q0 loadingDialog;
        java.lang.Integer num;
        hu3.q0 loadingDialog2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        loadingDialog = this.f331952d.getLoadingDialog();
        if (loadingDialog.isShowing()) {
            loadingDialog2 = this.f331952d.getLoadingDialog();
            loadingDialog2.dismiss();
        }
        this.f331952d.f69566z1 = true;
        android.os.Bundle bundle = this.f331953e.M;
        if (bundle != null) {
            bundle.remove("KEY_ORIGIN_MUSIC_PATH");
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331952d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f331953e;
        bu0.c Q0 = shootComposingPluginLayout.Q0(recordConfigProvider, this.f331954f, this.f331955g);
        android.os.Bundle bundle2 = recordConfigProvider.M;
        if (bundle2 != null) {
            bundle2.putString("ShootComposingUI.KEY_ORIGIN_MUSIC_ID", Q0 != null ? Q0.f24487a : null);
        }
        android.os.Bundle bundle3 = recordConfigProvider.M;
        if (bundle3 != null) {
            bundle3.putByteArray("ShootComposingUI.KEY_ORIGIN_MUSIC_INFO", Q0 != null ? Q0.f24488b : null);
        }
        android.os.Bundle bundle4 = recordConfigProvider.M;
        if (bundle4 != null) {
            bundle4.putInt("ShootComposingUI.KEY_MEDIA_EXTRA_MUSIC_SOURCE", (Q0 == null || (num = Q0.f24489c) == null) ? 0 : num.intValue());
        }
        android.os.Bundle bundle5 = recordConfigProvider.M;
        if (bundle5 != null) {
            bundle5.putByteArray("ShootComposingUI.MEDIA_EXTRA_MUSIC", Q0 != null ? Q0.f24490d : null);
        }
        android.os.Bundle bundle6 = this.f331953e.M;
        if (bundle6 != null) {
            com.tencent.maas.model.time.MJTime mJTime = this.f331956h;
            bundle6.putDouble("ShootComposingUI.SHOOT_TEMPLATE_COVER_START_TIME", mJTime != null ? mJTime.toSeconds() : 0.0d);
        }
        return java.lang.Boolean.valueOf(ut3.m.f431182a.i(this.f331952d.getContext(), 292, 0, 0, this.f331953e, this.f331957i, 0, true, this.f331958m, false, this.f331959n, false, this.f331960o, this.f331961p, this.f331962q));
    }
}
