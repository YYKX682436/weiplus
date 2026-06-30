package mz0;

/* loaded from: classes5.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f333063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f333065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(az0.b0 b0Var, java.lang.String str, mz0.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333063d = b0Var;
        this.f333064e = str;
        this.f333065f = x2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.t2(this.f333063d, this.f333064e, this.f333065f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mz0.t2 t2Var = (mz0.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        n0.e5 e5Var;
        n0.e5 e5Var2;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo;
        java.lang.String musicID;
        n0.e5 e5Var3;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("performPostAsync: templateId:");
        az0.b0 b0Var = this.f333063d;
        sb6.append(b0Var.f15340c);
        sb6.append(", workId=");
        java.lang.String str2 = this.f333064e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", sb6.toString());
        mz0.x2 x2Var = this.f333065f;
        androidx.appcompat.app.AppCompatActivity context = x2Var.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        dx1.g.f244489a.i("SnsTemplate", "installMiaojian", java.lang.Integer.valueOf(dw3.c.f244181a.b(context, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2));
        androidx.appcompat.app.AppCompatActivity activity = x2Var.getActivity();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_export_video_path", b0Var.f15338a);
        intent.putExtra("key_export_video_cover_path", b0Var.f15339b);
        intent.putExtra("key_export_background_task_id", str2);
        x2Var.getClass();
        r45.ib6 ib6Var = new r45.ib6();
        ib6Var.f376909d = "miaojian";
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = x2Var.o7().f70100r;
        java.lang.String str3 = "";
        if (m5Var == null || (str = m5Var.f70077a) == null) {
            str = "";
        }
        ib6Var.f376910e = str;
        java.lang.String str4 = b0Var.f15344g;
        if (str4 == null) {
            str4 = "";
        }
        ib6Var.f376914i = str4;
        java.lang.String str5 = b0Var.f15345h;
        if (str5 == null) {
            str5 = "";
        }
        ib6Var.f376915m = str5;
        java.util.Iterator it = x2Var.o7().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) obj2).f70077a, x2Var.o7().a())) {
                break;
            }
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var2 = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj2;
        java.lang.Integer valueOf = m5Var2 != null ? java.lang.Integer.valueOf(x2Var.o7().b().indexOf(m5Var2)) : null;
        dx1.f fVar = dx1.g.f244489a;
        int i17 = 0;
        fVar.i("SnsPublishProcess", "egLocation", java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        java.lang.String templateId = ib6Var.f376910e;
        kotlin.jvm.internal.o.f(templateId, "templateId");
        fVar.i("SnsPublishProcess", "egID", templateId);
        ty0.b1 b1Var = x2Var.f332889m;
        if ((b1Var == null || (e5Var3 = b1Var.f422794d) == null || ((java.lang.Boolean) e5Var3.getValue()).booleanValue()) ? false : true) {
            ty0.b1 b1Var2 = x2Var.f332889m;
            if (b1Var2 != null && (e5Var2 = b1Var2.f422792b) != null && (mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) e5Var2.getValue()) != null && (musicID = mJMusicInfo.getMusicID()) != null) {
                str3 = musicID;
            }
            ib6Var.f376911f = str3;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "fillSnsVideoTemplate has music id " + ib6Var.f376911f);
            java.lang.String musicId = ib6Var.f376911f;
            kotlin.jvm.internal.o.f(musicId, "musicId");
            fVar.i("SnsPublishProcess", "musicID", musicId);
        }
        ty0.b1 b1Var3 = x2Var.f332889m;
        if (b1Var3 != null && (e5Var = b1Var3.f422795e) != null && ((java.lang.Boolean) e5Var.getValue()).booleanValue()) {
            i17 = 1;
        }
        fVar.i("SnsPublishProcess", "ifVoice", java.lang.Integer.valueOf(i17 ^ 1));
        com.tencent.mm.mj_template.sns.compose.widget.k5 k5Var = m5Var instanceof com.tencent.mm.mj_template.sns.compose.widget.k5 ? (com.tencent.mm.mj_template.sns.compose.widget.k5) m5Var : null;
        if (k5Var != null) {
            ib6Var.f376913h = k5Var.f70030g;
            ib6Var.f376912g = k5Var.f70031h;
        }
        intent.putExtra("key_video_template_info", ib6Var.toByteArray());
        intent.putExtra("key_edit_video_bgm_listen_id", b0Var.f15342e);
        intent.putExtra("key_edit_video_bgm_is_major_owned", b0Var.f15343f);
        activity.setResult(-1, intent);
        activity.finish();
        return jz5.f0.f302826a;
    }
}
