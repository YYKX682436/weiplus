package kh;

/* loaded from: classes5.dex */
public final class c3 implements java.util.Comparator {
    public c3(java.lang.String str, java.lang.String str2) {
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Integer num = 1;
        java.lang.Integer num2 = r26.i0.p((java.lang.String) entry.getKey(), "Bad", true) ? 2 : r26.i0.p((java.lang.String) entry.getKey(), "Miss", true) ? num : 0;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        if (r26.i0.p((java.lang.String) entry2.getKey(), "Bad", true)) {
            num = 2;
        } else if (!r26.i0.p((java.lang.String) entry2.getKey(), "Miss", true)) {
            num = 0;
        }
        return mz5.a.b(num2, num);
    }
}
