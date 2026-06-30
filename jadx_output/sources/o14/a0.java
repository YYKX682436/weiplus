package o14;

/* loaded from: classes9.dex */
public class a0 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f342267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI f342268b;

    public a0(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI, long j17) {
        this.f342268b = fixToolsUplogUI;
        this.f342267a = j17;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i17)));
            stringBuffer.append(".");
            stringBuffer.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i18)));
            stringBuffer.append(".");
            stringBuffer.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i19)));
            this.f342268b.f160083i.setText(stringBuffer);
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            stringBuffer2.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i17)));
            stringBuffer2.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i18)));
            stringBuffer2.append(java.lang.String.format("%02d", java.lang.Integer.valueOf(i19)));
            com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s = stringBuffer2.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.FixToolsUplogUI", "uplog choose time maxTime[%d], date[%s]", java.lang.Long.valueOf(this.f342267a), com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s);
        }
    }
}
