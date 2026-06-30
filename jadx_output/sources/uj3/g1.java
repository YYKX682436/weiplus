package uj3;

/* loaded from: classes14.dex */
public final class g1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.h1 f428280d;

    public g1(uj3.h1 h1Var) {
        this.f428280d = h1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        uj3.h1 h1Var = this.f428280d;
        synchronized (h1Var) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = h1Var.f428285c.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            java.util.List<java.lang.String> p17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().p();
            if (p17 != null) {
                for (java.lang.String str : p17) {
                    if (!arrayList.contains(str)) {
                        kotlin.jvm.internal.o.d(str);
                        hashMap.put(str, 0);
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it6.next();
                    if (p17.contains(str2)) {
                        java.lang.Integer num = (java.lang.Integer) h1Var.f428285c.get(str2);
                        if (num == null) {
                            num = 0;
                        }
                        if (num.intValue() > 30) {
                            arrayList2.add(str2);
                            z17 = true;
                        } else {
                            hashMap.put(str2, java.lang.Integer.valueOf(num.intValue() + 1));
                        }
                    } else if (((java.lang.Integer) h1Var.f428285c.get(str2)) != null) {
                        hashMap.put(str2, 0);
                    }
                }
                h1Var.f428285c = hashMap;
                if (z17 && !h1Var.f428283a.d()) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putStringArrayList("avatar_available_speaker", arrayList2);
                    h1Var.f428283a.f(uj3.a.f428198i, bundle);
                }
            }
        }
        return true;
    }
}
