package hr3;

/* loaded from: classes9.dex */
public class d6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f283472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283473e;

    public d6(hr3.t6 t6Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f283473e = t6Var;
        this.f283472d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().q(536, this.f283473e);
        com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent();
        am.y4 y4Var = exDeviceBindHardDeviceEvent.f54112g;
        y4Var.f8432c = 2;
        y4Var.f8433d = this.f283472d;
        exDeviceBindHardDeviceEvent.e();
    }
}
