package ir;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.o f293879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ir.o oVar) {
        super(0);
        this.f293879d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        java.lang.Object i1Var;
        ir.o oVar = this.f293879d;
        oVar.f293883d.f293891b.clear();
        oVar.f293883d.f293892c.clear();
        ir.h hVar = oVar.f293880a;
        if (hVar.f293843b) {
            oVar.f293883d.f293892c.add(new ir.y0(new ir.s(3), -1));
            oVar.f293883d.f293893d = 1;
        }
        if (hVar.f293844c) {
            com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
            emojiGroupInfo.field_productID = "smiley";
            emojiGroupInfo.field_packName = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491105bx5);
            oVar.a(new ir.t(1, emojiGroupInfo));
        }
        if (hVar.f293845d) {
            oVar.a(ir.v0.b());
        }
        if (hVar.f293848g) {
            boolean z17 = hVar.f293849h;
            ir.i0 i0Var = new ir.i0(ir.v0.a());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> b17 = gr.t.g().b(true);
            b17.size();
            if (!b17.isEmpty()) {
                linkedList.add(i0Var);
                if (z17) {
                    linkedList.add(new ir.z(1));
                }
                pr.z zVar = pr.k0.f357723q;
                int a17 = zVar.a(false).a();
                int g17 = zVar.a(false).g();
                int i17 = 0;
                for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : b17) {
                    if (i17 >= g17) {
                        break;
                    }
                    if (i17 >= a17) {
                        kotlin.jvm.internal.o.d(emojiInfo);
                        linkedList.add(new ir.g(emojiInfo, 3, null, 0, 12, null));
                    } else {
                        kotlin.jvm.internal.o.d(emojiInfo);
                        linkedList.add(new ir.g(emojiInfo, 1, null, 0, 12, null));
                    }
                    i17++;
                }
                if (pr.k0.f357723q.a(false).c()) {
                    linkedList.add(new ir.e0(1));
                }
            } else if (z17) {
                linkedList.add(new ir.b());
            }
            if (!linkedList.isEmpty()) {
                oVar.a(ir.v0.a());
            }
        }
        boolean Di = ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Di();
        hVar.f293853l = false;
        if (hVar.f293850i) {
            if (!Di) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiGroupInfo> d17 = gr.t.g().d();
                kotlin.jvm.internal.o.f(d17, "getEmojiGroupInfoList(...)");
                for (com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo2 : d17) {
                    kotlin.jvm.internal.o.d(emojiGroupInfo2);
                    linkedList2.add(new ir.t(0, emojiGroupInfo2));
                }
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    oVar.a((ir.r) it.next());
                }
            } else if (hVar.f293852k) {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                gr.t g18 = gr.t.g();
                java.util.concurrent.locks.ReentrantLock reentrantLock = g18.f274690i;
                try {
                    reentrantLock.lock();
                    java.util.ArrayList d18 = g18.d();
                    if (g18.f274689h == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        g18.f274689h = arrayList;
                        arrayList.addAll(gr.p.f274673c.a(d18));
                    }
                    java.util.ArrayList arrayList2 = g18.f274689h;
                    reentrantLock.unlock();
                    kotlin.jvm.internal.o.d(arrayList2);
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        gr.p pVar = (gr.p) it6.next();
                        com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo = pVar.f274674a;
                        java.util.LinkedList linkedList4 = pVar.f274675b;
                        if (linkedList4.size() == 1) {
                            java.lang.Object obj2 = linkedList4.get(0);
                            kotlin.jvm.internal.o.f(obj2, "get(...)");
                            linkedList3.add(new ir.t(0, (com.tencent.mm.storage.emotion.EmojiGroupInfo) obj2));
                        } else if (emojiIPSetInfo != null) {
                            ir.u uVar = new ir.u(emojiIPSetInfo);
                            uVar.f293905c.addAll(linkedList4);
                            uVar.f293906d = hVar.f293856o;
                            linkedList3.add(uVar);
                            hVar.f293853l = true;
                        }
                    }
                    java.util.Iterator it7 = linkedList3.iterator();
                    while (it7.hasNext()) {
                        oVar.a((ir.r) it7.next());
                    }
                } catch (java.lang.Throwable th6) {
                    reentrantLock.unlock();
                    throw th6;
                }
            } else {
                java.util.LinkedList<ir.r> linkedList5 = new java.util.LinkedList();
                java.util.HashMap hashMap = new java.util.HashMap();
                s25.b Bi = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi();
                java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiGroupInfo> d19 = gr.t.g().d();
                kotlin.jvm.internal.o.f(d19, "getEmojiGroupInfoList(...)");
                for (com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo3 : d19) {
                    java.lang.String str = emojiGroupInfo3.field_ipKey;
                    com.tencent.mm.storage.emotion.EmojiIPSetInfo k17 = Bi.k(str);
                    if (k17 == null) {
                        linkedList5.add(new ir.t(0, emojiGroupInfo3));
                    } else {
                        ir.u uVar2 = (ir.u) hashMap.get(str);
                        if (uVar2 == null) {
                            uVar2 = new ir.u(k17);
                            kotlin.jvm.internal.o.d(str);
                            hashMap.put(str, uVar2);
                        }
                        uVar2.f293905c.add(emojiGroupInfo3);
                        ir.t tVar = new ir.t(0, emojiGroupInfo3);
                        if (hVar.f293851j) {
                            linkedList5.add(new ir.v(tVar, uVar2));
                        } else {
                            linkedList5.add(new ir.t(0, emojiGroupInfo3));
                        }
                    }
                }
                for (ir.r rVar : linkedList5) {
                    if (rVar instanceof ir.v) {
                        ir.v vVar = (ir.v) rVar;
                        if (vVar.f293909c.f293905c.size() == 1) {
                            oVar.a(vVar.f293908b);
                        }
                    }
                    oVar.a(rVar);
                }
            }
        }
        java.util.Iterator it8 = oVar.f293883d.f293891b.iterator();
        while (it8.hasNext()) {
            ir.r group = (ir.r) it8.next();
            java.util.Iterator it9 = oVar.f293882c.f293890a.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it9.next();
                if (((ir.t0) obj).b().p().b(group)) {
                    break;
                }
            }
            ir.t0 t0Var = (ir.t0) obj;
            if (t0Var != null) {
                t0Var.e();
                if ((t0Var instanceof ir.g1) && (group instanceof ir.t)) {
                    ir.t tVar2 = (ir.t) group;
                    kotlin.jvm.internal.o.g(tVar2, "<set-?>");
                    ((ir.g1) t0Var).f293840d = tVar2;
                }
                oVar.f293883d.f293890a.add(t0Var);
            } else {
                java.util.ArrayList arrayList3 = oVar.f293883d.f293890a;
                kotlin.jvm.internal.o.g(group, "group");
                java.lang.String c17 = group.c();
                if (kotlin.jvm.internal.o.b(c17, "smiley")) {
                    i1Var = new ir.c1(hVar);
                } else if (kotlin.jvm.internal.o.b(c17, "custom")) {
                    i1Var = new ir.f(hVar);
                } else if (kotlin.jvm.internal.o.b(c17, "capture")) {
                    i1Var = new ir.d(hVar);
                } else {
                    i1Var = group instanceof ir.u ? new ir.i1((ir.u) group) : group instanceof ir.v ? new ir.h1((ir.v) group) : new ir.g1((ir.t) group);
                }
                arrayList3.add(i1Var);
            }
        }
        oVar.f293884e = androidx.recyclerview.widget.h0.a(new ir.i(oVar), false);
        oVar.f293885f = androidx.recyclerview.widget.h0.a(new ir.j(oVar), false);
        oVar.f293882c = oVar.f293883d;
        oVar.f293883d = new ir.q();
        pm0.v.X(new ir.m(oVar, oVar.f293882c));
        return jz5.f0.f302826a;
    }
}
