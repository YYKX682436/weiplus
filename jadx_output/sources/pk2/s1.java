package pk2;

/* loaded from: classes3.dex */
public final class s1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f356227h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f356228i;

    /* renamed from: j, reason: collision with root package name */
    public final int f356229j;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f356230r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356227h = "anchorlive.bottom.tools.link";
        this.f356228i = true;
        this.f356230r = true;
        this.f356229j = helper.O;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        o9Var.j(qo0.b.I2, null);
        bf2.c.b(bf2.c.f19598a, o9Var.f356074b, 2, 0, null, 0, 28, null);
        ll2.e.b(ll2.e.f319133a, this.f356227h, false, false, 6, null);
        if (D()) {
            df2.dd ddVar = df2.od.f230952w;
            pk2.o9 o9Var2 = this.f364427a;
            gk2.e eVar = o9Var2.f356074b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 2, 7, odVar != null ? odVar.f230958r : null, 15);
        }
    }

    public final boolean D() {
        df2.od odVar = (df2.od) this.f364427a.e(df2.od.class);
        return odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_CREATE_NOTICE_COUNT);
    }

    @Override // qk2.f
    public boolean h() {
        return this.f356228i;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356227h;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.q4 q4Var = zl2.q4.f473933a;
        pk2.o9 o9Var = this.f364427a;
        boolean D = q4Var.D(o9Var.f356074b);
        boolean z17 = this.f364428b == 0;
        if (!D) {
            return false;
        }
        if (z17) {
            return true;
        }
        return !(((com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class)) != null ? r0.b7(7) : false);
    }

    @Override // qk2.f
    public boolean r() {
        return this.f356230r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (((r0 == null || (r0 instanceof com.tencent.mm.plugin.finder.live.plugin.ea0)) ? false : true) == true) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(pk2.o9 r19, db5.g4 r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.s1.v(pk2.o9, db5.g4):void");
    }

    @Override // qk2.h
    public int y() {
        return this.f356229j;
    }
}
