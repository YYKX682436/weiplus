package dv4;

/* loaded from: classes.dex */
public class l extends dv4.a {

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f244014c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f244015d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f244016e;

    public l(java.lang.String str, java.util.List list) {
        super(str, Integer.MAX_VALUE);
        this.f244015d = list;
    }

    @Override // dv4.a
    public void a(java.util.List list) {
        this.f244014c = list;
        if (list != null) {
            java.util.List list2 = this.f244015d;
            java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
            java.util.Iterator it = this.f244014c.iterator();
            while (it.hasNext()) {
                p13.y yVar = (p13.y) it.next();
                int indexOf = list2.indexOf(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f351187e, true).d1());
                if (indexOf >= 0) {
                    if (indexOf < arrayList.size()) {
                        arrayList.add(indexOf, yVar);
                    } else {
                        arrayList.add(yVar);
                    }
                    it.remove();
                }
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f244014c.add(0, (p13.y) arrayList.get(size));
            }
        }
        this.f244016e = true;
    }

    public void b(p13.y yVar, com.tencent.mm.storage.z3 z3Var, org.json.JSONObject jSONObject) {
        java.lang.String str = yVar.f351190h;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<em class=\\\"highlight\\\">");
        java.lang.String str2 = this.f243997a;
        sb6.append(str2);
        sb6.append("</em>");
        java.lang.String replaceFirst = str.replaceFirst(str2, sb6.toString());
        int i17 = yVar.f351185c;
        if (i17 != 1) {
            if (i17 == 15) {
                replaceFirst = context.getString(com.tencent.mm.R.string.l57) + replaceFirst;
            } else if (i17 != 4 && i17 != 5) {
                replaceFirst = "";
            }
        }
        try {
            jSONObject.put("displayText", replaceFirst);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("JsapiFtsMatchContact", e17, "", new java.lang.Object[0]);
        }
    }
}
