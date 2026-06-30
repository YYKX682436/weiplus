package g36;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f268191a;

    /* renamed from: b, reason: collision with root package name */
    public final f36.a f268192b;

    public f(byte[] dataHolder) {
        kotlin.jvm.internal.o.g(dataHolder, "dataHolder");
        this.f268191a = dataHolder;
        this.f268192b = new f36.a(dataHolder, 0, dataHolder.length);
    }

    public final void a(int i17, boolean z17) {
        f36.a aVar = this.f268192b;
        aVar.i(i17, 0);
        if (z17) {
            aVar.d(1);
        } else {
            aVar.d(0);
        }
    }

    public final void b(int i17, com.tencent.mm.protobuf.g gVar) {
        f36.a aVar = this.f268192b;
        if (gVar == null) {
            aVar.getClass();
            return;
        }
        aVar.i(i17, 2);
        byte[] g17 = gVar.g();
        aVar.g(g17.length);
        aVar.e(g17);
    }

    public final void c(int i17, double d17) {
        f36.a aVar = this.f268192b;
        aVar.i(i17, 1);
        aVar.f(java.lang.Double.doubleToLongBits(d17));
    }

    public final void d(int i17, float f17) {
        f36.a aVar = this.f268192b;
        aVar.i(i17, 5);
        int floatToIntBits = java.lang.Float.floatToIntBits(f17);
        aVar.d(floatToIntBits & 255);
        aVar.d((floatToIntBits >> 8) & 255);
        aVar.d((floatToIntBits >> 16) & 255);
        aVar.d((floatToIntBits >> 24) & 255);
    }

    public final void e(int i17, int i18) {
        f36.a aVar = this.f268192b;
        aVar.i(i17, 0);
        if (i18 >= 0) {
            aVar.g(i18);
        } else {
            aVar.h(i18);
        }
    }

    public final void f(int i17, int i18) {
        e(i17, i18);
    }

    public final void g(int i17, int i18, java.util.LinkedList linkedList) {
        if (linkedList != null) {
            switch (i18) {
                case 1:
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        j(i17, (java.lang.String) it.next());
                    }
                    return;
                case 2:
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.Int");
                        e(i17, ((java.lang.Integer) next).intValue());
                    }
                    return;
                case 3:
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        java.lang.Object next2 = it7.next();
                        kotlin.jvm.internal.o.e(next2, "null cannot be cast to non-null type kotlin.Long");
                        h(i17, ((java.lang.Long) next2).longValue());
                    }
                    return;
                case 4:
                    java.util.Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        java.lang.Object next3 = it8.next();
                        kotlin.jvm.internal.o.e(next3, "null cannot be cast to non-null type kotlin.Double");
                        c(i17, ((java.lang.Double) next3).doubleValue());
                    }
                    return;
                case 5:
                    java.util.Iterator it9 = linkedList.iterator();
                    while (it9.hasNext()) {
                        java.lang.Object next4 = it9.next();
                        kotlin.jvm.internal.o.e(next4, "null cannot be cast to non-null type kotlin.Float");
                        d(i17, ((java.lang.Float) next4).floatValue());
                    }
                    return;
                case 6:
                    java.util.Iterator it10 = linkedList.iterator();
                    while (it10.hasNext()) {
                        b(i17, (com.tencent.mm.protobuf.g) it10.next());
                    }
                    return;
                case 7:
                    java.util.Iterator it11 = linkedList.iterator();
                    while (it11.hasNext()) {
                        java.lang.Object next5 = it11.next();
                        kotlin.jvm.internal.o.e(next5, "null cannot be cast to non-null type kotlin.Boolean");
                        a(i17, ((java.lang.Boolean) next5).booleanValue());
                    }
                    return;
                case 8:
                    java.util.Iterator it12 = linkedList.iterator();
                    while (it12.hasNext()) {
                        java.lang.Object next6 = it12.next();
                        kotlin.jvm.internal.o.e(next6, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
                        com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) next6;
                        i(i17, fVar.computeSize());
                        fVar.writeFields(this);
                    }
                    return;
                default:
                    throw new java.lang.IllegalArgumentException("The data type was not found, the id used was " + i18);
            }
        }
    }

    public final void h(int i17, long j17) {
        f36.a aVar = this.f268192b;
        aVar.i(i17, 0);
        aVar.h(j17);
    }

    public final void i(int i17, int i18) {
        f36.a aVar = this.f268192b;
        aVar.i(i17, 2);
        aVar.g(i18);
    }

    public final void j(int i17, java.lang.String str) {
        f36.a aVar = this.f268192b;
        if (str == null) {
            aVar.getClass();
            return;
        }
        aVar.i(i17, 2);
        byte[] bytes = str.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
        aVar.g(bytes.length);
        aVar.e(bytes);
    }

    public final void k(int i17, int i18, java.util.LinkedList linkedList) {
        yz5.l aVar;
        if (linkedList == null || !(!linkedList.isEmpty())) {
            return;
        }
        if (i18 == 2) {
            aVar = new g36.a(this);
        } else if (i18 == 3) {
            aVar = new g36.b(this);
        } else if (i18 == 4) {
            aVar = new g36.c(this);
        } else if (i18 == 5) {
            aVar = new g36.e(this);
        } else {
            if (i18 != 7) {
                throw new java.lang.IllegalArgumentException("The data type was not found, the id used was " + i18);
            }
            aVar = new g36.d(this);
        }
        f36.a aVar2 = this.f268192b;
        aVar2.i(i17, 2);
        aVar2.g(b36.f.l(i18, linkedList));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            aVar.invoke(it.next());
        }
    }
}
