package rc3;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float[] f394060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float[] f394061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f394062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f394063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rc3.w0 w0Var, int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        super(0);
        this.f394058d = w0Var;
        this.f394059e = i17;
        this.f394060f = fArr;
        this.f394061g = fArr2;
        this.f394062h = fArr3;
        this.f394063i = fArr4;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        rc3.w0 w0Var = this.f394058d;
        java.lang.String str2 = w0Var.f394105z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canvas view ");
        int i17 = this.f394059e;
        sb6.append(i17);
        sb6.append(" touch rect changed...");
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        cf3.d dVar = (cf3.d) w0Var.f394096q.get(java.lang.Integer.valueOf(i17));
        float[] fArr = this.f394063i;
        float[] fArr2 = this.f394062h;
        float[] fArr3 = this.f394061g;
        float[] fArr4 = this.f394060f;
        if (dVar != null) {
            int length = fArr4.length;
            java.util.ArrayList arrayList = new java.util.ArrayList(length);
            for (int i18 = 0; i18 < length; i18++) {
                float f17 = fArr4[i18];
                float f18 = fArr3[i18];
                arrayList.add(new android.graphics.RectF(f17, f18, fArr2[i18] + f17, f18 + fArr[i18]));
            }
            if (!arrayList.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((android.graphics.RectF) it.next()).toString());
                }
                java.util.Iterator it6 = arrayList2.iterator();
                if (!it6.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it6.next();
                while (it6.hasNext()) {
                    next = ((java.lang.String) next) + ';' + ((java.lang.String) it6.next());
                }
                str = (java.lang.String) next;
            } else {
                str = "";
            }
            kotlin.jvm.internal.o.d(str);
            dVar.f40924i = arrayList;
        }
        com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub = (com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub) w0Var.f394095p.get(java.lang.Integer.valueOf(i17));
        if (mBSurfaceStub != null) {
            int length2 = fArr4.length;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(length2);
            for (int i19 = 0; i19 < length2; i19++) {
                float f19 = fArr4[i19];
                float f27 = fArr3[i19];
                arrayList3.add(new android.graphics.RectF(f19, f27, fArr2[i19] + f19, fArr[i19] + f27));
            }
            mBSurfaceStub.setTouchableRectList(arrayList3);
        }
        return jz5.f0.f302826a;
    }
}
