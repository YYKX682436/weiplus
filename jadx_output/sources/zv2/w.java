package zv2;

/* loaded from: classes10.dex */
public final class w extends zv2.b {

    /* renamed from: h, reason: collision with root package name */
    public final int f476425h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView, int i17) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        this.f476425h = i17;
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        if (this.f476425h == 57) {
            str = "1.0.65";
            str3 = r26.i0.t("{\"nickname\":\"#\"}", "#", hc2.t.b(this.f476395d, 1), false);
            z17 = true;
            str2 = "pages/music-selector/entry";
        } else {
            str = null;
            str2 = "pages/audio-profile/entry";
            str3 = "{\"mode\":\"selector\"}";
            z17 = false;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.ta.f(ya2.e1.f460472a, this.f476395d, "wxalitef1d58076d58fb4e8cc6bed37a19a4534", str2, str3, false, false, z17, str, new zv2.t(this), 48, null);
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        java.lang.String string;
        java.lang.String wording;
        java.lang.String wording2;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        int i17 = this.f476425h;
        java.lang.String str = "";
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f476395d;
        if (i17 == 57) {
            android.content.res.Resources resources = appCompatActivity.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
            if (finderJumpInfo != null && (wording2 = finderJumpInfo.getWording()) != null) {
                str = wording2;
            }
            objArr[0] = str;
            string = resources.getString(com.tencent.mm.R.string.loz, objArr);
        } else {
            android.content.res.Resources resources2 = appCompatActivity.getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.f476397f;
            if (finderJumpInfo2 != null && (wording = finderJumpInfo2.getWording()) != null) {
                str = wording;
            }
            objArr2[0] = str;
            string = resources2.getString(com.tencent.mm.R.string.loy, objArr2);
        }
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(this.f476396e, string, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        androidx.appcompat.app.AppCompatActivity activity = this.f476395d;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setMinimumHeight(dimensionPixelSize);
        int i17 = this.f476425h;
        if (i17 == 57) {
            finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.icons_filled_music3_regular);
            finderJumperView.setFilledIconId(com.tencent.mm.R.raw.icons_filled_music3_regular);
        } else {
            finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.icons_outlined_audio_fav);
            finderJumperView.setFilledIconId(com.tencent.mm.R.raw.icons_outlined_audio_fav);
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6();
        hc2.v0.b(this.f476396e, null, "post_selected_music_audio", 0, kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("behaviour_session_id", V6.getString(0)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("jump_business_type", java.lang.Integer.valueOf(i17))), null, 21, null);
    }

    @Override // zv2.b
    public void g() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo != null) {
            r45.k74 lite_app_info = finderJumpInfo.getLite_app_info();
            if (lite_app_info != null) {
                lite_app_info.set(2, xc2.r0.a(lite_app_info.getString(2), kz5.c1.k(new jz5.l("client_commentscene", "preview"), new jz5.l("from_scene", 4))));
            }
            xc2.y2 y2Var = xc2.y2.f453343a;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f476395d;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.f144167d = new yc2.i(this.f476395d);
            p0Var.R = sVar;
            xc2.y2.i(y2Var, appCompatActivity, p0Var, 0, null, 12, null);
        }
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f401398a.a(this.f476395d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.u(this), null, 22, null), new ry2.f(2, com.tencent.mm.R.color.Red_100, 0, new zv2.v(this), null, 20, null)), null);
    }

    @Override // zv2.b, ya2.q1
    public void n0(ya2.b2 contact) {
        r45.k74 lite_app_info;
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo == null || (lite_app_info = finderJumpInfo.getLite_app_info()) == null) {
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String string = lite_app_info.getString(2);
            m521constructorimpl = kotlin.Result.m521constructorimpl(string != null ? new org.json.JSONObject(string) : new org.json.JSONObject());
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = jSONObject;
        }
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) m521constructorimpl;
        jSONObject2.put("nickname", contact.w0());
        lite_app_info.set(2, jSONObject2.toString());
    }
}
