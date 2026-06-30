package e01;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f245838a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245839b = e();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f245840c = d();

    public void a(e01.g gVar) {
        java.util.List list = this.f245838a;
        if (((java.util.ArrayList) list).contains(gVar)) {
            return;
        }
        ((java.util.ArrayList) list).add(gVar);
    }

    public void b(java.lang.String str) {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null) {
            return;
        }
        android.content.SharedPreferences.Editor edit = D.edit();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = this.f245839b;
        sb6.append(str2);
        sb6.append(str);
        edit.remove(sb6.toString()).commit();
        java.lang.String[] strArr = this.f245840c;
        if (strArr != null) {
            for (java.lang.String str3 : strArr) {
                if (str3 != null) {
                    D.edit().remove(str2 + str3 + str).commit();
                }
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f245838a).iterator();
        while (it.hasNext()) {
            ((e01.g) it.next()).b();
        }
    }

    public java.lang.String c(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null || str2 == null) {
            return null;
        }
        return D.getString(this.f245839b + str2 + str, null);
    }

    public java.lang.String[] d() {
        return null;
    }

    public abstract java.lang.String e();

    public boolean f(java.lang.String str) {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f245839b);
        sb6.append(str);
        return D.getBoolean(sb6.toString(), false);
    }

    public void g(java.lang.String str, boolean z17, java.lang.String[] strArr) {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null) {
            return;
        }
        java.util.Arrays.toString(strArr);
        android.content.SharedPreferences.Editor edit = D.edit();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = this.f245839b;
        sb6.append(str2);
        sb6.append(str);
        edit.putBoolean(sb6.toString(), z17).commit();
        java.lang.String[] strArr2 = this.f245840c;
        if (strArr2 != null && strArr != null && strArr2.length == strArr.length) {
            int i17 = 0;
            for (java.lang.String str3 : strArr2) {
                if (str3 != null) {
                    java.lang.String str4 = strArr[i17];
                    if (str4 == null) {
                        str4 = "";
                    }
                    D.edit().putString(str2 + str3 + str, str4).commit();
                }
                i17++;
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f245838a).iterator();
        while (it.hasNext()) {
            ((e01.g) it.next()).a(z17);
        }
    }
}
