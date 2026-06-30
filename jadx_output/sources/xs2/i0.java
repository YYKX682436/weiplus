package xs2;

/* loaded from: classes3.dex */
public final class i0 extends xs2.e {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f456337h;

    /* renamed from: i, reason: collision with root package name */
    public final xs2.f0 f456338i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f456339j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f456340k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f456341l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.view.View bulletView, gk2.e buContext, xs2.f0 danmakuConfig) {
        super(bulletView, buContext, danmakuConfig);
        kotlin.jvm.internal.o.g(bulletView, "bulletView");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(danmakuConfig, "danmakuConfig");
        this.f456337h = bulletView;
        this.f456338i = danmakuConfig;
        this.f456339j = "LiveDanmakuManager";
        this.f456340k = jz5.h.b(xs2.g0.f456330d);
        this.f456341l = jz5.h.b(xs2.h0.f456334d);
    }

    @Override // xs2.o
    public void c(java.util.List list, java.lang.String source) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(source, "source");
        synchronized (list) {
            ((java.util.LinkedList) ((jz5.n) this.f456340k).getValue()).clear();
            ((java.util.LinkedList) ((jz5.n) this.f456341l).getValue()).clear();
            for (java.lang.Object obj : list) {
                if (obj instanceof mm2.a2) {
                    ((java.util.LinkedList) ((jz5.n) this.f456341l).getValue()).add(obj);
                } else {
                    ((java.util.LinkedList) ((jz5.n) this.f456340k).getValue()).add(obj);
                }
            }
            if (!((java.util.LinkedList) ((jz5.n) this.f456340k).getValue()).isEmpty()) {
                java.util.LinkedList linkedList = (java.util.LinkedList) ((jz5.n) this.f456340k).getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    wp.a f57 = i().f5(0, it.next());
                    f57.f448348s = false;
                    xp.a aVar = this.f456338i.f456328c;
                    f57.f448345p = aVar != null ? aVar.f455809g : 3000;
                    f57.f448335f = android.os.SystemClock.uptimeMillis();
                    arrayList.add(f57);
                }
                vp.x i17 = i();
                xp.a aVar2 = this.f456338i.f456328c;
                i17.f438852d.k1(arrayList, aVar2 != null ? aVar2.f455818p : false, aVar2 != null ? aVar2.f455819q : false);
            }
            if (!((java.util.LinkedList) ((jz5.n) this.f456341l).getValue()).isEmpty()) {
                java.util.LinkedList<mm2.a2> linkedList2 = (java.util.LinkedList) ((jz5.n) this.f456341l).getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                for (mm2.a2 a2Var : linkedList2) {
                    wp.a f58 = i().f5(0, a2Var.f328743a);
                    f58.f448348s = a2Var.f328744b;
                    xp.a aVar3 = this.f456338i.f456328c;
                    f58.f448345p = aVar3 != null ? aVar3.f455809g : 3000;
                    f58.f448335f = android.os.SystemClock.uptimeMillis();
                    arrayList2.add(f58);
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    i().f438852d.k0((wp.a) it6.next(), false);
                }
            }
        }
    }

    @Override // xs2.e, xs2.o
    public void d(java.util.List list) {
        super.d(list);
        i().n(0L);
    }

    @Override // xs2.e
    public long h() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // xs2.e
    public java.lang.String j() {
        return this.f456339j;
    }

    @Override // xs2.e
    public void m(long j17) {
    }

    @Override // xs2.e, xs2.o
    public void onDetach() {
        super.onDetach();
    }
}
