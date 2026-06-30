package t00;

/* loaded from: classes.dex */
public final class a1 implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f414263a = hashCode();

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414344y;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (context == null) {
            com.tencent.mars.xlog.Log.i("OpenMyAddressEcsActionHandler", "context is null");
            callback.a();
        } else {
            c00.w2 w2Var = (c00.w2) i95.n0.c(c00.w2.class);
            ((b30.k) w2Var).Ai(context, this.f414263a, data, new t00.z0(this, data, callback));
        }
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
