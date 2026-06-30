package o14;

/* loaded from: classes12.dex */
public class b0 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f342270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f342271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI f342272c;

    public b0(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI, boolean z17, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f342272c = fixToolsUplogUI;
        this.f342270a = z17;
        this.f342271b = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = this.f342270a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FixToolsUplogUI", "Picked hour: %s, %s, %s, %s", valueOf, obj, obj2, java.lang.Boolean.valueOf(z18));
        if (z17) {
            if (z18) {
                com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160077t = (java.lang.String) obj;
            } else {
                com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160078u = (java.lang.String) obj;
            }
            com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI = this.f342272c;
            java.util.ArrayList arrayList = fixToolsUplogUI.f160088q;
            int indexOf = arrayList.indexOf(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160077t);
            java.util.ArrayList arrayList2 = fixToolsUplogUI.f160089r;
            int indexOf2 = arrayList2.indexOf(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160078u);
            if (indexOf < 0 || indexOf2 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FixToolsUplogUI", "index of hours < 0! %s, %s", java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(indexOf2));
            }
            if (indexOf > indexOf2) {
                if (z18) {
                    com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160078u = (java.lang.String) arrayList2.get(indexOf);
                } else {
                    com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160077t = (java.lang.String) arrayList.get(indexOf2);
                }
            }
            fixToolsUplogUI.f160084m.setText(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160077t);
            fixToolsUplogUI.f160085n.setText(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160078u);
        }
        this.f342271b.d();
    }
}
