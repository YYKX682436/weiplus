package eg5;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f252841a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f252842b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f252843c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f252844d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f252845e;

    public d(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f252841a = str;
        this.f252842b = f9Var;
        this.f252843c = g95.u.f(str);
        if (f9Var != null && f9Var.getMsgId() > 0 && !b(f9Var.getMsgId())) {
            java.util.Iterator it = this.f252843c.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((g15.a) it.next()).l() < f9Var.getMsgId()) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 >= this.f252843c.size() || i17 < 0) {
                java.util.ArrayList arrayList = this.f252843c;
                g15.a aVar = new g15.a();
                aVar.q(f9Var.getMsgId());
                aVar.p(0);
                arrayList.add(aVar);
            } else {
                java.util.ArrayList arrayList2 = this.f252843c;
                g15.a aVar2 = new g15.a();
                aVar2.q(f9Var.getMsgId());
                aVar2.p(0);
                arrayList2.add(i17, aVar2);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent.ConvRedHintController", "init: ".concat(kz5.n0.g0(this.f252843c, ", ", null, null, 0, null, eg5.a.f252837d, 30, null)));
        this.f252845e = new java.util.LinkedHashMap();
    }

    public final boolean a(long j17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f252844d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g15.a) obj).l() == j17) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean b(long j17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f252843c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g15.a) obj).l() == j17) {
                break;
            }
        }
        return obj != null;
    }

    public final java.util.Map c(g15.a redHint) {
        kotlin.jvm.internal.o.g(redHint, "redHint");
        if (!this.f252843c.contains(redHint)) {
            return new java.util.LinkedHashMap();
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f252845e;
        java.lang.Object obj = linkedHashMap.get(redHint);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            linkedHashMap.put(redHint, obj);
        }
        return (java.util.Map) obj;
    }

    public final boolean d(g15.a hint) {
        kotlin.jvm.internal.o.g(hint, "hint");
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent.ConvRedHintController", "insertHint: " + hint.toXml());
        if (b(hint.l())) {
            return false;
        }
        this.f252843c.add(hint);
        this.f252843c = g95.u.o(this.f252843c);
        return true;
    }

    public final boolean e(long j17) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent.ConvRedHintController", "removeMsgId: " + j17);
        boolean removeIf = this.f252843c.removeIf(new eg5.c(j17, this));
        if (!removeIf) {
            removeIf = ((java.util.ArrayList) this.f252844d).removeIf(new eg5.b(j17));
        }
        if (removeIf) {
            java.lang.String str = this.f252841a;
            if (str != null) {
                g95.u uVar = g95.u.f269821a;
                g15.b wi6 = ((ez.j) uVar.e()).wi(str);
                if (wi6 == null) {
                    wi6 = new g15.b();
                }
                boolean removeIf2 = wi6.j().removeIf(new g95.h(j17));
                if (removeIf2) {
                    uVar.n(str, wi6);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", "expose, [" + str + ", " + j17 + "], result: " + removeIf2);
                f0Var = jz5.f0.f302826a;
            } else {
                g95.u uVar2 = g95.u.f269821a;
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConvRedHintStorage", "talker is null");
            }
        }
        return removeIf;
    }
}
