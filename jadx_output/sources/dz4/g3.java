package dz4;

/* loaded from: classes12.dex */
public final class g3 implements mz4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f245259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.i3 f245260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245261c;

    public g3(kotlin.jvm.internal.h0 h0Var, dz4.i3 i3Var, android.app.Activity activity) {
        this.f245259a = h0Var;
        this.f245260b = i3Var;
        this.f245261c = activity;
    }

    @Override // mz4.q
    public void a(java.lang.String filePath, iz4.k kVar) {
        com.tencent.mm.vfs.x1 m17;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("compressNoteVideoSync onExportFinish thumbPath ");
        sb6.append(kVar != null ? kVar.f296117t : null);
        sb6.append(", videoPath=");
        sb6.append(kVar != null ? kVar.f296135s : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        kotlin.jvm.internal.h0 h0Var = this.f245259a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f310123d = null;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(filePath);
        dz4.i3 i3Var = this.f245260b;
        if (K0 || !com.tencent.mm.vfs.w6.j(filePath) || kVar == null || kVar.f296120w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync file not exist or user canceled");
        } else {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(filePath);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            long g17 = ip.c.g();
            int vj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj();
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L) < g17) {
                kVar.f296135s = com.tencent.mm.vfs.w6.i(filePath, false);
                dz4.n0 n0Var = i3Var.f245306b;
                if (n0Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.wechat.aff.favorites.j jVar = new com.tencent.wechat.aff.favorites.j();
                    jVar.k(kVar.f296117t);
                    jVar.l((int) com.tencent.mm.vfs.w6.k(kVar.f296135s));
                    jz5.l c17 = i3Var.c(kVar.f296117t);
                    int intValue = ((java.lang.Number) c17.f302833d).intValue();
                    int intValue2 = ((java.lang.Number) c17.f302834e).intValue();
                    jVar.n(intValue);
                    jVar.j(intValue2);
                    jVar.g(kVar.f296135s);
                    jVar.d(kVar.f296118u);
                    jVar.i(kVar.f296132p);
                    jVar.e(false);
                    jVar.c(kVar.f296119v);
                    jVar.f(false);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("createMediaInfoByVideoDataItemSync: thumbPath=");
                    sb7.append(jVar.getThumbPath());
                    sb7.append(", thumb_size=");
                    sb7.append(jVar.f216807o);
                    sb7.append(", thumbWidth=");
                    sb7.append(jVar.f216805m);
                    sb7.append(", thumbHeight=");
                    sb7.append(jVar.f216806n);
                    sb7.append(", media_path=");
                    sb7.append(jVar.getMediaPath());
                    sb7.append(", duration=");
                    sb7.append(jVar.f216808p);
                    sb7.append(", size=");
                    sb7.append(jVar.f216801f);
                    sb7.append(", is_image=");
                    sb7.append(jVar.f216803h);
                    sb7.append(", dataFmt=");
                    sb7.append(jVar.f216811s[4] ? jVar.f216802g : "");
                    sb7.append(", isRaw=");
                    sb7.append(jVar.f216800e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb7.toString());
                    arrayList.add(jVar);
                    n0Var.a(arrayList);
                    return;
                }
                return;
            }
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(vj6)};
            android.app.Activity activity = this.f245261c;
            dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.cds, objArr), 1).show();
        }
        dz4.n0 n0Var2 = i3Var.f245306b;
        if (n0Var2 != null) {
            n0Var2.a(null);
        }
    }

    @Override // mz4.q
    public void b(java.lang.String thumbPath, iz4.k kVar) {
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync onImportFinish");
        if (com.tencent.mm.sdk.platformtools.t8.K0(thumbPath) || !com.tencent.mm.vfs.w6.j(thumbPath) || kVar == null) {
            return;
        }
        kVar.f296117t = com.tencent.mm.vfs.w6.i(thumbPath, false);
    }
}
