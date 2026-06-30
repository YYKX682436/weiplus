package wp3;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.plugin.performance.diagnostic.f {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f448389l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f448390m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f448391n;

    public a(com.tencent.mm.plugin.performance.diagnostic.d dVar) {
        super(dVar);
        this.f448389l = dVar.b() + ".$hook";
        this.f448390m = dVar.b() + ".$ignore";
        this.f448391n = dVar.b() + ".$thread";
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.f
    public void a(java.util.Map map) {
        super.a(map);
        java.lang.String str = this.f448389l;
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PthreadHookConfigStg", "ERROR(PthreadHook): hook regex is blank");
            return;
        }
        java.lang.String str3 = this.f448390m;
        java.lang.String str4 = (java.lang.String) map.get(str3);
        java.lang.String str5 = this.f448391n;
        java.lang.String str6 = (java.lang.String) map.get(str5);
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f152921a;
        o4Var.D(str, str2);
        o4Var.D(str3, str4);
        o4Var.D(str5, str6);
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.f
    public long c() {
        return -1L;
    }
}
