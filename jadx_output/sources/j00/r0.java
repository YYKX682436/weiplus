package j00;

/* loaded from: classes5.dex */
public final class r0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j00.h0 f296879a;

    public r0(j00.h0 h0Var) {
        this.f296879a = h0Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "loadImageInternal, start load:" + str);
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadImageInternal, load bitmap finish, url:");
        sb6.append(str);
        sb6.append(", status:");
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f359531a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", sb6.toString());
        android.graphics.Bitmap bitmap = bVar != null ? bVar.f359534d : null;
        if (str == null) {
            str = "";
        }
        ((j00.q0) this.f296879a).a(bitmap, str);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
