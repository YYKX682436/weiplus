package qe5;

/* loaded from: classes12.dex */
public final class m2 extends wm3.a implements zs3.t {

    /* renamed from: d, reason: collision with root package name */
    public final i40.b f362150d;

    /* renamed from: e, reason: collision with root package name */
    public final qe5.l2 f362151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f362150d = new qe5.j2(this);
        this.f362151e = new qe5.l2(this, activity);
    }

    public static final void T6(qe5.m2 m2Var) {
        jz5.f0 f0Var;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.H = true;
            java.lang.String str = U6.f306880h;
            if (str == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.RecordFileDownloadUIC", "talker is null");
                return;
            }
            com.tencent.mm.storage.f9 f9Var = U6.f306877e;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.RecordFileDownloadUIC", "msgSvrId is null");
                return;
            }
            long I0 = f9Var.I0();
            java.lang.String str2 = U6.f306885p;
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.RecordFileDownloadUIC", "dataId is null");
                return;
            }
            h40.f fVar = new h40.f(str, I0);
            fVar.f278744e = new h40.a(str2);
            fVar.f278742c = m2Var.f362151e;
            fVar.f278745f = h40.b.f278722g;
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.RecordFileDownloadUIC", "startReceiveFile, getFileDownloadState is null");
        }
    }

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.File.RecordFileDownloadUIC", "on cdn info changed, but cdn info is null");
            return;
        }
        kd5.e U6 = U6();
        java.lang.String str = U6 != null ? U6.f306891v : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "cur mediaid[%s], notify mediaid[%s]", str, yVar.field_mediaId);
        if (!kotlin.jvm.internal.o.b(str, yVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "on cdn info changed, but media id not match");
            return;
        }
        int i18 = yVar.field_status;
        if (i18 == 2 || i18 == 3 || i18 == 4) {
            return;
        }
        int max = (int) ((((float) yVar.field_offset) / java.lang.Math.max(1.0d, yVar.field_totalLen)) * 100);
        kd5.e U62 = U6();
        if (U62 != null) {
            U62.f306888s = max;
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(2, 0));
        }
    }

    public final kd5.e U6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.i2(this));
        }
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).y0(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(this);
        kd5.e U6 = U6();
        if (U6 != null) {
            java.lang.String str = U6.f306880h;
            if (str == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.RecordFileDownloadUIC", "talker is null");
                return;
            }
            com.tencent.mm.storage.f9 f9Var = U6.f306877e;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.RecordFileDownloadUIC", "msgSvrId is null");
                return;
            }
            long I0 = f9Var.I0();
            java.lang.String str2 = U6.f306885p;
            if (str2 == null) {
                str2 = "";
            }
            h40.f fVar = new h40.f(str, I0);
            fVar.f278744e = new h40.a(str2);
            fVar.f278742c = this.f362151e;
            fVar.f278745f = h40.b.f278722g;
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).mj(fVar);
        }
    }
}
