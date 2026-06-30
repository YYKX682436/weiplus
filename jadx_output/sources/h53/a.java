package h53;

/* loaded from: classes8.dex */
public class a implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h53.b f279040a;

    public a(h53.b bVar) {
        this.f279040a = bVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        sd.g gVar;
        h53.b bVar = this.f279040a;
        h53.j jVar = bVar.f279041a;
        jVar.f279058h = h53.i.inited;
        h53.q qVar = jVar.f279056f;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "ready");
        if (!qVar.f279066c) {
            qVar.f279065b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "flush");
            java.util.LinkedList linkedList = qVar.f279067d;
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                gVar = qVar.f279064a;
                if (!hasNext) {
                    break;
                }
                sd.e eVar = (sd.e) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "flush event name: %s, data: %s", eVar.b(), eVar.a());
                gVar.c(eVar);
            }
            linkedList.clear();
            java.util.LinkedList linkedList2 = qVar.f279068e;
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                h53.r rVar = (h53.r) it6.next();
                gVar.h(java.lang.String.format("WxGameJsCoreBridge.invokeEvent(%s,\"%s\")", rVar.f279069a, rVar.f279070b.toString()), null);
            }
            linkedList2.clear();
        }
        bVar.f279041a.b("inited");
    }
}
