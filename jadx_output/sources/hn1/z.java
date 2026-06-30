package hn1;

/* loaded from: classes11.dex */
public interface z {
    default void a(java.lang.String imageKey, android.graphics.Bitmap bitmap, java.lang.String username) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(username, "username");
    }

    default void b(java.lang.String imageKey, java.lang.String path, java.lang.String username) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
    }
}
