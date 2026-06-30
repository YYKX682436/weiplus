package en3;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f255331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f255332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.jv4 f255333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ en3.b0 f255334h;

    public z(java.lang.String str, long j17, long j18, r45.jv4 jv4Var, en3.b0 b0Var) {
        this.f255330d = str;
        this.f255331e = j17;
        this.f255332f = j18;
        this.f255333g = jv4Var;
        this.f255334h = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.iv4 iv4Var;
        r45.iv4 iv4Var2 = new r45.iv4();
        java.lang.String str = this.f255330d;
        iv4Var2.set(0, str);
        iv4Var2.set(1, java.lang.Long.valueOf(this.f255331e));
        iv4Var2.set(2, java.lang.Long.valueOf(this.f255332f));
        long j17 = iv4Var2.getLong(2);
        r45.jv4 jv4Var = this.f255333g;
        iv4Var2.set(3, java.lang.Long.valueOf(j17 - jv4Var.getLong(2)));
        long j18 = iv4Var2.getLong(2);
        java.util.LinkedList list = jv4Var.getList(7);
        iv4Var2.set(4, java.lang.Long.valueOf(j18 - ((list == null || (iv4Var = (r45.iv4) kz5.n0.k0(list)) == null) ? jv4Var.getLong(2) : iv4Var.getLong(2))));
        jv4Var.getList(7).add(iv4Var2);
        jz5.l[] lVarArr = new jz5.l[13];
        lVarArr[0] = new jz5.l("contextid", jv4Var.getString(0));
        java.lang.String string = jv4Var.getString(3);
        if (string == null) {
            string = "";
        }
        lVarArr[1] = new jz5.l("reddotuuid", string);
        lVarArr[2] = new jz5.l("cachetype", java.lang.Integer.valueOf(jv4Var.getInteger(4)));
        lVarArr[3] = new jz5.l("action", iv4Var2.getString(0));
        lVarArr[4] = new jz5.l(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(iv4Var2.getLong(1)));
        lVarArr[5] = new jz5.l("uptime", java.lang.Long.valueOf(iv4Var2.getLong(2)));
        lVarArr[6] = new jz5.l("timefromfirstaction", java.lang.Long.valueOf(iv4Var2.getLong(3)));
        lVarArr[7] = new jz5.l("timefrompreaction", java.lang.Long.valueOf(iv4Var2.getLong(4)));
        lVarArr[8] = new jz5.l("isnewlifetab", java.lang.Integer.valueOf(jv4Var.getInteger(5)));
        lVarArr[9] = new jz5.l("openbyview", java.lang.Integer.valueOf(jv4Var.getInteger(9)));
        lVarArr[10] = new jz5.l("useinstancecache", java.lang.Integer.valueOf(jv4Var.getInteger(6)));
        lVarArr[11] = new jz5.l("fromfindmoretabresume", java.lang.Long.valueOf(jv4Var.getLong(8)));
        lVarArr[12] = new jz5.l("innerversion", 10);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("newlife_enter", null, k17, 30923);
        if (kotlin.jvm.internal.o.b(str, "OnBackBtnClick") || kotlin.jvm.internal.o.b(str, "HomeUIOnDestroy") || kotlin.jvm.internal.o.b(str, "FirstItemExpose") || kotlin.jvm.internal.o.b(str, "SwitchToOtherTab")) {
            int integer = jv4Var.getInteger(6);
            en3.b0 b0Var = this.f255334h;
            long wi6 = integer == 0 ? en3.b0.wi(b0Var, jv4Var, "StartNewLife", "InitFlutterHomePage") : en3.b0.wi(b0Var, jv4Var, "StartNewLife", "InitNewLifeFlutterInstance");
            long j19 = iv4Var2.getLong(3) - wi6;
            jz5.l[] lVarArr2 = new jz5.l[15];
            lVarArr2[0] = new jz5.l("contextid", jv4Var.getString(0));
            java.lang.String string2 = jv4Var.getString(3);
            if (string2 == null) {
                string2 = "";
            }
            lVarArr2[1] = new jz5.l("reddotuuid", string2);
            lVarArr2[2] = new jz5.l("cachetype", java.lang.Integer.valueOf(jv4Var.getInteger(4)));
            lVarArr2[3] = new jz5.l("action", str);
            lVarArr2[4] = new jz5.l(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(iv4Var2.getLong(1)));
            lVarArr2[5] = new jz5.l("uptime", java.lang.Long.valueOf(iv4Var2.getLong(2)));
            lVarArr2[6] = new jz5.l("totalcost", java.lang.Long.valueOf(iv4Var2.getLong(3)));
            lVarArr2[7] = new jz5.l("isnewlifetab", java.lang.Integer.valueOf(jv4Var.getInteger(5)));
            lVarArr2[8] = new jz5.l("openbyview", java.lang.Integer.valueOf(jv4Var.getInteger(9)));
            lVarArr2[9] = new jz5.l("useinstancecache", java.lang.Integer.valueOf(jv4Var.getInteger(6)));
            lVarArr2[10] = new jz5.l(ya.b.SUCCESS, java.lang.Integer.valueOf(kotlin.jvm.internal.o.b(str, "FirstItemExpose") ? 1 : 0));
            lVarArr2[11] = new jz5.l("nativecost", java.lang.Long.valueOf(wi6));
            lVarArr2[12] = new jz5.l("fluttercost", java.lang.Long.valueOf(j19));
            lVarArr2[13] = new jz5.l("fromfindmoretabresume", java.lang.Long.valueOf(jv4Var.getLong(8)));
            lVarArr2[14] = new jz5.l("innerversion", 10);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("newlife_end", null, kz5.c1.k(lVarArr2), 30923);
            b0Var.f255289d = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeDataFeatureService", "newlife_enter " + k17);
    }
}
