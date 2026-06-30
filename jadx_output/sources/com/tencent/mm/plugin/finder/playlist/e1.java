package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        super(1);
        this.f122295d = s1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.plugin.finder.playlist.z1 item = (com.tencent.mm.plugin.finder.playlist.z1) obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.util.Iterator it = this.f122295d.f122422b.f122296a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((so2.j5) obj2).getItemId() == item.getItemId()) {
                break;
            }
        }
        return java.lang.Boolean.valueOf(obj2 != null);
    }
}
