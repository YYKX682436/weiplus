package ti;

/* loaded from: classes16.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final dc.m f419523a;

    public x0(java.io.File file) {
        java.lang.Object obj;
        vi.b.a(file, "hprofFile");
        dc.i iVar = new dc.i(new ec.b(file));
        ec.a aVar = iVar.f228626a;
        dc.m mVar = new dc.m(aVar);
        iVar.f228628c = mVar;
        do {
        } while (((ec.b) aVar).c() != 0);
        int d17 = ((ec.b) aVar).d();
        iVar.f228627b = d17;
        iVar.f228628c.k(d17);
        ((ec.b) aVar).e();
        while (true) {
            ec.b bVar = (ec.b) aVar;
            if (!(bVar.f250928d < bVar.f250927c)) {
                break;
            }
            int i17 = iVar.i();
            ((ec.b) aVar).d();
            long d18 = ((ec.b) aVar).d() & io.flutter.embedding.android.KeyboardMap.kValueMask;
            if (i17 == 1) {
                iVar.g(((int) d18) - iVar.f228627b);
            } else if (i17 == 2) {
                iVar.b();
            } else if (i17 == 4) {
                iVar.e();
            } else if (i17 == 5) {
                iVar.f();
            } else if (i17 == 12) {
                iVar.c(d18);
                iVar.f228628c.j(0, "default");
            } else if (i17 != 28) {
                iVar.k(d18);
            } else {
                iVar.c(d18);
                iVar.f228628c.j(0, "default");
            }
        }
        iVar.f228628c.h();
        iVar.f228628c.i();
        iVar.f228630e.clear();
        iVar.f228629d.clear();
        fc.k kVar = new fc.k();
        java.util.ArrayList arrayList = ((dc.h) mVar.f228655b.get(0)).f228620d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dc.k kVar2 = (dc.k) it.next();
            java.lang.String format = java.lang.String.format("%s@0x%08x", kVar2.f228635h.f228653d, java.lang.Long.valueOf(kVar2.f228631d));
            if (!kVar.contains(format)) {
                kVar.put(format, kVar2);
            }
        }
        arrayList.clear();
        java.lang.Object[] objArr = kVar.f260928i;
        int length = objArr.length;
        while (true) {
            int i18 = length - 1;
            if (length <= 0 || !((obj = objArr[i18]) == null || obj == fc.s.f260926n || arrayList.add(kVar.get((java.lang.String) obj)))) {
                break;
            } else {
                length = i18;
            }
        }
        this.f419523a = mVar;
    }
}
