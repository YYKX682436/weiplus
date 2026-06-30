package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public final class c implements com.tencent.mm.xcompat.recyclerview.widget.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.a f214471d;

    /* renamed from: a, reason: collision with root package name */
    public final m3.e f214468a = new m3.f(30);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f214469b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f214470c = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f214473f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.h0 f214472e = new com.tencent.mm.xcompat.recyclerview.widget.h0(this);

    public c(com.tencent.mm.xcompat.recyclerview.widget.a aVar) {
        this.f214471d = aVar;
    }

    public final boolean a(int i17) {
        java.util.ArrayList arrayList = this.f214470c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mm.xcompat.recyclerview.widget.b bVar = (com.tencent.mm.xcompat.recyclerview.widget.b) arrayList.get(i18);
            int i19 = bVar.f214453a;
            if (i19 == 8) {
                if (f(bVar.f214456d, i18 + 1) == i17) {
                    return true;
                }
            } else if (i19 == 1) {
                int i27 = bVar.f214454b;
                int i28 = bVar.f214456d + i27;
                while (i27 < i28) {
                    if (f(i27, i18 + 1) == i17) {
                        return true;
                    }
                    i27++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        java.util.ArrayList arrayList = this.f214470c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.tencent.mm.xcompat.recyclerview.widget.s0) this.f214471d).a((com.tencent.mm.xcompat.recyclerview.widget.b) arrayList.get(i17));
        }
        l(arrayList);
        this.f214473f = 0;
    }

    public void c() {
        b();
        java.util.ArrayList arrayList = this.f214469b;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.xcompat.recyclerview.widget.b bVar = (com.tencent.mm.xcompat.recyclerview.widget.b) arrayList.get(i17);
            int i18 = bVar.f214453a;
            com.tencent.mm.xcompat.recyclerview.widget.a aVar = this.f214471d;
            if (i18 == 1) {
                com.tencent.mm.xcompat.recyclerview.widget.s0 s0Var = (com.tencent.mm.xcompat.recyclerview.widget.s0) aVar;
                s0Var.a(bVar);
                s0Var.d(bVar.f214454b, bVar.f214456d);
            } else if (i18 == 2) {
                com.tencent.mm.xcompat.recyclerview.widget.s0 s0Var2 = (com.tencent.mm.xcompat.recyclerview.widget.s0) aVar;
                s0Var2.a(bVar);
                int i19 = bVar.f214454b;
                int i27 = bVar.f214456d;
                com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = s0Var2.f214631a;
                recyclerView.O(i19, i27, true);
                recyclerView.I1 = true;
                recyclerView.F1.f214648c += i27;
            } else if (i18 == 4) {
                com.tencent.mm.xcompat.recyclerview.widget.s0 s0Var3 = (com.tencent.mm.xcompat.recyclerview.widget.s0) aVar;
                s0Var3.a(bVar);
                s0Var3.c(bVar.f214454b, bVar.f214456d, bVar.f214455c);
            } else if (i18 == 8) {
                com.tencent.mm.xcompat.recyclerview.widget.s0 s0Var4 = (com.tencent.mm.xcompat.recyclerview.widget.s0) aVar;
                s0Var4.a(bVar);
                s0Var4.e(bVar.f214454b, bVar.f214456d);
            }
        }
        l(arrayList);
        this.f214473f = 0;
    }

    public final void d(com.tencent.mm.xcompat.recyclerview.widget.b bVar) {
        int i17;
        int i18 = bVar.f214453a;
        if (i18 == 1 || i18 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m17 = m(bVar.f214454b, i18);
        int i19 = bVar.f214454b;
        int i27 = bVar.f214453a;
        if (i27 == 2) {
            i17 = 0;
        } else {
            if (i27 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update." + bVar);
            }
            i17 = 1;
        }
        int i28 = 1;
        for (int i29 = 1; i29 < bVar.f214456d; i29++) {
            int m18 = m(bVar.f214454b + (i17 * i29), bVar.f214453a);
            int i37 = bVar.f214453a;
            if (i37 == 2 ? m18 == m17 : i37 == 4 && m18 == m17 + 1) {
                i28++;
            } else {
                com.tencent.mm.xcompat.recyclerview.widget.b h17 = h(i37, m17, i28, bVar.f214455c);
                e(h17, i19);
                k(h17);
                if (bVar.f214453a == 4) {
                    i19 += i28;
                }
                i28 = 1;
                m17 = m18;
            }
        }
        java.lang.Object obj = bVar.f214455c;
        k(bVar);
        if (i28 > 0) {
            com.tencent.mm.xcompat.recyclerview.widget.b h18 = h(bVar.f214453a, m17, i28, obj);
            e(h18, i19);
            k(h18);
        }
    }

    public void e(com.tencent.mm.xcompat.recyclerview.widget.b bVar, int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.s0 s0Var = (com.tencent.mm.xcompat.recyclerview.widget.s0) this.f214471d;
        s0Var.a(bVar);
        int i18 = bVar.f214453a;
        if (i18 != 2) {
            if (i18 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            s0Var.c(i17, bVar.f214456d, bVar.f214455c);
        } else {
            int i19 = bVar.f214456d;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = s0Var.f214631a;
            recyclerView.O(i17, i19, true);
            recyclerView.I1 = true;
            recyclerView.F1.f214648c += i19;
        }
    }

    public int f(int i17, int i18) {
        java.util.ArrayList arrayList = this.f214470c;
        int size = arrayList.size();
        while (i18 < size) {
            com.tencent.mm.xcompat.recyclerview.widget.b bVar = (com.tencent.mm.xcompat.recyclerview.widget.b) arrayList.get(i18);
            int i19 = bVar.f214453a;
            if (i19 == 8) {
                int i27 = bVar.f214454b;
                if (i27 == i17) {
                    i17 = bVar.f214456d;
                } else {
                    if (i27 < i17) {
                        i17--;
                    }
                    if (bVar.f214456d <= i17) {
                        i17++;
                    }
                }
            } else {
                int i28 = bVar.f214454b;
                if (i28 > i17) {
                    continue;
                } else if (i19 == 2) {
                    int i29 = bVar.f214456d;
                    if (i17 < i28 + i29) {
                        return -1;
                    }
                    i17 -= i29;
                } else if (i19 == 1) {
                    i17 += bVar.f214456d;
                }
            }
            i18++;
        }
        return i17;
    }

    public boolean g() {
        return this.f214469b.size() > 0;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.b h(int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.mm.xcompat.recyclerview.widget.b bVar = (com.tencent.mm.xcompat.recyclerview.widget.b) ((m3.f) this.f214468a).a();
        if (bVar == null) {
            return new com.tencent.mm.xcompat.recyclerview.widget.b(i17, i18, i19, obj);
        }
        bVar.f214453a = i17;
        bVar.f214454b = i18;
        bVar.f214456d = i19;
        bVar.f214455c = obj;
        return bVar;
    }

    public final void i(com.tencent.mm.xcompat.recyclerview.widget.b bVar) {
        this.f214470c.add(bVar);
        int i17 = bVar.f214453a;
        com.tencent.mm.xcompat.recyclerview.widget.a aVar = this.f214471d;
        if (i17 == 1) {
            ((com.tencent.mm.xcompat.recyclerview.widget.s0) aVar).d(bVar.f214454b, bVar.f214456d);
            return;
        }
        if (i17 == 2) {
            int i18 = bVar.f214454b;
            int i19 = bVar.f214456d;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.xcompat.recyclerview.widget.s0) aVar).f214631a;
            recyclerView.O(i18, i19, false);
            recyclerView.I1 = true;
            return;
        }
        if (i17 == 4) {
            ((com.tencent.mm.xcompat.recyclerview.widget.s0) aVar).c(bVar.f214454b, bVar.f214456d, bVar.f214455c);
        } else if (i17 == 8) {
            ((com.tencent.mm.xcompat.recyclerview.widget.s0) aVar).e(bVar.f214454b, bVar.f214456d);
        } else {
            throw new java.lang.IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.c.j():void");
    }

    public void k(com.tencent.mm.xcompat.recyclerview.widget.b bVar) {
        bVar.f214455c = null;
        ((m3.f) this.f214468a).b(bVar);
    }

    public void l(java.util.List list) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            k((com.tencent.mm.xcompat.recyclerview.widget.b) list.get(i17));
        }
        list.clear();
    }

    public final int m(int i17, int i18) {
        int i19;
        int i27;
        java.util.ArrayList arrayList = this.f214470c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            com.tencent.mm.xcompat.recyclerview.widget.b bVar = (com.tencent.mm.xcompat.recyclerview.widget.b) arrayList.get(size);
            int i28 = bVar.f214453a;
            if (i28 == 8) {
                int i29 = bVar.f214454b;
                int i37 = bVar.f214456d;
                if (i29 < i37) {
                    i27 = i29;
                    i19 = i37;
                } else {
                    i19 = i29;
                    i27 = i37;
                }
                if (i17 < i27 || i17 > i19) {
                    if (i17 < i29) {
                        if (i18 == 1) {
                            bVar.f214454b = i29 + 1;
                            bVar.f214456d = i37 + 1;
                        } else if (i18 == 2) {
                            bVar.f214454b = i29 - 1;
                            bVar.f214456d = i37 - 1;
                        }
                    }
                } else if (i27 == i29) {
                    if (i18 == 1) {
                        bVar.f214456d = i37 + 1;
                    } else if (i18 == 2) {
                        bVar.f214456d = i37 - 1;
                    }
                    i17++;
                } else {
                    if (i18 == 1) {
                        bVar.f214454b = i29 + 1;
                    } else if (i18 == 2) {
                        bVar.f214454b = i29 - 1;
                    }
                    i17--;
                }
            } else {
                int i38 = bVar.f214454b;
                if (i38 <= i17) {
                    if (i28 == 1) {
                        i17 -= bVar.f214456d;
                    } else if (i28 == 2) {
                        i17 += bVar.f214456d;
                    }
                } else if (i18 == 1) {
                    bVar.f214454b = i38 + 1;
                } else if (i18 == 2) {
                    bVar.f214454b = i38 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            com.tencent.mm.xcompat.recyclerview.widget.b bVar2 = (com.tencent.mm.xcompat.recyclerview.widget.b) arrayList.get(size2);
            if (bVar2.f214453a == 8) {
                int i39 = bVar2.f214456d;
                if (i39 == bVar2.f214454b || i39 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f214456d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i17;
    }
}
