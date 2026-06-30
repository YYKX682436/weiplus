package op4;

/* loaded from: classes10.dex */
public final class j extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout f347289e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347290f;

    public j(com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f347289e = pluginLayout;
        this.f347290f = "";
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
    }

    @Override // op4.k
    public java.lang.String g() {
        return "25496";
    }

    public final void j(java.lang.String editId, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        rm5.v vVar;
        kotlin.jvm.internal.o.g(editId, "editId");
        if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).wi() == 0) {
            return;
        }
        this.f347290f = editId;
        java.util.Map k17 = kz5.c1.k(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.d7_), "edit_page_bgm"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.d7f), "edit_page_emoji"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.d7p), "edit_page_word"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484169d81), "edit_page_clip"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.d7c), "identify_subtitle"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.o89), "edit_page_finish"));
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = this.f347289e;
        lp4.u uVar = (lp4.u) basePluginLayout.j(lp4.u.class);
        long j17 = 0;
        if (uVar != null && (vVar = uVar.f320429h) != null) {
            java.util.Iterator it = np4.a.a(vVar).f175597c.iterator();
            while (it.hasNext()) {
                rm5.j jVar = ((com.tencent.mm.plugin.vlog.model.i1) it.next()).f175627l;
                j17 += jVar.f397505g - jVar.f397504f;
            }
        }
        java.lang.String b17 = np4.b.b(recordConfigProvider);
        java.lang.String a17 = np4.b.a(recordConfigProvider);
        java.lang.String c17 = np4.b.c(recordConfigProvider);
        com.tencent.mars.xlog.Log.i("TimelineEditorReport25496", "initReport, editId:" + editId + " finderContextId:" + b17 + " tabContextId:" + a17 + " sessionId:" + c17 + " commentScene:101 duration:" + j17);
        for (java.util.Map.Entry entry : k17.entrySet()) {
            android.view.View findViewById = basePluginLayout.findViewById(((java.lang.Number) entry.getKey()).intValue());
            if (findViewById != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, (java.lang.String) entry.getValue());
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 8, 25496);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(findViewById, kz5.c1.k(new jz5.l("video_duration_time", java.lang.Long.valueOf(j17)), new jz5.l("editid", this.f347290f)));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(findViewById, new op4.i(c17, b17, a17, "101"));
            }
        }
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
    }
}
