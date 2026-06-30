package p14;

/* loaded from: classes5.dex */
public class r0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd0.j2 f351246d;

    public r0(com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI, kd0.j2 j2Var) {
        this.f351246d = j2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f351246d);
    }
}
