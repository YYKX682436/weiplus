package ke5;

/* loaded from: classes9.dex */
public interface f0 {
    void a(hd5.n nVar, boolean z17, android.os.Bundle bundle);

    void b(hd5.n nVar, boolean z17);

    default boolean d() {
        return this instanceof sd5.d;
    }

    default boolean isLoading() {
        return false;
    }

    void onCancel();
}
