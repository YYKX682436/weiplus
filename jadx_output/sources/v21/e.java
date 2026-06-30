package v21;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MediaInfoRptEvent mediaInfoRptEvent = (com.tencent.mm.autogen.events.MediaInfoRptEvent) iEvent;
        if (mediaInfoRptEvent == null) {
            return false;
        }
        am.oj ojVar = mediaInfoRptEvent.f54491g;
        java.lang.String str = ojVar.f7547g;
        try {
            if (str.endsWith(".tmp")) {
                str = str.substring(0, str.lastIndexOf(".tmp"));
                com.tencent.mars.xlog.Log.i("MediaInfoRptEventIListener", "media info event path[%s, %s]", str, ojVar.f7547g);
            }
        } catch (java.lang.Exception unused) {
        }
        gm0.j1.e().j(new t21.g2(str, ojVar.f7548h, ojVar.f7541a, ojVar.f7542b, ojVar.f7543c, ojVar.f7544d, ojVar.f7549i, ojVar.f7545e, ojVar.f7546f, ojVar.f7550j, ojVar.f7551k, ojVar.f7552l));
        return false;
    }
}
