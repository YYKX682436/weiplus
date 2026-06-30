package z81;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f470690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h91.a f470691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z81.g f470692f;

    public d(z81.g gVar, org.json.JSONArray jSONArray, h91.a aVar) {
        this.f470692f = gVar;
        this.f470690d = jSONArray;
        this.f470691e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg drawCanvasArg = this.f470692f.f470699f;
        this.f470692f.f470699f = null;
        z81.g gVar = this.f470692f;
        gVar.f470698e = this.f470690d;
        gVar.f470708r = true;
        gVar.f470697d = true;
        h91.a aVar = this.f470691e;
        if (aVar != null) {
            aVar.a(drawCanvasArg);
        }
        z81.g gVar2 = this.f470692f;
        if (gVar2.f470707q != 0) {
            java.lang.System.nanoTime();
            gVar2.f470707q = 0L;
        }
    }
}
