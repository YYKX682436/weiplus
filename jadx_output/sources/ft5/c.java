package ft5;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static gt5.a f266744a;

    public static void a(android.content.Context context, ft5.b bVar) {
        if (f266744a == null) {
            f266744a = new gt5.a(context);
        }
        gt5.a aVar = f266744a;
        aVar.getClass();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (arrayList.size() == 0) {
                if (bVar != null) {
                    ((vm0.b) bVar).a(-10, null);
                    return;
                }
                return;
            }
            it5.a aVar2 = new it5.a();
            aVar2.f294606f = aVar.b();
            it5.c cVar = new it5.c();
            aVar2.f294604d = cVar;
            cVar.f294629d = 6;
            cVar.f294630e = 1;
            cVar.f294631f = 0;
            cVar.f294632g = 0;
            cVar.f294633h = 0;
            cVar.f294634i = null;
            cVar.f294635m = 0;
            cVar.f294640r = 1;
            aVar2.f294605e = new java.util.ArrayList();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                gt5.a.a(aVar.f275587a, (ft5.a) arrayList.get(i17), i17);
                aVar2.f294605e.add(null);
            }
            byte[] a17 = aVar.f275588b.a(aVar2);
            if (a17 == null) {
                if (bVar != null) {
                    ((vm0.b) bVar).a(-20, null);
                }
            } else if (bVar != null) {
                ((vm0.b) bVar).a(0, a17);
            }
        } catch (java.lang.Throwable unused) {
            if (bVar != null) {
                ((vm0.b) bVar).a(-100, null);
            }
        }
    }
}
