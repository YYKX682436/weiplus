package dk2;

/* loaded from: classes2.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public final dk2.bc f233327a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f233328b;

    /* renamed from: c, reason: collision with root package name */
    public long f233329c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f233330d;

    public dc(dk2.bc poll, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, kotlin.jvm.internal.i iVar) {
        finderObject = (i17 & 2) != 0 ? null : finderObject;
        kotlin.jvm.internal.o.g(poll, "poll");
        this.f233327a = poll;
        this.f233328b = finderObject;
        this.f233330d = new java.util.LinkedHashMap();
    }

    public final java.util.List a(java.lang.Integer num) {
        dk2.bc bcVar;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        r45.jn0 jn0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f233330d).entrySet().iterator();
        int i18 = 1;
        int i19 = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            bcVar = this.f233327a;
            finderObject = this.f233328b;
            if (!hasNext) {
                break;
            }
            dk2.cc ccVar = (dk2.cc) ((java.util.Map.Entry) it.next()).getValue();
            r45.jn0 jn0Var2 = new r45.jn0();
            if (finderObject != null) {
                jn0Var2.set(0, java.lang.Long.valueOf(finderObject.getId()));
                jn0Var2.set(i18, finderObject.getUsername());
                jn0Var2.set(2, finderObject.getSessionBuffer());
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                jn0Var2.set(5, java.lang.Integer.valueOf(objectDesc != null ? objectDesc.getMediaType() : 0));
            }
            r45.st2 st2Var = new r45.st2();
            st2Var.set(0, ccVar.f233295a.f233579a);
            arrayList2.add(st2Var);
            r45.rt2 rt2Var = new r45.rt2();
            if (finderObject != null) {
                str2 = finderObject + ".id";
            } else {
                str2 = null;
            }
            rt2Var.set(0, str2);
            rt2Var.set(2, bcVar.f233255b);
            rt2Var.set(3, bcVar.f233254a);
            rt2Var.set(4, java.lang.Integer.valueOf(i19));
            rt2Var.set(5, new java.util.LinkedList(arrayList2));
            rt2Var.set(7, java.lang.String.valueOf(ccVar.f233296b));
            rt2Var.set(9, java.lang.String.valueOf(this.f233329c));
            rt2Var.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
            jn0Var2.set(3, java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("feedActionType", 47), new jz5.l("strValue", rt2Var.toJSON().toString())))));
            arrayList.add(jn0Var2);
            if (ccVar.f233298d.isEmpty()) {
                jn0Var = null;
            } else {
                r45.st2 st2Var2 = (r45.st2) kz5.n0.i0(arrayList2);
                int ordinal = ccVar.f233295a.f233581c.ordinal();
                if (ordinal != 0) {
                    i17 = 1;
                    if (ordinal == 1) {
                        java.util.List list = ccVar.f233298d;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                        java.util.Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(((dk2.ic) it6.next()).f233622a);
                        }
                        st2Var2.set(3, new java.util.LinkedList(arrayList3));
                        i17 = 1;
                    }
                } else {
                    i17 = 1;
                    st2Var2.set(1, ((dk2.ic) kz5.n0.X(ccVar.f233298d)).f233622a);
                }
                r45.jn0 jn0Var3 = new r45.jn0();
                if (finderObject != null) {
                    jn0Var3.set(0, java.lang.Long.valueOf(finderObject.getId()));
                    jn0Var3.set(i17, finderObject.getUsername());
                    jn0Var3.set(2, finderObject.getSessionBuffer());
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
                    jn0Var3.set(5, java.lang.Integer.valueOf(objectDesc2 != null ? objectDesc2.getMediaType() : 0));
                }
                r45.rt2 rt2Var2 = new r45.rt2();
                if (finderObject != null) {
                    str3 = finderObject + ".id";
                } else {
                    str3 = null;
                }
                rt2Var2.set(0, str3);
                rt2Var2.set(2, bcVar.f233255b);
                rt2Var2.set(3, bcVar.f233254a);
                rt2Var2.set(4, java.lang.Integer.valueOf(i19));
                rt2Var2.set(5, new java.util.LinkedList(arrayList2));
                rt2Var2.set(7, java.lang.String.valueOf(ccVar.f233296b));
                rt2Var2.set(8, java.lang.String.valueOf(ccVar.f233297c));
                rt2Var2.set(9, java.lang.String.valueOf(this.f233329c));
                rt2Var2.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                jn0Var3.set(3, java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("feedActionType", 48), new jz5.l("strValue", rt2Var2.toJSON().toString())))));
                jn0Var = jn0Var3;
            }
            if (jn0Var != null) {
                arrayList.add(jn0Var);
            }
            i19++;
            i18 = 1;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i27 = i19 - 1;
        r45.jn0 jn0Var4 = new r45.jn0();
        if (finderObject != null) {
            jn0Var4.set(0, java.lang.Long.valueOf(finderObject.getId()));
            jn0Var4.set(1, finderObject.getUsername());
            jn0Var4.set(2, finderObject.getSessionBuffer());
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
            jn0Var4.set(5, java.lang.Integer.valueOf(objectDesc3 != null ? objectDesc3.getMediaType() : 0));
        }
        r45.rt2 rt2Var3 = new r45.rt2();
        if (finderObject != null) {
            str = finderObject + ".id";
        } else {
            str = null;
        }
        rt2Var3.set(0, str);
        rt2Var3.set(2, bcVar.f233255b);
        rt2Var3.set(3, bcVar.f233254a);
        rt2Var3.set(4, java.lang.Integer.valueOf(i27));
        rt2Var3.set(5, new java.util.LinkedList(arrayList2));
        rt2Var3.set(9, java.lang.String.valueOf(this.f233329c));
        rt2Var3.set(10, java.lang.String.valueOf(currentTimeMillis));
        rt2Var3.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        jn0Var4.set(3, java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("feedActionType", 118), new jz5.l("strValue", rt2Var3.toJSON().toString())))));
        arrayList.add(jn0Var4);
        return arrayList;
    }

    public final void b(dk2.hc question, java.lang.Iterable response) {
        kotlin.jvm.internal.o.g(question, "question");
        kotlin.jvm.internal.o.g(response, "response");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f233330d;
        java.lang.String str = question.f233580b;
        dk2.cc ccVar = (dk2.cc) linkedHashMap.get(str);
        if (ccVar != null) {
            ccVar.f233298d = kz5.n0.S0(response);
            return;
        }
        throw new java.lang.IllegalStateException("Question activity not found. " + question.f233579a + ", " + str);
    }

    public final void c(dk2.hc question) {
        kotlin.jvm.internal.o.g(question, "question");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f233330d;
        java.lang.String str = question.f233580b;
        dk2.cc ccVar = (dk2.cc) linkedHashMap.get(str);
        if (ccVar != null) {
            ccVar.f233297c = java.lang.System.currentTimeMillis();
            return;
        }
        throw new java.lang.IllegalStateException("Question activity not found. " + question.f233579a + ", " + str);
    }

    public final void d(dk2.hc question) {
        kotlin.jvm.internal.o.g(question, "question");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = this.f233330d;
        if (map.isEmpty()) {
            this.f233329c = currentTimeMillis;
        }
        map.put(question.f233580b, new dk2.cc(question, currentTimeMillis));
    }
}
