package r42;

/* loaded from: classes15.dex */
public abstract class c {
    public static java.util.List a(r45.rh0 rh0Var) {
        if (rh0Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = rh0Var.f384863d;
        if (linkedList.size() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.qh0 qh0Var = (r45.qh0) it.next();
            r42.a aVar = new r42.a();
            aVar.f369510s = qh0Var.f383988e;
            aVar.f369511t = qh0Var.f383989f;
            aVar.f369509r = qh0Var.f383987d;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static java.util.Map b(r45.yh0 yh0Var) {
        if (yh0Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = yh0Var.f391076d;
        if (linkedList.size() <= 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.xh0 xh0Var = (r45.xh0) it.next();
            if (!u46.l.e(xh0Var.f390092d)) {
                s42.b bVar = new s42.b();
                bVar.f402931a = xh0Var.f390092d;
                bVar.f402932b = xh0Var.f390093e;
                bVar.f402933c = xh0Var.f390094f;
                bVar.f402934d = xh0Var.f390095g;
                bVar.f402936f = xh0Var.f390097i;
                bVar.f402940j = xh0Var.f390104s;
                bVar.f402937g = xh0Var.f390102q;
                bVar.f402938h = xh0Var.f390101p;
                bVar.f402939i = xh0Var.f390098m;
                bVar.f402941k = xh0Var.f390099n;
                bVar.f402942l = xh0Var.f390105t;
                bVar.f402944n = xh0Var.f390103r;
                bVar.f402935e = new java.util.ArrayList();
                java.util.Iterator it6 = xh0Var.f390096h.iterator();
                while (it6.hasNext()) {
                    r45.sh0 sh0Var = (r45.sh0) it6.next();
                    s42.a aVar = new s42.a();
                    aVar.f402928a = sh0Var.f385711d;
                    aVar.f402930c = sh0Var.f385713f;
                    aVar.f402929b = sh0Var.f385712e;
                    bVar.f402935e.add(aVar);
                }
                hashMap.put(bVar.f402931a, bVar);
            }
        }
        return hashMap;
    }

    public static java.util.Map c(r45.ai0 ai0Var) {
        if (ai0Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = ai0Var.f370018d;
        if (linkedList.size() <= 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.zh0 zh0Var = (r45.zh0) it.next();
            if (!u46.l.e(zh0Var.f392054d)) {
                s42.c cVar = new s42.c();
                java.lang.String str = zh0Var.f392054d;
                cVar.f402945a = str;
                cVar.f402946b = zh0Var.f392055e;
                cVar.f402947c = zh0Var.f392056f;
                cVar.f402948d = zh0Var.f392061n;
                cVar.f402952h = zh0Var.f392059i;
                cVar.f402949e = zh0Var.f392057g;
                cVar.f402950f = zh0Var.f392060m;
                cVar.f402951g = zh0Var.f392058h;
                hashMap.put(str, cVar);
            }
        }
        return hashMap;
    }
}
