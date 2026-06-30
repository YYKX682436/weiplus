package sk4;

/* loaded from: classes.dex */
public final class n implements com.tencent.mm.ui.yc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f408986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sk4.p f408987b;

    public n(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, sk4.p pVar) {
        this.f408986a = mMFragmentActivity;
        this.f408987b = pVar;
    }

    @Override // com.tencent.mm.ui.yc
    public void a(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 == 80) {
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f408986a;
            mMFragmentActivity.unregisterMMOnRequestPermissionsResult(this);
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            this.f408987b.getClass();
            pm0.v.X(new sk4.j(mMFragmentActivity));
        }
    }
}
