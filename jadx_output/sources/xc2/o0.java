package xc2;

/* loaded from: classes2.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f453219a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f453220b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f453221c;

    /* renamed from: d, reason: collision with root package name */
    public int f453222d = com.tencent.mm.R.raw.icons_filled_link;

    /* renamed from: e, reason: collision with root package name */
    public int f453223e = com.tencent.mm.R.color.f478502m;

    public boolean a() {
        java.lang.CharSequence charSequence = this.f453219a;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return false;
        }
        java.lang.CharSequence charSequence2 = this.f453220b;
        return charSequence2 == null || charSequence2.length() == 0;
    }

    public final void b(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        java.lang.CharSequence charSequence = this.f453219a;
        if (charSequence == null || charSequence.length() == 0) {
            java.lang.CharSequence charSequence2 = this.f453220b;
            if (charSequence2 == null || charSequence2.length() == 0) {
                java.lang.String wording = jumpInfo.getWording();
                if (!(wording == null || wording.length() == 0)) {
                    this.f453219a = jumpInfo.getWording();
                }
            }
        }
        java.lang.String str = this.f453221c;
        if (str == null || str.length() == 0) {
            java.lang.String icon_url = jumpInfo.getIcon_url();
            if (icon_url == null || icon_url.length() == 0) {
                return;
            }
            this.f453221c = jumpInfo.getIcon_url();
        }
    }
}
