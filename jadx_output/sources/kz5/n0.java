package kz5;

/* loaded from: classes14.dex */
public abstract class n0 extends kz5.j0 {
    public static final java.lang.Object A0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final java.lang.Object B0(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final java.util.List C0(java.util.List list, e06.k indices) {
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(indices, "indices");
        return indices.isEmpty() ? kz5.p0.f313996d : S0(list.subList(indices.h().intValue(), indices.g().intValue() + 1));
    }

    public static final java.util.List D0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List U0 = U0(iterable);
            kz5.g0.s(U0);
            return U0;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return S0(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Comparable[0]);
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) array;
        kotlin.jvm.internal.o.g(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            java.util.Arrays.sort(comparableArr);
        }
        return kz5.v.f(array);
    }

    public static final java.util.List E0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        return F0(iterable, mz5.d.f333360d);
    }

    public static final java.util.List F0(java.lang.Iterable iterable, java.util.Comparator comparator) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(comparator, "comparator");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List U0 = U0(iterable);
            kz5.g0.t(U0, comparator);
            return U0;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return S0(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Object[0]);
        kz5.v.A(array, comparator);
        return kz5.v.f(array);
    }

    public static final java.util.Set G0(java.lang.Iterable iterable, java.lang.Iterable other) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(other, "other");
        java.util.Set W0 = W0(iterable);
        W0.removeAll(kz5.h0.x(other));
        return W0;
    }

    public static final float H0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        float f17 = 0.0f;
        while (it.hasNext()) {
            f17 += ((java.lang.Number) it.next()).floatValue();
        }
        return f17;
    }

    public static final int I0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((java.lang.Number) it.next()).intValue();
        }
        return i17;
    }

    public static final q26.n J(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        return new kz5.k0(iterable);
    }

    public static final long J0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((java.lang.Number) it.next()).longValue();
        }
        return j17;
    }

    public static final double K(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        double d17 = 0.0d;
        int i17 = 0;
        while (it.hasNext()) {
            d17 += ((java.lang.Number) it.next()).floatValue();
            i17++;
            if (i17 < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        if (i17 == 0) {
            return Double.NaN;
        }
        return d17 / i17;
    }

    public static final java.util.List K0(java.lang.Iterable iterable, int i17) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        int i18 = 0;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
        }
        if (i17 == 0) {
            return kz5.p0.f313996d;
        }
        if (iterable instanceof java.util.Collection) {
            if (i17 >= ((java.util.Collection) iterable).size()) {
                return S0(iterable);
            }
            if (i17 == 1) {
                return kz5.b0.c(W(iterable));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i18++;
            if (i18 == i17) {
                break;
            }
        }
        return kz5.c0.l(arrayList);
    }

    public static final double L(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        double d17 = 0.0d;
        int i17 = 0;
        while (it.hasNext()) {
            d17 += ((java.lang.Number) it.next()).intValue();
            i17++;
            if (i17 < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        if (i17 == 0) {
            return Double.NaN;
        }
        return d17 / i17;
    }

    public static final java.util.List L0(java.util.List list, int i17) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
        }
        if (i17 == 0) {
            return kz5.p0.f313996d;
        }
        int size = list.size();
        if (i17 >= size) {
            return S0(list);
        }
        if (i17 == 1) {
            return kz5.b0.c(i0(list));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        if (list instanceof java.util.RandomAccess) {
            for (int i18 = size - i17; i18 < size; i18++) {
                arrayList.add(list.get(i18));
            }
        } else {
            java.util.ListIterator listIterator = list.listIterator(size - i17);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final double M(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        double d17 = 0.0d;
        int i17 = 0;
        while (it.hasNext()) {
            d17 += ((java.lang.Number) it.next()).longValue();
            i17++;
            if (i17 < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        if (i17 == 0) {
            return Double.NaN;
        }
        return d17 / i17;
    }

    public static final boolean[] M0(java.util.Collection collection) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            zArr[i17] = ((java.lang.Boolean) it.next()).booleanValue();
            i17++;
        }
        return zArr;
    }

    public static final java.util.List N(java.lang.Iterable iterable, int i17) {
        java.util.Iterator it;
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kz5.s1.a(i17, i17);
        if (!(iterable instanceof java.util.RandomAccess) || !(iterable instanceof java.util.List)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator iterator = iterable.iterator();
            kotlin.jvm.internal.o.g(iterator, "iterator");
            if (iterator.hasNext()) {
                kz5.r1 r1Var = new kz5.r1(i17, i17, iterator, false, true, null);
                q26.o oVar = new q26.o();
                oVar.f359881g = pz5.f.a(r1Var, oVar, oVar);
                it = oVar;
            } else {
                it = kz5.o0.f313993d;
            }
            while (it.hasNext()) {
                arrayList.add((java.util.List) it.next());
            }
            return arrayList;
        }
        java.util.List list = (java.util.List) iterable;
        int size = list.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList((size / i17) + (size % i17 == 0 ? 0 : 1));
        int i18 = 0;
        while (true) {
            if (!(i18 >= 0 && i18 < size)) {
                return arrayList2;
            }
            int i19 = size - i18;
            if (i17 <= i19) {
                i19 = i17;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(i19);
            for (int i27 = 0; i27 < i19; i27++) {
                arrayList3.add(list.get(i27 + i18));
            }
            arrayList2.add(arrayList3);
            i18 += i17;
        }
    }

    public static final byte[] N0(java.util.Collection collection) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            bArr[i17] = ((java.lang.Number) it.next()).byteValue();
            i17++;
        }
        return bArr;
    }

    public static final boolean O(java.lang.Iterable iterable, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).contains(obj) : b0(iterable, obj) >= 0;
    }

    public static final java.util.Collection O0(java.lang.Iterable iterable, java.util.Collection destination) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final int P(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).size();
        }
        java.util.Iterator it = iterable.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            it.next();
            i17++;
            if (i17 < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    public static final float[] P0(java.util.Collection collection) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            fArr[i17] = ((java.lang.Number) it.next()).floatValue();
            i17++;
        }
        return fArr;
    }

    public static final java.util.List Q(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        return S0(W0(iterable));
    }

    public static final java.util.HashSet Q0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.HashSet hashSet = new java.util.HashSet(kz5.b1.d(kz5.d0.q(iterable, 12)));
        O0(iterable, hashSet);
        return hashSet;
    }

    public static final java.util.List R(java.lang.Iterable iterable, int i17) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(iterable, "<this>");
        int i18 = 0;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
        }
        if (i17 == 0) {
            return S0(iterable);
        }
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size() - i17;
            if (size <= 0) {
                return kz5.p0.f313996d;
            }
            if (size == 1) {
                return kz5.b0.c(h0(iterable));
            }
            arrayList = new java.util.ArrayList(size);
            if (iterable instanceof java.util.List) {
                if (iterable instanceof java.util.RandomAccess) {
                    int size2 = collection.size();
                    while (i17 < size2) {
                        arrayList.add(((java.util.List) iterable).get(i17));
                        i17++;
                    }
                } else {
                    java.util.ListIterator listIterator = ((java.util.List) iterable).listIterator(i17);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        for (java.lang.Object obj : iterable) {
            if (i18 >= i17) {
                arrayList.add(obj);
            } else {
                i18++;
            }
        }
        return kz5.c0.l(arrayList);
    }

    public static final int[] R0(java.util.Collection collection) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            iArr[i17] = ((java.lang.Number) it.next()).intValue();
            i17++;
        }
        return iArr;
    }

    public static final java.util.List S(java.util.List list, int i17) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (i17 >= 0) {
            int size = list.size() - i17;
            return K0(list, size >= 0 ? size : 0);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
    }

    public static final java.util.List S0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            return kz5.c0.l(U0(iterable));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return kz5.p0.f313996d;
        }
        if (size != 1) {
            return V0(collection);
        }
        return kz5.b0.c(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : iterable.iterator().next());
    }

    public static final java.lang.Object T(java.lang.Iterable iterable, int i17) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        boolean z17 = iterable instanceof java.util.List;
        if (z17) {
            return ((java.util.List) iterable).get(i17);
        }
        kz5.l0 l0Var = new kz5.l0(i17);
        int i18 = 0;
        if (z17) {
            java.util.List list = (java.util.List) iterable;
            if (i17 >= 0 && i17 < list.size()) {
                i18 = 1;
            }
            if (i18 != 0) {
                return list.get(i17);
            }
            l0Var.invoke(java.lang.Integer.valueOf(i17));
            throw null;
        }
        if (i17 < 0) {
            l0Var.invoke(java.lang.Integer.valueOf(i17));
            throw null;
        }
        for (java.lang.Object obj : iterable) {
            int i19 = i18 + 1;
            if (i17 == i18) {
                return obj;
            }
            i18 = i19;
        }
        l0Var.invoke(java.lang.Integer.valueOf(i17));
        throw null;
    }

    public static final long[] T0(java.util.Collection collection) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            jArr[i17] = ((java.lang.Number) it.next()).longValue();
            i17++;
        }
        return jArr;
    }

    public static final java.util.List U(java.lang.Iterable iterable, yz5.l predicate) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (((java.lang.Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List U0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return V0((java.util.Collection) iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        O0(iterable, arrayList);
        return arrayList;
    }

    public static final java.util.List V(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List V0(java.util.Collection collection) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        return new java.util.ArrayList(collection);
    }

    public static final java.lang.Object W(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return X((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.util.NoSuchElementException("Collection is empty.");
    }

    public static final java.util.Set W0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return new java.util.LinkedHashSet((java.util.Collection) iterable);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        O0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final java.lang.Object X(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final java.util.Set X0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        boolean z17 = iterable instanceof java.util.Collection;
        kz5.r0 r0Var = kz5.r0.f314002d;
        if (!z17) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            O0(iterable, linkedHashSet);
            java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
            int size = linkedHashSet2.size();
            return size != 0 ? size != 1 ? linkedHashSet2 : kz5.o1.c(linkedHashSet2.iterator().next()) : r0Var;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return r0Var;
        }
        if (size2 == 1) {
            return kz5.o1.c(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : iterable.iterator().next());
        }
        java.util.LinkedHashSet linkedHashSet3 = new java.util.LinkedHashSet(kz5.b1.d(collection.size()));
        O0(iterable, linkedHashSet3);
        return linkedHashSet3;
    }

    public static final java.lang.Object Y(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final java.util.Set Y0(java.lang.Iterable iterable, java.lang.Iterable other) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(other, "other");
        java.util.Set W0 = W0(iterable);
        kz5.h0.u(W0, other);
        return W0;
    }

    public static final java.lang.Object Z(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final java.lang.Iterable Z0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        return new kz5.v0(new kz5.m0(iterable));
    }

    public static final java.lang.Object a0(java.util.List list, int i17) {
        kotlin.jvm.internal.o.g(list, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < list.size()) {
            z17 = true;
        }
        if (z17) {
            return list.get(i17);
        }
        return null;
    }

    public static final java.util.List a1(java.lang.Iterable iterable, java.lang.Iterable other) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(other, "other");
        java.util.Iterator it = iterable.iterator();
        java.util.Iterator it6 = other.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(kz5.d0.q(iterable, 10), kz5.d0.q(other, 10)));
        while (it.hasNext() && it6.hasNext()) {
            arrayList.add(new jz5.l(it.next(), it6.next()));
        }
        return arrayList;
    }

    public static final int b0(java.lang.Iterable iterable, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return ((java.util.List) iterable).indexOf(obj);
        }
        int i17 = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (kotlin.jvm.internal.o.b(obj, obj2)) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public static final int c0(java.util.List list, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(list, "<this>");
        return list.indexOf(obj);
    }

    public static final java.util.Set d0(java.lang.Iterable iterable, java.lang.Iterable other) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(other, "other");
        java.util.Set W0 = W0(iterable);
        W0.retainAll(kz5.h0.x(other));
        return W0;
    }

    public static final java.lang.Appendable e0(java.lang.Iterable iterable, java.lang.Appendable buffer, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i17, java.lang.CharSequence truncated, yz5.l lVar) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(separator, "separator");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(postfix, "postfix");
        kotlin.jvm.internal.o.g(truncated, "truncated");
        buffer.append(prefix);
        int i18 = 0;
        for (java.lang.Object obj : iterable) {
            i18++;
            if (i18 > 1) {
                buffer.append(separator);
            }
            if (i17 >= 0 && i18 > i17) {
                break;
            }
            r26.y.a(buffer, obj, lVar);
        }
        if (i17 >= 0 && i18 > i17) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ java.lang.Appendable f0(java.lang.Iterable iterable, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i17, java.lang.CharSequence charSequence4, yz5.l lVar, int i18, java.lang.Object obj) {
        e0(iterable, appendable, (i18 & 2) != 0 ? ", " : charSequence, (i18 & 4) != 0 ? "" : charSequence2, (i18 & 8) == 0 ? charSequence3 : "", (i18 & 16) != 0 ? -1 : i17, (i18 & 32) != 0 ? "..." : charSequence4, (i18 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static java.lang.String g0(java.lang.Iterable iterable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i17, java.lang.CharSequence charSequence4, yz5.l lVar, int i18, java.lang.Object obj) {
        java.lang.CharSequence separator = (i18 & 1) != 0 ? ", " : charSequence;
        java.lang.CharSequence prefix = (i18 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence postfix = (i18 & 4) == 0 ? charSequence3 : "";
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        java.lang.CharSequence truncated = (i18 & 16) != 0 ? "..." : charSequence4;
        yz5.l lVar2 = (i18 & 32) != 0 ? null : lVar;
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(separator, "separator");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(postfix, "postfix");
        kotlin.jvm.internal.o.g(truncated, "truncated");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        e0(iterable, sb6, separator, prefix, postfix, i19, truncated, lVar2);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final java.lang.Object h0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return i0((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final java.lang.Object i0(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(kz5.c0.h(list));
    }

    public static final java.lang.Object j0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final java.lang.Object k0(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final java.util.List l0(java.lang.Iterable iterable, yz5.l transform) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(transform, "transform");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final java.lang.Comparable m0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final java.lang.Float n0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((java.lang.Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = java.lang.Math.max(floatValue, ((java.lang.Number) it.next()).floatValue());
        }
        return java.lang.Float.valueOf(floatValue);
    }

    public static final java.lang.Comparable o0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final java.lang.Float p0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((java.lang.Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = java.lang.Math.min(floatValue, ((java.lang.Number) it.next()).floatValue());
        }
        return java.lang.Float.valueOf(floatValue);
    }

    public static final java.util.List q0(java.lang.Iterable iterable, java.lang.Iterable elements) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Collection x17 = kz5.h0.x(elements);
        if (x17.isEmpty()) {
            return S0(iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (!x17.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List r0(java.lang.Iterable iterable, java.lang.Iterable elements) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        if (iterable instanceof java.util.Collection) {
            return t0((java.util.Collection) iterable, elements);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kz5.h0.u(arrayList, iterable);
        kz5.h0.u(arrayList, elements);
        return arrayList;
    }

    public static final java.util.List s0(java.lang.Iterable iterable, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return u0((java.util.Collection) iterable, obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kz5.h0.u(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static final java.util.List t0(java.util.Collection collection, java.lang.Iterable elements) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        if (!(elements instanceof java.util.Collection)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            kz5.h0.u(arrayList, elements);
            return arrayList;
        }
        java.util.Collection collection2 = (java.util.Collection) elements;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final java.util.List u0(java.util.Collection collection, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final java.lang.Object v0(java.util.Collection collection, c06.e random) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(random, "random");
        if (collection.isEmpty()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        return T(collection, random.d(collection.size()));
    }

    public static final java.lang.Object w0(java.util.Collection collection, c06.e random) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return T(collection, random.d(collection.size()));
    }

    public static final java.util.List x0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).size() <= 1) {
            return S0(iterable);
        }
        java.util.List U0 = U0(iterable);
        java.util.Collections.reverse(U0);
        return U0;
    }

    public static final java.lang.Object y0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return z0((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            throw new java.lang.IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final java.lang.Object z0(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new java.lang.IllegalArgumentException("List has more than one element.");
    }
}
