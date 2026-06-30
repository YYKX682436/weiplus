package mc;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public jc.a f325497a;

    /* renamed from: b, reason: collision with root package name */
    public jc.b f325498b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f325499c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f325500d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f325501e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f325502f;

    /* renamed from: g, reason: collision with root package name */
    public mc.r f325503g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.SparseArray f325504h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f325505i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent f325506j;

    /* renamed from: k, reason: collision with root package name */
    public int f325507k;

    /* renamed from: l, reason: collision with root package name */
    public int f325508l;

    /* renamed from: m, reason: collision with root package name */
    public int f325509m;

    /* renamed from: n, reason: collision with root package name */
    public int f325510n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.cloud.huiyan.enums.HuiYanAuthEvent f325511o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f325512p;

    public c() {
        com.tencent.cloud.huiyan.enums.AuthState authState = com.tencent.cloud.huiyan.enums.AuthState.PREPARE;
        this.f325499c = false;
        this.f325511o = com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.NONE;
        this.f325512p = false;
        this.f325500d = new int[]{com.tencent.mm.R.string.fl_no_face, com.tencent.mm.R.string.fl_incomplete_face, com.tencent.mm.R.string.fl_pose_incorrect, com.tencent.mm.R.string.fl_no_left_face, com.tencent.mm.R.string.fl_no_right_face, com.tencent.mm.R.string.fl_no_chin, com.tencent.mm.R.string.fl_no_mouth, com.tencent.mm.R.string.fl_no_nose, com.tencent.mm.R.string.fl_no_left_eye, com.tencent.mm.R.string.fl_no_right_eye, com.tencent.mm.R.string.fl_pose_closer, com.tencent.mm.R.string.fl_pose_farer, com.tencent.mm.R.string.fl_too_many_faces, com.tencent.mm.R.string.fl_pose_open_eye, com.tencent.mm.R.string.fl_close_mouth, com.tencent.mm.R.string.fl_pose_open_eye, com.tencent.mm.R.string.f493844pb4, com.tencent.mm.R.string.fl_act_screen_shaking};
        this.f325501e = new int[]{com.tencent.mm.R.string.fl_act_blink, com.tencent.mm.R.string.fl_act_open_mouth, com.tencent.mm.R.string.fl_act_shake_head, com.tencent.mm.R.string.fl_act_nod_head, com.tencent.mm.R.string.fl_pose_keep};
        this.f325502f = new int[]{com.tencent.mm.R.string.rst_succeed, com.tencent.mm.R.string.rst_failed, com.tencent.mm.R.string.net_fetch_data, com.tencent.mm.R.string.net_fetch_failed, com.tencent.mm.R.string.msg_net_error, com.tencent.mm.R.string.msg_param_error, com.tencent.mm.R.string.msg_inner_error, com.tencent.mm.R.string.msg_user_cancel, com.tencent.mm.R.string.msg_cam_error, com.tencent.mm.R.string.msg_light_dark, com.tencent.mm.R.string.msg_light_norm, com.tencent.mm.R.string.msg_light_bright};
        android.util.SparseArray sparseArray = this.f325504h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_pose_keep);
        if (sparseArray == null) {
            android.util.SparseArray sparseArray2 = new android.util.SparseArray(20);
            this.f325504h = sparseArray2;
            sparseArray2.put(com.tencent.mm.R.string.fl_act_open_mouth, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_OPEN_MOUTH);
            this.f325504h.put(com.tencent.mm.R.string.fl_act_blink, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_BLINK);
            this.f325504h.put(com.tencent.mm.R.string.fl_act_nod_head, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_NOD_HEAD);
            this.f325504h.put(com.tencent.mm.R.string.fl_act_shake_head, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_SHAKE_HEAD);
            this.f325504h.put(com.tencent.mm.R.string.fl_act_screen_shaking, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_SCREEN_SHAKING);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_face, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_FACE);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_left_face, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_LEFT_FACE);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_right_face, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_RIGHT_FACE);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_chin, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_CHIN);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_mouth, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_MOUTH);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_nose, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_NOSE);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_left_eye, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_LEFT_EYE);
            this.f325504h.put(com.tencent.mm.R.string.fl_no_right_eye, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_RIGHT_EYE);
            this.f325504h.put(com.tencent.mm.R.string.fl_pose_keep, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_KEEP);
            this.f325504h.put(com.tencent.mm.R.string.fl_incomplete_face, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.INCOMPLETE_FACE);
            this.f325504h.put(com.tencent.mm.R.string.fl_pose_closer, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_CLOSER);
            this.f325504h.put(com.tencent.mm.R.string.fl_pose_farer, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_FARTHER);
            this.f325504h.put(com.tencent.mm.R.string.fl_pose_incorrect, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_INCORRECT);
            this.f325504h.put(com.tencent.mm.R.string.fl_too_many_faces, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.TOO_MANY_FACE);
            this.f325504h.put(com.tencent.mm.R.string.fl_pose_open_eye, com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_OPEN_EYE);
        }
        if (this.f325505i == null) {
            java.util.HashMap hashMap = new java.util.HashMap(30);
            this.f325505i = hashMap;
            hashMap.put("0", valueOf);
            this.f325505i.put("1", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_unknow));
            this.f325505i.put("10000", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_face));
            this.f325505i.put("10001", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_too_many_faces));
            this.f325505i.put("10002", valueOf);
            this.f325505i.put("10005", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_pose_incorrect));
            this.f325505i.put("10006", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_pose_open_eye));
            this.f325505i.put("10007", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_close_mouth));
            this.f325505i.put("10010", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_incomplete_face));
            this.f325505i.put("10012", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_pose_farer));
            this.f325505i.put("10013", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_pose_closer));
            this.f325505i.put("10014", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_mouth));
            this.f325505i.put("10015", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_right_eye));
            this.f325505i.put("10016", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_left_eye));
            this.f325505i.put("10017", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_right_face));
            this.f325505i.put("10018", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_left_face));
            this.f325505i.put("10019", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_chin));
            this.f325505i.put("10020", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_no_nose));
            this.f325505i.put("20006", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_act_screen_shaking));
            this.f325505i.put("20001", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_act_blink));
            this.f325505i.put("20002", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_act_open_mouth));
            this.f325505i.put("20003", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_act_shake_head));
            this.f325505i.put("20004", java.lang.Integer.valueOf(com.tencent.mm.R.string.fl_act_nod_head));
            this.f325505i.put("20005", valueOf);
        }
        this.f325506j = com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE;
    }

    public static boolean b(int i17, int[] iArr) {
        for (int i18 : iArr) {
            if (i17 == i18) {
                return true;
            }
        }
        return false;
    }

    public final void a(com.tencent.cloud.huiyan.enums.AuthState authState, java.lang.Object obj) {
        jc.a aVar = this.f325497a;
        if (aVar != null) {
            ((lc.f) aVar).a(authState, obj);
        }
    }
}
