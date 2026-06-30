package g95;

/* loaded from: classes9.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f269814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, java.util.List list, int i17, int i18) {
        super(0);
        this.f269813d = str;
        this.f269814e = list;
        this.f269815f = i17;
        this.f269816g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        ez.j jVar = (ez.j) g95.u.f269821a.e();
        java.lang.String str = this.f269813d;
        g15.b wi6 = jVar.wi(str);
        if (wi6 == null) {
            wi6 = new g15.b();
        }
        java.util.LinkedList j17 = wi6.j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = j17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = this.f269815f;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            if (((g15.a) next).k() == i17) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((g15.a) it6.next()).l()));
        }
        java.util.Set X0 = kz5.n0.X0(arrayList2);
        java.util.List<com.tencent.mm.storage.f9> list = this.f269814e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it7.next()).getMsgId()));
        }
        java.util.Set X02 = kz5.n0.X0(arrayList3);
        if (kotlin.jvm.internal.o.b(X0, X02)) {
            kz5.n0.g0(X02, ", ", null, null, 0, null, null, 62, null);
        } else {
            wi6.j().removeIf(new g95.n(i17));
            java.util.LinkedList j18 = wi6.j();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.storage.f9 f9Var : list) {
                g15.a aVar = new g15.a();
                aVar.q(f9Var.getMsgId());
                aVar.p(i17);
                aVar.n(this.f269816g);
                aVar.o(f9Var.getCreateTime());
                arrayList4.add(aVar);
            }
            j18.addAll(arrayList4);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replace, [");
            sb6.append(str);
            sb6.append(", ");
            sb6.append(i17);
            sb6.append("], ");
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList5.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it8.next()).getMsgId()));
            }
            sb6.append(arrayList5);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", sb6.toString());
            g95.u.f269821a.n(str, wi6);
        }
        return jz5.f0.f302826a;
    }
}
