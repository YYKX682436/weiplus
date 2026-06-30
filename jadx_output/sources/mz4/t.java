package mz4;

/* loaded from: classes12.dex */
public class t implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f333350d;

    /* renamed from: e, reason: collision with root package name */
    public int f333351e;

    public t(int i17, int i18) {
        this.f333350d = i17;
        this.f333351e = i18;
        if (i17 > i18) {
            this.f333351e = i17;
            this.f333350d = i18;
        }
    }

    public boolean a() {
        return this.f333350d == this.f333351e;
    }

    public mz4.t b(int i17, int i18) {
        this.f333350d = java.lang.Math.max(0, this.f333350d - i17);
        this.f333351e += i18;
        return this;
    }

    public java.lang.String toString() {
        return "[" + this.f333350d + ", " + this.f333351e + "]";
    }

    public t(android.widget.EditText editText) {
        this(editText.getSelectionStart(), editText.getSelectionEnd());
    }
}
