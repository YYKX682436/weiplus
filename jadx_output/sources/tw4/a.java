package tw4;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        java.lang.String string2 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.util.LinkedList b17 = com.tencent.mm.plugin.webview.luggage.u1.b();
        tw4.b bVar = new tw4.b();
        bVar.f422481b = string;
        try {
            bVar.f422480a = new org.json.JSONObject(string2);
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                ((sd.u0) it.next()).f406655i.c(bVar);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
