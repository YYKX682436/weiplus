package es5;

/* loaded from: classes13.dex */
public final class c implements tr5.u {

    /* renamed from: a, reason: collision with root package name */
    public final int f256427a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f256428b = java.util.Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f256429c = java.util.Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f256430d = java.util.Collections.emptyList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f256431e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f256432f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f256433g = java.util.Collections.emptyList();

    public c(int i17, es5.a aVar) {
        this.f256427a = i17;
    }

    public final java.util.List a(java.util.List list, java.lang.String str) {
        if (java.util.Collections.emptyList() == list) {
            list = new java.util.ArrayList();
        }
        list.add(str);
        return list;
    }

    public final java.lang.String[] b(java.lang.String str) {
        java.util.List list = java.util.Objects.equals(str, "ipv6") ? this.f256433g : this.f256432f;
        java.util.List<java.lang.String> list2 = java.util.Objects.equals(str, "ipv6") ? this.f256429c : this.f256428b;
        java.util.List<java.lang.String> list3 = java.util.Objects.equals(str, "ipv6") ? this.f256431e : this.f256430d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (!list3.isEmpty()) {
            arrayList.addAll(list3);
            if (!list2.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str2 : list3) {
                    if (str2.contains(":")) {
                        java.lang.String str3 = str2.split(":")[0];
                        if (!arrayList2.contains(str3)) {
                            arrayList2.add(str3);
                        }
                    }
                }
                for (java.lang.String str4 : list2) {
                    if (str4.contains(":")) {
                        java.lang.String str5 = str4.split(":")[0];
                        if (!arrayList2.contains(str5)) {
                            or5.b.a("%s's %s result is from localDns", str5, str);
                            arrayList.add(str4);
                        }
                    }
                }
            }
        } else if (!list2.isEmpty()) {
            or5.b.a("%s result all from localDns", str);
            arrayList.addAll(list2);
        }
        return (java.lang.String[]) arrayList.toArray(tr5.c.f421455a);
    }

    public synchronized void c(tr5.r rVar, java.lang.String[] strArr) {
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
        }
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
        }
        if (sr5.a.c(strArr)) {
            return;
        }
        int i17 = 0;
        if ("Local".equals(rVar.getDescription().f421490a)) {
            or5.b.a("sorter put lookup from local: %s", java.util.Arrays.toString(strArr));
            int length = strArr.length;
            while (i17 < length) {
                java.lang.String str = strArr[i17];
                if (sr5.e.a(str)) {
                    this.f256428b = a(this.f256428b, str);
                } else if (sr5.e.b(str)) {
                    this.f256429c = a(this.f256429c, str);
                }
                i17++;
            }
        } else {
            or5.b.a("sorter put lookup from rest(%d): %s", java.lang.Integer.valueOf(rVar.getDescription().f421491b), java.util.Arrays.toString(strArr));
            int length2 = strArr.length;
            while (i17 < length2) {
                java.lang.String str2 = strArr[i17];
                if (sr5.e.a(str2)) {
                    this.f256430d = a(this.f256430d, str2);
                } else if (sr5.e.b(str2)) {
                    this.f256431e = a(this.f256431e, str2);
                }
                i17++;
            }
        }
    }

    public tr5.z d() {
        java.lang.String[] strArr = tr5.c.f421455a;
        int i17 = this.f256427a;
        java.lang.String[] b17 = (i17 & 1) != 0 ? b("ipv4") : strArr;
        if ((i17 & 2) != 0) {
            strArr = b("ipv6");
        }
        return new tr5.z(b17, strArr);
    }
}
