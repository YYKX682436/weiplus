package eh0;

/* loaded from: classes5.dex */
public abstract class q {
    public static final java.lang.String a(java.lang.String str, long j17, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[talker:");
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append("|svrId:");
        sb6.append(j17);
        if (!(str2 == null || str2.length() == 0)) {
            sb6.append("|stream:");
            sb6.append(str2);
        }
        sb6.append("] ");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
