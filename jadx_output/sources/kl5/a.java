package kl5;

/* loaded from: classes13.dex */
public class a implements java.text.CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f308973d;

    /* renamed from: e, reason: collision with root package name */
    public final int f308974e;

    /* renamed from: f, reason: collision with root package name */
    public int f308975f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f308976g;

    public a(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f308976g = charSequence;
        this.f308975f = i17;
        this.f308973d = i17;
        this.f308974e = i18;
    }

    @Override // java.text.CharacterIterator
    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i17 = this.f308975f;
        if (i17 == this.f308974e) {
            return (char) 65535;
        }
        return this.f308976g.charAt(i17);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f308975f = this.f308973d;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f308973d;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f308974e;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f308975f;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i17 = this.f308973d;
        int i18 = this.f308974e;
        if (i17 == i18) {
            this.f308975f = i18;
            return (char) 65535;
        }
        int i19 = i18 - 1;
        this.f308975f = i19;
        return this.f308976g.charAt(i19);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i17 = this.f308975f + 1;
        this.f308975f = i17;
        int i18 = this.f308974e;
        if (i17 < i18) {
            return this.f308976g.charAt(i17);
        }
        this.f308975f = i18;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i17 = this.f308975f;
        if (i17 <= this.f308973d) {
            return (char) 65535;
        }
        int i18 = i17 - 1;
        this.f308975f = i18;
        return this.f308976g.charAt(i18);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i17) {
        if (this.f308973d > i17 || i17 > this.f308974e) {
            return current();
        }
        this.f308975f = i17;
        return current();
    }
}
