package ki;

/* loaded from: classes12.dex */
public final class c extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ki.d f308086b;

    public c(ki.d dVar) {
        this.f308086b = dVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        this.f308086b.f308088e = 0;
        ki.d dVar = this.f308086b;
        java.lang.Object obj = dVar.f308092i.f308085b.get(dVar.f308088e);
        kotlin.jvm.internal.o.f(obj, "config.delayMillis[delayIndex]");
        long longValue = ((java.lang.Number) obj).longValue();
        this.f308086b.f308087d.removeCallbacksAndMessages(null);
        ki.d dVar2 = this.f308086b;
        if (dVar2.f308093m) {
            ki.i.f308101c.d(dVar2.f308091h);
            oj.j.c("Matrix.TrimMemoryNotifier", "[" + this.f308086b.f308089f + "] trim immediately", new java.lang.Object[0]);
        }
        ki.d dVar3 = this.f308086b;
        dVar3.f308087d.postDelayed(dVar3, longValue);
        oj.j.c("Matrix.TrimMemoryNotifier", "...[" + this.f308086b.f308089f + "] trim delay[" + (this.f308086b.f308088e + 1) + '/' + this.f308086b.f308092i.f308085b.size() + "] " + longValue, new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        ki.d dVar = this.f308086b;
        dVar.f308087d.removeCallbacks(dVar);
        this.f308086b.f308088e = 0;
    }
}
