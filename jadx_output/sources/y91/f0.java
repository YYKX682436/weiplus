package y91;

/* loaded from: classes7.dex */
public class f0 implements r56.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa1.b f460269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y91.i0 f460270e;

    public f0(y91.i0 i0Var, aa1.b bVar) {
        this.f460270e = i0Var;
        this.f460269d = bVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        x91.c cVar = (x91.c) obj;
        if (cVar == null || cVar.f452638f == null || cVar.f452639g == null) {
            return;
        }
        y91.i0 i0Var = this.f460270e;
        ((java.util.HashSet) i0Var.f460288g).remove(cVar.f452633a);
        x91.h hVar = new x91.h(cVar);
        boolean z17 = true;
        int i17 = 0;
        if (!((hVar.f452649c == null || hVar.f452650d == null) ? false : true)) {
            hVar = null;
        }
        if (hVar == null) {
            return;
        }
        java.lang.String c17 = i0Var.c(this.f460269d.a("USN"));
        if (android.text.TextUtils.isEmpty(c17)) {
            return;
        }
        hVar.f452647a.getClass();
        x91.b b17 = x91.b.b();
        if (b17.f452630a) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) b17.f452631b;
        if (hashMap.containsKey(c17)) {
            x91.h hVar2 = (x91.h) hashMap.get(c17);
            if (hVar2 != null && hVar2.equals(hVar)) {
                return;
            } else {
                z17 = false;
            }
        }
        hashMap.put(c17, hVar);
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) b17.f452632c;
            if (i17 >= arrayList.size()) {
                return;
            }
            x91.a aVar = (x91.a) arrayList.get(i17);
            if (aVar != null) {
                if (z17) {
                    aVar.C2(hVar);
                } else {
                    aVar.K4(hVar);
                }
                i17++;
            } else {
                arrayList.remove(i17);
            }
        }
    }
}
