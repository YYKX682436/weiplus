package o13;

/* loaded from: classes12.dex */
public interface u extends java.lang.Comparable {
    void F(int[] iArr, long j17);

    java.lang.String K(java.lang.String str, int i17);

    void create();

    void destroy();

    java.lang.String getName();

    int getPriority();

    int getType();

    void m0(int[] iArr, java.lang.String str);

    default android.database.Cursor q1(int[] iArr, java.lang.String str) {
        return null;
    }
}
