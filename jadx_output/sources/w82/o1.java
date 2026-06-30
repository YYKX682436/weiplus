package w82;

/* loaded from: classes12.dex */
public class o1 implements zs3.t, o72.x3, com.tencent.mm.modelcdntran.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443917d;

    public o1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView, w82.e1 e1Var) {
        this.f443917d = favVideoView;
    }

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar != null && yVar.field_dataId.equals(this.f443917d.B)) {
            b(yVar.field_status, yVar.field_path, yVar.field_offset, yVar.field_totalLen);
        }
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        if (e2Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e2Var.field_dataId) || !e2Var.field_dataId.equals(this.f443917d.B)) {
            return;
        }
        b(e2Var.field_status, e2Var.field_path, e2Var.field_offset, e2Var.field_totalLen);
    }

    @Override // com.tencent.mm.modelcdntran.c1
    public void a(int i17, com.tencent.mm.modelcdntran.d1 d1Var) {
        if (java.util.Objects.equals(this.f443917d.B, d1Var.f70907c)) {
            if (i17 == 1) {
                b(2, d1Var.f70912h, d1Var.f70909e, d1Var.f70910f);
            } else {
                if (i17 != 4) {
                    return;
                }
                b(1, d1Var.f70912h, d1Var.f70909e, d1Var.f70910f);
            }
        }
    }

    public void b(int i17, java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443917d;
        com.tencent.mars.xlog.Log.i(favVideoView.f101566d, "onCdnStatusChanged status:%s, offset:%s, totalLength:%s, path:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str);
        com.tencent.mm.sdk.platformtools.n3 n3Var = favVideoView.f101567e;
        if ((i17 != 3 && i17 != 2) || !com.tencent.mm.vfs.w6.j(str)) {
            n3Var.post(new w82.l1(favVideoView, j17, j18));
            return;
        }
        favVideoView.f101569g.stop();
        n3Var.post(new w82.d1(favVideoView));
        favVideoView.f101576q = str;
        com.tencent.mm.sdk.platformtools.u3.h(new w82.n1(this));
    }
}
