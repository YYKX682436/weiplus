package ju1;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.i f301717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tt f301718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ju1.i iVar, r45.tt ttVar) {
        super(0);
        this.f301717d = iVar;
        this.f301718e = ttVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ju1.i iVar = this.f301717d;
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView = iVar.f301736n;
        if (memberCardTopCropImageView == null) {
            kotlin.jvm.internal.o.o("bgIv");
            throw null;
        }
        memberCardTopCropImageView.f95474e = i65.a.b(memberCardTopCropImageView.getContext(), 32);
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView2 = iVar.f301736n;
        if (memberCardTopCropImageView2 == null) {
            kotlin.jvm.internal.o.o("bgIv");
            throw null;
        }
        memberCardTopCropImageView2.f95473d = iVar.f301729d;
        memberCardTopCropImageView2.getLayoutParams().height = iVar.f301729d;
        if (memberCardTopCropImageView2 == null) {
            kotlin.jvm.internal.o.o("bgIv");
            throw null;
        }
        memberCardTopCropImageView2.setVisibility(0);
        android.widget.ImageView imageView = iVar.f301737o;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("shadowBgIv");
            throw null;
        }
        imageView.setVisibility(0);
        r45.tt ttVar = this.f301718e;
        java.lang.String str = ttVar.f386770i;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = ttVar.f386769h;
            if (!(str2 == null || str2.length() == 0)) {
                if (memberCardTopCropImageView2 == null) {
                    kotlin.jvm.internal.o.o("bgIv");
                    throw null;
                }
                memberCardTopCropImageView2.setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(ttVar.f386769h)));
            }
        } else {
            if (memberCardTopCropImageView2 == null) {
                kotlin.jvm.internal.o.o("bgIv");
                throw null;
            }
            ju1.e.b(memberCardTopCropImageView2, ttVar.f386770i, iVar.f301730e, iVar.f301729d);
        }
        return jz5.f0.f302826a;
    }
}
