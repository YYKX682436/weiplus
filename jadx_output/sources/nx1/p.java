package nx1;

/* loaded from: classes12.dex */
public class p implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f341315d;

    /* renamed from: e, reason: collision with root package name */
    public int f341316e;

    public p(int i17, int i18) {
        this.f341315d = i17;
        this.f341316e = i18;
        if (i17 > i18) {
            this.f341316e = i17;
            this.f341315d = i18;
        }
    }

    public boolean a() {
        return this.f341315d == this.f341316e;
    }

    public java.lang.String toString() {
        return "[" + this.f341315d + ", " + this.f341316e + "]";
    }

    public p(android.widget.EditText editText) {
        this(editText.getSelectionStart(), editText.getSelectionEnd());
    }
}
