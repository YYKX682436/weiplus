package mx0;

/* loaded from: classes4.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f332002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, android.content.Context context) {
        super(0);
        this.f332001d = shootComposingPluginLayout;
        this.f332002e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.media.camera.view.control.CameraFocusView cameraFocusView = (com.tencent.mm.media.camera.view.control.CameraFocusView) this.f332001d.findViewById(com.tencent.mm.R.id.res);
        int b17 = i65.a.b(this.f332002e, 120);
        cameraFocusView.c(b17, b17);
        return cameraFocusView;
    }
}
