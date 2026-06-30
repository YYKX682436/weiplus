package lf4;

/* loaded from: classes4.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f318486f;

    public t0(lf4.j1 j1Var, int i17, int i18) {
        this.f318484d = j1Var;
        this.f318485e = i17;
        this.f318486f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.j1 j1Var = this.f318484d;
        int i17 = this.f318485e;
        j1Var.f318426p = i17;
        int i18 = this.f318486f;
        j1Var.f318427q = i18;
        java.lang.Object obj = ((java.util.ArrayList) j1Var.f318422i.get(i17)).get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        if4.f fVar = (if4.f) obj;
        ef4.v vVar = ef4.w.f252468t;
        nf4.j J0 = vVar.i().J0(fVar.f291247e.f291253a);
        nf4.l i19 = vVar.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if4.h hVar = fVar.f291247e;
        sb6.append(hVar.f291253a);
        sb6.append('_');
        sb6.append(hVar.f291255c);
        java.lang.String localId = sb6.toString();
        kotlin.jvm.internal.o.g(localId, "localId");
        i19.f336873i.add(localId);
        if (J0 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LogStory: deleteItem2 storyinfo ");
            sb7.append(fVar);
            sb7.append(" deleteItemRow ");
            sb7.append(j1Var.f318426p);
            sb7.append(" deleteItemCol ");
            sb7.append(j1Var.f318427q);
            sb7.append(" localid ");
            int i27 = hVar.f291253a;
            sb7.append(i27);
            sb7.append(' ');
            sb7.append(J0.field_storyID);
            com.tencent.mars.xlog.Log.i(j1Var.f318421h, sb7.toString());
            long j17 = J0.field_storyID;
            if (j17 == 0) {
                ef4.e0.f252441a.a(i27);
                pm0.v.X(new lf4.w0(true, j1Var));
            } else if (j1Var.f318426p != -1 && j1Var.f318427q != -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList.add(new ff4.p(j17, 1));
                arrayList2.add(java.lang.Integer.valueOf(i27));
                gm0.j1.n().f273288b.g(new ff4.e(arrayList, arrayList2));
            }
        }
        if (hVar.a()) {
            vVar.l().post(new lf4.s0(j1Var, fVar));
        }
    }
}
