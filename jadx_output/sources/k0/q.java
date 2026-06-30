package k0;

/* loaded from: classes14.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.m implements yz5.l {
    public q(java.lang.Object obj) {
        super(1, obj, j0.a3.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.receiver;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        int i17 = intValue - 1;
        while (true) {
            if (i17 <= 0) {
                i17 = 0;
                break;
            }
            int i18 = i17 - 1;
            if (charSequence.charAt(i18) == '\n') {
                break;
            }
            i17 = i18;
        }
        return new a2.m1(a2.n1.a(i17, j0.a3.a(charSequence, intValue)));
    }
}
