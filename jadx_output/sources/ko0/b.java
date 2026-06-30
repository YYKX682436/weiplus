package ko0;

/* loaded from: classes10.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.b f309819a = new ko0.b();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String sb6;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ko0.c.f309823c = false;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("GetCdnIpReq errType:");
        sb7.append(fVar.f70615a);
        sb7.append(", errCode:");
        sb7.append(fVar.f70616b);
        sb7.append(",errMsg:");
        sb7.append(fVar.f70617c);
        sb7.append(',');
        java.util.LinkedList<r45.ev> list = ((r45.xr1) fVar.f70618d).getList(1);
        if (list == null || list.isEmpty()) {
            sb6 = "[NULL]";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            for (r45.ev evVar : list) {
                sb8.append("[");
                sb8.append(evVar.getString(0));
                sb8.append(":");
                sb8.append(evVar.getList(1));
                sb8.append("]");
            }
            sb6 = sb8.toString();
            kotlin.jvm.internal.o.d(sb6);
        }
        sb7.append(sb6);
        com.tencent.mars.xlog.Log.i("LiveBackUpUtil", sb7.toString());
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            ko0.c cVar = ko0.c.f309821a;
            ko0.c.f309822b = ((r45.xr1) fVar.f70618d).getList(1);
        } else if (fVar.f70616b == -200291) {
            ko0.c.f309824d = true;
        }
        return jz5.f0.f302826a;
    }
}
