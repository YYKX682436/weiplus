package z81;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f470693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h91.a f470694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z81.g f470695f;

    public e(z81.g gVar, org.json.JSONArray jSONArray, h91.a aVar) {
        this.f470695f = gVar;
        this.f470693d = jSONArray;
        this.f470694e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z81.g gVar = this.f470695f;
        gVar.f470708r = true;
        if (gVar.f470698e == null) {
            gVar.f470698e = this.f470693d;
        } else {
            for (int i17 = 0; i17 < this.f470693d.length(); i17++) {
                this.f470695f.f470698e.put(this.f470693d.opt(i17));
            }
        }
        this.f470695f.f470697d = true;
        h91.a aVar = this.f470694e;
        if (aVar != null) {
            aVar.a(null);
        }
    }
}
