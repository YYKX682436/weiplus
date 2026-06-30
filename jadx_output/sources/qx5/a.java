package qx5;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f367479a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f367480b;

    public a(boolean z17, boolean z18) {
        this.f367479a = z17;
        this.f367480b = z18;
    }

    public static qx5.a a() {
        return new qx5.a(false, false);
    }

    public static qx5.a b() {
        return new qx5.a(true, false);
    }

    public java.lang.String toString() {
        return "CommandResult{success=" + this.f367479a + ", shouldKillAllProcess=" + this.f367480b + '}';
    }
}
