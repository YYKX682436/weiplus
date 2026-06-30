package md5;

/* loaded from: classes8.dex */
public class b extends jk3.v implements md5.c {
    public static boolean A;
    public static long B;

    /* renamed from: x, reason: collision with root package name */
    public final r45.qs0 f325882x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f325883y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f325884z;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("app_type");
        hashSet.add("app_media_id");
        hashSet.add("app_msg_id");
        hashSet.add("app_show_share");
        hashSet.add(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        hashSet.add("msg_talker");
        A = false;
        B = 0L;
    }

    public b(ak3.c cVar) {
        super(cVar);
        this.f325882x = new r45.qs0();
        this.f325883y = false;
        this.f325884z = false;
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        return super.U(i17, this.f325883y);
    }

    @Override // jk3.b, jk3.e
    public boolean c(int i17) {
        r45.qs0 qs0Var = this.f325882x;
        if ((com.tencent.mm.sdk.platformtools.t8.K0(qs0Var.getString(1)) || com.tencent.mm.vfs.w6.j(qs0Var.getString(1))) && !this.f325884z) {
            return !(this instanceof com.tencent.mm.pluginsdk.ui.tools.p3);
        }
        return false;
    }

    public void c0(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        android.os.Bundle extras;
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "onCreate, filePath:%s fileExt:%s sence:%s", str, str2, java.lang.Integer.valueOf(i17));
        y(4, com.tencent.mm.plugin.multitask.s0.c(str));
        this.f325883y = false;
        r45.qs0 qs0Var = this.f325882x;
        qs0Var.set(1, str);
        qs0Var.set(7, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)));
        if (!z17) {
            qs0Var.set(2, str2);
            qs0Var.set(5, java.lang.Integer.valueOf(i17));
            qs0Var.set(0, java.lang.Boolean.FALSE);
            try {
                this.f300077a.field_data = qs0Var.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e17);
            }
            J();
            return;
        }
        ak3.c cVar = this.f300111d;
        if (cVar.getIntent() != null) {
            android.content.Intent intent = cVar.getIntent();
            if (qs0Var != null && (extras = intent.getExtras()) != null) {
                qs0Var.set(8, extras.getString("app_type"));
                qs0Var.set(9, extras.getString("app_media_id"));
                qs0Var.set(10, java.lang.Long.valueOf(extras.getLong("app_msg_id")));
                qs0Var.set(11, java.lang.Boolean.valueOf(extras.getBoolean("app_show_share")));
                qs0Var.set(12, java.lang.Integer.valueOf(extras.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
                qs0Var.set(30, extras.getString("msg_talker"));
            }
            qs0Var.set(0, java.lang.Boolean.TRUE);
            try {
                this.f300077a.field_data = qs0Var.toByteArray();
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e18);
            }
            J();
        }
    }

    public void d0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        multiTaskInfo.v0().set(1, str2);
        multiTaskInfo.v0().set(4, str);
        J();
    }

    public void e0(long j17) {
        r45.qs0 qs0Var = this.f325882x;
        if (qs0Var != null) {
            qs0Var.set(7, java.lang.Long.valueOf(j17));
            try {
                this.f300077a.field_data = qs0Var.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "updateFileLen", e17);
            }
        }
    }

    @Override // jk3.b
    public long n() {
        return 1000L;
    }

    @Override // jk3.b
    public boolean u() {
        return !this.f325884z;
    }

    @Override // jk3.b
    public boolean x() {
        r45.qs0 qs0Var = this.f325882x;
        return (com.tencent.mm.sdk.platformtools.t8.K0(qs0Var.getString(1)) || com.tencent.mm.vfs.w6.j(qs0Var.getString(1))) && !this.f325884z;
    }
}
