package lf5;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f318528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.text.SpannableString spannableString) {
        super(2);
        this.f318528d = spannableString;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.text.style.ImageSpan[] imageSpanArr = (android.text.style.ImageSpan[]) this.f318528d.getSpans(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), android.text.style.ImageSpan.class);
        kotlin.jvm.internal.o.d(imageSpanArr);
        return java.lang.Boolean.valueOf(!(imageSpanArr.length == 0));
    }
}
