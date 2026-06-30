package mz2;

/* loaded from: classes9.dex */
public class c1 implements mz2.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz2.d1 f333095a;

    public c1(mz2.d1 d1Var, mz2.y0 y0Var) {
        this.f333095a = d1Var;
    }

    @Override // mz2.b2
    public void a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new mz2.b1(this, str));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new mz2.a1(this));
            com.tencent.mars.xlog.Log.e("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback rsaKey is empty!");
        }
    }
}
