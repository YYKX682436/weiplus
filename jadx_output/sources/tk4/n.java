package tk4;

/* loaded from: classes5.dex */
public final class n implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f420000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f420001c;

    public n(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic, boolean z17, bw5.d2 d2Var) {
        this.f419999a = tingAudioPushConfigLogic;
        this.f420000b = z17;
        this.f420001c = d2Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        java.lang.Integer num = null;
        byte[] bArr = bVar != null ? bVar.f359533c : null;
        boolean z17 = this.f420000b;
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419999a;
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i(tingAudioPushConfigLogic.f174639a, "ImageLoader net download finish: url = %s outdoor " + z17, str);
        }
        java.lang.String str2 = tingAudioPushConfigLogic.f174639a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ImageLoader getImage finish: url = ");
        sb6.append(str);
        sb6.append(", width = ");
        sb6.append((bVar == null || (bitmap2 = bVar.f359534d) == null) ? null : java.lang.Integer.valueOf(bitmap2.getWidth()));
        sb6.append(", height = ");
        if (bVar != null && (bitmap = bVar.f359534d) != null) {
            num = java.lang.Integer.valueOf(bitmap.getHeight());
        }
        sb6.append(num);
        sb6.append(" outdoor ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        pm0.v.X(new tk4.m(tingAudioPushConfigLogic, this.f420001c, bVar));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
