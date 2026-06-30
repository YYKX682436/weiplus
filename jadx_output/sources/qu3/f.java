package qu3;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f366823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f366825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, java.util.List list) {
        super(1);
        this.f366823d = r6Var;
        this.f366824e = str;
        this.f366825f = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jsonObject = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        java.lang.String o17 = new com.tencent.mm.vfs.r6(this.f366823d, jsonObject.optString("icon")).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String optString = jsonObject.optString(this.f366824e);
        kotlin.jvm.internal.o.d(optString);
        this.f366825f.add(new qu3.e(o17, optString));
        return jz5.f0.f302826a;
    }
}
