package ea2;

/* loaded from: classes2.dex */
public final class k0 extends com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC {
    public long F;
    public int G;
    public java.lang.String H;
    public com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        c01.id.c();
        this.H = "";
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public boolean A7(int i17) {
        return i17 == -4081 || i17 == -4080;
    }

    @Override // x92.m
    public void F7(java.lang.String tabName, int i17, int i18) {
        java.lang.String str;
        r45.hj2 hj2Var;
        kotlin.jvm.internal.o.g(tabName, "tabName");
        fa2.a aVar = fa2.a.f260706a;
        android.app.Activity context = getContext();
        r45.r03 r03Var = (r45.r03) this.f452711w;
        r45.hj2 hj2Var2 = r03Var != null ? (r45.hj2) r03Var.getCustom(19) : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        byte[] bytes = tabName.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        jSONObject.put("tab_name", android.util.Base64.encodeToString(bytes, 2));
        r45.r03 r03Var2 = (r45.r03) this.f452711w;
        if (r03Var2 == null || (hj2Var = (r45.hj2) r03Var2.getCustom(19)) == null || (str = hj2Var.getString(15)) == null) {
            str = "";
        }
        jSONObject.put("audioId", str);
        fa2.a.a(aVar, context, "music_profile_video_tab", i18, 0, hj2Var2, jSONObject, 8, null);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public y92.b M7() {
        long longExtra = getIntent().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        long longExtra2 = getIntent().getLongExtra("key_feed_id", 0L);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_topic_info_pass_buff");
        return new y92.b(longExtra, str, java.lang.Long.valueOf(longExtra2), byteArrayExtra != null ? com.tencent.mm.protobuf.g.b(byteArrayExtra) : null, java.lang.Integer.valueOf(longExtra == 0 ? 1 : 0), null, 32, null);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public boolean Q7(r45.r03 topicInfo) {
        java.lang.String str;
        java.lang.String str2;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var2;
        r45.hj2 hj2Var3;
        r45.zi2 zi2Var2;
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        r45.hj2 hj2Var4 = (r45.hj2) topicInfo.getCustom(19);
        if (hj2Var4 == null) {
            return false;
        }
        z5();
        r45.ij2 ij2Var = (r45.ij2) hj2Var4.getCustom(6);
        if (ij2Var == null) {
            return false;
        }
        long j17 = hj2Var4.getLong(0);
        java.util.LinkedList list = ij2Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getList(...)");
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0("");
        r45.r03 r03Var = (r45.r03) this.f452711w;
        int i17 = 3;
        java.lang.String string = (r03Var == null || (hj2Var3 = (r45.hj2) r03Var.getCustom(19)) == null || (zi2Var2 = (r45.zi2) hj2Var3.getCustom(3)) == null) ? null : zi2Var2.getString(12);
        if (string == null) {
            string = "";
        }
        this.H = string;
        getIntent().putExtra("key_song_id", this.H);
        android.content.Intent intent = getIntent();
        r45.r03 r03Var2 = (r45.r03) this.f452711w;
        if (r03Var2 == null || (hj2Var2 = (r45.hj2) r03Var2.getCustom(19)) == null || (str = hj2Var2.getString(15)) == null) {
            str = "";
        }
        intent.putExtra("key_audio_id", str);
        android.content.Intent intent2 = getIntent();
        r45.r03 r03Var3 = (r45.r03) this.f452711w;
        if (r03Var3 == null || (hj2Var = (r45.hj2) r03Var3.getCustom(19)) == null || (zi2Var = (r45.zi2) hj2Var.getCustom(3)) == null || (str2 = zi2Var.getString(0)) == null) {
            str2 = "";
        }
        intent2.putExtra("key_doc_id", str2);
        android.content.Intent intent3 = getContext().getIntent();
        long longExtra = intent3 != null ? intent3.getLongExtra("key_feed_id", 0L) : 0L;
        android.content.Intent intent4 = getContext().getIntent();
        java.lang.String stringExtra = intent4 != null ? intent4.getStringExtra("key_feed_dup_flag") : null;
        R7();
        int i18 = 0;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ys4 ys4Var = (r45.ys4) obj;
            com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment finderMusicTopicFragment = new com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment();
            finderMusicTopicFragment.f129265p = ys4Var.getInteger(1) - 1;
            finderMusicTopicFragment.f129266q = ys4Var.getString(0);
            finderMusicTopicFragment.f101753u = j17;
            java.lang.String string2 = ys4Var.getString(0);
            if (string2 == null) {
                string2 = "";
            }
            finderMusicTopicFragment.f101754v = string2;
            getIntent().putExtra("key_ref_object_id", longExtra);
            getIntent().putExtra("key_ref_object_dup_flag", stringExtra);
            getIntent().putExtra("key_feed_ref_id", longExtra);
            getIntent().putExtra("key_feed_ref_dup_flag", stringExtra);
            int integer = ys4Var.getInteger(1);
            if (integer == 1) {
                getIntent().putExtra("key_latest_index", i18);
            } else if (integer == i17) {
                this.I = finderMusicTopicFragment;
            }
            java.lang.String string3 = ys4Var.getString(0);
            java.lang.String str3 = stringExtra;
            long j18 = longExtra;
            int i27 = i17;
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new w92.a(-1, string3 == null ? "" : string3, z17, 15, 0, 16, null), finderMusicTopicFragment, false, 4, null);
            java.lang.String string4 = ys4Var.getString(0);
            if (string4 == null) {
                string4 = "";
            }
            F7(string4, ys4Var.getInteger(1), 0);
            i17 = i27;
            stringExtra = str3;
            longExtra = j18;
            i18 = i19;
        }
        r7();
        return true;
    }

    public final void R7() {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        java.lang.String string;
        r45.hj2 hj2Var2;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        utVar.P6("activityid", pm0.v.u(this.F));
        utVar.O6("src_type", this.G);
        utVar.P6("songid", this.H);
        r45.r03 r03Var = (r45.r03) this.f452711w;
        java.lang.String str2 = "";
        if (r03Var == null || (hj2Var2 = (r45.hj2) r03Var.getCustom(19)) == null || (str = hj2Var2.getString(15)) == null) {
            str = "";
        }
        utVar.P6("audioId", str);
        r45.r03 r03Var2 = (r45.r03) this.f452711w;
        if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.getCustom(19)) != null && (zi2Var = (r45.zi2) hj2Var.getCustom(3)) != null && (string = zi2Var.getString(0)) != null) {
            str2 = string;
        }
        utVar.P6("docid", str2);
        android.content.Intent intent = utVar.getContext().getIntent();
        utVar.P6("source_feedid", pm0.v.u(intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L));
        android.content.Intent intent2 = utVar.getContext().getIntent();
        utVar.O6("source_position", intent2 != null ? intent2.getIntExtra("key_source_postion", 0) : 0);
        androidx.appcompat.app.AppCompatActivity activity = utVar.getActivity();
        com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI finderMusicTopicUI = activity instanceof com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI ? (com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI) activity : null;
        utVar.O6("expose_count", finderMusicTopicUI != null ? finderMusicTopicUI.f101757w : 0);
    }

    @Override // x92.m, x92.q
    public java.lang.String d2() {
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.F = getIntent().getLongExtra("key_activity_id", 0L);
        this.G = getIntent().getIntExtra("key_source_type", 0);
        R7();
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public int w7() {
        return com.tencent.mm.R.layout.b4e;
    }
}
