package rx2;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f400998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.text.Spannable spannable) {
        super(2);
        this.f400998d = spannable;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        this.f400998d.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo)), intValue, intValue2, 17);
        return jz5.f0.f302826a;
    }
}
