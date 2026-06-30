package zj0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f473283a = new java.util.ArrayList();

    public java.lang.Object a(int i17) {
        return ((java.util.ArrayList) this.f473283a).get(i17);
    }

    public java.lang.Object[] b() {
        java.util.List list = this.f473283a;
        java.util.Collections.reverse(list);
        return ((java.util.ArrayList) list).toArray();
    }

    public zj0.a c(java.lang.Object obj) {
        ((java.util.ArrayList) this.f473283a).add(obj);
        return this;
    }
}
