package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class d0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.d0 f185040d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f185041e;

    static {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.d0 d0Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.d0();
        f185040d = d0Var;
        f185041e = cf.b.a(d0Var);
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("0", com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, "appid"));
        intent.putExtra("default_fileid", com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, "defaultAvatarFileId"));
        java.lang.Object obj = msg.f340790a.get("editAvatarInfo");
        org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        if (jSONObject != null) {
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, env.f340860a.getResources().getString(com.tencent.mm.R.string.d4w));
            intent.putExtra("extra_is_edit_page", true);
            intent.putExtra("extra_edit_avatar_id", jSONObject.optString(dm.i4.COL_ID));
            intent.putExtra("extra_edit_frefill_avatar_name", jSONObject.optString("nickname"));
            intent.putExtra("extra_edit_frefill_avatar_icon", jSONObject.optString("avatarUrl"));
        }
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.tencent.mm.ui.MMActivity) context, ".plugin.webview.ui.tools.CreateAvatarUI", intent, f185041e, new com.tencent.mm.plugin.webview.ui.tools.jsapi.c0(env, msg));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 490;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "createAvatar";
    }
}
