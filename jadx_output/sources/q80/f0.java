package q80;

/* loaded from: classes15.dex */
public interface f0 {
    default void cancel() {
    }

    void fail();

    default boolean listenOnCreate() {
        return false;
    }

    default void onCreate(long j17, java.lang.String str) {
    }

    void success();
}
