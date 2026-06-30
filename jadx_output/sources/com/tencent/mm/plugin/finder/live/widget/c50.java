package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class c50 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f117966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c50(java.util.LinkedList linkedList) {
        super(1);
        this.f117966d = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.il1 resultItem = (r45.il1) obj;
        kotlin.jvm.internal.o.g(resultItem, "resultItem");
        java.util.Iterator it = this.f117966d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((r45.il1) obj2).getString(0), resultItem.getString(0))) {
                break;
            }
        }
        return java.lang.Boolean.valueOf(obj2 != null);
    }
}
