package pk2;

/* loaded from: classes3.dex */
public final class gb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(pk2.o9 o9Var) {
        super(1);
        this.f355791d = o9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        this.f355791d.d(list);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            java.lang.String str = "";
            while (it.hasNext()) {
                str = str + ((java.lang.String) it.next()) + ';';
            }
            if (r26.i0.o(str, ";", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            com.tencent.mm.plugin.finder.live.util.x.f115742a.a(list, linkedHashMap);
            linkedHashMap.put("share_scene", java.lang.String.valueOf(zl2.r4.f473950a.Z0()));
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Fk(str, ml2.j5.f327630e, linkedHashMap);
        }
        return jz5.f0.f302826a;
    }
}
