package lx;

/* loaded from: classes7.dex */
public final class e2 implements rv.f3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f321740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321741b;

    public e2(lx.i2 i2Var, yz5.l lVar) {
        this.f321740a = i2Var;
        this.f321741b = lVar;
    }

    @Override // rv.f3
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        lx.i2.a(this.f321740a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "editTextCover: result received, filePath=" + str + ", picId=" + str2);
        yz5.l lVar = this.f321741b;
        if (str != null) {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.biz.BizTextCoverEditResult(str, l17, str3, str2, str5, str4, str6))));
        } else {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
    }

    @Override // rv.f3
    public void b(boolean z17) {
    }

    @Override // rv.f3
    public void onCancel() {
        lx.i2.a(this.f321740a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "editTextCover: cancelled by user");
        this.f321741b.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
    }
}
