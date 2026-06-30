package nw4;

/* loaded from: classes.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340880e;

    public m0(nw4.n nVar, java.lang.String str) {
        this.f340880e = nVar;
        this.f340879d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.y2 y2Var = new nw4.y2();
        java.util.HashMap hashMap = new java.util.HashMap();
        y2Var.f340790a = hashMap;
        hashMap.put(dm.i4.COL_USERNAME, this.f340879d);
        y2Var.f341014d = new org.json.JSONObject();
        y2Var.f341012b = "call";
        y2Var.f341013c = "";
        y2Var.f341019i = com.google.android.gms.common.Scopes.PROFILE;
        nw4.n nVar = this.f340880e;
        nVar.f340891e.add(y2Var);
        nVar.l();
    }
}
