package ft;

/* loaded from: classes7.dex */
public interface b {
    boolean a();

    void b();

    default java.util.List c() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = g().iterator();
        while (it.hasNext()) {
            linkedList.add(((ft.c) it.next()).b());
        }
        return linkedList;
    }

    ft.d d();

    void e();

    java.lang.String f();

    java.util.List g();

    boolean h();
}
