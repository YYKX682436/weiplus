package com.tencent.mm.plugin.qrcode.model;

/* loaded from: classes15.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f154951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w60.k f154952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f154953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f154954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f154955h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f154956i;

    public e(android.content.Intent intent, w60.k kVar, int i17, int i18, android.os.Bundle bundle, android.content.Context context) {
        this.f154951d = intent;
        this.f154952e = kVar;
        this.f154953f = i17;
        this.f154954g = i18;
        this.f154955h = bundle;
        this.f154956i = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        w60.k kVar = this.f154952e;
        com.tencent.mm.modelsimple.k0 k0Var = (com.tencent.mm.modelsimple.k0) kVar;
        java.lang.String str = ((r45.s83) k0Var.f71356e.f70711b.f70700a).f385548g;
        android.content.Intent intent = this.f154951d;
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
        intent.putExtra("rawUrl", k0Var.Q());
        int i18 = this.f154953f;
        if (e04.p.y(i18)) {
            intent.putExtra("stastic_scene", 13);
        } else if (i18 == 1) {
            intent.putExtra("stastic_scene", 14);
        } else {
            intent.putExtra("stastic_scene", 11);
        }
        intent.putExtra("pay_channel", com.tencent.mm.plugin.qrcode.model.p.a(this.f154954g));
        intent.putExtra("geta8key_session_id", k0Var.O());
        intent.putExtra("geta8key_cookie", k0Var.J());
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        com.tencent.mm.plugin.qrcode.model.p.g(intent, kVar, this.f154955h);
        ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).D(intent, this.f154956i);
    }
}
