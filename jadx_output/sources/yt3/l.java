package yt3;

/* loaded from: classes10.dex */
public final class l implements wu3.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.m f465520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f465521b;

    public l(yt3.m mVar, ju3.d0 d0Var) {
        this.f465520a = mVar;
        this.f465521b = d0Var;
    }

    @Override // wu3.a1
    public void a(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font) {
        kotlin.jvm.internal.o.g(font, "font");
        yt3.m mVar = this.f465520a;
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                android.os.Bundle bundle = new android.os.Bundle();
                int mode = mVar.f465532g.getMode();
                ju3.d0 d0Var = this.f465521b;
                if (mode == 0) {
                    bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence.toString());
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR", i17);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
                    bundle.putString("PARAM_EDIT_TEXT_FONT", font);
                    d0Var.w(ju3.c0.f301867J, bundle);
                } else if (mode == 2) {
                    r45.is isVar = mVar.f465534i;
                    byte[] bytes = charSequence.toString().getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    isVar.f377297d = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
                    bundle.putByteArray("PARAM_1_BYTEARRAY", mVar.f465534i.toByteArray());
                    bundle.putLong("PARAM_1_LONG", mVar.f465534i.f377298e);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR", i17);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
                    bundle.putString("PARAM_EDIT_TEXT_FONT", font);
                    d0Var.w(ju3.c0.f301906u2, bundle);
                }
                mVar.f465532g.setShow(false);
                return;
            }
        }
        mVar.f465532g.setShow(false);
    }

    @Override // wu3.a1
    public void onCancel() {
        yt3.m mVar = this.f465520a;
        mVar.f465532g.setShow(false);
        int mode = mVar.f465532g.getMode();
        ju3.d0 d0Var = this.f465521b;
        if (mode == 0) {
            ju3.d0.k(d0Var, ju3.c0.f301913x1, null, 2, null);
            ju3.d0.k(d0Var, ju3.c0.L, null, 2, null);
        } else {
            if (mode != 2) {
                return;
            }
            ju3.d0.k(d0Var, ju3.c0.f301910w2, null, 2, null);
        }
    }
}
