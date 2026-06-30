package w6;

/* loaded from: classes12.dex */
public final class s0 implements java.lang.Appendable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Appendable f443207d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443208e = true;

    public s0(java.lang.Appendable appendable) {
        this.f443207d = appendable;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(char c17) {
        boolean z17 = this.f443208e;
        java.lang.Appendable appendable = this.f443207d;
        if (z17) {
            this.f443208e = false;
            appendable.append("  ");
        }
        this.f443208e = c17 == '\n';
        appendable.append(c17);
        return this;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence, int i17, int i18) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z17 = this.f443208e;
        java.lang.Appendable appendable = this.f443207d;
        boolean z18 = false;
        if (z17) {
            this.f443208e = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i18 - 1) == '\n') {
            z18 = true;
        }
        this.f443208e = z18;
        appendable.append(charSequence, i17, i18);
        return this;
    }
}
