package oa2;

/* loaded from: classes2.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.w f343823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f343824e;

    public l(oa2.w wVar, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.f343823d = wVar;
        this.f343824e = finderContact;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10001) {
            oa2.w wVar = this.f343823d;
            wVar.X6(this.f343824e, false);
            wVar.f343844i = null;
        }
    }
}
