package r0;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final r0.u f367987e = new r0.u(0, 0, new java.lang.Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public int f367988a;

    /* renamed from: b, reason: collision with root package name */
    public int f367989b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.d f367990c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f367991d;

    public u(int i17, int i18, java.lang.Object[] buffer, t0.d dVar) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f367988a = i17;
        this.f367989b = i18;
        this.f367990c = dVar;
        this.f367991d = buffer;
    }

    public final java.lang.Object[] a(int i17, int i18, int i19, java.lang.Object obj, java.lang.Object obj2, int i27, t0.d dVar) {
        java.lang.Object obj3 = this.f367991d[i17];
        r0.u j17 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i17), i19, obj, obj2, i27 + 5, dVar);
        int t17 = t(i18) + 1;
        java.lang.Object[] objArr = this.f367991d;
        int i28 = t17 - 2;
        java.lang.Object[] objArr2 = new java.lang.Object[(objArr.length - 2) + 1];
        kz5.v.p(objArr, objArr2, 0, 0, i17, 6, null);
        kz5.v.k(objArr, objArr2, i17, i17 + 2, t17);
        objArr2[i28] = j17;
        kz5.v.k(objArr, objArr2, i28 + 1, t17, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f367989b == 0) {
            return this.f367991d.length / 2;
        }
        int bitCount = java.lang.Integer.bitCount(this.f367988a);
        int length = this.f367991d.length;
        for (int i17 = bitCount * 2; i17 < length; i17++) {
            bitCount += s(i17).b();
        }
        return bitCount;
    }

    public final boolean c(java.lang.Object obj) {
        e06.i l17 = e06.p.l(e06.p.m(0, this.f367991d.length), 2);
        int i17 = l17.f246209d;
        int i18 = l17.f246210e;
        int i19 = l17.f246211f;
        if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
            while (!kotlin.jvm.internal.o.b(obj, this.f367991d[i17])) {
                if (i17 != i18) {
                    i17 += i19;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i17, java.lang.Object obj, int i18) {
        int i19 = 1 << ((i17 >> i18) & 31);
        if (h(i19)) {
            return kotlin.jvm.internal.o.b(obj, this.f367991d[f(i19)]);
        }
        if (!i(i19)) {
            return false;
        }
        r0.u s17 = s(t(i19));
        return i18 == 30 ? s17.c(obj) : s17.d(i17, obj, i18 + 5);
    }

    public final boolean e(r0.u uVar) {
        if (this == uVar) {
            return true;
        }
        if (this.f367989b != uVar.f367989b || this.f367988a != uVar.f367988a) {
            return false;
        }
        int length = this.f367991d.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (this.f367991d[i17] != uVar.f367991d[i17]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i17) {
        return java.lang.Integer.bitCount((i17 - 1) & this.f367988a) * 2;
    }

    public final java.lang.Object g(int i17, java.lang.Object obj, int i18) {
        int i19 = 1 << ((i17 >> i18) & 31);
        if (h(i19)) {
            int f17 = f(i19);
            if (kotlin.jvm.internal.o.b(obj, this.f367991d[f17])) {
                return x(f17);
            }
            return null;
        }
        if (!i(i19)) {
            return null;
        }
        r0.u s17 = s(t(i19));
        if (i18 != 30) {
            return s17.g(i17, obj, i18 + 5);
        }
        e06.i l17 = e06.p.l(e06.p.m(0, s17.f367991d.length), 2);
        int i27 = l17.f246209d;
        int i28 = l17.f246210e;
        int i29 = l17.f246211f;
        if ((i29 <= 0 || i27 > i28) && (i29 >= 0 || i28 > i27)) {
            return null;
        }
        while (!kotlin.jvm.internal.o.b(obj, s17.f367991d[i27])) {
            if (i27 == i28) {
                return null;
            }
            i27 += i29;
        }
        return s17.x(i27);
    }

    public final boolean h(int i17) {
        return (i17 & this.f367988a) != 0;
    }

    public final boolean i(int i17) {
        return (i17 & this.f367989b) != 0;
    }

    public final r0.u j(int i17, java.lang.Object obj, java.lang.Object obj2, int i18, java.lang.Object obj3, java.lang.Object obj4, int i19, t0.d dVar) {
        if (i19 > 30) {
            return new r0.u(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, dVar);
        }
        int i27 = (i17 >> i19) & 31;
        int i28 = (i18 >> i19) & 31;
        if (i27 != i28) {
            return new r0.u((1 << i28) | (1 << i27), 0, i27 < i28 ? new java.lang.Object[]{obj, obj2, obj3, obj4} : new java.lang.Object[]{obj3, obj4, obj, obj2}, dVar);
        }
        return new r0.u(0, 1 << i27, new java.lang.Object[]{j(i17, obj, obj2, i18, obj3, obj4, i19 + 5, dVar)}, dVar);
    }

    public final r0.u k(int i17, r0.f fVar) {
        fVar.getClass();
        fVar.c(fVar.f367973i - 1);
        fVar.f367971g = x(i17);
        java.lang.Object[] objArr = this.f367991d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f367990c != fVar.f367969e) {
            return new r0.u(0, 0, r0.y.b(objArr, i17), fVar.f367969e);
        }
        this.f367991d = r0.y.b(objArr, i17);
        return this;
    }

    public final r0.u l(int i17, java.lang.Object obj, java.lang.Object obj2, int i18, r0.f mutator) {
        r0.u l17;
        kotlin.jvm.internal.o.g(mutator, "mutator");
        int i19 = 1 << ((i17 >> i18) & 31);
        boolean h17 = h(i19);
        t0.d dVar = this.f367990c;
        if (h17) {
            int f17 = f(i19);
            if (!kotlin.jvm.internal.o.b(obj, this.f367991d[f17])) {
                mutator.c(mutator.f367973i + 1);
                t0.d dVar2 = mutator.f367969e;
                if (dVar != dVar2) {
                    return new r0.u(this.f367988a ^ i19, this.f367989b | i19, a(f17, i19, i17, obj, obj2, i18, dVar2), dVar2);
                }
                this.f367991d = a(f17, i19, i17, obj, obj2, i18, dVar2);
                this.f367988a ^= i19;
                this.f367989b |= i19;
                return this;
            }
            mutator.f367971g = x(f17);
            if (x(f17) == obj2) {
                return this;
            }
            if (dVar == mutator.f367969e) {
                this.f367991d[f17 + 1] = obj2;
                return this;
            }
            mutator.f367972h++;
            java.lang.Object[] objArr = this.f367991d;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, size)");
            copyOf[f17 + 1] = obj2;
            return new r0.u(this.f367988a, this.f367989b, copyOf, mutator.f367969e);
        }
        if (!i(i19)) {
            mutator.c(mutator.f367973i + 1);
            t0.d dVar3 = mutator.f367969e;
            int f18 = f(i19);
            if (dVar != dVar3) {
                return new r0.u(this.f367988a | i19, this.f367989b, r0.y.a(this.f367991d, f18, obj, obj2), dVar3);
            }
            this.f367991d = r0.y.a(this.f367991d, f18, obj, obj2);
            this.f367988a |= i19;
            return this;
        }
        int t17 = t(i19);
        r0.u s17 = s(t17);
        if (i18 == 30) {
            e06.i l18 = e06.p.l(e06.p.m(0, s17.f367991d.length), 2);
            int i27 = l18.f246209d;
            int i28 = l18.f246210e;
            int i29 = l18.f246211f;
            if ((i29 > 0 && i27 <= i28) || (i29 < 0 && i28 <= i27)) {
                while (!kotlin.jvm.internal.o.b(obj, s17.f367991d[i27])) {
                    if (i27 != i28) {
                        i27 += i29;
                    }
                }
                mutator.f367971g = s17.x(i27);
                if (s17.f367990c == mutator.f367969e) {
                    s17.f367991d[i27 + 1] = obj2;
                    l17 = s17;
                } else {
                    mutator.f367972h++;
                    java.lang.Object[] objArr2 = s17.f367991d;
                    java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.o.f(copyOf2, "copyOf(this, size)");
                    copyOf2[i27 + 1] = obj2;
                    l17 = new r0.u(0, 0, copyOf2, mutator.f367969e);
                }
            }
            mutator.c(mutator.f367973i + 1);
            l17 = new r0.u(0, 0, r0.y.a(s17.f367991d, 0, obj, obj2), mutator.f367969e);
            break;
        }
        l17 = s17.l(i17, obj, obj2, i18 + 5, mutator);
        return s17 == l17 ? this : r(t17, l17, mutator.f367969e);
    }

    public final r0.u m(r0.u otherNode, int i17, t0.a intersectionCounter, r0.f mutator) {
        java.lang.Object[] objArr;
        int i18;
        r0.u uVar;
        int i19;
        r0.u j17;
        kotlin.jvm.internal.o.g(otherNode, "otherNode");
        kotlin.jvm.internal.o.g(intersectionCounter, "intersectionCounter");
        kotlin.jvm.internal.o.g(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.f414260a += b();
            return this;
        }
        int i27 = 0;
        if (i17 > 30) {
            t0.d dVar = mutator.f367969e;
            java.lang.Object[] objArr2 = this.f367991d;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length + otherNode.f367991d.length);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            int length = this.f367991d.length;
            e06.i l17 = e06.p.l(e06.p.m(0, otherNode.f367991d.length), 2);
            int i28 = l17.f246209d;
            int i29 = l17.f246210e;
            int i37 = l17.f246211f;
            if ((i37 > 0 && i28 <= i29) || (i37 < 0 && i29 <= i28)) {
                while (true) {
                    if (c(otherNode.f367991d[i28])) {
                        intersectionCounter.f414260a++;
                    } else {
                        java.lang.Object[] objArr3 = otherNode.f367991d;
                        copyOf[length] = objArr3[i28];
                        copyOf[length + 1] = objArr3[i28 + 1];
                        length += 2;
                    }
                    if (i28 == i29) {
                        break;
                    }
                    i28 += i37;
                }
            }
            if (length == this.f367991d.length) {
                return this;
            }
            if (length == otherNode.f367991d.length) {
                return otherNode;
            }
            if (length == copyOf.length) {
                return new r0.u(0, 0, copyOf, dVar);
            }
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(copyOf, length);
            kotlin.jvm.internal.o.f(copyOf2, "copyOf(this, newSize)");
            return new r0.u(0, 0, copyOf2, dVar);
        }
        int i38 = this.f367989b | otherNode.f367989b;
        int i39 = this.f367988a;
        int i47 = otherNode.f367988a;
        int i48 = (i39 ^ i47) & (~i38);
        int i49 = i39 & i47;
        int i57 = i48;
        while (i49 != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i49);
            if (kotlin.jvm.internal.o.b(this.f367991d[f(lowestOneBit)], otherNode.f367991d[otherNode.f(lowestOneBit)])) {
                i57 |= lowestOneBit;
            } else {
                i38 |= lowestOneBit;
            }
            i49 ^= lowestOneBit;
        }
        if (!((i38 & i57) == 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r0.u uVar2 = (kotlin.jvm.internal.o.b(this.f367990c, mutator.f367969e) && this.f367988a == i57 && this.f367989b == i38) ? this : new r0.u(i57, i38, new java.lang.Object[(java.lang.Integer.bitCount(i57) * 2) + java.lang.Integer.bitCount(i38)]);
        int i58 = i38;
        int i59 = 0;
        while (i58 != 0) {
            int lowestOneBit2 = java.lang.Integer.lowestOneBit(i58);
            java.lang.Object[] objArr4 = uVar2.f367991d;
            int length2 = (objArr4.length - 1) - i59;
            if (i(lowestOneBit2)) {
                j17 = s(t(lowestOneBit2));
                if (otherNode.i(lowestOneBit2)) {
                    j17 = j17.m(otherNode.s(otherNode.t(lowestOneBit2)), i17 + 5, intersectionCounter, mutator);
                } else if (otherNode.h(lowestOneBit2)) {
                    int f17 = otherNode.f(lowestOneBit2);
                    java.lang.Object obj = otherNode.f367991d[f17];
                    java.lang.Object x17 = otherNode.x(f17);
                    int i66 = mutator.f367973i;
                    objArr = objArr4;
                    j17 = j17.l(obj != null ? obj.hashCode() : i27, obj, x17, i17 + 5, mutator);
                    if (mutator.f367973i == i66) {
                        intersectionCounter.f414260a++;
                    }
                }
                objArr = objArr4;
            } else {
                objArr = objArr4;
                if (otherNode.i(lowestOneBit2)) {
                    j17 = otherNode.s(otherNode.t(lowestOneBit2));
                    if (h(lowestOneBit2)) {
                        int f18 = f(lowestOneBit2);
                        java.lang.Object obj2 = this.f367991d[f18];
                        int i67 = i17 + 5;
                        if (j17.d(obj2 != null ? obj2.hashCode() : 0, obj2, i67)) {
                            intersectionCounter.f414260a++;
                        } else {
                            j17 = j17.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f18), i67, mutator);
                        }
                    }
                } else {
                    int f19 = f(lowestOneBit2);
                    java.lang.Object obj3 = this.f367991d[f19];
                    java.lang.Object x18 = x(f19);
                    int f27 = otherNode.f(lowestOneBit2);
                    java.lang.Object obj4 = otherNode.f367991d[f27];
                    i18 = lowestOneBit2;
                    uVar = uVar2;
                    i19 = i57;
                    j17 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x18, obj4 != null ? obj4.hashCode() : 0, obj4, otherNode.x(f27), i17 + 5, mutator.f367969e);
                    objArr[length2] = j17;
                    i59++;
                    i58 ^= i18;
                    uVar2 = uVar;
                    i57 = i19;
                    i27 = 0;
                }
            }
            i18 = lowestOneBit2;
            uVar = uVar2;
            i19 = i57;
            objArr[length2] = j17;
            i59++;
            i58 ^= i18;
            uVar2 = uVar;
            i57 = i19;
            i27 = 0;
        }
        r0.u uVar3 = uVar2;
        int i68 = 0;
        while (i57 != 0) {
            int lowestOneBit3 = java.lang.Integer.lowestOneBit(i57);
            int i69 = i68 * 2;
            if (otherNode.h(lowestOneBit3)) {
                int f28 = otherNode.f(lowestOneBit3);
                java.lang.Object[] objArr5 = uVar3.f367991d;
                objArr5[i69] = otherNode.f367991d[f28];
                objArr5[i69 + 1] = otherNode.x(f28);
                if (h(lowestOneBit3)) {
                    intersectionCounter.f414260a++;
                }
            } else {
                int f29 = f(lowestOneBit3);
                java.lang.Object[] objArr6 = uVar3.f367991d;
                objArr6[i69] = this.f367991d[f29];
                objArr6[i69 + 1] = x(f29);
            }
            i68++;
            i57 ^= lowestOneBit3;
        }
        return e(uVar3) ? this : otherNode.e(uVar3) ? otherNode : uVar3;
    }

    public final r0.u n(int i17, java.lang.Object obj, int i18, r0.f mutator) {
        r0.u n17;
        kotlin.jvm.internal.o.g(mutator, "mutator");
        int i19 = 1 << ((i17 >> i18) & 31);
        if (h(i19)) {
            int f17 = f(i19);
            return kotlin.jvm.internal.o.b(obj, this.f367991d[f17]) ? p(f17, i19, mutator) : this;
        }
        if (!i(i19)) {
            return this;
        }
        int t17 = t(i19);
        r0.u s17 = s(t17);
        if (i18 == 30) {
            e06.i l17 = e06.p.l(e06.p.m(0, s17.f367991d.length), 2);
            int i27 = l17.f246209d;
            int i28 = l17.f246210e;
            int i29 = l17.f246211f;
            if ((i29 > 0 && i27 <= i28) || (i29 < 0 && i28 <= i27)) {
                while (!kotlin.jvm.internal.o.b(obj, s17.f367991d[i27])) {
                    if (i27 != i28) {
                        i27 += i29;
                    }
                }
                n17 = s17.k(i27, mutator);
            }
            n17 = s17;
            break;
        }
        n17 = s17.n(i17, obj, i18 + 5, mutator);
        return q(s17, n17, t17, i19, mutator.f367969e);
    }

    public final r0.u o(int i17, java.lang.Object obj, java.lang.Object obj2, int i18, r0.f mutator) {
        r0.u o17;
        kotlin.jvm.internal.o.g(mutator, "mutator");
        int i19 = 1 << ((i17 >> i18) & 31);
        if (h(i19)) {
            int f17 = f(i19);
            return (kotlin.jvm.internal.o.b(obj, this.f367991d[f17]) && kotlin.jvm.internal.o.b(obj2, x(f17))) ? p(f17, i19, mutator) : this;
        }
        if (!i(i19)) {
            return this;
        }
        int t17 = t(i19);
        r0.u s17 = s(t17);
        if (i18 == 30) {
            e06.i l17 = e06.p.l(e06.p.m(0, s17.f367991d.length), 2);
            int i27 = l17.f246209d;
            int i28 = l17.f246210e;
            int i29 = l17.f246211f;
            if ((i29 > 0 && i27 <= i28) || (i29 < 0 && i28 <= i27)) {
                while (true) {
                    if (!kotlin.jvm.internal.o.b(obj, s17.f367991d[i27]) || !kotlin.jvm.internal.o.b(obj2, s17.x(i27))) {
                        if (i27 == i28) {
                            break;
                        }
                        i27 += i29;
                    } else {
                        o17 = s17.k(i27, mutator);
                        break;
                    }
                }
            }
            o17 = s17;
        } else {
            o17 = s17.o(i17, obj, obj2, i18 + 5, mutator);
        }
        return q(s17, o17, t17, i19, mutator.f367969e);
    }

    public final r0.u p(int i17, int i18, r0.f fVar) {
        fVar.getClass();
        fVar.c(fVar.f367973i - 1);
        fVar.f367971g = x(i17);
        java.lang.Object[] objArr = this.f367991d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f367990c != fVar.f367969e) {
            return new r0.u(i18 ^ this.f367988a, this.f367989b, r0.y.b(objArr, i17), fVar.f367969e);
        }
        this.f367991d = r0.y.b(objArr, i17);
        this.f367988a ^= i18;
        return this;
    }

    public final r0.u q(r0.u uVar, r0.u uVar2, int i17, int i18, t0.d dVar) {
        t0.d dVar2 = this.f367990c;
        if (uVar2 == null) {
            java.lang.Object[] objArr = this.f367991d;
            if (objArr.length == 1) {
                return null;
            }
            if (dVar2 != dVar) {
                return new r0.u(this.f367988a, i18 ^ this.f367989b, r0.y.c(objArr, i17), dVar);
            }
            this.f367991d = r0.y.c(objArr, i17);
            this.f367989b ^= i18;
        } else if (dVar2 == dVar || uVar != uVar2) {
            return r(i17, uVar2, dVar);
        }
        return this;
    }

    public final r0.u r(int i17, r0.u uVar, t0.d dVar) {
        java.lang.Object[] objArr = this.f367991d;
        if (objArr.length == 1 && uVar.f367991d.length == 2 && uVar.f367989b == 0) {
            uVar.f367988a = this.f367989b;
            return uVar;
        }
        if (this.f367990c == dVar) {
            objArr[i17] = uVar;
            return this;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, size)");
        copyOf[i17] = uVar;
        return new r0.u(this.f367988a, this.f367989b, copyOf, dVar);
    }

    public final r0.u s(int i17) {
        java.lang.Object obj = this.f367991d[i17];
        if (obj != null) {
            return (r0.u) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int t(int i17) {
        return (this.f367991d.length - 1) - java.lang.Integer.bitCount((i17 - 1) & this.f367989b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r0.t u(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.u.u(int, java.lang.Object, java.lang.Object, int):r0.t");
    }

    public final r0.u v(int i17, java.lang.Object obj, int i18) {
        r0.u v17;
        int i19 = 1 << ((i17 >> i18) & 31);
        if (h(i19)) {
            int f17 = f(i19);
            if (!kotlin.jvm.internal.o.b(obj, this.f367991d[f17])) {
                return this;
            }
            java.lang.Object[] objArr = this.f367991d;
            if (objArr.length == 2) {
                return null;
            }
            return new r0.u(this.f367988a ^ i19, this.f367989b, r0.y.b(objArr, f17));
        }
        if (!i(i19)) {
            return this;
        }
        int t17 = t(i19);
        r0.u s17 = s(t17);
        if (i18 == 30) {
            e06.i l17 = e06.p.l(e06.p.m(0, s17.f367991d.length), 2);
            int i27 = l17.f246209d;
            int i28 = l17.f246210e;
            int i29 = l17.f246211f;
            if ((i29 > 0 && i27 <= i28) || (i29 < 0 && i28 <= i27)) {
                while (!kotlin.jvm.internal.o.b(obj, s17.f367991d[i27])) {
                    if (i27 != i28) {
                        i27 += i29;
                    }
                }
                java.lang.Object[] objArr2 = s17.f367991d;
                v17 = objArr2.length == 2 ? null : new r0.u(0, 0, r0.y.b(objArr2, i27));
            }
            v17 = s17;
            break;
        }
        v17 = s17.v(i17, obj, i18 + 5);
        if (v17 != null) {
            return s17 != v17 ? w(t17, i19, v17) : this;
        }
        java.lang.Object[] objArr3 = this.f367991d;
        if (objArr3.length == 1) {
            return null;
        }
        return new r0.u(this.f367988a, this.f367989b ^ i19, r0.y.c(objArr3, t17));
    }

    public final r0.u w(int i17, int i18, r0.u uVar) {
        java.lang.Object[] objArr = uVar.f367991d;
        if (objArr.length != 2 || uVar.f367989b != 0) {
            java.lang.Object[] objArr2 = this.f367991d;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            copyOf[i17] = uVar;
            return new r0.u(this.f367988a, this.f367989b, copyOf);
        }
        if (this.f367991d.length == 1) {
            uVar.f367988a = this.f367989b;
            return uVar;
        }
        int f17 = f(i18);
        java.lang.Object[] objArr3 = this.f367991d;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.o.f(copyOf2, "copyOf(this, newSize)");
        kz5.v.k(copyOf2, copyOf2, i17 + 2, i17 + 1, objArr3.length);
        kz5.v.k(copyOf2, copyOf2, f17 + 2, f17, i17);
        copyOf2[f17] = obj;
        copyOf2[f17 + 1] = obj2;
        return new r0.u(this.f367988a ^ i18, i18 ^ this.f367989b, copyOf2);
    }

    public final java.lang.Object x(int i17) {
        return this.f367991d[i17 + 1];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(int i17, int i18, java.lang.Object[] buffer) {
        this(i17, i18, buffer, null);
        kotlin.jvm.internal.o.g(buffer, "buffer");
    }
}
