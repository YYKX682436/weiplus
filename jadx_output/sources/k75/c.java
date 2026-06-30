package k75;

/* loaded from: classes7.dex */
public abstract class c implements k75.a {
    public void a() {
    }

    public void b() {
    }

    public boolean c(android.os.Message message) {
        return false;
    }

    @Override // k75.a
    public java.lang.String getName() {
        java.lang.String name = getClass().getName();
        return name.substring(name.lastIndexOf(36) + 1);
    }
}
