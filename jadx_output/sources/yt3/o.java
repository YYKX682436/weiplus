package yt3;

/* loaded from: classes10.dex */
public final class o implements wu3.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.p f465557a;

    public o(yt3.p pVar) {
        this.f465557a = pVar;
    }

    public void a(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font) {
        kotlin.jvm.internal.o.g(font, "font");
        yt3.p pVar = this.f465557a;
        pVar.f465576e.setShow(false);
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                pVar.f465577f.setVisibility(8);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence);
                bundle.putInt("PARAM_EDIT_TEXT_COLOR", i17);
                bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
                pVar.f465575d.w(ju3.c0.M, bundle);
            }
        }
        pVar.f465577f.setVisibility(0);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence);
        bundle2.putInt("PARAM_EDIT_TEXT_COLOR", i17);
        bundle2.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
        pVar.f465575d.w(ju3.c0.M, bundle2);
    }
}
