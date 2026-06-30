package ir1;

/* loaded from: classes11.dex */
public final class e0 extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f293958e;

    /* renamed from: f, reason: collision with root package name */
    public final int f293959f;

    /* renamed from: g, reason: collision with root package name */
    public final int f293960g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f293961h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f293962i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f293963m;

    /* renamed from: n, reason: collision with root package name */
    public final x.g f293964n;

    /* renamed from: o, reason: collision with root package name */
    public ir1.w f293965o;

    /* renamed from: p, reason: collision with root package name */
    public ir1.v f293966p;

    public e0(androidx.fragment.app.Fragment fragment, int i17, int i18) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f293958e = fragment;
        this.f293959f = i17;
        this.f293960g = i18;
        this.f293961h = new java.util.ArrayList();
        this.f293962i = new java.util.HashMap();
        java.util.concurrent.ConcurrentHashMap.KeySetView newKeySet = java.util.concurrent.ConcurrentHashMap.newKeySet();
        kotlin.jvm.internal.o.f(newKeySet, "newKeySet(...)");
        this.f293963m = newKeySet;
        this.f293964n = new x.g(50);
    }

    public static final void B(ir1.e0 e0Var, hr1.e eVar) {
        int i17;
        int i18;
        java.util.HashMap hashMap = e0Var.f293962i;
        hr1.e eVar2 = (hr1.e) hashMap.get(eVar.field_sessionId);
        java.util.ArrayList arrayList = e0Var.f293961h;
        int c07 = kz5.n0.c0(arrayList, eVar2);
        if (c07 >= 0) {
            arrayList.remove(c07);
            e0Var.notifyItemRemoved(c07);
        }
        eVar.u0();
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((hr1.e) listIterator.previous()).field_placedFlag > 0) {
                    i18 = listIterator.nextIndex();
                    break;
                }
            } else {
                i18 = -1;
                break;
            }
        }
        int i19 = i18 < 0 ? 0 : i18 + 1;
        if (eVar.field_placedFlag > 0) {
            for (i17 = 0; i17 < i19; i17++) {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                hr1.e eVar3 = (hr1.e) obj;
                long j17 = eVar.field_placedFlag;
                long j18 = eVar3.field_placedFlag;
                if (j17 > j18 || (j17 == j18 && eVar.field_updateTime > eVar3.field_updateTime)) {
                    i19 = i17;
                    break;
                }
            }
        }
        arrayList.add(i19, eVar);
        e0Var.notifyItemInserted(i19);
        hashMap.remove(eVar.field_sessionId);
        java.lang.String field_sessionId = eVar.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        hashMap.put(field_sessionId, eVar);
    }

    public final void E(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.util.HashMap hashMap = this.f293962i;
        hr1.e eVar = (hr1.e) hashMap.get(sessionId);
        java.util.ArrayList arrayList = this.f293961h;
        int c07 = kz5.n0.c0(arrayList, eVar);
        if (c07 < 0 || c07 >= arrayList.size()) {
            return;
        }
        arrayList.remove(c07);
        hashMap.remove(sessionId);
        this.f293964n.remove(sessionId);
        notifyItemRemoved(c07);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f293961h.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r29, int r30) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir1.e0.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f293958e.getContext()).inflate(com.tencent.mm.R.layout.dze, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        ir1.u uVar = new ir1.u(inflate);
        android.view.View view = uVar.itemView;
        view.setOnLongClickListener(new ir1.b0(uVar, this, view));
        view.setOnClickListener(new ir1.c0(uVar, this, view));
        return uVar;
    }

    @Override // wn.a
    public java.util.List x() {
        return this.f293961h;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        kotlin.jvm.internal.o.g(convs, "convs");
        if (this.f293960g == 1) {
            java.util.Iterator it = convs.iterator();
            while (it.hasNext()) {
                hr1.e eVar = (hr1.e) it.next();
                java.lang.String str = eVar.field_sessionId;
                if (!(str == null || str.length() == 0)) {
                    java.util.Set set = this.f293963m;
                    java.lang.String field_sessionId = eVar.field_sessionId;
                    kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                    ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).add(field_sessionId);
                }
            }
        }
        pm0.v.X(new ir1.d0(this, convs, z17));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    @Override // wn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z(java.lang.String r8, l75.w0 r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir1.e0.z(java.lang.String, l75.w0):boolean");
    }
}
