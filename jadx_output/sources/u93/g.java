package u93;

/* loaded from: classes.dex */
public class g implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u93.h f425826a;

    public g(u93.h hVar) {
        this.f425826a = hVar;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameDetail", "JsApiOpenGameDetail success");
        map.put("err_msg", "openGameDetail:ok");
        this.f425826a.f143443f.b(map);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        this.f425826a.f143443f.a("openGameDetail:fail, " + map.get("error"));
    }
}
