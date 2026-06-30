package y42;

/* loaded from: classes7.dex */
public class b extends x42.a {

    /* renamed from: a, reason: collision with root package name */
    public p42.a f459342a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f459343b = new java.util.HashMap();

    @Override // x42.b
    public java.lang.String a() {
        return "read_edge_db_data";
    }

    @Override // x42.b
    public java.lang.Object b(com.eclipsesource.mmv8.V8Array v8Array) {
        java.util.List<java.util.List> list;
        if (v8Array != null && v8Array.length() >= 1) {
            java.lang.String string = v8Array.getString(0);
            g42.i.a("EdgeComputingJsApiBase", "[EdgeComputingJsApiReadEdgeDBData] logic, sql : " + string);
            if (u46.l.e(string)) {
                return null;
            }
            java.util.Map map = this.f459343b;
            if (((java.util.HashMap) map).containsKey(string)) {
                list = (java.util.List) ((java.util.HashMap) map).get(string);
            } else {
                if (this.f459342a == null) {
                    this.f459342a = new p42.a();
                }
                list = this.f459342a.b("Edge.db", string);
                ((java.util.HashMap) map).put(string, list);
            }
            if (list != null && list.size() > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.util.List<java.lang.String> list2 : list) {
                    if (list2 != null && list2.size() > 0) {
                        if (sb6.length() > 0) {
                            sb6.append(";");
                        }
                        int i17 = 0;
                        for (java.lang.String str : list2) {
                            if (str == null) {
                                str = "";
                            }
                            if (u46.l.a(str, ",")) {
                                str = u46.l.o(str, ",", "\\#");
                            }
                            if (u46.l.a(str, ";")) {
                                str = u46.l.o(str, ";", "\\$");
                            }
                            sb6.append(str);
                            if (i17 < list2.size() - 1) {
                                sb6.append(",");
                            }
                            i17++;
                        }
                    }
                }
                return sb6.toString();
            }
        }
        return null;
    }

    @Override // x42.b
    public int getType() {
        return 5;
    }

    @Override // x42.b
    public void release() {
        ((java.util.HashMap) this.f459343b).clear();
        p42.a aVar = this.f459342a;
        if (aVar != null) {
            aVar.c();
            this.f459342a = null;
        }
    }
}
