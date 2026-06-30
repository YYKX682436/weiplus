package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e7 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h7 f118231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.t f118232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(com.tencent.mm.plugin.finder.live.widget.h7 h7Var, bm2.t tVar) {
        super(3);
        this.f118231d = h7Var;
        this.f118232e = tVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        dk2.vg musicItem = (dk2.vg) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        java.util.Iterator it = this.f118232e.f22298m.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((dk2.vg) it.next()).f234258e) {
                z17 = true;
                break;
            }
        }
        this.f118231d.e0(z17);
        return jz5.f0.f302826a;
    }
}
