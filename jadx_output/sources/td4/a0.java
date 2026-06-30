package td4;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td4.g0 f417630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(td4.g0 g0Var) {
        super(0);
        this.f417630d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
        td4.g0 g0Var = this.f417630d;
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsAlbumAdapterHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.z zVar = new td4.z(g0Var);
        java.lang.String z17 = g0Var.z();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMySelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        boolean b17 = kotlin.jvm.internal.o.b(gm0.j1.u().c().l(2, null), g0Var.z());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMySelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        td4.l0 l0Var = new td4.l0(g0Var.f417667f, zVar, z17, b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsAlbumAdapterHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
        return l0Var;
    }
}
