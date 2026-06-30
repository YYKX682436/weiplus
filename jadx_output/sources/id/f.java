package id;

/* loaded from: classes5.dex */
public final class f implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f290451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id.e f290452b;

    public f(int i17, yz5.p pVar, id.e eVar) {
        this.f290451a = pVar;
        this.f290452b = eVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("LiteAppModule.PocketMoneyHelper", "[onActivityResult] requestCode: " + i17 + " (expected: 50002), resultCode: " + i18);
        if (i17 != 50002) {
            com.tencent.mars.xlog.Log.w("LiteAppModule.PocketMoneyHelper", "[onActivityResult] REQUEST CODE NOT MATCHED, passing through");
            return false;
        }
        com.tencent.mars.xlog.Log.i("LiteAppModule.PocketMoneyHelper", "[onActivityResult] ✅ REQUEST CODE MATCHED!");
        yz5.p pVar = this.f290451a;
        if (pVar != null) {
            pVar.invoke(this.f290452b.f290448a, java.lang.Boolean.FALSE);
        }
        com.tencent.mars.xlog.Log.i("LiteAppModule.PocketMoneyHelper", "[onActivityResult] Callback invoked successfully");
        return true;
    }
}
