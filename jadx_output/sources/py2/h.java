package py2;

/* loaded from: classes4.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f359075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u26.w f359076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py2.i f359077c;

    public h(android.content.Context context, u26.w wVar, py2.i iVar) {
        this.f359075a = context;
        this.f359076b = wVar;
        this.f359077c = iVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        u26.w wVar = this.f359076b;
        androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) this.f359075a;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = ((um3.b) pf5.z.f353948a.a(activity).a(um3.b.class)).O6();
        try {
            java.lang.String string = ((r45.h51) fVar.f70618d).getString(12);
            if (string == null) {
                string = "";
            }
            return v65.i.b(O6, null, new py2.f(new org.json.JSONObject(string), wVar, null), 1, null);
        } catch (java.lang.Throwable unused) {
            return v65.i.b(O6, null, new py2.g(wVar, this.f359077c, null), 1, null);
        }
    }
}
