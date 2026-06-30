package vq0;

/* loaded from: classes7.dex */
public abstract class a {
    public static final java.lang.String a(java.lang.String frameSetRootId, java.lang.String frameSetName) {
        kotlin.jvm.internal.o.g(frameSetRootId, "frameSetRootId");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        return frameSetRootId + '-' + frameSetName;
    }

    public static final java.lang.String b(java.lang.String frameSetId) {
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        return r26.n0.p0(frameSetId, "-", frameSetId);
    }
}
