package ru5;

/* loaded from: classes10.dex */
public class e implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru5.a f399795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ru5.g f399796e;

    public e(ru5.g gVar, ru5.a aVar) {
        this.f399796e = gVar;
        this.f399795d = aVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f399795d.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f399796e.f399804e.f399800a = this.f399795d.a(this.f399796e.f399800a);
            this.f399796e.f399804e.c(this.f399796e.f399804e.f399802c);
            this.f399796e.a();
        } catch (java.lang.Throwable th6) {
            try {
                ru5.a d17 = this.f399796e.d();
                if (d17 == null) {
                    throw th6;
                }
                java.lang.Object a17 = d17.a(th6);
                ru5.g gVar = this.f399796e;
                while (gVar.f399804e != null) {
                    gVar = gVar.f399804e;
                }
                gVar.f399800a = a17;
            } finally {
                ru5.g gVar2 = this.f399796e;
                gVar2.getClass();
                while (gVar2 != null) {
                    gVar2.a();
                    gVar2 = gVar2.f399804e;
                }
                this.f399796e.f399804e = null;
                this.f399796e.f399803d = null;
                this.f399796e.f399802c = null;
                this.f399796e.getClass();
            }
        }
    }
}
