package mv2;

/* loaded from: classes2.dex */
public interface w0 {
    default void onPostErr(long j17, boolean z17) {
    }

    default void onPostFakeOk(long j17) {
    }

    default void onPostNotify(long j17, boolean z17) {
    }

    default void onPostOk(long j17, long j18) {
    }

    default void onPostStart(long j17) {
    }

    default void onPrePostEvent(java.lang.String postId, mv2.g0 event) {
        kotlin.jvm.internal.o.g(postId, "postId");
        kotlin.jvm.internal.o.g(event, "event");
    }
}
