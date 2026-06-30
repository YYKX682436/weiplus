package wz0;

/* loaded from: classes7.dex */
public abstract class a {
    public static final java.lang.String a(r45.y50 y50Var) {
        if (y50Var == null) {
            return "CommRequestSource{NULL}";
        }
        return "CommRequestSource{open_scene=" + y50Var.f390797d + ", is_pre_hot=" + y50Var.f390798e + ", sync_type=" + y50Var.f390799f + '}';
    }

    public static final java.lang.String b(r45.v54 v54Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LaunchWxaAppResponse{");
        java.lang.String str3 = "NULL";
        java.lang.String str4 = str3;
        if (v54Var != null) {
            if (v54Var.f387903e == null) {
                str = "NULL_API_INFO";
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("api_info~ fg:");
                com.tencent.mm.protobuf.g gVar = v54Var.f387903e.f370425d;
                java.lang.Object obj = str3;
                if (gVar != null) {
                    obj = java.lang.Integer.valueOf(gVar.f192156a.length);
                }
                sb7.append(obj);
                java.lang.String sb8 = sb7.toString();
                java.util.LinkedList linkedList = v54Var.f387903e.f370426e;
                if (linkedList != null) {
                    if (linkedList.size() > 0) {
                        sb8 = sb8 + " | bg:" + ((com.tencent.mm.protobuf.g) v54Var.f387903e.f370426e.get(0)).f192156a.length;
                    }
                    if (v54Var.f387903e.f370426e.size() > 1) {
                        sb8 = sb8 + " | suspend:" + ((com.tencent.mm.protobuf.g) v54Var.f387903e.f370426e.get(1)).f192156a.length;
                    }
                }
                str = sb8 + '~';
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            if (v54Var.f387902d == null) {
                str2 = " || NULL_LAUNCH";
            } else {
                str2 = " || launch " + v54Var.f387902d.f381942d;
            }
            sb9.append(str2);
            str4 = sb9.toString();
        }
        sb6.append(str4);
        sb6.append('}');
        return sb6.toString();
    }
}
