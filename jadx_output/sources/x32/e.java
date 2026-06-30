package x32;

/* loaded from: classes13.dex */
public class e extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f451603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x32.f f451604b;

    public e(int i17, x32.f fVar) {
        this.f451603a = i17;
        this.f451604b = fVar;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackFailAsync(j17, i17, i18, str, str2, i19, rVar);
        rk0.c.c("LibraryHelper", "download fail. projectId:%s, name:%s, version:%s, errNo:%d, errCode:%d", str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackSuccessAsync(j17, str, str2, i17, rVar);
        rk0.c.c("LibraryHelper", "download success. projectId:%s, name:%s, version:%s", str, str2, java.lang.Integer.valueOf(i17));
        java.util.Map map = x32.g.f451605a;
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(str, str2);
        int i18 = this.f451603a;
        if (Ui == null || i18 != Ui.f217590e) {
            rk0.c.d("LibraryHelper", "download success, but version doesn't match. projectId:%s, name:%s, version:%s, target version:%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            x32.g.a(str, str2, Ui.getPath(), this.f451604b);
        }
    }
}
