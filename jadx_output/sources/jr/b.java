package jr;

/* loaded from: classes12.dex */
public final class b implements jr.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jr.d f301286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f301287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f301288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jr.n f301289d;

    public b(jr.d dVar, boolean z17, java.util.LinkedList linkedList, jr.n nVar) {
        this.f301286a = dVar;
        this.f301287b = z17;
        this.f301288c = linkedList;
        this.f301289d = nVar;
    }

    @Override // jr.n
    public void a(java.util.List emojiList, jr.q wordInfo) {
        kotlin.jvm.internal.o.g(emojiList, "emojiList");
        kotlin.jvm.internal.o.g(wordInfo, "wordInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiSuggest", "onResult: remote " + emojiList.size());
        jr.d dVar = this.f301286a;
        if (dVar.f301285e) {
            boolean z17 = this.f301287b;
            java.lang.Object obj = null;
            java.util.LinkedList linkedList = this.f301288c;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : linkedList) {
                    if (((jr.p) obj2).f301316a.field_catalog == 81) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : linkedList) {
                    if (((jr.p) obj3).f301316a.field_catalog != 81) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList(emojiList);
                linkedList2.addAll(linkedList);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj4 : linkedList2) {
                    if (((jr.p) obj4).f301316a.field_lastUseTime != 0) {
                        arrayList3.add(obj4);
                    }
                }
                java.util.Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long j17 = ((jr.p) obj).f301316a.field_lastUseTime;
                        do {
                            java.lang.Object next = it.next();
                            long j18 = ((jr.p) next).f301316a.field_lastUseTime;
                            if (j17 < j18) {
                                obj = next;
                                j17 = j18;
                            }
                        } while (it.hasNext());
                    }
                }
                jr.p pVar = (jr.p) obj;
                if (pVar != null) {
                    pVar.f301317b.f301315d = 1;
                    dVar.f301295h.add(pVar);
                }
                jr.d.a(dVar, dVar.f301295h, arrayList);
                jr.d.a(dVar, dVar.f301295h, emojiList);
                jr.d.a(dVar, dVar.f301295h, arrayList2);
            } else {
                java.util.Iterator it6 = linkedList.iterator();
                if (it6.hasNext()) {
                    obj = it6.next();
                    if (it6.hasNext()) {
                        long j19 = ((jr.p) obj).f301316a.field_lastUseTime;
                        do {
                            java.lang.Object next2 = it6.next();
                            long j27 = ((jr.p) next2).f301316a.field_lastUseTime;
                            if (j19 < j27) {
                                obj = next2;
                                j19 = j27;
                            }
                        } while (it6.hasNext());
                    }
                }
                jr.p pVar2 = (jr.p) obj;
                if (pVar2 != null) {
                    pVar2.f301317b.f301315d = 1;
                    dVar.f301295h.add(pVar2);
                }
                jr.d.a(dVar, dVar.f301295h, linkedList);
                jr.d.a(dVar, dVar.f301295h, emojiList);
            }
            jr.n nVar = this.f301289d;
            if (nVar != null) {
                nVar.a(dVar.f301295h, wordInfo);
            }
            jr.f fVar = jr.f.f301297a;
            java.util.LinkedList emojiList2 = dVar.f301295h;
            kotlin.jvm.internal.o.g(emojiList2, "emojiList");
            if (!emojiList2.isEmpty()) {
                int size = emojiList2.size();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj5 : emojiList2) {
                    if (((jr.p) obj5).f301317b.f301312a == 0) {
                        arrayList4.add(obj5);
                    }
                }
                int size2 = arrayList4.size();
                fVar.a(1);
                if (size <= 2) {
                    fVar.a(2);
                } else if (size <= 5) {
                    fVar.a(3);
                } else if (size <= 10) {
                    fVar.a(4);
                } else if (size <= 50) {
                    fVar.a(5);
                } else {
                    fVar.a(9);
                }
                if (size2 > 0) {
                    fVar.a(11);
                    if (size2 <= 2) {
                        fVar.a(12);
                        return;
                    }
                    if (size2 <= 5) {
                        fVar.a(13);
                        return;
                    }
                    if (size2 <= 10) {
                        fVar.a(14);
                    } else if (size2 <= 50) {
                        fVar.a(15);
                    } else {
                        fVar.a(19);
                    }
                }
            }
        }
    }
}
