package o6;

/* loaded from: classes16.dex */
public class a implements m6.c {

    /* renamed from: a, reason: collision with root package name */
    public o6.b f343173a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f343174b;

    @Override // m6.c
    public int getDuration() {
        int i17;
        try {
            o6.c cVar = (o6.c) this.f343174b.get(r1.size() - 1);
            java.util.Iterator it = cVar.f343176b.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                m6.e eVar = (m6.e) it.next();
                if (eVar.f324349a.f324341a.equals("continuous")) {
                    m6.b bVar = eVar.f324349a;
                    i17 = bVar.f324342b + bVar.f324343c;
                } else {
                    i17 = eVar.f324349a.f324342b + 22;
                }
                if (i17 > i18) {
                    i18 = i17;
                }
            }
            return i18 + cVar.f343175a;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // m6.c
    public int getVersion() {
        this.f343173a.getClass();
        return 2;
    }
}
