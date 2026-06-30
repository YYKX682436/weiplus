package q1;

/* loaded from: classes14.dex */
public abstract class g {
    public static final void a(q1.f fVar, p1.s event) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(event, "event");
        java.util.List list = event.f350888j;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        int size = list.size();
        int i17 = 0;
        while (true) {
            q1.b[] bVarArr = fVar.f359493a;
            if (i17 >= size) {
                long j17 = event.f350880b;
                long j18 = event.f350881c;
                int i18 = (fVar.f359494b + 1) % 20;
                fVar.f359494b = i18;
                bVarArr[i18] = new q1.b(j18, j17, null);
                return;
            }
            p1.e eVar = (p1.e) list.get(i17);
            long j19 = eVar.f350810a;
            long j27 = eVar.f350811b;
            int i19 = (fVar.f359494b + 1) % 20;
            fVar.f359494b = i19;
            bVarArr[i19] = new q1.b(j27, j19, null);
            i17++;
        }
    }

    public static final q1.c b(java.util.List x17, java.util.List y17, int i17) {
        kotlin.jvm.internal.o.g(x17, "x");
        kotlin.jvm.internal.o.g(y17, "y");
        if (i17 < 1) {
            throw new java.lang.IllegalArgumentException("The degree must be at positive integer");
        }
        if (x17.size() != y17.size()) {
            throw new java.lang.IllegalArgumentException("x and y must be the same length");
        }
        if (x17.isEmpty()) {
            throw new java.lang.IllegalArgumentException("At least one point must be provided");
        }
        int size = i17 >= x17.size() ? x17.size() - 1 : i17;
        int i18 = i17 + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(i18);
        for (int i19 = 0; i19 < i18; i19++) {
            arrayList.add(java.lang.Float.valueOf(0.0f));
        }
        int size2 = x17.size();
        int i27 = size + 1;
        q1.a aVar = new q1.a(i27, size2);
        int i28 = 0;
        while (true) {
            if (i28 >= size2) {
                break;
            }
            aVar.b(0, i28, 1.0f);
            for (int i29 = 1; i29 < i27; i29++) {
                aVar.b(i29, i28, aVar.a(i29 - 1, i28) * ((java.lang.Number) x17.get(i28)).floatValue());
            }
            i28++;
        }
        q1.a aVar2 = new q1.a(i27, size2);
        q1.a aVar3 = new q1.a(i27, i27);
        int i37 = 0;
        while (true) {
            q1.d[] dVarArr = aVar2.f359481a;
            if (i37 >= i27) {
                q1.d dVar = new q1.d(size2);
                for (int i38 = 0; i38 < size2; i38++) {
                    dVar.f359487b[i38] = java.lang.Float.valueOf(((java.lang.Number) y17.get(i38)).floatValue() * 1.0f);
                }
                int i39 = i27 - 1;
                for (int i47 = i39; -1 < i47; i47--) {
                    arrayList.set(i47, java.lang.Float.valueOf(dVarArr[i47].a(dVar)));
                    int i48 = i47 + 1;
                    if (i48 <= i39) {
                        int i49 = i39;
                        while (true) {
                            arrayList.set(i47, java.lang.Float.valueOf(((java.lang.Number) arrayList.get(i47)).floatValue() - (aVar3.a(i47, i49) * ((java.lang.Number) arrayList.get(i49)).floatValue())));
                            if (i49 != i48) {
                                i49--;
                            }
                        }
                    }
                    arrayList.set(i47, java.lang.Float.valueOf(((java.lang.Number) arrayList.get(i47)).floatValue() / aVar3.a(i47, i47)));
                }
                float f17 = 0.0f;
                for (int i57 = 0; i57 < size2; i57++) {
                    f17 += ((java.lang.Number) y17.get(i57)).floatValue();
                }
                float f18 = f17 / size2;
                float f19 = 0.0f;
                float f27 = 0.0f;
                for (int i58 = 0; i58 < size2; i58++) {
                    float floatValue = ((java.lang.Number) y17.get(i58)).floatValue() - ((java.lang.Number) arrayList.get(0)).floatValue();
                    float f28 = 1.0f;
                    for (int i59 = 1; i59 < i27; i59++) {
                        f28 *= ((java.lang.Number) x17.get(i58)).floatValue();
                        floatValue -= ((java.lang.Number) arrayList.get(i59)).floatValue() * f28;
                    }
                    f19 += floatValue * 1.0f * floatValue;
                    float floatValue2 = ((java.lang.Number) y17.get(i58)).floatValue() - f18;
                    f27 += floatValue2 * 1.0f * floatValue2;
                }
                return new q1.c(arrayList, f27 > 1.0E-6f ? 1.0f - (f19 / f27) : 1.0f);
            }
            for (int i66 = 0; i66 < size2; i66++) {
                aVar2.b(i37, i66, aVar.a(i37, i66));
            }
            for (int i67 = 0; i67 < i37; i67++) {
                float a17 = dVarArr[i37].a(dVarArr[i67]);
                for (int i68 = 0; i68 < size2; i68++) {
                    aVar2.b(i37, i68, aVar2.a(i37, i68) - (aVar2.a(i67, i68) * a17));
                }
            }
            q1.d dVar2 = dVarArr[i37];
            float sqrt = (float) java.lang.Math.sqrt(dVar2.a(dVar2));
            if (sqrt < 1.0E-6d) {
                throw new java.lang.IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f29 = 1.0f / sqrt;
            for (int i69 = 0; i69 < size2; i69++) {
                aVar2.b(i37, i69, aVar2.a(i37, i69) * f29);
            }
            int i76 = 0;
            while (i76 < i27) {
                aVar3.b(i37, i76, i76 < i37 ? 0.0f : dVarArr[i37].a(aVar.f359481a[i76]));
                i76++;
            }
            i37++;
        }
    }
}
