package gj;

/* loaded from: classes12.dex */
public class i implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Printer f272347d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f272348e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f272349f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gj.k f272350g;

    public i(gj.k kVar, android.util.Printer printer) {
        this.f272350g = kVar;
        this.f272347d = printer;
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        android.util.Printer printer = this.f272347d;
        if (printer != null) {
            printer.println(str);
            if (this.f272347d == this) {
                throw new java.lang.RuntimeException("Matrix.LooperMonitor origin == this");
            }
        }
        if (!this.f272348e) {
            boolean z17 = str.charAt(0) == '>' || str.charAt(0) == '<';
            this.f272349f = z17;
            this.f272348e = true;
            if (!z17) {
                oj.j.b("Matrix.LooperMonitor", "[println] Printer is inValid! x:%s", str);
            }
        }
        if (this.f272349f) {
            gj.k kVar = this.f272350g;
            if (!(str.charAt(0) == '>')) {
                synchronized (kVar.f272360h) {
                    java.util.Iterator it = kVar.f272360h.iterator();
                    if (it.hasNext()) {
                        ((gj.l) ((gj.h) it.next())).getClass();
                        throw null;
                    }
                }
                synchronized (kVar.f272361i) {
                    for (gj.g gVar : ((java.util.HashMap) kVar.f272361i).values()) {
                        if (gVar.f272346c.isValid() && gVar.f272344a) {
                            gVar.f272344a = false;
                            gVar.f272346c.b(str, gVar.f272345b, java.lang.System.nanoTime());
                        }
                    }
                }
                return;
            }
            synchronized (kVar.f272360h) {
                java.util.Iterator it6 = kVar.f272360h.iterator();
                if (it6.hasNext()) {
                    ((gj.l) ((gj.h) it6.next())).getClass();
                    throw null;
                }
            }
            synchronized (kVar.f272361i) {
                for (gj.g gVar2 : ((java.util.HashMap) kVar.f272361i).values()) {
                    if (gVar2.f272346c.isValid() && !gVar2.f272344a) {
                        gVar2.f272344a = true;
                        gVar2.f272345b = java.lang.System.nanoTime();
                        gVar2.f272346c.c(str);
                    }
                }
            }
        }
    }
}
