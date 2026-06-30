package vh;

/* loaded from: classes12.dex */
public class u implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh.y f436821b;

    public u(vh.y yVar, int i17) {
        this.f436821b = yVar;
        this.f436820a = i17;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        vh.y yVar = this.f436821b;
        java.lang.String str = yVar.f436829e;
        ((com.tencent.matrix.batterycanary.stats.k) obj).getClass();
        java.util.List emptyList = java.util.Collections.emptyList();
        vh.x xVar = yVar.f436830f;
        if (xVar != null) {
            emptyList = xVar.a(emptyList);
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(5, this.f436820a);
        java.lang.String format = ((java.text.DateFormat) uh.c.f427669b.b()).format(calendar.getTime());
        java.util.ArrayList arrayList = new java.util.ArrayList(emptyList.size() + 1);
        if (emptyList.isEmpty()) {
            vh.g gVar = new vh.g();
            gVar.f436787d = "NO DATA";
            arrayList.add(0, gVar);
        } else {
            java.util.Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(0, yVar.c((com.tencent.matrix.batterycanary.stats.BatteryRecord) it.next()));
            }
        }
        vh.f fVar = new vh.f();
        fVar.f436786d = format;
        arrayList.add(0, fVar);
        int abs = java.lang.Math.abs(yVar.f436828d);
        int i17 = yVar.f436826b;
        if (abs >= i17) {
            vh.f fVar2 = new vh.f();
            fVar2.f436786d = "END";
            arrayList.add(fVar2);
            vh.g gVar2 = new vh.g();
            gVar2.f436787d = "Only keep last " + i17 + " days' data";
            arrayList.add(gVar2);
        }
        yVar.f436827c.post(new vh.v(yVar, arrayList));
    }
}
