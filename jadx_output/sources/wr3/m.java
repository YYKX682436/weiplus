package wr3;

/* loaded from: classes11.dex */
public final class m extends wr3.f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, java.lang.String bizUsername, boolean z17, int i17, long j17, boolean z18, sr3.g config, com.tencent.mm.storage.z3 contact) {
        super(context, bizUsername, z17, i17, j17, z18, config, contact);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(contact, "contact");
    }

    @Override // wr3.f0
    public void L(androidx.recyclerview.widget.k3 holder, int i17) {
        wr3.l lVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String d17 = this.f448785t.d1();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String str = d17;
        boolean z17 = holder instanceof yr3.g0;
        java.util.ArrayList arrayList = this.f448786u;
        if (z17) {
            wr3.l lVar2 = (wr3.l) kz5.n0.a0(arrayList, i17);
            if (lVar2 == null) {
                return;
            }
            ((yr3.g0) holder).i(lVar2.f448830b, lVar2.f448829a, i17, this.f448780o, str, this.f448781p);
            return;
        }
        if (!(holder instanceof yr3.y) || (lVar = (wr3.l) kz5.n0.a0(arrayList, i17)) == null) {
            return;
        }
        ((yr3.y) holder).i(lVar.f448830b, lVar.f448829a, i17, this.f448780o, str, this.f448781p);
    }

    @Override // wr3.f0
    public java.util.List M(java.util.List msgList, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        java.util.LinkedList linkedList3;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                vr3.h hVar = (vr3.h) it.next();
                r45.s5 s5Var = hVar.f439631a;
                if (s5Var != null && S(s5Var)) {
                    wr3.n0 n0Var = hVar.f439632b;
                    if (n0Var == null) {
                        n0Var = wr3.n0.f448842f;
                    }
                    arrayList.add(N(n0Var, s5Var, 2));
                }
            }
        }
        if (linkedList != null) {
            if (linkedList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("BizProfileTabArticleAdapter", "no featured list");
            } else {
                int i17 = 0;
                java.lang.Object obj = linkedList.get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.s5 s5Var2 = (r45.s5) obj;
                r45.p5 p5Var = s5Var2.f385514i;
                if (p5Var != null && (linkedList3 = p5Var.f382754e) != null) {
                    i17 = linkedList3.size();
                }
                this.f448817g = i17;
                yr3.o0[] o0VarArr = yr3.o0.f464965d;
                s5Var2.f385516n = 2;
                if (S(s5Var2)) {
                    arrayList.add(N(wr3.n0.f448842f, s5Var2, 2));
                }
            }
        }
        java.util.Iterator it6 = msgList.iterator();
        while (it6.hasNext()) {
            r45.s5 s5Var3 = (r45.s5) it6.next();
            if (S(s5Var3)) {
                arrayList.add(N(wr3.n0.f448842f, s5Var3, 2));
            }
        }
        return arrayList;
    }

    @Override // wr3.f0
    public androidx.recyclerview.widget.k3 O(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 0) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.dno, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new yr3.g0(this, inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.a0g, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new yr3.y(this, inflate2, this.f448781p);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type: " + i17);
    }

    @Override // wr3.f0
    public int P() {
        return 3;
    }

    @Override // wr3.f0
    public int Q() {
        return 4;
    }

    @Override // wr3.f0
    public int R() {
        return 2;
    }

    @Override // wr3.f0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public wr3.l N(wr3.n0 status, r45.s5 message, int i17) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(message, "message");
        r45.p5 p5Var = message.f385514i;
        int i18 = 2;
        if (p5Var != null) {
            java.util.LinkedList linkedList = p5Var.f382754e;
            if (linkedList.size() == 1 && ((r45.o5) linkedList.get(0)).f381923p == 0) {
                r45.l5 l5Var = p5Var.f382753d;
                if (l5Var != null && l5Var.f379142h == 1) {
                    i18 = 0;
                }
            }
        }
        return new wr3.l(status, message, i18);
    }

    @Override // wr3.f0, androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.ArrayList arrayList = this.f448786u;
        return i17 < arrayList.size() ? ((wr3.l) arrayList.get(i17)).f448831c : this.f448788w ? 3 : 4;
    }
}
