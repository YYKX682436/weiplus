package x03;

/* loaded from: classes15.dex */
public final class d2 implements io.flutter.plugin.common.EventChannel.EventSink {

    /* renamed from: a, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f451003a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f451004b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f451005c = false;

    public final void a() {
        if (this.f451003a == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f451004b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof x03.b2) {
                this.f451003a.endOfStream();
            } else if (next instanceof x03.c2) {
                x03.c2 c2Var = (x03.c2) next;
                this.f451003a.error(c2Var.f450996a, c2Var.f450997b, c2Var.f450998c);
            } else {
                this.f451003a.success(next);
            }
        }
        arrayList.clear();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void endOfStream() {
        x03.b2 b2Var = new x03.b2(null);
        if (!this.f451005c) {
            this.f451004b.add(b2Var);
        }
        a();
        this.f451005c = true;
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        x03.c2 c2Var = new x03.c2(str, str2, obj);
        if (!this.f451005c) {
            this.f451004b.add(c2Var);
        }
        a();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void success(java.lang.Object obj) {
        if (!this.f451005c) {
            this.f451004b.add(obj);
        }
        a();
    }
}
