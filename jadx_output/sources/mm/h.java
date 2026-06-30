package mm;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final mm.h f328485a = new mm.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f328486b;

    static {
        jz5.i iVar = jz5.i.f302829d;
        jz5.h.a(iVar, mm.g.f328482d);
        jz5.h.a(iVar, mm.e.f328477d);
        jz5.h.a(iVar, mm.f.f328479d);
        jz5.h.a(iVar, mm.c.f328472d);
        jz5.h.a(iVar, mm.a.f328463d);
        f328486b = jz5.h.a(iVar, mm.b.f328471d);
    }

    public final void a(r45.j4 add) {
        kotlin.jvm.internal.o.g(add, "add");
        if (((java.lang.Boolean) ((jz5.n) mm.j.f328495a).getValue()).booleanValue()) {
            jz5.g gVar = f328486b;
            synchronized (((java.util.Map) gVar.getValue())) {
                mm.h hVar = f328485a;
                ((java.util.Map) gVar.getValue()).remove(java.lang.Long.valueOf(add.f377568r));
                com.tencent.mars.xlog.Log.i("MiroMsg.proc.MsgTracker", "freeAddMsg: add=" + hVar.c(add) + ':' + add.hashCode() + ", id=" + add.f377557d + ':' + add.f377568r);
            }
        }
    }

    public final int b(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        boolean z17 = obj instanceof r45.ju4;
        mm.h hVar = f328485a;
        if (z17) {
            r45.ju4 ju4Var = (r45.ju4) obj;
            java.util.LinkedList CmdList = ju4Var.f378116i;
            kotlin.jvm.internal.o.f(CmdList, "CmdList");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(CmdList, 10));
            java.util.Iterator it = CmdList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(hVar.b((r45.b50) it.next())));
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
            kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0(7);
            l0Var.a(java.lang.Integer.valueOf(b(ju4Var.f378111d)));
            l0Var.a(java.lang.Integer.valueOf(b(ju4Var.f378112e)));
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f378113f))));
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f378114g))));
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f378115h))));
            l0Var.b(array);
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f378117m))));
            return java.util.Objects.hash(l0Var.d(new java.lang.Object[l0Var.c()]));
        }
        if (obj instanceof r45.ew4) {
            r45.ew4 ew4Var = (r45.ew4) obj;
            return java.util.Objects.hash(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f373758d))), java.lang.Integer.valueOf(b(ew4Var.f373759e)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f373760f))), java.lang.Integer.valueOf(b(ew4Var.f373761g)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f373762h))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f373763i))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f373764m))));
        }
        if (obj instanceof r45.j4) {
            return c((r45.j4) obj);
        }
        if (obj instanceof r45.b50) {
            r45.b50 b50Var = (r45.b50) obj;
            return java.util.Objects.hash(java.lang.Integer.valueOf(b50Var.f370530d), java.lang.Integer.valueOf(b(b50Var.f370531e)));
        }
        if (!(obj instanceof r45.c50)) {
            if (obj instanceof r45.du5) {
                java.lang.String g17 = x51.j1.g((r45.du5) obj);
                if (g17 == null) {
                    return 0;
                }
                return g17.hashCode();
            }
            if (!(obj instanceof r45.cu5)) {
                return obj.hashCode();
            }
            byte[] d17 = x51.j1.d((r45.cu5) obj);
            if (d17 == null) {
                return 0;
            }
            return java.util.Arrays.hashCode(d17);
        }
        r45.c50 c50Var = (r45.c50) obj;
        java.util.LinkedList List = c50Var.f371295e;
        kotlin.jvm.internal.o.f(List, "List");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(List, 10));
        java.util.Iterator it6 = List.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(hVar.b((r45.b50) it6.next())));
        }
        java.lang.Object[] array2 = arrayList2.toArray(new java.lang.Object[0]);
        kotlin.jvm.internal.l0 l0Var2 = new kotlin.jvm.internal.l0(2);
        l0Var2.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(c50Var.f371294d))));
        l0Var2.b(array2);
        return java.util.Objects.hash(l0Var2.d(new java.lang.Object[l0Var2.c()]));
    }

    public final int c(r45.j4 addMsg) {
        kotlin.jvm.internal.o.g(addMsg, "addMsg");
        return java.util.Objects.hash(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f377557d))), java.lang.Integer.valueOf(b(addMsg.f377558e)), java.lang.Integer.valueOf(b(addMsg.f377559f)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f377560g))), java.lang.Integer.valueOf(b(addMsg.f377561h)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f377562i))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f377563m))), java.lang.Integer.valueOf(b(addMsg.f377564n)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f377565o))), java.lang.Integer.valueOf(b(addMsg.f377566p)), java.lang.Integer.valueOf(b(addMsg.f377567q)), java.lang.Integer.valueOf(b(java.lang.Long.valueOf(addMsg.f377568r))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f377569s))));
    }
}
