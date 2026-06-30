package fq0;

/* loaded from: classes.dex */
public abstract class a0 {
    public static final java.lang.String a(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet) {
        kotlin.jvm.internal.o.g(copyOnWriteArraySet, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Integer) it.next()) + ", ");
        }
        sb6.append("]");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
