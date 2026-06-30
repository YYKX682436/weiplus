package zu3;

/* loaded from: classes10.dex */
public final class d extends zu3.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f475792g;

    /* renamed from: h, reason: collision with root package name */
    public int f475793h;

    /* renamed from: i, reason: collision with root package name */
    public int f475794i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f475795j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.e type) {
        super(type);
        kotlin.jvm.internal.o.g(type, "type");
        this.f475792g = new java.util.ArrayList();
    }

    public final r45.is i(long j17) {
        for (r45.is isVar : this.f475792g) {
            if (isVar.f377298e <= j17 && isVar.f377299f >= j17) {
                return isVar;
            }
        }
        return null;
    }

    @Override // zu3.o
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public r45.ot toProtoBuf() {
        r45.ot otVar = new r45.ot();
        otVar.f382502d.addAll(this.f475792g);
        otVar.f382503e = f(this.f475763f);
        otVar.f382505g = this.f475794i;
        otVar.f382504f = this.f475793h;
        otVar.f382506h = this.f475795j;
        return otVar;
    }

    public java.lang.String toString() {
        java.util.Iterator it = this.f475792g.iterator();
        while (it.hasNext()) {
            r45.is isVar = (r45.is) it.next();
            long j17 = isVar.f377298e;
            isVar.f377297d.h(com.tencent.mapsdk.internal.rv.f51270c);
        }
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.e type, java.util.ArrayList list, android.graphics.Matrix matrix) {
        super(type);
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f475792g = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        this.f475763f.set(matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.e type, byte[] byteArray) {
        super(type);
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(byteArray, "byteArray");
        this.f475792g = new java.util.ArrayList();
        try {
            r45.ot otVar = new r45.ot();
            try {
                otVar.parseFrom(byteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                otVar = null;
            }
            if (otVar != null) {
                this.f475792g.clear();
                this.f475792g.addAll(otVar.f382502d);
                android.graphics.Matrix matrix = this.f475763f;
                r45.zz6 matrix2 = otVar.f382503e;
                kotlin.jvm.internal.o.f(matrix2, "matrix");
                matrix.setValues(g(matrix2));
                this.f475794i = otVar.f382505g;
                this.f475793h = otVar.f382504f;
                this.f475795j = otVar.f382506h;
                toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.CaptionItem", "");
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CaptionItem", e18, "LocationItem parse error", new java.lang.Object[0]);
        }
    }
}
