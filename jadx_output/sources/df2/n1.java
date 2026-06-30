package df2;

/* loaded from: classes3.dex */
public final class n1 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.v94 f230828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f230829b;

    public n1(r45.v94 v94Var, df2.p1 p1Var) {
        this.f230828a = v94Var;
        this.f230829b = p1Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorLiveReplaySettingController", "modifyLiveReplaySetting failed, errCode: " + i18 + ", errMsg: " + str);
        boolean z17 = str == null || str.length() == 0;
        df2.p1 p1Var = this.f230829b;
        if (z17) {
            pm0.v.X(new df2.l1(p1Var));
            return;
        }
        android.content.Context O6 = p1Var.O6();
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
        e4Var.f211776c = str;
        e4Var.c();
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyLiveReplaySetting success, new setting:[");
        r45.v94 v94Var = this.f230828a;
        sb6.append(v94Var.getBoolean(0));
        sb6.append(',');
        sb6.append(v94Var.getBoolean(1));
        sb6.append(',');
        sb6.append(v94Var.getBoolean(2));
        sb6.append(',');
        sb6.append(v94Var.getBoolean(3));
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingController", sb6.toString());
        pm0.v.X(new df2.m1(this.f230829b, v94Var));
    }
}
