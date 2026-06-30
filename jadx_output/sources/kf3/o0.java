package kf3;

/* loaded from: classes5.dex */
public class o0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307407d;

    public o0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307407d = massSendHistoryUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.sdk.platformtools.SensorController sensorController = com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.f148525q;
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = this.f307407d;
        massSendHistoryUI.getClass();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jci);
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSendHistoryUI", "showLongClickMenu, not clicking contentArea, position: " + i17);
        } else {
            rl5.r rVar = new rl5.r(massSendHistoryUI.getContext(), view);
            rVar.C = true;
            rVar.f397355y = new kf3.p0(massSendHistoryUI);
            rVar.f397354x = new kf3.s0(massSendHistoryUI, i17);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            rVar.n((iArr[0] + findViewById.getWidth()) / 2, iArr[1]);
        }
        return false;
    }
}
