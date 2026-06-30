package qp1;

/* loaded from: classes7.dex */
public enum j0 {
    Already_Has,
    Allow,
    Refuse,
    Cancel,
    OverLimit;

    public boolean h() {
        return this == Allow || this == Already_Has;
    }
}
