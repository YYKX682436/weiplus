package w16;

/* loaded from: classes16.dex */
public final class a implements w16.g {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f442250b;

    public a(java.util.List inner) {
        kotlin.jvm.internal.o.g(inner, "inner");
        this.f442250b = inner;
    }

    public void a(a16.l context_receiver_0, o06.g thisDescriptor, java.util.List result) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            ((w16.a) ((w16.g) it.next())).a(context_receiver_0, thisDescriptor, result);
        }
    }

    public void b(a16.l context_receiver_0, o06.g thisDescriptor, n16.g name, java.util.Collection result) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            ((w16.a) ((w16.g) it.next())).b(context_receiver_0, thisDescriptor, name, result);
        }
    }

    public void c(a16.l context_receiver_0, o06.g thisDescriptor, n16.g name, java.util.List result) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            ((w16.a) ((w16.g) it.next())).c(context_receiver_0, thisDescriptor, name, result);
        }
    }

    public void d(a16.l context_receiver_0, o06.g thisDescriptor, n16.g name, java.util.Collection result) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            ((w16.a) ((w16.g) it.next())).d(context_receiver_0, thisDescriptor, name, result);
        }
    }

    public java.util.List e(a16.l context_receiver_0, o06.g thisDescriptor) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((w16.a) ((w16.g) it.next())).e(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    public java.util.List f(a16.l context_receiver_0, o06.g thisDescriptor) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((w16.a) ((w16.g) it.next())).f(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    public java.util.List g(a16.l context_receiver_0, o06.g thisDescriptor) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((w16.a) ((w16.g) it.next())).g(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    public r06.f1 h(a16.l context_receiver_0, o06.g thisDescriptor, r06.f1 propertyDescriptor) {
        kotlin.jvm.internal.o.g(context_receiver_0, "$context_receiver_0");
        kotlin.jvm.internal.o.g(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.o.g(propertyDescriptor, "propertyDescriptor");
        java.util.Iterator it = this.f442250b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((w16.a) ((w16.g) it.next())).h(context_receiver_0, thisDescriptor, propertyDescriptor);
        }
        return propertyDescriptor;
    }
}
