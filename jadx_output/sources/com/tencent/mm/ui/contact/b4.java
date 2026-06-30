package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public final class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co.a f206619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f206620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206623h;

    public b4(co.a aVar, boolean z17, int i17, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        this.f206619d = aVar;
        this.f206620e = z17;
        this.f206621f = i17;
        this.f206622g = f9Var;
        this.f206623h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.autogen.mmdata.rpt.ForwardToWeWorkStruct forwardToWeWorkStruct = new com.tencent.mm.autogen.mmdata.rpt.ForwardToWeWorkStruct();
        forwardToWeWorkStruct.f58236d = 1L;
        co.a aVar = this.f206619d;
        int i18 = 1;
        forwardToWeWorkStruct.f58237e = forwardToWeWorkStruct.b("ChatName", aVar.getString(aVar.f43702d + 1), true);
        if (aVar instanceof ld5.b) {
            forwardToWeWorkStruct.f58238f = 2L;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            ld5.b bVar = (ld5.b) aVar;
            java.util.LinkedList k17 = bVar.k();
            if (k17 != null) {
                java.util.Iterator it = k17.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.ui.contact.c4.a(pt0.f0.f358209b1.n(bVar.getString(bVar.f43702d + 1), ((java.lang.Number) it.next()).longValue()))));
                }
            }
            forwardToWeWorkStruct.p(kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null));
            forwardToWeWorkStruct.f58239g = arrayList.size();
        } else if (aVar instanceof ld5.a) {
            forwardToWeWorkStruct.f58238f = 3L;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            ld5.a aVar2 = (ld5.a) aVar;
            java.util.LinkedList j17 = aVar2.j();
            if (j17 != null) {
                java.util.Iterator it6 = j17.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.ui.contact.c4.a(pt0.f0.f358209b1.n(aVar2.getString(aVar2.f43702d + 1), ((java.lang.Number) it6.next()).longValue()))));
                }
            }
            forwardToWeWorkStruct.p(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
            forwardToWeWorkStruct.f58239g = arrayList2.size();
        } else {
            forwardToWeWorkStruct.f58238f = 1L;
            if (this.f206620e) {
                forwardToWeWorkStruct.f58238f = 2L;
            }
            forwardToWeWorkStruct.f58239g = 1L;
            int i19 = this.f206621f;
            if (i19 > 0) {
                forwardToWeWorkStruct.p(java.lang.String.valueOf(i19));
            } else {
                com.tencent.mm.storage.f9 f9Var = this.f206622g;
                if (f9Var == null || f9Var.getMsgId() <= 0) {
                    if (!(aVar instanceof ne5.a)) {
                        i18 = 2;
                        if (!(aVar instanceof jd5.a)) {
                            if (aVar instanceof jd5.c) {
                                i18 = 3;
                            } else {
                                if (!(aVar instanceof ec5.a)) {
                                    if (!(aVar instanceof nb5.b)) {
                                        if (aVar instanceof id5.a) {
                                            i18 = 6;
                                        } else {
                                            if (!(aVar instanceof se5.a)) {
                                                if (!(aVar instanceof fc5.i)) {
                                                    if (!(aVar instanceof fc5.f)) {
                                                        if (!(aVar instanceof dc5.a)) {
                                                            if (aVar instanceof lb5.a) {
                                                                com.tencent.mm.feature.emoji.api.z5 z5Var = (com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class);
                                                                java.lang.String j18 = ((lb5.a) aVar).j();
                                                                com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) z5Var).Ni(j18 != null ? j18 : "");
                                                                ((com.tencent.mm.feature.emoji.b1) ((com.tencent.mm.feature.emoji.api.d6) i95.n0.c(com.tencent.mm.feature.emoji.api.d6.class))).getClass();
                                                                kotlin.jvm.internal.o.f(com.tencent.mm.smiley.g.b(), "getInstance(...)");
                                                                i18 = n22.m.e(Ni);
                                                            } else if (aVar instanceof vd5.a) {
                                                                i18 = 19;
                                                            } else if (aVar instanceof pb5.a) {
                                                                i18 = 20;
                                                            } else {
                                                                v05.b bVar2 = new v05.b();
                                                                java.lang.String str = this.f206623h;
                                                                if (str == null) {
                                                                    str = "";
                                                                }
                                                                bVar2.fromXml(str, "");
                                                                int integer = bVar2.getInteger(bVar2.f368365d + 6);
                                                                if (integer != 2) {
                                                                    if (integer != 24) {
                                                                        if (integer != 33 && integer != 36) {
                                                                            if (integer != 51) {
                                                                                if (integer != 63) {
                                                                                    if (integer != 130) {
                                                                                        if (integer != 5) {
                                                                                            if (integer != 6) {
                                                                                                i17 = -1;
                                                                                                i18 = i17;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i18 = 13;
                                                    }
                                                    i18 = 12;
                                                }
                                                i18 = 8;
                                            }
                                            i17 = 7;
                                            i18 = i17;
                                        }
                                    }
                                    i18 = 5;
                                }
                                i18 = 4;
                            }
                        }
                    }
                    forwardToWeWorkStruct.p(java.lang.String.valueOf(i18));
                } else {
                    forwardToWeWorkStruct.p(java.lang.String.valueOf(com.tencent.mm.ui.contact.c4.a(f9Var)));
                }
            }
        }
        forwardToWeWorkStruct.o();
        forwardToWeWorkStruct.k();
    }
}
