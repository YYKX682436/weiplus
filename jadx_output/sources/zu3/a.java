package zu3;

/* loaded from: classes10.dex */
public abstract class a implements zu3.o {

    /* renamed from: a, reason: collision with root package name */
    public zu3.e f475758a;

    /* renamed from: b, reason: collision with root package name */
    public bv3.d f475759b;

    /* renamed from: c, reason: collision with root package name */
    public final bv3.d f475760c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f475761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f475762e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Matrix f475763f;

    public a(zu3.e dataType) {
        kotlin.jvm.internal.o.g(dataType, "dataType");
        this.f475758a = dataType;
        this.f475760c = new bv3.d(2147483647L, false, 2, null);
        this.f475762e = true;
        this.f475763f = new android.graphics.Matrix();
    }

    public final bv3.d d() {
        return this.f475760c;
    }

    public final r45.bi0 e() {
        r45.bi0 bi0Var = new r45.bi0();
        bv3.d dVar = this.f475760c;
        bi0Var.f370772d = dVar.c();
        bi0Var.f370773e = dVar.b();
        return bi0Var;
    }

    public final r45.zz6 f(android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(matrix, "matrix");
        float[] fArr = new float[9];
        r45.zz6 zz6Var = new r45.zz6();
        matrix.getValues(fArr);
        for (int i17 = 0; i17 < 9; i17++) {
            zz6Var.f392494d.add(java.lang.Float.valueOf(fArr[i17]));
        }
        return zz6Var;
    }

    public final float[] g(r45.zz6 viewMatrix) {
        kotlin.jvm.internal.o.g(viewMatrix, "viewMatrix");
        float[] fArr = new float[9];
        java.util.LinkedList<java.lang.Float> value = viewMatrix.f392494d;
        kotlin.jvm.internal.o.f(value, "value");
        int i17 = 0;
        for (java.lang.Float f17 : value) {
            kotlin.jvm.internal.o.d(f17);
            fArr[i17] = f17.floatValue();
            i17++;
        }
        return fArr;
    }

    public final void h(boolean z17) {
        this.f475762e = z17;
    }
}
